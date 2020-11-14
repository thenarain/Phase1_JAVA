package eg4;

public class Employee {
	private int id;
	private String name;
	private Profile profile;
	private Project project;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, Profile profile, Project project) {
		this.id = id;
		this.name = name;
		this.profile = profile;
		this.project = project;
	}
	
	public void viewEmployee() {
		System.out.println("Employee Id: "+id);
		System.out.println("Employee Name: "+name);
		profile.viewProfile();
		project.viewProject();
		
	}
	
	
}
