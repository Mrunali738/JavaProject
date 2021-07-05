package package1;

public class Main {
  
    public static void main(String[] args)
    {
        int[] arr = new int [] {-1, -100, 3, 99};
        int k = 2;
        System.out.println("Original array: ");
        for(int i = 0; i < arr.length; i++)
        {
        	System.out.println(arr[i] + " ");
     }  
     for(int i = 0; i < k; i++)
     {
        int j, last;
        last = arr[arr.length-1];
        for(j = arr.length-1; j>0; j--) {
        	arr[j] = arr[j-1];
        }
        arr[0] = last;
    }  
     System.out.println();
     System.out.println("Array after right rotation: ");
     for(int i = 0; i < arr.length; i++)
     {
    	System.out.println(arr[i] + " "); 
    	 
     }
     }
                
    }
	