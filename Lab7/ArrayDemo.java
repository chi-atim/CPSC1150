public class ArrayDemo {
	public static void main (String[] args) {
		int[] numbers = new int[20];
		initializeArray(numbers);

		System.out.println("The random numbers are: ");
		displayArray(numbers);
		System.out.println("\nThe smallest number in the list: " + getSmallest(numbers));

		System.out.println("The average of the array elements is: " + getAverage(numbers));

		reverseArray(numbers);

		System.out.println("The random numbers in reverse are:");
		displayArray(numbers);
	}

	public static int[] initializeArray (int[] list) {
		for (int i = 0; i < list.length; i ++)
			list[i] = (int)(Math.random() * 100)+1;
		return list;
	}
   
	public static void displayArray (int[] list) {
		for (int i = 0; i < list.length; i ++)
			System.out.print(list[i] + " ");
	}

	public static int getSmallest (int[] list) {
		int smallest = list[0];
		for (int i = 0; i < list.length; i ++) {
			if(smallest > list[i])
			smallest = list[i];
		}
		return smallest;
	}

	public static double getAverage (int[] list) {
		double sum = 0;
		double average;
		for (int i = 0; i < list.length; i ++) {
			sum += list[i];
		}
		average = sum / list.length;
		return average;
	}

	public static int[] reverseArray (int[] list) {
		for (int i = 0; i < list.length/2; i ++) {
			int temp = list[i];
			list[i] = list [list.length-1-i];
			list[list.length-1-i] = temp;
		}
		return list;
	} 
}
