import java.util.Scanner;
public class Book{
public static void main(String args[]){
int num,quantity;
int amount,gst,net_amount;
String product;
long price;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the product number");
num=sc.nextInt();
Switch(num){
case 1:
product = "C";
price = 5000;
System.out.println("The product is: "+product +"and the price is "+price);
break;

case 2:
product ="Java";
price = 5500;
System.out.println("The product is: "+product +"and the price is "+price);
break;

case 3:
product = "C++";
price = 10,000;
System.out.println("The product is: "+product +"and the price is "+price);
break;

case 4:
product = "Oracle";
price = 7000;
System.out.println("The product is: "+product +"and the price is "+price);
break;

default:
System.out.println("Please select a number");
}

System.out.println("Please enter the quantity");
quantity=sc.nextInt();
amount=quantity*price;
gst=(amount*15)/100;
net_amount=amount+gst;
System.out.println("The net amount is: "+net_amount);
}
}