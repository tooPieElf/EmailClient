package com.company;

import java.util.Scanner;
import java.math.*;
import jdk.swing.interop.SwingInterOpUtils;

public class Email {
  private String firstname;
  private String lastname;
  private String password;
  private String department;
  private int mailBoxCapacity;
  private String alternateEmail;


  //Email constructor.
  public Email(String firstname, String lastname) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.department = setDepartment();
    this.password = setPassword(15);
    this.alternateEmail = setEmail();
    System.out.println("Email created "+ this.firstname+" "+this.lastname);
    System.out.println("Department is "+ this.department);
    System.out.println("Passwod is "+ this.password);
    System.out.println("email is "+ this.alternateEmail);


  }

  private  String setDepartment() {

    System.out.print("DEPARTMENT CODES:  \n1 for sales \n 2 for department"
        + "\n 3 for Acconting\n 0 for Name\n enter the students department please");
    Scanner in =new Scanner(System.in);
    int deptChoice = in.nextInt();
    if(deptChoice==1){return "sales";}
    else if(deptChoice==2){return "developement";}
    else if(deptChoice ==3){return "Account";}
    else{return "no department specified";}
  }
  private String setPassword(int passwordLength){
    String seed = "abcdefghijklmnopqrstuvwxyzABCDEFHIJKLMNOPQRSTUVWXYZ@##$%^&*(){}><?"+this.firstname+this.lastname;
    char[] value = new char[passwordLength];
    for(int i =0;i<passwordLength;i++){
      int randNum = (int) (Math.random()*seed.length());// note the position of the brackets. it could be buggy.
      value[i]=seed.charAt(randNum);
    }
    return  new String(value);
  }
// Next task is to auto generate email based on the username.
private String setEmail(){

    return this.lastname+"."+this.firstname+"@"+"gmail.com";
}
}
