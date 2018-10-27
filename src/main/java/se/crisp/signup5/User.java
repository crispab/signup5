package se.crisp.signup5;

import lombok.Data;

@Data
public class User {
  private Long id;
  private String firstName;
  private String lastName;
  private String comment;
  private String email;
  private String phone;
  private String permission;
  private String pwd;
  private String imageProvider;
  private String imageVersion;
  private String providerKey;
  private String authInfo;
}
