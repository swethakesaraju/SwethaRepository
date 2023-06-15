package Java.examples;

public class Dt_var {
	int b=30; //instance var{
static int empid=101;
public void m1() {
// DTV VV---To Represent Data
	int a=10;//local var

	
	System.out.println(a+"local Var");//10
	System.out.println(empid+"static var");
}
public void m2() {
	System.out.println("m2 executed");
	System.out.println(b+"instance var");
	System.out.println(empid+"static var");
}
public void m3() {
	System.out.println("m3 executed");
	System.out.println(b+"instance var");
}
public static void main(String args[]) {
	System.out.println("main method executed");
//classname objectname=new classname();
	Dt_var m =new Dt_var();
	m.m1();
	m.m2();
	m.m3();
}
}


