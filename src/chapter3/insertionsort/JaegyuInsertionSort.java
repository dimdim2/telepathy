package chapter3.insertionsort;

public class JaegyuInsertionSort {

	public int[] sort(int[] input) {
		
		for(int i=1;i<input.length;i++){
			
			int loc = i-1;
			int newItem = input[i];
		
			while(loc>=0 && newItem<input[loc]){
				input[loc+1] = input[loc];
				loc--;
			}
			input[loc+1] = newItem;
			
		}
		return input;
	}

}
