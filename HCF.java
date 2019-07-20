import java.util.Scanner;
import java.util.*;
class HCF{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);
System.out.println("Enter a number");
int n = sc.nextInt();
int gcd=1;
int smallest=1;
int temp=1;


int a[]=new int[n];
System.out.println("Enter "+ n +" numbers");
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
}
for(int i=0;i<a.length;i++){
for(int j=i+1;j<a.length;j++){
if(a[i]>a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
smallest=a[0];
System.out.println("The smallest number is "+smallest);


for(int j=1;j<=smallest;j++){
int flag =0;
for(int i=0;i<n;i++){
if(a[i]%j!=0){
flag=1;
break;
}
if (flag==0){
gcd=j;
}
}
}
System.out.println("HCF of the numbers is " + gcd);
}
}