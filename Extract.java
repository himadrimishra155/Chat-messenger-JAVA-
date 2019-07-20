import java.util.Scanner;
class Extract{
public static void main(String args[]){
String s;
Scanner sc = new Scanner(System.in);
s=sc.nextLine();
System.out.println("The string is "+s);
int value = Integer.parseInt(s.replaceAll("[^0-9]",""));
System.out.println(value);
}
}