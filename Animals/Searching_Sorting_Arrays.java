public class Searching_Sorting_Arrays {
	
	private static char [] arr = {'B', 'L', 'A', 'H', 'S'};

	private static int [] nums = {3, 9, 21, 56};
	
	public static void main(String[] args) {
		//findAndReplace('L', 'M');
		doublingTheArray(nums);
		printArray(nums);
		
		/*
		char lookingFor = 'H'; //we could modify to get from user..
		int loc = findLocMatchInArray(lookingFor);
		String isOrNot = "the fantastic location " +loc;
		if(loc==-1){
			isOrNot = "No Man's Land... ";
		}
		System.out.print("Found at "+ isOrNot);
		*/
	}
	
	public static int findLocMatchInArray(char match){
		//char match = 'H';
		int index = -1;
		for(int i=index+1; i<arr.length; i++){
			//see if it matches
			if(arr[i] == match){
				return i;
			}
			System.out.println("now viewing " + i);
		}	
		return index;
	}
	
	public static void findAndReplace(char oldC, char newC){
		//while there are chars in the array, if oldC
		int i=0;				//start at first location.
		while(i<arr.length){ 	//while there are still places to compare...
			if(arr[i]==oldC){	//compare the current location to the value.
				arr[i]=newC;	//if value is at this location, replaced it.
				System.out.println("replacing " + oldC + " with " + newC + " at location " + i + ".");
			}
			System.out.println("current val is " + arr[i]);
			i++;
		}		
	}	
	
	public static void doublingTheArray(int[]nums){
		for(int i=0; i<nums.length; i++){
			nums[i] = nums[i] * 2;
		}
	}
	
	public static void printArray(int[]nums){
		for(int i=0; i<nums.length; i++){
			System.out.println(nums[i]);
		}
	}
}
