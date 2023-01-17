/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package de.dfki.cos.basys.processcontrol.model;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class OperationMode extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -8603286687531739519L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"OperationMode\",\"namespace\":\"de.dfki.cos.basys.processcontrol.model\",\"fields\":[{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"inputParameters\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Variable\",\"fields\":[{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"value\",\"type\":[\"null\",\"boolean\",\"long\",\"double\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"VariableType\",\"symbols\":[\"NULL\",\"BOOLEAN\",\"INTEGER\",\"STRING\",\"DOUBLE\",\"LONG\",\"DATE\"]}}]}},\"default\":[]},{\"name\":\"outputParameters\",\"type\":{\"type\":\"array\",\"items\":\"Variable\"},\"default\":[]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<OperationMode> ENCODER =
      new BinaryMessageEncoder<OperationMode>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<OperationMode> DECODER =
      new BinaryMessageDecoder<OperationMode>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<OperationMode> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<OperationMode> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<OperationMode> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<OperationMode>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this OperationMode to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a OperationMode from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a OperationMode instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static OperationMode fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.String name;
  private java.util.List<de.dfki.cos.basys.processcontrol.model.Variable> inputParameters;
  private java.util.List<de.dfki.cos.basys.processcontrol.model.Variable> outputParameters;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public OperationMode() {}

  /**
   * All-args constructor.
   * @param name The new value for name
   * @param inputParameters The new value for inputParameters
   * @param outputParameters The new value for outputParameters
   */
  public OperationMode(java.lang.String name, java.util.List<de.dfki.cos.basys.processcontrol.model.Variable> inputParameters, java.util.List<de.dfki.cos.basys.processcontrol.model.Variable> outputParameters) {
    this.name = name;
    this.inputParameters = inputParameters;
    this.outputParameters = outputParameters;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return name;
    case 1: return inputParameters;
    case 2: return outputParameters;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: name = value$ != null ? value$.toString() : null; break;
    case 1: inputParameters = (java.util.List<de.dfki.cos.basys.processcontrol.model.Variable>)value$; break;
    case 2: outputParameters = (java.util.List<de.dfki.cos.basys.processcontrol.model.Variable>)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'name' field.
   * @return The value of the 'name' field.
   */
  public java.lang.String getName() {
    return name;
  }


  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.String value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'inputParameters' field.
   * @return The value of the 'inputParameters' field.
   */
  public java.util.List<de.dfki.cos.basys.processcontrol.model.Variable> getInputParameters() {
    return inputParameters;
  }


  /**
   * Sets the value of the 'inputParameters' field.
   * @param value the value to set.
   */
  public void setInputParameters(java.util.List<de.dfki.cos.basys.processcontrol.model.Variable> value) {
    this.inputParameters = value;
  }

  /**
   * Gets the value of the 'outputParameters' field.
   * @return The value of the 'outputParameters' field.
   */
  public java.util.List<de.dfki.cos.basys.processcontrol.model.Variable> getOutputParameters() {
    return outputParameters;
  }


  /**
   * Sets the value of the 'outputParameters' field.
   * @param value the value to set.
   */
  public void setOutputParameters(java.util.List<de.dfki.cos.basys.processcontrol.model.Variable> value) {
    this.outputParameters = value;
  }

  /**
   * Creates a new OperationMode RecordBuilder.
   * @return A new OperationMode RecordBuilder
   */
  public static de.dfki.cos.basys.processcontrol.model.OperationMode.Builder newBuilder() {
    return new de.dfki.cos.basys.processcontrol.model.OperationMode.Builder();
  }

  /**
   * Creates a new OperationMode RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new OperationMode RecordBuilder
   */
  public static de.dfki.cos.basys.processcontrol.model.OperationMode.Builder newBuilder(de.dfki.cos.basys.processcontrol.model.OperationMode.Builder other) {
    if (other == null) {
      return new de.dfki.cos.basys.processcontrol.model.OperationMode.Builder();
    } else {
      return new de.dfki.cos.basys.processcontrol.model.OperationMode.Builder(other);
    }
  }

  /**
   * Creates a new OperationMode RecordBuilder by copying an existing OperationMode instance.
   * @param other The existing instance to copy.
   * @return A new OperationMode RecordBuilder
   */
  public static de.dfki.cos.basys.processcontrol.model.OperationMode.Builder newBuilder(de.dfki.cos.basys.processcontrol.model.OperationMode other) {
    if (other == null) {
      return new de.dfki.cos.basys.processcontrol.model.OperationMode.Builder();
    } else {
      return new de.dfki.cos.basys.processcontrol.model.OperationMode.Builder(other);
    }
  }

  /**
   * RecordBuilder for OperationMode instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<OperationMode>
    implements org.apache.avro.data.RecordBuilder<OperationMode> {

    private java.lang.String name;
    private java.util.List<de.dfki.cos.basys.processcontrol.model.Variable> inputParameters;
    private java.util.List<de.dfki.cos.basys.processcontrol.model.Variable> outputParameters;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(de.dfki.cos.basys.processcontrol.model.OperationMode.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.inputParameters)) {
        this.inputParameters = data().deepCopy(fields()[1].schema(), other.inputParameters);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.outputParameters)) {
        this.outputParameters = data().deepCopy(fields()[2].schema(), other.outputParameters);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
    }

    /**
     * Creates a Builder by copying an existing OperationMode instance
     * @param other The existing instance to copy.
     */
    private Builder(de.dfki.cos.basys.processcontrol.model.OperationMode other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.inputParameters)) {
        this.inputParameters = data().deepCopy(fields()[1].schema(), other.inputParameters);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.outputParameters)) {
        this.outputParameters = data().deepCopy(fields()[2].schema(), other.outputParameters);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'name' field.
      * @return The value.
      */
    public java.lang.String getName() {
      return name;
    }


    /**
      * Sets the value of the 'name' field.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public de.dfki.cos.basys.processcontrol.model.OperationMode.Builder setName(java.lang.String value) {
      validate(fields()[0], value);
      this.name = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public de.dfki.cos.basys.processcontrol.model.OperationMode.Builder clearName() {
      name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'inputParameters' field.
      * @return The value.
      */
    public java.util.List<de.dfki.cos.basys.processcontrol.model.Variable> getInputParameters() {
      return inputParameters;
    }


    /**
      * Sets the value of the 'inputParameters' field.
      * @param value The value of 'inputParameters'.
      * @return This builder.
      */
    public de.dfki.cos.basys.processcontrol.model.OperationMode.Builder setInputParameters(java.util.List<de.dfki.cos.basys.processcontrol.model.Variable> value) {
      validate(fields()[1], value);
      this.inputParameters = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'inputParameters' field has been set.
      * @return True if the 'inputParameters' field has been set, false otherwise.
      */
    public boolean hasInputParameters() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'inputParameters' field.
      * @return This builder.
      */
    public de.dfki.cos.basys.processcontrol.model.OperationMode.Builder clearInputParameters() {
      inputParameters = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'outputParameters' field.
      * @return The value.
      */
    public java.util.List<de.dfki.cos.basys.processcontrol.model.Variable> getOutputParameters() {
      return outputParameters;
    }


    /**
      * Sets the value of the 'outputParameters' field.
      * @param value The value of 'outputParameters'.
      * @return This builder.
      */
    public de.dfki.cos.basys.processcontrol.model.OperationMode.Builder setOutputParameters(java.util.List<de.dfki.cos.basys.processcontrol.model.Variable> value) {
      validate(fields()[2], value);
      this.outputParameters = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'outputParameters' field has been set.
      * @return True if the 'outputParameters' field has been set, false otherwise.
      */
    public boolean hasOutputParameters() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'outputParameters' field.
      * @return This builder.
      */
    public de.dfki.cos.basys.processcontrol.model.OperationMode.Builder clearOutputParameters() {
      outputParameters = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public OperationMode build() {
      try {
        OperationMode record = new OperationMode();
        record.name = fieldSetFlags()[0] ? this.name : (java.lang.String) defaultValue(fields()[0]);
        record.inputParameters = fieldSetFlags()[1] ? this.inputParameters : (java.util.List<de.dfki.cos.basys.processcontrol.model.Variable>) defaultValue(fields()[1]);
        record.outputParameters = fieldSetFlags()[2] ? this.outputParameters : (java.util.List<de.dfki.cos.basys.processcontrol.model.Variable>) defaultValue(fields()[2]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<OperationMode>
    WRITER$ = (org.apache.avro.io.DatumWriter<OperationMode>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<OperationMode>
    READER$ = (org.apache.avro.io.DatumReader<OperationMode>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}










