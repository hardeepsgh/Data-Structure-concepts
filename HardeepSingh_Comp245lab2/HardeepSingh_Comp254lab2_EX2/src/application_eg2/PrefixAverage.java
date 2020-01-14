package application_eg2;
import java.util.Random;

public class PrefixAverage {
	/** Returns an array a such that, for all j, a[j] equals the average of x[0], ..., x[j]. */
	 public static double[] prefixAverage1(double[] x) {
	   int n = x.length;
	   double[] a = new double[n];    
	   for (int j=0; j < n; j++) {
	     double total = 0;            
	     for (int i=0; i <= j; i++)
	       total += x[i];
	     a[j] = total / (j+1);        
	   }
	   return a;
	 }
	 
	 /** Returns an array a such that, for all j, a[j] equals the average of x[0], ..., x[j]. */
	 public static double[] prefixAverage2(double[] x) {
	   int n = x.length;
	   double[] a = new double[n];   
	   double total = 0;             
	   for (int j=0; j < n; j++) {
	     total += x[j];              
	     a[j] = total / (j+1);       
	   }
	   return a;
	 }
	 

	 public static double[] randomMethod(int size)
	 {
		  Random rand = new Random(); 
	     double[] array = new double[size];
	     for (int i = 0; i < array.length; i++) {
	    	 array[i] = rand.nextInt(); 
	     }
	     return array;
	 }
	 
	 public static void main(String[] args) {
		  
		  double[] array1 = randomMethod(300);
		  double[] array2 = randomMethod(3030);
		  double[] array3 = randomMethod(3930);
		  System.out.println("Example 1");
		  long startTime = System.currentTimeMillis();
		  System.out.println(prefixAverage1(array1));
		  long endTime = System.currentTimeMillis();
		  long diff = endTime-startTime;
		  System.out.println("Run time of array 1 " + diff);
		  
		  startTime = System.currentTimeMillis();
		  System.out.println(prefixAverage1(array2));
		  endTime = System.currentTimeMillis();
		  diff = endTime-startTime;
		  System.out.println("Run time of array 2  " + diff);
		  
		  startTime = System.currentTimeMillis();
		  System.out.println(prefixAverage1(array3));
		  endTime = System.currentTimeMillis();
		  diff = endTime-startTime;
		  System.out.println("Run time of array 3  " + diff);


		  System.out.println("Example 2");
		  startTime = System.currentTimeMillis();
		  System.out.println(prefixAverage2(array1));
		  endTime = System.currentTimeMillis();
		  diff = endTime-startTime;
		  System.out.println("Run time of array 1 " + diff);
		  
		  startTime = System.currentTimeMillis();
		  System.out.println(prefixAverage2(array2));
		  endTime = System.currentTimeMillis();
		  diff = endTime-startTime;
		  System.out.println("Run time of array 2 " + diff);
		  
		  startTime = System.currentTimeMillis();
		  System.out.println(prefixAverage2(array3));
		  endTime = System.currentTimeMillis();
		  diff = endTime-startTime;
		  System.out.println("Run time of array 3 " + diff);
		  
	 }
	 
}
