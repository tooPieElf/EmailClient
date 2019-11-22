package com.company;

public class Email {
  private String firstname;
  private String lastname;
  private String password;
  private String department;
  private int mailBoxCapacity;
  private String alternateEmail;

  public Email(String firstname, String lastname, String password, String department,
      int mailBoxCapacity, String alternateEmail) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.password = password;
    this.department = department;
    this.mailBoxCapacity = mailBoxCapacity;
    this.alternateEmail = alternateEmail;
  }
}
