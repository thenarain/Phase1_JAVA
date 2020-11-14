package eg4;

public class Project {
	private String name;
	private Client client;
	
	public Project() {
		// TODO Auto-generated constructor stub
	}

	public Project(String name, Client client) {
		this.name = name;
		this.client = client;
	}
	
	public void viewProject() {
		System.out.println("Working on the Project named: "+name);
		client.viewClient();
	}
	
}
