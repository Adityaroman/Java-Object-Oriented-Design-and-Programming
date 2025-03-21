package mypackage;

interface Animal1{
	abstract void sound(); {  //java interface always accept abstract method
}
class Hourse implements Animal1{
	@Override
}
	public void sound() {
	     System.out.println("Wooof wooof");	
	}

class Tiger implements Animal1{
	@Override
}
	public void sound() {
		 System.out.println("Gurr Gurr");	
    }	

}
public class Interface {  
	public static void main(String []args) {
		Hourse h = new Hourse();
		Tiger t = new Tiger();
		h.sound();
		t.sound():
	}
	
}
