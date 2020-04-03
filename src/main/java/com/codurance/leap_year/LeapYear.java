package com.codurance.leap_year;

public class LeapYear {
  public boolean verify(int year) {
    if(isDivisibleBy(year, 100) && !isDivisibleBy(year, 400)){
      return false;
    }

    return isDivisibleBy(year, 4);
  }

  private boolean isDivisibleBy(int year, int i) {
    return year % i == 0;
  }
}
