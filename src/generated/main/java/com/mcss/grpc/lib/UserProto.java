// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user.proto

// Protobuf Java Version: 3.25.1
package com.mcss.grpc.lib;

public final class UserProto {
  private UserProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_mcss_grpc_UserReadRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_mcss_grpc_UserReadRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_mcss_grpc_UserReadResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_mcss_grpc_UserReadResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nuser.proto\022\rcom.mcss.grpc\"\035\n\017UserReadR" +
      "equest\022\n\n\002id\030\001 \001(\t\"\215\001\n\020UserReadResponse\022" +
      "\n\n\002id\030\001 \001(\t\022\021\n\004name\030\002 \001(\tH\000\210\001\001\022\022\n\005email\030" +
      "\003 \001(\tH\001\210\001\001\022\025\n\010password\030\004 \001(\tH\002\210\001\001\022\017\n\007cou" +
      "rses\030\005 \003(\tB\007\n\005_nameB\010\n\006_emailB\013\n\t_passwo" +
      "rd2`\n\017UserReadService\022M\n\010ReadUser\022\036.com." +
      "mcss.grpc.UserReadRequest\032\037.com.mcss.grp" +
      "c.UserReadResponse\"\000B \n\021com.mcss.grpc.li" +
      "bB\tUserProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_mcss_grpc_UserReadRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_mcss_grpc_UserReadRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_mcss_grpc_UserReadRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_com_mcss_grpc_UserReadResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_mcss_grpc_UserReadResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_mcss_grpc_UserReadResponse_descriptor,
        new java.lang.String[] { "Id", "Name", "Email", "Password", "Courses", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
