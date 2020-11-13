package eg3;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator obj = new Calculator();
		
		int x = 34;
		int y = 67;
		int z = 72;
		
		float f1 = 98.5f;
		float f2 = 39.03f;
		
//		call by value
		obj.add(x, y);
		int res = obj.add(x, y, z, x);
		System.out.println("The solution int + int + int + int is "+res);
		float result = obj.add(f1, (int)f2);
		System.out.println("The solution float + int is "+result);
		
//		call by reference
		String full = obj.add("Kartikay", "Narain");
		System.out.println("The solution String + String is "+full);

	}

}
