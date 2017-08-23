public class CakeSplitterDRAFT {

	private static int guests = 0;
	private static int piecesOfCake = 0;
	
	public static int calcPiecesOfCakePerGuest(int guest, int pieces) throws Exception{
		int piecesPerGuest = 0;
		if(guests == 0){
			throw new Exception("NO ONE TO FEED! :(");
		}else if(pieces % guests != 0){
			throw new Exception("No, No, No");
		}else if(piecesOfCake == 0 ){
			throw new Exception("NO CAKE! :(");
		}else{
			piecesPerGuest = pieces / guests; // we know only entire pieces will be cut.
		}
		
		return piecesPerGuest;
	}
	
	public static void main(String [] args){
		try {
			System.out.println("When there are " + guests + " guests and " + piecesOfCake + " pieces of cake... Each guest should get " + calcPiecesOfCakePerGuest(guests, piecesOfCake)+ ".");
		} catch (Exception e) {
			System.out.println("the exception message was: " + e.getMessage());
			System.out.println("Don't worry, someone will arrive... ");
			try {
				System.out.println("Pieces per guest: " + calcPiecesOfCakePerGuest(guests, piecesOfCake));
			} catch (Exception e1){
				System.out.println("better luck next time! " + e1.getMessage());
			}
		}
	}
}