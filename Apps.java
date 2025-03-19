package mypackage;
import java.util.Scanner;
//implementation od Abstracton

abstract class Softwares{    ///Abstract class
	String user_name;
	String password;
	
	void user_input() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter username: ");
		user_name = s.nextLine();
		System.out.println("Enter password: ");
		password = s.nextLine();
		
	}
	
	void user_login(){
		System.out.println("Wlecome to instagrame");
		System.out.println("---------------------");
		System.out.println("Please login here..!!");


	}
	abstract void app_open();  //Abstract method
	
}

class Instagram extends Softwares{  //child class
	@Override
	void app_open() {
		while(true) {
		if(user_name.equals("Raghav")&&password.equals(123@)) {
			System.out.println("SuccessFullyy Login, App is Open..");
			break;
		}else {
			System.out.println("Invalid user & password");
		}
	}
	}
//	void app_close() {
//		System.out.println("App is Close..");
//	}
}
public class Apps {
    public static void main(String[]args) {
    	Instagram i = new Instagram();
    	i.user_login();
    	i.user_input();
    	i.app_open();
    }
}
