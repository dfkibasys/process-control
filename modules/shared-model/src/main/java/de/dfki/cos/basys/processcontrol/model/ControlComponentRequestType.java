/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package de.dfki.cos.basys.processcontrol.model;
@org.apache.avro.specific.AvroGenerated
public enum ControlComponentRequestType implements org.apache.avro.generic.GenericEnumSymbol<ControlComponentRequestType> {
  OCCUPATION_COMMAND_REQUEST, EXECUTION_MODE_REQUEST, EXECUTION_COMMAND_REQUEST, OPERATION_MODE_REQUEST  ;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"enum\",\"name\":\"ControlComponentRequestType\",\"namespace\":\"de.dfki.cos.basys.processcontrol.model\",\"symbols\":[\"OCCUPATION_COMMAND_REQUEST\",\"EXECUTION_MODE_REQUEST\",\"EXECUTION_COMMAND_REQUEST\",\"OPERATION_MODE_REQUEST\"]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
}
