 import java.util.Scanner;
class Factorial{
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
System.out.println("Enter the Number n1:");
int n1=scan.nextInt();
int i,fact=1;
for(i=1;i<=n1;i++){
fact=fact*i;
}
System.out.println("Factorial of"+n1+"Is:"+fact);
}
}
