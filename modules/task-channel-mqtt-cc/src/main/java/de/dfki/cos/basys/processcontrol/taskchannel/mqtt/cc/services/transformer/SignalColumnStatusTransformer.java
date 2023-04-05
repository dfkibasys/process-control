package de.dfki.cos.basys.processcontrol.taskchannel.mqtt.cc.services.transformer;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import de.dfki.cos.mrk40.avro.*;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.function.Function;

@Service
public class SignalColumnStatusTransformer implements Function<String, SignalColumnStatusStamped> {

    @Override
    public SignalColumnStatusStamped apply(String json) {
        JsonObject jsonObject = new Gson().fromJson(json, JsonObject.class);

        DateTimeFormatter formatter = DateTimeFormatter.ISO_INSTANT;
        Instant instant = Instant.from(formatter.parse(jsonObject.getAsJsonPrimitive("timestamp").getAsString()));

        SignalColumnStatusStamped status = SignalColumnStatusStamped.newBuilder()
                .setTimestamp(TimestampUnix.newBuilder()
                        .setSeconds(instant.getEpochSecond())
                        .setNseconds(instant.getNano())
                        .build())
                .setData(SignalColumnStatus.newBuilder()
                        .setRed(jsonObject.getAsJsonPrimitive("red").getAsBoolean() ? 1 : 0)
                        .setYellow(jsonObject.getAsJsonPrimitive("yellow").getAsBoolean() ? 1 : 0)
                        .setGreen(jsonObject.getAsJsonPrimitive("green").getAsBoolean() ? 1 : 0)
                        .setWhite(jsonObject.getAsJsonPrimitive("white").getAsBoolean() ? 1 : 0)
                        .build())
                .build();

        return status;
    }
}
