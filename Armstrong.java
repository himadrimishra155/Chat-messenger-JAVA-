import java.util.Scanner;
class Armstrong{
public static void main(String args[]){
long n,r,temp,result=0;
System.out.println("Enter the number");
Scanner sc = new Scanner(System.in);
n=sc.nextLong();
temp=n;
while(n>0){
r=n%10;
result+=Math.pow(r,3);
n=n/10;
}
if(result==temp)
System.out.println("It is an armstrong number");
else
System.out.println("It is not an armstrong number");
}
}

