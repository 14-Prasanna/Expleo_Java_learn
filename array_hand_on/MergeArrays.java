/**
 * 	Write a program to merge two arrays into a third array. Display the values of three
	arrays
 */
package array_hand_on;

/**
 * 
 */
public class MergeArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};

        int[] arr3 = new int[arr1.length + arr2.length];

       
        for(int i = 0; i < arr1.length; i++){
            arr3[i] = arr1[i];
        }
        
        for(int i = 0; i < arr2.length; i++){
            arr3[arr1.length + i] = arr2[i];
        }

        System.out.println("\nMerged Array:");
        for(int num : arr3){
            System.out.print(num + " ");
        }
 

	}

}
