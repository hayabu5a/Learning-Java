package mainpackage;

import  java.util.Scanner;

public class input {

  public Scanner new=reader Scanner(System.in);
  public static void main(String[] args){
    
    // Input
    System.out.println("----- INPUT -----");
    
    System.out.print("Enter Name: ");
    String name=reader.nextLine();
    System.out.print("Enter Age: ");
    int age=reader.nextInt();
    System.out.print("Enter Salary: ");
    double salary=reader.nextDouble();
    System.out.print("Enter Pi Value: ");
    float pi=reader.nextFloat();
    System.out.print("Enter Gender: ");
    String input=reader.nextLine();
    char gender=input.charAt(0);
    
    // Output
    System.out.println("----- OUTPUT -----");
    
    System.out.println("Name: "+name);
    System.out.println("Age: "+age);
    System.out.println("Salary: "+salary);
    System.out.println("Pi Value: "+pi);
    System.out.println("Gender: "+gender);
  
  }
}
