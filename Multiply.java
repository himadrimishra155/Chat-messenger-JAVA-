import java.util.Scanner;
class MatrixMultiplication{
public static void main(String args[]){
int a,b;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of rows");
a = sc.nextInt();
System.out.println("Enter the number of columns");
b = sc.nextInt();
int first[][]= new int[m][n];
System.out.println("Enter the elements of first matrix");
for(int i=0;i<a;i++){
for(int j=0;j<b;j++){
first[i][j]=sc.nextInt();
}
}
System.out.println("The matrix is " + first[][]);
}
}