package com.company;

import java.util.Scanner;
import java.math.*;
import jdk.swing.interop.SwingInterOpUtils;

public class Email {
  private String firstname;
  private String lastname;
  private String password;
  private String department;
  private String email;
  private int defaultPasswordLength=10;
  private int mailBoxCapacity=500;
  private String alternateEmail;


  public void setDefaultPasswordLength(int defaultPasswordLength) {
    this.defaultPasswordLength = defaultPasswordLength;

    // find out why this isnt setting the password in the setter
  }

  public void setMailBoxCapacity(int mailBoxCapacity) {
    this.mailBoxCapacity = mailBoxCapacity;
  }

  public void setAlternateEmail(String alternateEmail) {
    this.alternateEmail = alternateEmail;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getPassword() {
    return password;
  }

  public int getDefaultPasswordLength() {
    return defaultPasswordLength;
  }

  public int getMailBoxCapacity() {
    return mailBoxCapacity;
  }

  public String getAlternateEmail() {
    return alternateEmail;
  }



  //Email constructor for first and last name.
  public Email(String firstname, String lastname) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.department = setDepartment();
    this.password = setPassword(defaultPasswordLength);
    this.email = setEmail();



  }

  private  String setDepartment() {

    System.out.print("DEPARTMENT CODES:  \n1 for sales \n 2 for department"
        + "\n 3 for Acconting\n 0 for None\n enter the department code :");
    Scanner in =new Scanner(System.in);
    int deptChoice = in.nextInt();
    if(deptChoice==1){return "sales";}
    else if(deptChoice==2){return "developement";}
    else if(deptChoice ==3){return "Account";}
    else{return "no department specified"; }
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

    return this.lastname.toLowerCase()+"."+this.firstname.toLowerCase()+"@"+"gmail.com";
}

public String show(){
    return  "DISPLAY NAME  :" +firstname+" "+lastname+'\n'+
             "COMPANY EMAIL :" + email +'\n'+
            "ALTRNATE EMAIL :" +alternateEmail+'\n'+
             "MAILBOX CAPACITY :"+ mailBoxCapacity + "mb"+ '\n'+
             "PASSWORD :"+ password ;
  }
}
