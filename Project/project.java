import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

public class project {
	public static String lgArr = "99, 25, 34, 54, 92, 70, 12, 15";
	public static String[] strArry = {"99", "25", "34", "54", "92"};
	public static int [] banana = {68, 43, 52, 99, 12, 24};
	
	public static void main(String[] args) {
		//int [] arrFH = new int[lgArr.length() / 2];
		//int [] arrLH = new int[lgArr.length() - arrFH.length];
	}
	
	public static String okayNow(){

		String fileName = JOptionPane.showInputDialog("Please enter your file's name here. \n (This is the file you will be saving/writing to.)");
		return fileName;
	}
	
	public static String converter(JTextField tfString, JTextField tfInt){
		
			String textArr = tfString.getText().trim().replaceAll("\\s", "");
			int [] intArr = convertsStrArrToIntArr(textArr);
			
			String tfNum = tfInt.getText().trim();
			int num = Integer.parseInt(tfNum);
			
			String [] strArr = convertsIntArrToStrArr(MultiplyValues(intArr, num));
			
			String blah = convertsStrArrToStr(strArr);
			return blah;
		}
	
	public static String converter2(JTextField tfString2){
			//doesnt use tfInt.
			String textArrMS = tfString2.getText().trim().replaceAll("\\s", "");
			int [] intArrMS = project.convertsStrArrToIntArr(textArrMS);
			
			String [] strArrMS = project.convertsIntArrToStrArr(project.mergeSort(intArrMS));
			
			String blahMS = project.convertsStrArrToStr(strArrMS);
			return blahMS;
	}
	
	public static String converter2b(JTextField tfString2){
		//doesnt use tfInt.
		String textArrMS = tfString2.getText().trim().replaceAll("\\s", "");
		int [] intArrMS = project.convertsStrArrToIntArr(textArrMS);
		
		String [] strArrMS = project.convertsIntArrToStrArr(project.mergeSort(intArrMS));
		
		String blahMS = project.convertsStrArrToStr(strArrMS);
		return blahMS;
}
	
	public static String converter3(JTextField tfString, JTextField tfInt, int a){
		
		String textArr = tfString.getText().trim().replaceAll("\\s", "");
		int [] intArr = convertsStrArrToIntArr(textArr);

		String tfNum = tfInt.getText();
		int num = Integer.parseInt(tfNum);
		
		return sequestialSearch(intArr, num);		
		
	}
	
	public static String converter4(JTextField tfString, JTextField tfInt){
	
		String textArr = tfString.getText().trim().replaceAll("\\s", "");
		int [] intArr = convertsStrArrToIntArr(textArr);

		String tfNum = tfInt.getText();
		int num = Integer.parseInt(tfNum);
		int [] sortedArray = bubbleSort(intArr);
		int endI = (sortedArray.length - 1);
		int a = (binarySearch(sortedArray, num, 0, endI));
		if(a == -1){
			return num + " was not found";
		}else if(a >= 0){
			return num + " was found in the array";
		}else{
			return "please check your code and try again.";
		}
	}
	
	public static int[] convertsStrArrToIntArr(String tf){
		String [] tf2 = tf.split(",");
	    int[] ints = new int[tf2.length];
	    for (int i=0; i < ints.length; i++) {
	    		ints[i] = Integer.parseInt(tf2[i]);
	    }
	    
	    return ints;
	}
	
	public static String[] convertsIntArrToStrArr(int [] ints){
	    String[] strArr = new String[ints.length];
	    for (int i=0; i < ints.length; i++) {
	        strArr[i] = Integer.toString(ints[i]);
	    }
	    return strArr;
	}


	public static String convertsStrArrToStr(String [] stArr){
		String[] strArr = stArr;
		String str =Arrays.toString(strArr);
		  return str;
	}
	
	public static int[] mergeSort(int [] anArray){
		if(anArray.length >= 2){
			int halfLength = anArray.length/2;
			int [] firstHalf = new int[halfLength];
			int [] lastHalf = new int[anArray.length - halfLength];
			split(anArray, firstHalf, lastHalf);
			mergeSort(firstHalf);
			mergeSort(lastHalf);
			merge(anArray, firstHalf, lastHalf);

		}
		return anArray;
	}
	
	
	public static int[] MultiplyValues(int [] numArr, int tfInt){
	//a method that multiplies each value in the array by the value specified in the 2nd JTextfield
		int[] newNumArr = new int[numArr.length] ;
		for(int i=0; i<numArr.length; i++){
			newNumArr[i] = numArr[i] * tfInt;
		}
		return newNumArr;	
	}

	public static void swap(int [] arr, int a, int b){
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	public static int[] bubbleSort(int [] arr){
		boolean notSorted = true;
		while(notSorted){
			notSorted = false;	
			
			for(int i=0; i<arr.length-1; i++){
				int j=i+1;
				if( (arr[i]) > (arr[j])){
				swap(arr, i, j);
				notSorted = true;
				}
			}
		}return arr;
	}
	

	public static int binarySearch(int [] arr, int match, int startI, int endI){
		
		if(startI > endI){
			return -1; //NOT FOUND...need to stop searching.
		}
				int midpt = (startI + endI) / 2;
				if(match == arr[midpt]){
					return midpt;
					}else if(match > arr[midpt]){
						return binarySearch(arr, match, midpt +1, endI); //look in the right part of the array.
					}else{
						return binarySearch(arr, match, startI, midpt-1); //look in the left part of array.
					}
	}
	
	
	public static String sequestialSearch(int[]anArray, int match){
		String found = (match + " was found in the array.");
		String notMatch = (match + " was not found in the array.");
		
		for(int i=0; i<anArray.length; i++){
			if(match == anArray[i]){
				return found;
			}
		}
		return notMatch;
	}
		
	private static void merge(int [] bigArr, int [] firstHalf , int [] lastHalf){		
		int indexFH = 0;
		int indexLH = 0;
		int indexBigArr = 0;
		
		while( (indexFH < firstHalf.length) && (indexLH < lastHalf.length) ){			
			if(firstHalf[indexFH] < lastHalf[indexLH]){
				bigArr[indexBigArr] = firstHalf[indexFH];
				indexFH ++;
			}else{
				bigArr[indexBigArr] = lastHalf[indexLH];
				indexLH ++;
				}
			indexBigArr++;
		}
		while(indexFH < firstHalf.length){
			bigArr[indexBigArr] = firstHalf[indexFH];
			indexFH ++;
			indexBigArr ++;
		}	
		while(indexLH < lastHalf.length){
			bigArr[indexBigArr] = lastHalf[indexLH];
			indexLH ++;
			indexBigArr ++;
		}
	}
	
	public static void split(int[]lgArr, int [] arrFH, int [] arrLH){
		for(int i=0; i<arrFH.length; i++){
			arrFH[i] = lgArr[i];		
		}
		for(int i=0; i<arrLH.length; i++){
			arrLH[i] = lgArr[arrFH.length + i];
		}
	}

	public static int findLocMatchInArray(char match, int [] arr){
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
}