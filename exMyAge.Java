package mainpackage;

import.util.Scanner;
import.util.Calender;

public class MyAge{
  static Scanner reader=new Scanner(System.in);
  public static void main(String[] args){
  
  System.out.print("Enter Your DOY: ");
  int doy=reader.nextInt();
  // Fetch Current Year from Your System
  int year=Calender.getInstance().get(Calender.YEAR);
  int age=year-doy;
  
  System.out.println("Your Age is: "+age+" Years");
  
  }
}

/* 
- OUTPUT (Example)
Enter Your Age: 1991 (Input)
Your Age is: 28 Years
*/
