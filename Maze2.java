import java.util.Scanner;
public class Maze2{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the term");
int n = sc.nextInt();
if(n%2==0){
int x=n/2;
int input=x-1;
int output=input;
System.out.println(output);

}
else{
int x=(n+1)/2;
int input=x-1;
int output=2*input;
System.out.println(output);
}
}
}