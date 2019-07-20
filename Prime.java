import java.util.Scanner;
class Prime{
public static void main(String args[]){
int n;
int flag=0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number");
n=sc.nextInt();

for(int i=2;i<n-1;i++){
if(n%i==0){
flag=1;
}
}
if(flag==1){
System.out.println("The number is not prime");
}
else{
System.out.println("The number is prime");
}


}
}