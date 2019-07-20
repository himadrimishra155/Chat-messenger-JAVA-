import java.util.Scanner;
public class DecToBin{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number");
int n= sc.nextInt();
String reverse="";
String y="";
while(n!=1){  
int p=n/2;
int rem = n%2;
n=p;
String x = Integer.toString(rem);
y=y.concat(x);
}
for(int i=y.length()-1;i>=0;i--){
reverse+=y.charAt(i);
}
System.out.println("1" + reverse);	
}
}