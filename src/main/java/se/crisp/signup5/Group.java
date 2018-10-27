package se.crisp.signup5;

import lombok.Data;

@Data
public class Group {
  Long id;
  String name;
  String description = "";
  String mailFrom = "";
  String mailSubjectPrefix = "";
}
