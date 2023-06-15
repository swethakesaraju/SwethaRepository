package Java.examples;

public class Hello1  {
public void m1 () {
	System.out.print("m1 executed");
}
public void m2 () {
	System.out.print("m2 executed");
}
public void m3 () {
	System.out.print("m3 executed");
}
public static void main(String args[]) {
	System.out.println("main method executed");
	Hello1 m =new Hello1();
	m.m1();
	m.m2();
	m.m3();
}
}
