import java.util.Scanner;
class BinToDec{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the binary number");
int n=sc.nextInt();
int decimal=0,p=0;
while(n!=0){
int last_digit=n%10;
n=n/10;
decimal+=last_digit*Math.pow(2,p);
p++;
}
System.out.println(decimal);

}
}