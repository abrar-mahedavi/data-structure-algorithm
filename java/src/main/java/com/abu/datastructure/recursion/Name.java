package com.abu.datastructure.recursion;

/**
 * Print the name n number times.
 */
public class Name {

  public void printName(Integer currentCounter,Integer numberOfTimes){
    if(currentCounter>numberOfTimes ){
      return;
    }
    System.out.println("Abrar");
    printName(currentCounter+1,numberOfTimes);
  }

  public static void main(String[] args) {
    Name name = new Name();
    name.printName(1,5);
  }

}
