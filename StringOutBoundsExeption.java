//3.StringOutOfBoundException
//4.NullPointerException

package mypackage;

public class Execption_Handling {
	public static void main(String[]args) {
		//StringOutOfBoundException--3
		String name = "Raghav";
		System.out.println("My name:+name.charAt(10)");
		
		
		//4.NullPointerException
//		String a = null;
//		System.out.println("My name":+a.length());
		
		try {
			String a = null;
			System.out.println("My name":+a.length());
			
		}catch(NullPointerException e){
			System.out.println("My String":+e);
		}
	}
    
}

//In java try can be used only for one time in a block finally also but catch multiple time
