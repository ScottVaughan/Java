package arrays;
import java.util.*;

public class Arrays_DS {
	
	public static void main(String[] args) {
		Arrays_DS arrays = new Arrays_DS();
		
		arrays.binarySearch();
		arrays.increaseSize();
		arrays.frequentIntArray();
		arrays.arrayPairs();
	}
	/*** Binary search ***/
	void binarySearch(){
		char[] array = {'b','c','f','a','d','e'};
		//Use Java.util.Array to sort the array alphabetically
		Arrays.sort(array);
		int index = Arrays.binarySearch(array, 'c');
		
		System.out.println("The index for binary search for the char c: " + index);
	}
	
	void increaseSize(){
		char[] array = {'b','c','f','a','d'};
		System.out.println("Array size is: "+array.length);
		char[] copyArray = Arrays.copyOf(array, 10);
		System.out.println("copyArray size is: "+copyArray.length);
		
		char alpha = 'a';
		String arrayCharacters = "";
		int i = 0;
		for(char r:copyArray){
			copyArray[i] = alpha++;
			arrayCharacters += copyArray[i];
			i++;
		}
		System.out.println("The new array has: "+arrayCharacters);
	}
	
	/*** Find the most frequent int in an array ***/
	void frequentIntArray(){
		int[] array = {5, 6, 5, 8, 5, 6, 5, 4, 6};
		int mostFrequentNum = 0;
		int countOld = 0;
	
		for(int arrayLength1 : array){
			int currentNum = arrayLength1;
			int countNew = 0;
			
			for(int arrayLength2 : array){
				if(currentNum == arrayLength2)
					countNew++;
			}
			if(countNew > countOld){
				mostFrequentNum = currentNum;
				countOld = countNew;
			}
		}
		System.out.println("The most frequent integer in the array is: " + mostFrequentNum);
	}
	
	/*** Find pairs in an array that add to 10 ***/
	void arrayPairs(){

		int[] array = {5, 2, 8, 5, 5, 6, 5, 4, 6};
		int numOld = 0;
		String pairs = "";
		
		for(int arrayLength : array){
			
			int numNew = arrayLength;
			
			if(numNew + numOld == 10)
				pairs += numOld + " , " + numNew + " | ";
			numOld = arrayLength;
		}
		pairs = pairs.substring(0, pairs.length() - 2); //cut off | at end of string
		System.out.println("The pairs in the array that add to 10 are: " + pairs);
	}
}
