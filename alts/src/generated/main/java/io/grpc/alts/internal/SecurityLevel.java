// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/gcp/transport_security_common.proto

package io.grpc.alts.internal;

/**
 * <pre>
 * The security level of the created channel. The list is sorted in increasing
 * level of security. This order must always be maintained.
 * </pre>
 *
 * Protobuf enum {@code grpc.gcp.SecurityLevel}
 */
public enum SecurityLevel
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>SECURITY_NONE = 0;</code>
   */
  SECURITY_NONE(0),
  /**
   * <code>INTEGRITY_ONLY = 1;</code>
   */
  INTEGRITY_ONLY(1),
  /**
   * <code>INTEGRITY_AND_PRIVACY = 2;</code>
   */
  INTEGRITY_AND_PRIVACY(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>SECURITY_NONE = 0;</code>
   */
  public static final int SECURITY_NONE_VALUE = 0;
  /**
   * <code>INTEGRITY_ONLY = 1;</code>
   */
  public static final int INTEGRITY_ONLY_VALUE = 1;
  /**
   * <code>INTEGRITY_AND_PRIVACY = 2;</code>
   */
  public static final int INTEGRITY_AND_PRIVACY_VALUE = 2;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static SecurityLevel valueOf(int value) {
    return forNumber(value);
  }

  public static SecurityLevel forNumber(int value) {
    switch (value) {
      case 0: return SECURITY_NONE;
      case 1: return INTEGRITY_ONLY;
      case 2: return INTEGRITY_AND_PRIVACY;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<SecurityLevel>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      SecurityLevel> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<SecurityLevel>() {
          public SecurityLevel findValueByNumber(int number) {
            return SecurityLevel.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return io.grpc.alts.internal.TransportSecurityCommonProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final SecurityLevel[] VALUES = values();

  public static SecurityLevel valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private SecurityLevel(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:grpc.gcp.SecurityLevel)
}

