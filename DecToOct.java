import java.util.Scanner; 
public class DecToOct{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number");
int n = sc.nextInt();
String a="";
String reverse="";
while(n!=0){
int p=n/8;
int rem=n%8;
n=p;
String x=Integer.toString(rem);
a=a.concat(x);
}
for(int i=a.length()-1;i>=0;i--){
reverse+=a.charAt(i);
}
System.out.println(reverse);
}
}