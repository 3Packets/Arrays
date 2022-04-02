
public class Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   System.out.println("Sum of given array is "
                   + sum());
	}
		        
		 static int arr[] = { 1,5,6,5,4,1 };
		  
		    // method for sum of elements in an array
		    static int sum()
		    {
		        int sum = 0; // initialize sum
		        int i;
		  
		        // Iterate through all elements and add them to sum
		        for (i = 0; i < arr.length; i++)
		            sum += arr[i];
		  
		        return sum;
		    }
		  
		    // Driver method
		   
		    
		
	}
