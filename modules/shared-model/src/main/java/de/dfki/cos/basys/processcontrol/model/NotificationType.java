/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package de.dfki.cos.basys.processcontrol.model;
@org.apache.avro.specific.AvroGenerated
public enum NotificationType implements org.apache.avro.generic.GenericEnumSymbol<NotificationType> {
  LEADING_INTO_WRONG_DIRECTION, WRONG_LOCATION_REACHED, GRASPED_AT_WRONG_LOCATION, WRONG_QUANTITY_TAKEN  ;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"enum\",\"name\":\"NotificationType\",\"namespace\":\"de.dfki.cos.basys.processcontrol.model\",\"symbols\":[\"LEADING_INTO_WRONG_DIRECTION\",\"WRONG_LOCATION_REACHED\",\"GRASPED_AT_WRONG_LOCATION\",\"WRONG_QUANTITY_TAKEN\"]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
}
