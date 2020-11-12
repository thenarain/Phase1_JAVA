package eg2;

public class A {
	
	public void welcomePublic() {
		System.out.println("welcome public from class A");
	}
	protected void welcomeProtected() {
		System.out.println("welcome protected from class A");
	}
	private void welcomePrivate() {
		System.out.println("welcome private from class A");
	}
	void welcomeDefault() {
		System.out.println("welcome default from class A");
	}
	public void accessPrivate() {
		welcomePrivate();
	}
}
