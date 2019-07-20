import java.util.Scanner; 
public class Maze{


static void fibonacci(int n){
int n1=0,n2=1;
int n3=0;
for(int i=1;i<=n-2;i++){
n3=n1+n2;
n1=n2;
n2=n3;
}
System.out.println(n3);

}


static void prime(int n){
System.out.println("The number entered is: "+ n);
for(int i=1;i<=n;i++)
{
int counter=0;
for(int j=n;j<=1;j--)
{
if(i%j==0){
counter=counter+1;
}
}

if(counter==2){
System.out.print(i);

}
}
}

public static void main(String args[]){
Scanner sc = new Scanner(System.in);

int n=sc.nextInt();
prime(n);
}

}
