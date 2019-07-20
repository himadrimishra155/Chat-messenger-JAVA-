import java.util.Scanner;
public class Maze1{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number");
int n=sc.nextInt();
if(n%2==0){
int input=n/2;
int r=input-1;
int k=3;
int output1= (int)Math.pow(k,r);
System.out.println(output1);
}

else{
int input=(n+1)/2;
int r=input-1;
int k=2;
int output2=(int)Math.pow(k,r);
System.out.println(output2);
}


}
}


