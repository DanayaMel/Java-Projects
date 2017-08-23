import java.io.*;
import java.util.Scanner;

import javax.swing.JTextField;

public class technicalStuff {

	public static void appendTextToFile(String fileName, String lineOfText, JTextField tfString, JTextField tfInt, int a){
		PrintWriter outStr = null;
		String tfNum = tfInt.getText();
		String textArr = tfString.getText();
		
		
		
		try{
			outStr = new PrintWriter(new FileOutputStream(fileName, true));
			
			if(a == 0){
				outStr.println("You have entered the Array: " + textArr + " To multiply by: " + tfNum + "\nYour finished result is: " + lineOfText);
				outStr.println("_____________________________________________________________\n");
				System.out.println("sanity proof: " + lineOfText);
			}else if(a == 1){
				outStr.println("You have entered the Array: " + textArr + " To search for the #: " + tfNum + "\nYour result is: " + lineOfText);
				outStr.println("________________________________________________________________\n");
				System.out.println("sanity proof: " + lineOfText);
			}else if(a == 2 ){
				outStr.println("You have entered the Array: " + textArr + "\nYour sorted result is: " + lineOfText);
				outStr.println("________________________________________________________________\n");
				System.out.println("sanity proof: " + lineOfText);
			}
			
		}catch(FileNotFoundException fnfe){
			fnfe.printStackTrace();
			
		}finally{
			outStr.close();
		}
	}

	public static void clearAllEntries (String fileName){
		PrintWriter outStr = null;
		
		try{
			outStr = new PrintWriter(fileName); //creates a file
			outStr.println("");
		}catch(FileNotFoundException fnfe){
			System.out.println("Ooopsy: " +fnfe.getMessage());
		}finally{
			outStr.close();
			System.out.println("Done wrtiting to file...");
		}
	}
	
	/*public static void checkingInput(String str, JTextField tfString, JTextField tfNum){
	
		if(str.equals("yes")){
			for(i=0;)
			
		}
	}*/
}