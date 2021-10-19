package pack08_protected;

public class B extends A{
	public B() {
		super();
		this.method();
	}
	public void init() {
		A a = new A();
		a.method();
		a.feild ="";
	}
}
