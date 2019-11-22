package com.company;

import java.util.Scanner;

public class Email {
  private String firstname;
  private String lastname;
  private String password;
  private String department;
  private int mailBoxCapacity;
  private String alternateEmail;

  public Email(String firstname, String lastname) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.department = setDepartment();
    System.out.println("Email created "+ this.firstname+" "+this.lastname);
// call department and return department.
  }

  private  String setDepartment() {

    System.out.println("enter the students department please \n1 for sales \n 2 for department"
        + "\n 3 for Acconting\n 0 for Name");
    Scanner in =new Scanner(System.in);
    int deptChoice = in.nextInt();
    if(deptChoice==1){return "sales";}
    else if(deptChoice==2){return "developement";}
    else if(deptChoice ==3){return "Account";}
    else{return "";}
  }
}
