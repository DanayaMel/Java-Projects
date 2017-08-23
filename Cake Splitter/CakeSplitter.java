public class CakeSplitter extends BadSplitException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static int calcPiecesOfCakePerGuest(int guests, int pieces) throws ZeroGuestsExceptions, BadSplitException, Exception{
		int piecesPerGuest = 0;
		if(guests == 0){
			throw new ZeroGuestsExceptions();
		}else if(pieces % guests != 0){
			throw new BadSplitException();
		}else{
			piecesPerGuest = pieces / guests; // only divide when whole pieces are guaranteed.
		}
		return piecesPerGuest;
	}
	
	public static int areWeSharing (String sharing, int guests, int pieces){
		int piecesPerGuest = 0;
		int x = 0;
		//int y = 0;
		if(sharing.equals("yes")){
			if(guests < pieces){
			x = guests - pieces;
			guests = guests - x;
			
			System.out.println("Well then " + guests + " people get " + pieces + " pieces." +
			" And " + x + " are left over!");
			}else if(guests > pieces){
				x = pieces % guests;
				
				System.out.println("Well " + guests + " people get " + guests + " pieces. And " + x + 
						" people can have an extra slice! =)");
			}
		}else if(sharing.equals("no")){
			System.out.println("O.K then, no one gets cake!");
		}else{
			System.out.println("I'm sorry, no comprende!");
		}
			return piecesPerGuest;
	}
	
	public static void cleanUp(){
		System.out.println("Now I'm eating any left over cake...and sweeping the floor.");
	}
}