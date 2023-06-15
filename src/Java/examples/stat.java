package Java.examples;

public class stat {
  int b=30;//instance var
static int empid=101;
//non-static methods
public void m1() {
// DT V VV ---To Represent Data
	int a=10;//Locsal var
	System.out.println("m1 executed");//m1 executed
	//      intString
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
//static method
public static void st() {
System.out.println("static method executed");
}
public static void main(String args[]) {
	System.out.println("main method executed");
//classname ojbectname=new classname();
//non-static methods :access by using object
	stat m =new stat();
	m.m1();
	m.m2();
	m.m3();
//static methods:access by using classname,no need of to create object
	stat.st();
	m.m1();
	m.m2();
	m.m3();
}
}



