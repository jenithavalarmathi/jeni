import java.util.*;
import java.io.*;
public class Leapornot{
   public static void main(String args[]){
    int y;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the year");
    y=s.nextInt();
    boolean i=false;
    if(y%400==0){
        i=true;
    }
    else if(y%100==0){
       i=false;
    }
    else if(y%4==0){
      i=false;
    }
    if(i)
    {
      System.out.println(i+" is leapyear");
    }
     else
     {
      System.out.println(i+" is not leapyear");
    } 
  }
}
