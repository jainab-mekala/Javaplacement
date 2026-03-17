package javaplacement;

public class Oddincrease {
	public static void main(String[] args) {
		 int[] arr = {3, 6, 11, 18, 27};
	        int prevDiff = arr[1] - arr[0];
	        int currDiff = 0;
	        for(int i = 2; i < arr.length; i++) {
	            currDiff = arr[i] - arr[i-1];
	        }

	        int nextDiff = currDiff + 2;
	        int next = arr[arr.length - 1] + nextDiff;
	        System.out.print("Series: ");
	        for(int n : arr) {
	            System.out.print(n + " ");
	        }

	        System.out.println("\nPattern: Increasing odd differences");
	        System.out.println("Next Number: " + next);

	}

}
