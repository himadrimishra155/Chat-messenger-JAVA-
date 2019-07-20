import java.util.*;	
import java.io.*;
class Stack{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number");
Stack stk = new Stack();
int n= sc.nextInt();

while(n!=1){
int p=n/2;
int rem=n%2;
stk.push(rem);
n=p;
}
while(!(stk.isEmpty())){
System.out.println("1"+stk.pop());
}


}
}