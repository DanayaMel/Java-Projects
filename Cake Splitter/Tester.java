import java.util.Scanner;

public class Tester {

//be careful how you order things, it matters. example(if statements go to first if then else if. More specific first, then more general catch.
	public static void main(String [] args){
		System.out.println("How many pieces of cake are being delieved? ");
		@SuppressWarnings("resource")
		Scanner kb = new Scanner(System.in);
		int pieces = kb.nextInt();
		
		System.out.println("How many guests are coming for da function? ");
		int guests = kb.nextInt();
		
		try{
			//modify this code to get the number of guests and pieces of cake from the user.
			
			System.out.println("Well then the pieces per guest: " +CakeSplitter.calcPiecesOfCakePerGuest(guests, pieces));
			
		}catch(BadSplitException bse){ //BSE is just initials of BadSplitException
			
			System.out.println("Uneven Cake Split... " + bse.getMessage());
			//in here you can determine what else you might be able to do.
			
			//if guests > than number of cake, you can ask the user if it is okay to share?
			//if guests < than number of cake, give one piece to each person.
			
			System.out.println("Is it O.K to share? ");
			String sharing = kb.next();
			CakeSplitter.areWeSharing(sharing, guests, pieces);
			
		}catch(ZeroGuestsExceptions zge){
			
			System.out.println("Cake Split w. No People... " + zge.getMessage());
			
		}catch(Exception e){
			
			System.out.println("General Cake Split... " + e.getMessage());
			
		}
		finally{
			
			CakeSplitter.cleanUp();
		}
	}

}
