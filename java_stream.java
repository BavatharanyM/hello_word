

import java.util.Arrays;

public class StreamExample {


	public static void main(String[] args) {

    //way using for loop and using stream
		
		int sum = Arrays.stream(new int [] {1,2,3}).filter(i -> i>=2).map(i -> i*3).sum();
    System.out.println(sum); //print sum
		
		int sum = 0;
		int arr [] = new int[] {1,2,3};
		for(int i =0;i<arr.length ;i++) { //strem
      
			if(arr[i] >=2) {  //filter
				arr[i] = arr[i]* 3 ; //map
				sum = sum +arr[i];  //sum
			}
			
		}
		
		System.out.println(sum);  //print sum
	
		}

	

}
