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
public class ControlComponentRequest extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 4052603318475508826L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ControlComponentRequest\",\"namespace\":\"de.dfki.cos.basys.processcontrol.model\",\"fields\":[{\"name\":\"componentId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"aasId\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"correlationId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"occupierId\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"requestType\",\"type\":{\"type\":\"enum\",\"name\":\"ControlComponentRequestType\",\"symbols\":[\"OCCUPATION_COMMAND_REQUEST\",\"EXECUTION_MODE_REQUEST\",\"EXECUTION_COMMAND_REQUEST\",\"OPERATION_MODE_REQUEST\"]}},{\"name\":\"occupationCommand\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"OccupationCommand\",\"symbols\":[\"FREE\",\"OCCUPY\",\"PRIO\"]}]},{\"name\":\"executionMode\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"ExecutionMode\",\"symbols\":[\"AUTO\",\"SEMIAUTO\",\"MANUAL\",\"SIMULATE\"]}]},{\"name\":\"executionCommand\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"ExecutionCommand\",\"symbols\":[\"RESET\",\"START\",\"STOP\",\"HOLD\",\"UNHOLD\",\"SUSPEND\",\"UNSUSPEND\",\"ABORT\",\"CLEAR\"]}]},{\"name\":\"operationMode\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"OperationMode\",\"fields\":[{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"inputParameters\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Variable\",\"fields\":[{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"value\",\"type\":[\"null\",\"boolean\",\"double\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"VariableType\",\"symbols\":[\"NULL\",\"BOOLEAN\",\"INTEGER\",\"STRING\",\"DOUBLE\",\"DATE\"]}}]}},\"default\":[]},{\"name\":\"outputParameters\",\"type\":{\"type\":\"array\",\"items\":\"Variable\"},\"default\":[]}]}]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<ControlComponentRequest> ENCODER =
      new BinaryMessageEncoder<ControlComponentRequest>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<ControlComponentRequest> DECODER =
      new BinaryMessageDecoder<ControlComponentRequest>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<ControlComponentRequest> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<ControlComponentRequest> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<ControlComponentRequest> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<ControlComponentRequest>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this ControlComponentRequest to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a ControlComponentRequest from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a ControlComponentRequest instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static ControlComponentRequest fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.String componentId;
  private java.lang.String aasId;
  private java.lang.String correlationId;
  private java.lang.String occupierId;
  private de.dfki.cos.basys.processcontrol.model.ControlComponentRequestType requestType;
  private de.dfki.cos.basys.processcontrol.model.OccupationCommand occupationCommand;
  private de.dfki.cos.basys.processcontrol.model.ExecutionMode executionMode;
  private de.dfki.cos.basys.processcontrol.model.ExecutionCommand executionCommand;
  private de.dfki.cos.basys.processcontrol.model.OperationMode operationMode;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public ControlComponentRequest() {}

  /**
   * All-args constructor.
   * @param componentId The new value for componentId
   * @param aasId The new value for aasId
   * @param correlationId The new value for correlationId
   * @param occupierId The new value for occupierId
   * @param requestType The new value for requestType
   * @param occupationCommand The new value for occupationCommand
   * @param executionMode The new value for executionMode
   * @param executionCommand The new value for executionCommand
   * @param operationMode The new value for operationMode
   */
  public ControlComponentRequest(java.lang.String componentId, java.lang.String aasId, java.lang.String correlationId, java.lang.String occupierId, de.dfki.cos.basys.processcontrol.model.ControlComponentRequestType requestType, de.dfki.cos.basys.processcontrol.model.OccupationCommand occupationCommand, de.dfki.cos.basys.processcontrol.model.ExecutionMode executionMode, de.dfki.cos.basys.processcontrol.model.ExecutionCommand executionCommand, de.dfki.cos.basys.processcontrol.model.OperationMode operationMode) {
    this.componentId = componentId;
    this.aasId = aasId;
    this.correlationId = correlationId;
    this.occupierId = occupierId;
    this.requestType = requestType;
    this.occupationCommand = occupationCommand;
    this.executionMode = executionMode;
    this.executionCommand = executionCommand;
    this.operationMode = operationMode;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return componentId;
    case 1: return aasId;
    case 2: return correlationId;
    case 3: return occupierId;
    case 4: return requestType;
    case 5: return occupationCommand;
    case 6: return executionMode;
    case 7: return executionCommand;
    case 8: return operationMode;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: componentId = value$ != null ? value$.toString() : null; break;
    case 1: aasId = value$ != null ? value$.toString() : null; break;
    case 2: correlationId = value$ != null ? value$.toString() : null; break;
    case 3: occupierId = value$ != null ? value$.toString() : null; break;
    case 4: requestType = (de.dfki.cos.basys.processcontrol.model.ControlComponentRequestType)value$; break;
    case 5: occupationCommand = (de.dfki.cos.basys.processcontrol.model.OccupationCommand)value$; break;
    case 6: executionMode = (de.dfki.cos.basys.processcontrol.model.ExecutionMode)value$; break;
    case 7: executionCommand = (de.dfki.cos.basys.processcontrol.model.ExecutionCommand)value$; break;
    case 8: operationMode = (de.dfki.cos.basys.processcontrol.model.OperationMode)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'componentId' field.
   * @return The value of the 'componentId' field.
   */
  public java.lang.String getComponentId() {
    return componentId;
  }


  /**
   * Sets the value of the 'componentId' field.
   * @param value the value to set.
   */
  public void setComponentId(java.lang.String value) {
    this.componentId = value;
  }

  /**
   * Gets the value of the 'aasId' field.
   * @return The value of the 'aasId' field.
   */
  public java.lang.String getAasId() {
    return aasId;
  }


  /**
   * Sets the value of the 'aasId' field.
   * @param value the value to set.
   */
  public void setAasId(java.lang.String value) {
    this.aasId = value;
  }

  /**
   * Gets the value of the 'correlationId' field.
   * @return The value of the 'correlationId' field.
   */
  public java.lang.String getCorrelationId() {
    return correlationId;
  }


  /**
   * Sets the value of the 'correlationId' field.
   * @param value the value to set.
   */
  public void setCorrelationId(java.lang.String value) {
    this.correlationId = value;
  }

  /**
   * Gets the value of the 'occupierId' field.
   * @return The value of the 'occupierId' field.
   */
  public java.lang.String getOccupierId() {
    return occupierId;
  }


  /**
   * Sets the value of the 'occupierId' field.
   * @param value the value to set.
   */
  public void setOccupierId(java.lang.String value) {
    this.occupierId = value;
  }

  /**
   * Gets the value of the 'requestType' field.
   * @return The value of the 'requestType' field.
   */
  public de.dfki.cos.basys.processcontrol.model.ControlComponentRequestType getRequestType() {
    return requestType;
  }


  /**
   * Sets the value of the 'requestType' field.
   * @param value the value to set.
   */
  public void setRequestType(de.dfki.cos.basys.processcontrol.model.ControlComponentRequestType value) {
    this.requestType = value;
  }

  /**
   * Gets the value of the 'occupationCommand' field.
   * @return The value of the 'occupationCommand' field.
   */
  public de.dfki.cos.basys.processcontrol.model.OccupationCommand getOccupationCommand() {
    return occupationCommand;
  }


  /**
   * Sets the value of the 'occupationCommand' field.
   * @param value the value to set.
   */
  public void setOccupationCommand(de.dfki.cos.basys.processcontrol.model.OccupationCommand value) {
    this.occupationCommand = value;
  }

  /**
   * Gets the value of the 'executionMode' field.
   * @return The value of the 'executionMode' field.
   */
  public de.dfki.cos.basys.processcontrol.model.ExecutionMode getExecutionMode() {
    return executionMode;
  }


  /**
   * Sets the value of the 'executionMode' field.
   * @param value the value to set.
   */
  public void setExecutionMode(de.dfki.cos.basys.processcontrol.model.ExecutionMode value) {
    this.executionMode = value;
  }

  /**
   * Gets the value of the 'executionCommand' field.
   * @return The value of the 'executionCommand' field.
   */
  public de.dfki.cos.basys.processcontrol.model.ExecutionCommand getExecutionCommand() {
    return executionCommand;
  }


  /**
   * Sets the value of the 'executionCommand' field.
   * @param value the value to set.
   */
  public void setExecutionCommand(de.dfki.cos.basys.processcontrol.model.ExecutionCommand value) {
    this.executionCommand = value;
  }

  /**
   * Gets the value of the 'operationMode' field.
   * @return The value of the 'operationMode' field.
   */
  public de.dfki.cos.basys.processcontrol.model.OperationMode getOperationMode() {
    return operationMode;
  }


  /**
   * Sets the value of the 'operationMode' field.
   * @param value the value to set.
   */
  public void setOperationMode(de.dfki.cos.basys.processcontrol.model.OperationMode value) {
    this.operationMode = value;
  }

  /**
   * Creates a new ControlComponentRequest RecordBuilder.
   * @return A new ControlComponentRequest RecordBuilder
   */
  public static de.dfki.cos.basys.processcontrol.model.ControlComponentRequest.Builder newBuilder() {
    return new de.dfki.cos.basys.processcontrol.model.ControlComponentRequest.Builder();
  }

  /**
   * Creates a new ControlComponentRequest RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new ControlComponentRequest RecordBuilder
   */
  public static de.dfki.cos.basys.processcontrol.model.ControlComponentRequest.Builder newBuilder(de.dfki.cos.basys.processcontrol.model.ControlComponentRequest.Builder other) {
    if (other == null) {
      return new de.dfki.cos.basys.processcontrol.model.ControlComponentRequest.Builder();
    } else {
      return new de.dfki.cos.basys.processcontrol.model.ControlComponentRequest.Builder(other);
    }
  }

  /**
   * Creates a new ControlComponentRequest RecordBuilder by copying an existing ControlComponentRequest instance.
   * @param other The existing instance to copy.
   * @return A new ControlComponentRequest RecordBuilder
   */
  public static de.dfki.cos.basys.processcontrol.model.ControlComponentRequest.Builder newBuilder(de.dfki.cos.basys.processcontrol.model.ControlComponentRequest other) {
    if (other == null) {
      return new de.dfki.cos.basys.processcontrol.model.ControlComponentRequest.Builder();
    } else {
      return new de.dfki.cos.basys.processcontrol.model.ControlComponentRequest.Builder(other);
    }
  }

  /**
   * RecordBuilder for ControlComponentRequest instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ControlComponentRequest>
    implements org.apache.avro.data.RecordBuilder<ControlComponentRequest> {

    private java.lang.String componentId;
    private java.lang.String aasId;
    private java.lang.String correlationId;
    private java.lang.String occupierId;
    private de.dfki.cos.basys.processcontrol.model.ControlComponentRequestType requestType;
    private de.dfki.cos.basys.processcontrol.model.OccupationCommand occupationCommand;
    private de.dfki.cos.basys.processcontrol.model.ExecutionMode executionMode;
    private de.dfki.cos.basys.processcontrol.model.ExecutionCommand executionCommand;
    private de.dfki.cos.basys.processcontrol.model.OperationMode operationMode;
    private de.dfki.cos.basys.processcontrol.model.OperationMode.Builder operationModeBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(de.dfki.cos.basys.processcontrol.model.ControlComponentRequest.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.componentId)) {
        this.componentId = data().deepCopy(fields()[0].schema(), other.componentId);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.aasId)) {
        this.aasId = data().deepCopy(fields()[1].schema(), other.aasId);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.correlationId)) {
        this.correlationId = data().deepCopy(fields()[2].schema(), other.correlationId);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.occupierId)) {
        this.occupierId = data().deepCopy(fields()[3].schema(), other.occupierId);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.requestType)) {
        this.requestType = data().deepCopy(fields()[4].schema(), other.requestType);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.occupationCommand)) {
        this.occupationCommand = data().deepCopy(fields()[5].schema(), other.occupationCommand);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
      if (isValidValue(fields()[6], other.executionMode)) {
        this.executionMode = data().deepCopy(fields()[6].schema(), other.executionMode);
        fieldSetFlags()[6] = other.fieldSetFlags()[6];
      }
      if (isValidValue(fields()[7], other.executionCommand)) {
        this.executionCommand = data().deepCopy(fields()[7].schema(), other.executionCommand);
        fieldSetFlags()[7] = other.fieldSetFlags()[7];
      }
      if (isValidValue(fields()[8], other.operationMode)) {
        this.operationMode = data().deepCopy(fields()[8].schema(), other.operationMode);
        fieldSetFlags()[8] = other.fieldSetFlags()[8];
      }
      if (other.hasOperationModeBuilder()) {
        this.operationModeBuilder = de.dfki.cos.basys.processcontrol.model.OperationMode.newBuilder(other.getOperationModeBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing ControlComponentRequest instance
     * @param other The existing instance to copy.
     */
    private Builder(de.dfki.cos.basys.processcontrol.model.ControlComponentRequest other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.componentId)) {
        this.componentId = data().deepCopy(fields()[0].schema(), other.componentId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.aasId)) {
        this.aasId = data().deepCopy(fields()[1].schema(), other.aasId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.correlationId)) {
        this.correlationId = data().deepCopy(fields()[2].schema(), other.correlationId);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.occupierId)) {
        this.occupierId = data().deepCopy(fields()[3].schema(), other.occupierId);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.requestType)) {
        this.requestType = data().deepCopy(fields()[4].schema(), other.requestType);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.occupationCommand)) {
        this.occupationCommand = data().deepCopy(fields()[5].schema(), other.occupationCommand);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.executionMode)) {
        this.executionMode = data().deepCopy(fields()[6].schema(), other.executionMode);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.executionCommand)) {
        this.executionCommand = data().deepCopy(fields()[7].schema(), other.executionCommand);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.operationMode)) {
        this.operationMode = data().deepCopy(fields()[8].schema(), other.operationMode);
        fieldSetFlags()[8] = true;
      }
      this.operationModeBuilder = null;
    }

    /**
      * Gets the value of the 'componentId' field.
      * @return The value.
      */
    public java.lang.String getComponentId() {
      return componentId;
    }


    /**
      * Sets the value of the 'componentId' field.
      * @param value The value of 'componentId'.
      * @return This builder.
      */
    public de.dfki.cos.basys.processcontrol.model.ControlComponentRequest.Builder setComponentId(java.lang.String value) {
      validate(fields()[0], value);
      this.componentId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'componentId' field has been set.
      * @return True if the 'componentId' field has been set, false otherwise.
      */
    public boolean hasComponentId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'componentId' field.
      * @return This builder.
      */
    public de.dfki.cos.basys.processcontrol.model.ControlComponentRequest.Builder clearComponentId() {
      componentId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'aasId' field.
      * @return The value.
      */
    public java.lang.String getAasId() {
      return aasId;
    }


    /**
      * Sets the value of the 'aasId' field.
      * @param value The value of 'aasId'.
      * @return This builder.
      */
    public de.dfki.cos.basys.processcontrol.model.ControlComponentRequest.Builder setAasId(java.lang.String value) {
      validate(fields()[1], value);
      this.aasId = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'aasId' field has been set.
      * @return True if the 'aasId' field has been set, false otherwise.
      */
    public boolean hasAasId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'aasId' field.
      * @return This builder.
      */
    public de.dfki.cos.basys.processcontrol.model.ControlComponentRequest.Builder clearAasId() {
      aasId = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'correlationId' field.
      * @return The value.
      */
    public java.lang.String getCorrelationId() {
      return correlationId;
    }


    /**
      * Sets the value of the 'correlationId' field.
      * @param value The value of 'correlationId'.
      * @return This builder.
      */
    public de.dfki.cos.basys.processcontrol.model.ControlComponentRequest.Builder setCorrelationId(java.lang.String value) {
      validate(fields()[2], value);
      this.correlationId = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'correlationId' field has been set.
      * @return True if the 'correlationId' field has been set, false otherwise.
      */
    public boolean hasCorrelationId() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'correlationId' field.
      * @return This builder.
      */
    public de.dfki.cos.basys.processcontrol.model.ControlComponentRequest.Builder clearCorrelationId() {
      correlationId = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'occupierId' field.
      * @return The value.
      */
    public java.lang.String getOccupierId() {
      return occupierId;
    }


    /**
      * Sets the value of the 'occupierId' field.
      * @param value The value of 'occupierId'.
      * @return This builder.
      */
    public de.dfki.cos.basys.processcontrol.model.ControlComponentRequest.Builder setOccupierId(java.lang.String value) {
      validate(fields()[3], value);
      this.occupierId = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'occupierId' field has been set.
      * @return True if the 'occupierId' field has been set, false otherwise.
      */
    public boolean hasOccupierId() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'occupierId' field.
      * @return This builder.
      */
    public de.dfki.cos.basys.processcontrol.model.ControlComponentRequest.Builder clearOccupierId() {
      occupierId = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'requestType' field.
      * @return The value.
      */
    public de.dfki.cos.basys.processcontrol.model.ControlComponentRequestType getRequestType() {
      return requestType;
    }


    /**
      * Sets the value of the 'requestType' field.
      * @param value The value of 'requestType'.
      * @return This builder.
      */
    public de.dfki.cos.basys.processcontrol.model.ControlComponentRequest.Builder setRequestType(de.dfki.cos.basys.processcontrol.model.ControlComponentRequestType value) {
      validate(fields()[4], value);
      this.requestType = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'requestType' field has been set.
      * @return True if the 'requestType' field has been set, false otherwise.
      */
    public boolean hasRequestType() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'requestType' field.
      * @return This builder.
      */
    public de.dfki.cos.basys.processcontrol.model.ControlComponentRequest.Builder clearRequestType() {
      requestType = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'occupationCommand' field.
      * @return The value.
      */
    public de.dfki.cos.basys.processcontrol.model.OccupationCommand getOccupationCommand() {
      return occupationCommand;
    }


    /**
      * Sets the value of the 'occupationCommand' field.
      * @param value The value of 'occupationCommand'.
      * @return This builder.
      */
    public de.dfki.cos.basys.processcontrol.model.ControlComponentRequest.Builder setOccupationCommand(de.dfki.cos.basys.processcontrol.model.OccupationCommand value) {
      validate(fields()[5], value);
      this.occupationCommand = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'occupationCommand' field has been set.
      * @return True if the 'occupationCommand' field has been set, false otherwise.
      */
    public boolean hasOccupationCommand() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'occupationCommand' field.
      * @return This builder.
      */
    public de.dfki.cos.basys.processcontrol.model.ControlComponentRequest.Builder clearOccupationCommand() {
      occupationCommand = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'executionMode' field.
      * @return The value.
      */
    public de.dfki.cos.basys.processcontrol.model.ExecutionMode getExecutionMode() {
      return executionMode;
    }


    /**
      * Sets the value of the 'executionMode' field.
      * @param value The value of 'executionMode'.
      * @return This builder.
      */
    public de.dfki.cos.basys.processcontrol.model.ControlComponentRequest.Builder setExecutionMode(de.dfki.cos.basys.processcontrol.model.ExecutionMode value) {
      validate(fields()[6], value);
      this.executionMode = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'executionMode' field has been set.
      * @return True if the 'executionMode' field has been set, false otherwise.
      */
    public boolean hasExecutionMode() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'executionMode' field.
      * @return This builder.
      */
    public de.dfki.cos.basys.processcontrol.model.ControlComponentRequest.Builder clearExecutionMode() {
      executionMode = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'executionCommand' field.
      * @return The value.
      */
    public de.dfki.cos.basys.processcontrol.model.ExecutionCommand getExecutionCommand() {
      return executionCommand;
    }


    /**
      * Sets the value of the 'executionCommand' field.
      * @param value The value of 'executionCommand'.
      * @return This builder.
      */
    public de.dfki.cos.basys.processcontrol.model.ControlComponentRequest.Builder setExecutionCommand(de.dfki.cos.basys.processcontrol.model.ExecutionCommand value) {
      validate(fields()[7], value);
      this.executionCommand = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'executionCommand' field has been set.
      * @return True if the 'executionCommand' field has been set, false otherwise.
      */
    public boolean hasExecutionCommand() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'executionCommand' field.
      * @return This builder.
      */
    public de.dfki.cos.basys.processcontrol.model.ControlComponentRequest.Builder clearExecutionCommand() {
      executionCommand = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'operationMode' field.
      * @return The value.
      */
    public de.dfki.cos.basys.processcontrol.model.OperationMode getOperationMode() {
      return operationMode;
    }


    /**
      * Sets the value of the 'operationMode' field.
      * @param value The value of 'operationMode'.
      * @return This builder.
      */
    public de.dfki.cos.basys.processcontrol.model.ControlComponentRequest.Builder setOperationMode(de.dfki.cos.basys.processcontrol.model.OperationMode value) {
      validate(fields()[8], value);
      this.operationModeBuilder = null;
      this.operationMode = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'operationMode' field has been set.
      * @return True if the 'operationMode' field has been set, false otherwise.
      */
    public boolean hasOperationMode() {
      return fieldSetFlags()[8];
    }

    /**
     * Gets the Builder instance for the 'operationMode' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public de.dfki.cos.basys.processcontrol.model.OperationMode.Builder getOperationModeBuilder() {
      if (operationModeBuilder == null) {
        if (hasOperationMode()) {
          setOperationModeBuilder(de.dfki.cos.basys.processcontrol.model.OperationMode.newBuilder(operationMode));
        } else {
          setOperationModeBuilder(de.dfki.cos.basys.processcontrol.model.OperationMode.newBuilder());
        }
      }
      return operationModeBuilder;
    }

    /**
     * Sets the Builder instance for the 'operationMode' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public de.dfki.cos.basys.processcontrol.model.ControlComponentRequest.Builder setOperationModeBuilder(de.dfki.cos.basys.processcontrol.model.OperationMode.Builder value) {
      clearOperationMode();
      operationModeBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'operationMode' field has an active Builder instance
     * @return True if the 'operationMode' field has an active Builder instance
     */
    public boolean hasOperationModeBuilder() {
      return operationModeBuilder != null;
    }

    /**
      * Clears the value of the 'operationMode' field.
      * @return This builder.
      */
    public de.dfki.cos.basys.processcontrol.model.ControlComponentRequest.Builder clearOperationMode() {
      operationMode = null;
      operationModeBuilder = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public ControlComponentRequest build() {
      try {
        ControlComponentRequest record = new ControlComponentRequest();
        record.componentId = fieldSetFlags()[0] ? this.componentId : (java.lang.String) defaultValue(fields()[0]);
        record.aasId = fieldSetFlags()[1] ? this.aasId : (java.lang.String) defaultValue(fields()[1]);
        record.correlationId = fieldSetFlags()[2] ? this.correlationId : (java.lang.String) defaultValue(fields()[2]);
        record.occupierId = fieldSetFlags()[3] ? this.occupierId : (java.lang.String) defaultValue(fields()[3]);
        record.requestType = fieldSetFlags()[4] ? this.requestType : (de.dfki.cos.basys.processcontrol.model.ControlComponentRequestType) defaultValue(fields()[4]);
        record.occupationCommand = fieldSetFlags()[5] ? this.occupationCommand : (de.dfki.cos.basys.processcontrol.model.OccupationCommand) defaultValue(fields()[5]);
        record.executionMode = fieldSetFlags()[6] ? this.executionMode : (de.dfki.cos.basys.processcontrol.model.ExecutionMode) defaultValue(fields()[6]);
        record.executionCommand = fieldSetFlags()[7] ? this.executionCommand : (de.dfki.cos.basys.processcontrol.model.ExecutionCommand) defaultValue(fields()[7]);
        if (operationModeBuilder != null) {
          try {
            record.operationMode = this.operationModeBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("operationMode"));
            throw e;
          }
        } else {
          record.operationMode = fieldSetFlags()[8] ? this.operationMode : (de.dfki.cos.basys.processcontrol.model.OperationMode) defaultValue(fields()[8]);
        }
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<ControlComponentRequest>
    WRITER$ = (org.apache.avro.io.DatumWriter<ControlComponentRequest>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<ControlComponentRequest>
    READER$ = (org.apache.avro.io.DatumReader<ControlComponentRequest>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}










