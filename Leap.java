import java.util.Scanner;
class Leap{
public static void main(String args[]){
long year;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the year");
year= sc.nextLong();
boolean isLeap=false;
if(year%4==0){
if(year%100==0){
if(year%400==0)
isLeap=true;
else
isLeap=false;
}
else
isLeap=true;
}
else{
isLeap=false;
}

if(isLeap==true)
System.out.println("This is a leap year");
else
System.out.println("This is not a leap year");
}
}