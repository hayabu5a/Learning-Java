package mainpackage;

public class operations {

/* 
[Calculators functions]
Use BODMAS 
0 - ()
1 - (--,++,before)
2 - ^
3 - multiplication * and division *
4 - addition + and substraction +
5 - =
6 - (--,++ after)
*/
  
/*
++n=n++ --> n=n+1;
--n=n-- --> n=n-1;
*/
  
  public static void main(String[] args){
  
  int n1=5;
  int n2=12;
  int n3=25;
  
  int ans=(n1+n2)*n3+3;
  int ans2=(n1++ n2)*n3;
  
  System.out.println("Answer: "+ans);
  System.out.println("Answer2: "+ans2);
  System.out.println("n1: "+n1);


/*
OUTPUT
Answer: 378
Answer2: 375
n1: 6
*/


  }
}
