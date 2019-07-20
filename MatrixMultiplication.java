import java.util.Scanner;
class MatrixMultiplication{
public static void main(String args[]){
int a=0,b=0,c=0,d=0,sum=0;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of rows");
a = sc.nextInt();
System.out.println("Enter the number of columns");
b = sc.nextInt();
int first[][]= new int[a][b];
System.out.println("Enter the elements of first matrix");
for(int i=0;i<a;i++){
for(int j=0;j<b;j++){
first[i][j]=sc.nextInt();
}
}
System.out.println("The matrix is :");
for(int i=0;i<a;i++){
for(int j=0;j<b;j++){

System.out.print(first[i][j] + "\t");
}
System.out.print("\n");

}

System.out.println("Enter the number of rows");
c= sc.nextInt();
System.out.println("Enter the number of columns");
d = sc.nextInt();
int second[][]= new int[c][d];
System.out.println("Enter the elements of second matrix");
for(int i=0;i<c;i++){
for(int j=0;j<d;j++){
second[i][j]=sc.nextInt();
}
}
System.out.println("The matrix is :");
for(int i=0;i<c;i++){
for(int j=0;j<d;j++){

System.out.print(second[i][j] + "\t");
}
System.out.print("\n");
}

if(b!=c)
System.out.println("Multiplication is not possible");
else{
int result[][] = new int[b][d];
for(int i=0;i<b;i++){
for(int j=0;j<d;j++){
for(int k=0;k<a;i++){
sum=sum+first[i][k]*second[k][j];
}
result[i][j]=sum;
}
}
System.out.println("product is :");
for(int i=0;i<b;i++){
for(int j=0;j<d;j++){
System.out.println(result[b][d]+"\t");
}
System.out.println("\n");
}

}

}
}


