package application_eg3;
import java.util.Arrays;

public class Uniqueness {
	public static boolean unique1(int[] data, int n) {
		   // n = data.length;
		    for (int j=0; j < n-1; j++)
		      for (int k=j+1; k < n; k++)
		        if (data[j] == data[k])
		          return false;                    
		    return true;                           
		  }
	 		 //@param i 
		  public static boolean unique2(int[] data, int n) {
		    int[] temp = Arrays.copyOf(data, n);   
		    Arrays.sort(temp);                     
		    for (int j=0; j < n-1; j++)
		      if (temp[j] == temp[j+1])            
		        return false;                      
		    return true;                           
		  }
		  
	
	public static void main(String[] args) {
		
		
		int size=(int)Math.pow(3,10);
	      int data[]= new int[size];
	      int i;
	      for(i=0;i<size;i++) 
	      {
	          data[i]=size-i+1;
	      }
	      long startTime,endTime,totalTime;
	      i=1;
	      totalTime=0;
	      while(totalTime/Math.pow(8,3)<1)
	      {
	          startTime = System.nanoTime();
	          unique1(data,i);
	          endTime   = System.nanoTime();
	          totalTime = endTime - startTime;
	          i++;
	      }
	      System.out.println("Value of n for which unique1 takes time = "+i);
	      System.out.println(" takes time = "+totalTime);
	      totalTime=0;
	      i=1;
	      while(totalTime/Math.pow(8,3)<1)
	      {
	          startTime = System.nanoTime();
	          unique2(data,i);
	          endTime   = System.nanoTime();
	          totalTime = endTime - startTime;
	      i++;
	      }
	      System.out.println("Value of n for which unique2 takes time = "+i);
	      System.out.println(" takes time = "+totalTime);
		}

}
