package Java.examples;

public class Cond_nestedif {
	public static void main(String args[]) {
		int a=50;
		int b=40;
		 
		if(a==50)
		{
			if(b==30) {
				System.out.println("a value is 50 and b value is 30");
			}
				else {
					System.out.println("else stmt of 2nd cond");
				}
		}
		else {
			System.out.println("else stmt of 1st cond");
			}
		}
	}


