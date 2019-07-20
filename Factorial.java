import java.util.Scanner; 
class Factorial{
public static void main(String args[]){
long num;
System.out.println("Enter the number");
Scanner sc = new Scanner(System.in);

num=sc.nextInt();

long f = fact(num);
System.out.println("The factorial of the number is : " +f);
}
static long fact(long num)
{
if(num<=0)
return 1;
 
return fact(num-1)*num;
}
}
