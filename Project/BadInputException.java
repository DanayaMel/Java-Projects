import javax.swing.JOptionPane;

public class BadInputException extends Exception{
	
	public BadInputException(){
		super("nah fam");
	}
	
	public BadInputException(String msg){
		super("Bad Splitting!: " + msg);
		
	}

}
