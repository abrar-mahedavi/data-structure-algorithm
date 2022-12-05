package com.abu.datastructure.recursion;

public class PrintNumber {

  public void printNumber(Integer currentNumber,Integer numberOfTimes){
    if (currentNumber>numberOfTimes) {
      return;
    }
    System.out.println(currentNumber);
    printNumber(currentNumber+1, numberOfTimes);
  }

  public static void main(String[] args) {
    PrintNumber printNumber = new PrintNumber();
    printNumber.printNumber(1,5);
  }
}
