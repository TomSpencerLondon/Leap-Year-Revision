package com.codurance.leap_year;

public class LeapYear {
  public boolean verify(int year) {
    if (year % 4 == 0){
      return true;
    }
    return false;
  }
}
