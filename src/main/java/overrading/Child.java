package overrading;

public class Child extends Parent {
	public static void main(String[] args) {
		Child c = new Child();
		Parent p = new Child();
		Parent t = new Parent();
		c.display();
		p.display();
		t.display();
	}
	public void display() {
		System.out.println("Child method");
	}

}
