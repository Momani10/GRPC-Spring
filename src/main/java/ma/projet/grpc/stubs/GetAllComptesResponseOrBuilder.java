// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compte.proto

package ma.projet.grpc.stubs;

public interface GetAllComptesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:GetAllComptesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .Compte comptes = 1;</code>
   */
  java.util.List<ma.projet.grpc.stubs.Compte> 
      getComptesList();
  /**
   * <code>repeated .Compte comptes = 1;</code>
   */
  ma.projet.grpc.stubs.Compte getComptes(int index);
  /**
   * <code>repeated .Compte comptes = 1;</code>
   */
  int getComptesCount();
  /**
   * <code>repeated .Compte comptes = 1;</code>
   */
  java.util.List<? extends ma.projet.grpc.stubs.CompteOrBuilder> 
      getComptesOrBuilderList();
  /**
   * <code>repeated .Compte comptes = 1;</code>
   */
  ma.projet.grpc.stubs.CompteOrBuilder getComptesOrBuilder(
      int index);
}
