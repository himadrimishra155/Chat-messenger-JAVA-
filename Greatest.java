import java.util.Scanner;
class Greatest{
public static void main(String args[]){
int n[] = new int[10];
int greatest=n[0];
Scanner sc = new Scanner(System.in);
System.out.println("Enter the numbers");
for(int i=0;i<10;i++){
n[i]=sc.nextInt();
}
for(int i=0;i<10;i++){
if(n[i]>=greatest){
greatest=n[i];
}
}
System.out.println("The greatest among 10  numbers is :" +greatest);
}

}
