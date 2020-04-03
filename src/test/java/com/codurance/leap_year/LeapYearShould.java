package com.codurance.leap_year;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

//  Implement a method that checks if a year is a leap year.
//
//  All the following rules must be satisfied:
//
//  A year is not a leap year if not divisible by 4
//  A year is a leap year if divisible by 4
//  A year is a leap year if divisible by 400
//  A year is not a leap year if divisible by 100 but not by 400
//  Examples:
//
//          1997 is not a leap year (not divisible by 4)
//1996 is a leap year (divisible by 4)
//1600 is a leap year (divisible by 400)
//1800 is not a leap year (divisible by 4, divisible by 100, NOT divisible by 400)

public class LeapYearShould {
  private LeapYear leapYear;

  @BeforeEach
  void setUp() {
    leapYear = new LeapYear();
  }


  @Test
  void return_false_if_not_divisible_by_four() {
    assertFalse(leapYear.verify(1997));
  }

  @Test
  void return_true_if_divisible_by_four() {
    assertTrue(leapYear.verify(1996));
  }

  @Test
  void return_true_if_divisible_by_four_hundred() {
    assertTrue(leapYear.verify(1600));
  }

  @Test
  void return_false_if_divisible_by_one_hundred_but_not_four_hundred() {
    assertFalse(leapYear.verify(1800));
  }
}
