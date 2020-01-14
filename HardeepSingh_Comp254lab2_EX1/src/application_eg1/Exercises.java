package application_eg1;

public class Exercises {
	 /** Returns the sum of the integers in given array. */
	  public static int example1(int[] arr) {
	    int n = arr.length, total = 0;
	    for (int j=0; j < n; j++)       
	      total += arr[j];
	    return total;
	  }
	  /**
	    Example 1: 
	    The Big(O) here would be n as the loop runs for n number of times.
	  	first line 2 + 1 = 3
		second line since j start from 0 2(n+1)
		third line: 2*n
		four line:1
		total operation   3+2(n+1)+2n+1
		4n+6 O(n)
	   * */

	  /** Returns the sum of the integers with even index in given array. */
	  public static int example2(int[] arr) {
	    int n = arr.length, total = 0;
	    for (int j=0; j < n; j += 2)    
	      total += arr[j];
	    return total;
	  }
	  /**
	   Example 2:
	   line 1: 2+1
	   line 2: 3+2((n-1)/2)+1= 3+n
	   line 3: 2n
	   line 4: 1
	   total operation   = 3+3+n+2n+1
	   = 3n+7 //O(n)
	   * */
	  /** Returns the sum of the integers with even index in given array. */
	 
	  /** Returns the sum of the prefix sums of given array. */
	  public static int example3(int[] arr) {
	    int n = arr.length, total = 0;
	    for (int j=0; j < n; j++)      
	      for (int k=0; k <= j; k++)   
	        total += arr[j];
	    return total;
	  }
	  /**
	   Example 3: 
	   This is a case of nested loop and here the Big(O) would be n^2
 line 1: 2+1
 line 2: (n+1)^2 + 3(n+1) -2
 line 3:
 line 3: 2(n*n)
 line 4: 1
 total operation   = 3+n^2+1+2n+3n+3-2+2n^2+1
 3n^2+5n+6//O(n^2)
 */ 
	  

	  /** Returns the sum of the prefix sums of given array. */
	  public static int example4(int[] arr) {
	    int n = arr.length, prefix = 0, total = 0;
	    for (int j=0; j < n; j++) {    
	      prefix += arr[j];
	      total += prefix;
	    }
	    return total;
	  }
	  /**
	   Example 4: 
	   This is a case of single loop and here the Big(O) would be n
	   line 1: 2+1+1
	   line 2: 2(n+1)
	   line 3: 2n
	   line 3: n
	   line 4: 
	   line 5: 1
	   total operation   = 3+2n+2+2n+n+1 = 6+5n//O(n)
	   */ 
	  

	  /** Returns the number of times second array stores sum of prefix sums from first. */
	  public static int example5(int[] first, int[] second) { // assume equal-length arrays
	    int n = first.length, count = 0;
	    for (int i=0; i < n; i++) {    
	      int total = 0;
	      for (int j=0; j < n; j++)    
	        for (int k=0; k <= j; k++) 
	          total += first[k];
	      if (second[i] == total) count++;
	    }
	    return count;
	  }
	  /**
	   Example 5: 
	   This is a case where we have two nested loops and the Big(O) would be n^3
	   line 1: 2+1
	   line 2: 2(n+1)
	   line 3: n
	   line 3: n
	   line 4:
	   line 5:
	   line 6: 2()
	   line 7: 3
	   line 8:
	   line 9: 1
	   total operation   = //O(n^3)
	   */ 
	

	  public static void main(String[] args)
	  {
		  int array[]={5,8,2};
		  
		  long startTime = System.currentTimeMillis();
		  
		  System.out.println("Output="+example1(array));
		  long endTime = System.currentTimeMillis();
		  long elapsed = endTime-startTime;
		  
		  System.out.println("First example Big Oh: " + " Start Time : "+ startTime + " EndTime : " + endTime + " Elapsed Time : " + elapsed);
		
		  startTime = System.currentTimeMillis();
		  System.out.println("Output="+example2(array));
		  endTime = System.currentTimeMillis();
		  elapsed = endTime-startTime;
		  System.out.println("Second Example  Big Oh: " + " Start Time : "+ startTime + " EndTime : " + endTime + " Elapsed Time : " + elapsed);
		
		  startTime = System.currentTimeMillis();
		  System.out.println("Output="+example3(array));
		  endTime = System.currentTimeMillis();
		  elapsed = endTime-startTime;
		  System.out.println("Third Example Big Oh : " + " Start Time : "+ startTime + " EndTime : " + endTime + " Elapsed Time : " + elapsed);
		
		  startTime = System.currentTimeMillis();
		  System.out.println("Output="+example4(array));
		  endTime = System.currentTimeMillis();
		  elapsed = endTime-startTime;
		  System.out.println("Fourth Example Big Oh : " + " Start Time : "+ startTime + " EndTime : " + endTime + " Elapsed Time : " + elapsed);
		
		  int array2[] = {1,2,3};
		  startTime = System.currentTimeMillis();
		  System.out.println("Output="+example5(array, array2));
		  endTime = System.currentTimeMillis();
		  elapsed = endTime-startTime;
		  System.out.println("Fifth Example Big Oh : " + " Start Time : "+ startTime + " EndTime : " + endTime + " Elapsed Time : " + elapsed);
		  
		  startTime = System.currentTimeMillis();
		  System.out.println("Output="+example4(array2));
		  endTime = System.currentTimeMillis();
		  elapsed = endTime-startTime;
		  System.out.println("Fourth Example Big Oh : " + " Start Time : "+ startTime + " EndTime : " + endTime + " Elapsed Time : " + elapsed);
	  }
}