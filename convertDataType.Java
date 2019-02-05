package mainpackage;

public class convert{

  public static void main(String[] args){
  
  int age=27;
  double salary=3500.5;
  boolean isTrue=true;
  String rate="3.5";
  
  // convert to String
  String newAge=String.valueOf(age);
  String newSalary=String.valueOf(salary);
  String newIsTrue=String.valueOf(isTrue);
  
  // convert to Integer
  int newRate=Integer.parseInt(rate);
  int NewSalary=(int) salary;
  
  // convert to Double
  double NewRate=Double.parseDouble(rate);
  double NewAge=(double) age;
  
  }
}
