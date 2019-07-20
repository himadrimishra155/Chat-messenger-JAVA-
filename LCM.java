import java.util.Scanner;
class LCM{
public static void main(String args[]){
int n1,n2,gcd=1;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the numbers");
n1=sc.nextInt();
n2=sc.nextInt();
for(int i=1;i<=n1 && i<=n2;i++){
if(n1%i==0 && n2%i==0)
gcd=i;
}
int lcm=(n1*n2)/gcd;
System.out.println("The LCM of the numbers is : " + lcm);
}
}