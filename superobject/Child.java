package superobject;

public class Child extends Parent {
	public Child(){
		//System.out.println("Hello ");//always write constructor 1st statement as super
		super(50);
		System.out.println("child constructor");
		
	}
	
	public void one() {
		System.out.println("one method ");
		System.out.println(super.i);
		super.add();
	}
	public static void main(String[] args) {
		Child c = new Child();
		c.one();
	}
	

}
