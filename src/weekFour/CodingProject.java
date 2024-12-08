package weekFour;

public class CodingProject {
	public static void main(String[] args) {
		
	/*
	 * STEP 1
	 */
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};    //initializing the array
		int step1a = ages[ages.length - 1] - ages[0]; //subtracting the first element in the array from the last element
		System.out.println(step1a);  //output is 90
		
		int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 57};   //initializing new array with more elements
		int step1b = ages2[ages2.length - 1] - ages2[0];  //using the subtraction code from before with the new array
		System.out.println(step1b);  //output is 54 showing that this use of index values is dynamic
		
		int sum = 0;
		for (int i = 0; i < ages2.length; i++) {  //creating a loop to iterate through the array
			sum += ages2[i];
		}
		double averageAge = (double) sum / ages2.length; //this divides the sum by the number of elements 
		System.out.println(averageAge); //output is 31.9 which is the average of all the elements
		
	/*
	 * STEP 2
	 */
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"}; //initializing the array 
		
		// step 2a (creating for loop to find the average number of letters per name) 
		int letters = 0;
			for (String name : names) {
				letters += name.length();  //finding length of all names
			}
			double average = (double) letters / names.length;  //calculates the average length of all the names
		System.out.println(average); //output is 3.8 which is the average length of all the names
		
		// step 2b (concatenate all the names together)
		  StringBuilder concatenatedNames = new StringBuilder();  //used StringBuilder as it is more efficient for concat in loops
	        for (int i = 0; i < names.length; i++) {
	            concatenatedNames.append(names[i]);  //adding names to the builder
	            if (i < names.length - 1) {
	                concatenatedNames.append(" ");  //add a space between names
	            }
	        }
	        
	       System.out.println(concatenatedNames);  // the output is: Sam Tommy Tim Sally Buck Bob
	       
	/*
	 * STEP 3
	 * How do you access the last element in an array?
	 * The last element will be 1 less than length
	 * example: array[array.length - 1];
	 */
	       
	/*
	 * STEP 4
	 * How do you access the first element of any array?
	 * The first element will be at index 0
	 * example: array[0];
	 */
		
	/*
	 * STEP 5
   	 */
	       int[] nameLengths = new int[names.length];  //creating the array of integers "nameLengths" which has the same length as "names"
	       
	       for (int i = 0; i < names.length; i++) {   //using for loop to iterate over the names array
	    	   nameLengths[i] = names[i].length();   //this stores the length of the names in the nameLengths array
	       }
	       
	       for (int i = 0; i < nameLengths.length; i++) {    //using another for loop to iterate through the nameLengths array and print the result
	    	   System.out.println(names[i] + " " + nameLengths[i]);   //output gives each name and their corresponding length separated by a space
	       } 
	       
	/*
	 * STEP 6
	 * calculates sum
	 */
	       int step6 = 0;  // initializing a variable for the sum 
	       
	       for (int i = 0; i < nameLengths.length; i++) {   //creating the loop that will calculate the sum
	            step6 += nameLengths[i]; // adding the lengths to the step6 variable
	       }
	            
	       System.out.println(step6);  //output is 23 which is the sum of all the name lengths 
	            
	/*
	 * STEP 7
	 * (method) concatenates a string a specified amount of times            
	 */   
	       String word1 = "Hello";  //creating a String named word
	       int n = 3;    //creating an int called n
	    
	        String step7Method = "";   //empty string to store result
	   	
	   	//using a loop in order to concatenate word n times
	   		for (int i = 0; i < n; i++) {  
	   			step7Method += word1;
		}
	   		System.out.println(step7Method);  //output is HelloHelloHello but word and n inputs can be changed to alter output 
	}
	
	/*
	 * STEP 8
	 * (method) returns string with first and last name            
	 */
	 	    public static String getFullName(String firstName, String lastName) {  //created a method with the strings firstName and lastName
	 	    	
	 		return firstName + " " + lastName;  // returns the concatenated first and last name with a space in between
	    }          
	
	 /*
	  * STEP 9
	  * (method) checks if sum of elements in an array are greater than 100
	  */
	        public static boolean step9Method(int[] step9Array) { //initialization of method that takes an array of integers
	        int sum = 0;    //creating variable to hold sum
	        	for (int num : step9Array) {
	        		sum += num;    //calculates sum of the integers in the array
	        }
	        return sum > 100;  //will return true if the sum is greater than 100
	    }   
	       
	 /*
	  * STEP 10
	  * (method) calculates avg of elements within a double array
	  */
	        public static double step10Method(double[] step10Array) {  //initialization of method that takes an array of double
	        	double sum = 0;  //creating variable to hold sum
	        	
	        	for (double num : step10Array) {
	        		sum +=num;   //used to calculate the sum of the elements
	        		
	        	}
	        	return sum / step10Array.length;   //divides the sum by the length to return the average 
	        }      
	        
	  /*
	   * STEP 11
	   * (method) compares avg of two double arrays 
	   */
	        public static boolean step11Method(double[] array1, double[] array2) { //initialization of method that takes two arrays of double
	        	double avg1 = step10Method(array1);    //calling the method from step 10 to calculate the average
	        	double avg2 = step10Method(array2);
	        	
	        	return avg1 > avg2;   //returns true if the average of array1 is greater than that of array2
	        }
	        
	 /*
	  * STEP 12
	  * (method) checks conditions to determine whether or not to buy a drink
	  */
	        public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) { //initialization of method that takes a boolean and a double
	        	
	        	return isHotOutside && moneyInPocket > 10.50; // if both isHotOutside and moneyInPocket is greater than 10.50, will return true; otherwise, returns false
	        }
	 /*
	  * STEP 13
	  * creating my own method that calculates price after sales 
	  */
	      //init of method that takes the initial price of the item and the percentage of the sale
	        public static double calculateSalePrice(double initialPrice, double percentOff) {
	        
	        double saleTotal = (initialPrice * percentOff) / 100; //calculating the amount that the sale deducts
	        double salePrice = initialPrice - saleTotal;  //subtracting the amount the sale deducts from the initial price to get the final sale amount
	        
	        return salePrice;  //will return the final sale price
	        }
}
