public class BadSplitException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BadSplitException(){
		super("Cannot unevenly split cake!");
	}
	
	public BadSplitException(String msg){
		super("Bad Splitting!: " + msg);
		
	}

}
