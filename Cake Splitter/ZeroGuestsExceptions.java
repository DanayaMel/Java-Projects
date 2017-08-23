public class ZeroGuestsExceptions extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ZeroGuestsExceptions(){
		super("Uhmmmm, YOU HAVE NO GUESTS SWEETIE.");
	}
	
	public ZeroGuestsExceptions(String msg){
		super("ZERO Guests Exception: " + msg);
	}

}
