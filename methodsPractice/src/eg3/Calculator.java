package eg3;

public class Calculator {
	
//	method overloading
	public void add(int a, int b) {
		System.out.println("The solution of int + int + int is "+(a+b));
	}
	public int add(int a, int b , int c, int d) {
		return a + b + c + d;
	}
	public float add(float a, int b) {
		return a + b;
	}
	public String add(String a, String b) {
		return a+" "+b;
	}
}
