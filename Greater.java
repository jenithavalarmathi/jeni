import java.util.*;
import java.io.*;
public class Greater{
   public static void main(String args[]){
    int i,j,k;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the three values");
    i=s.nextInt();
    j=s.nextInt();
    k=s.nextInt();
    if(i>=j && i>=k){
      System.out.println(i+" is greater");
    }
    else if(j>=i && j>=k){
      System.out.println(j+" is greater");
    }
    else{
      System.out.println(k+" is greater");
    }
  }
}
