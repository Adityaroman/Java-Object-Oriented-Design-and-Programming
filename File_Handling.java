//operations in file handling
//open ()
//write ()
//read()
//close()
//without try and catch block not pol=ssiable to file handling
//Q. how to create a file
package mypackage;
import java.io.FileWriter;
import java.io.IOException;
//import java.io.IOExcption;


public class File_Handling {
    public static void main(String []args) {
    	try {
    		FileWriter java = new FileWriter("java.text"); // how to create a file
    		java.write("Java is High Level,"+"And Programing Language");
    		java.close();
    		System.out.println("File is Created");
    	}
    	catch(IOException e) {
    		System.out.println("File not Created");
    		e.printStackTrace();
    	}
    }
}

//now file is created so create one more file to open it 
//go to tat file