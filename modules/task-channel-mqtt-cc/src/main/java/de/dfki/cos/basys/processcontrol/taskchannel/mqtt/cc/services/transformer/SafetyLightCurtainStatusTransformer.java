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
public class SafetyLightCurtainStatusTransformer extends BaseStatusTransformer<LightCurtainStatusStamped> {

    @Override
    protected LightCurtainStatusStamped applyWithInstant(JsonObject jsonObject, TimestampUnix ts) {
        LightCurtainStatusStamped status = LightCurtainStatusStamped.newBuilder()
                .setTimestamp(ts)
                .setData(LightCurtainStatus.newBuilder()
                        .setStatus(Collections.singletonList(jsonObject.getAsJsonPrimitive("status").getAsBoolean()))
                        .build())
                .build();

        return status;
    }
}
