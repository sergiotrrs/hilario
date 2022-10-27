package org.generation.test.plus_minus;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */


	
    public static void plusMinus(List<Integer> arr) {
    	int positiveValues = 0;
    	int negativeValues = 0;
    	int zeroValues = 0;	
    	
        double totalDataInArr = arr.size(); 
//        for (int value: arr)
//            if (value>0) positiveValues++;
//            else if(value<0) negativeValues++;
//            else zeroValues++;
//        
        /*
         *Se tiene que usar variables de instancia*/
//          arr.forEach(value -> {
//        	if (value>0) positiveValues++;
//            else if(value<0) negativeValues++;
//            else zeroValues++;
//        });
        

//      System.out.printf("%7.6f%n%7.6f%n%7.6f", 
//          positiveValues/totalDataInArr, 
//          negativeValues/totalDataInArr, 
//          zeroValues/totalDataInArr 
//          );     
        
        HashMap<Integer,Integer> posNegZeroCounter = new HashMap<Integer, Integer>();
        posNegZeroCounter.put(0, 0 );
        posNegZeroCounter.put(1, 0 );
        posNegZeroCounter.put(2, 0 );
        arr.forEach(value->{
        	if (value>0) posNegZeroCounter.put(0, posNegZeroCounter.get(0) + 1 );
            else if(value<0) posNegZeroCounter.put(1, posNegZeroCounter.get(1) + 1 );
            else  posNegZeroCounter.put(2, posNegZeroCounter.get(2) + 1 );
        });

        System.out.printf("%7.6f%n%7.6f%n%7.6f", 
        	posNegZeroCounter.get(0)/totalDataInArr, 
        	posNegZeroCounter.get(1)/totalDataInArr,
        	posNegZeroCounter.get(2)/totalDataInArr
            );         
               
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
    
    void myFunction() {
    	ArrayList<Integer> myArray = new ArrayList<Integer>();
    	int i=1; 
    	
    	myArray.forEach( value ->{    	
    		//Varias instrucciones.    		
    		int result = value*i;
    	});
    }
}

