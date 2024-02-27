import java.util.Scanner;
class Palindrome{
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
String s=scan.next();
boolean flag = true;
s = s.toLowerCase();
for(int i=0;i<s.length()/2;i++){
if(s.charAt(i) != s.charAt(s.length()-i-1)){

flag = false;
break;
}
}
if(flag)
System.out.println("Given String is Palindrome");
else 
System.out.println("Given String is not a Palindrome");
}
}

