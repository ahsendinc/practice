//Fisher-Yates shuffle algorithm
import java.util.Random;


public class Solution {

    public static int getRandom(int floor, int ceiling){
	Random rand = new Random();
    return rand.nextInt((ceiling - floor)+1) + floor;
}
public static void naiveShuffle(String[] theArray){
	
    for (int firstIndex = 0; firstIndex<theArray.length; firstIndex++){
    	int secondIndex = getRandom(firstIndex, theArray.length - 1);
        String temp = theArray[firstIndex];
        theArray[firstIndex] = theArray[secondIndex];
        theArray[secondIndex]=temp;
    }
    for (int i=0; i<theArray.length; i++){
        System.out.println(theArray[i]);
        }
}
    public static void main(String[] args) {
        // run your function through some test cases here
        String[] testInput = new String[]{"a","b","c"};
        naiveShuffle(testInput);       
    }
}