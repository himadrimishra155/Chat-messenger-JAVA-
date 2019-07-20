import java.util.Scanner;
public class SquareRoot{
public static void main(String args[]){
double n,result;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number");
n=sc.nextInt();
result=Math.pow(n,0.5);
System.out.println(result);
}
}