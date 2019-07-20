import java.util.Scanner;
public class Maze3{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
String a=sc.nextLine();
String b= sc.nextLine();
String c= sc.nextLine();
System.out.println(a +" " + b+" "+c);

char str[]=a.toCharArray();
char str1[]=b.toCharArray();

for(int i=0;i<str.length;i++){
if (str[i]=='a'||str[i]=='e'||str[i]=='o'||str[i]=='i'||str[i]=='u')
a=a.replace(str[i],'"');
}


for(int i=0;i<str1.length;i++){
if (str1[i]!='a'&& str1[i]!='e'&& str1[i]!='o' && str1[i]!='i'&& str1[i]!='u')
b=b.replace(str1[i],'*');
}

System.out.println(a);
System.out.println(b);
System.out.println(c.toUpperCase());
}
}