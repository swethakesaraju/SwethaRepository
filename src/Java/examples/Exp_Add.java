package Java.examples;
import java.util.Scanner;

public class Exp_Add {
public static void main(String args[]) {
// DT Var VV(Keyboard in Runtime)
	int a,b,c;
System.out.println("Enter a & b values");
Scanner obj=new Scanner(System.in);
a=obj.nextInt();
b=obj.nextInt();
c=a+b;
System.out.println("Addition of 2 no:" + c);
}
}

