import java.util.Scanner;
public class Area{
public static void main(String args[]){
double b,h,area;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the base");
b=sc.nextDouble();
System.out.println("Enter the height");
h=sc.nextDouble();
area=(b*h)/2;
System.out.println("The area of the traingle :" +area);
}
}