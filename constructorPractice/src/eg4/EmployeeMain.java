package eg4;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Profile p1 = new Profile("React Developer");
		Project pr1 = new Project("gameApp", new Client("Tencent"));
		Employee employee1 = new Employee(6857, "Kartikay", p1, pr1);
		
		System.out.println("Printing employee1");
		System.out.println();
		employee1.viewEmployee();
		
		

	}

}
