
public class Ex10 {
	public static void main(String a[]) {
		int[] arr1 = {1,2,3,4};
	      int[] arr2 = {3,4,5,6};
	      int c=0;
	      
	      for(int i = 0;i < arr1.length; i++) {
	         for(int j = 0; j < arr2.length; j++) {
	            if(arr1[i] == arr2[j]) { 
	               c+=arr1[i];
	               
	               
	            }
	            
	         } 
	      }
	      System.out.println(c);
	   }
	
}
