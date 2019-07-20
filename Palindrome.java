import java.util.Scanner;
class Palindrome{
public static void main(String args[]){
long n,r,sum=0,temp;
System.out.println("enter the number");
Scanner sc = new Scanner(System.in);
n=sc.nextLong();
temp=n;
while(n>0){
r=n%10;
sum=(sum*10)+r;
n=n/10;
}
if(temp==sum)
System.out.println("The number is palindrome");
else
System.out.println("The number is not palindrome");
}
}