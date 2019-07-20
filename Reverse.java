import java.util.Scanner;
class Reverse{
public static void main(String args[]){
String s; 
Scanner sc= new Scanner(System.in);
System.out.println("Enter a string");
s=sc.nextLine();
String reverse=" ";
for(int i=s.length()-1;i>=0;i--){
reverse=reverse+s.charAt(i);
}
System.out.println("The reversed string is :" +reverse);
}
}

