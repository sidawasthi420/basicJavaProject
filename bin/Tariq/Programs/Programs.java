/*
1) Find the Largest Element in an Array
2) Remove Duplicate Elements From an Array
3) Remove All Occurrences of an Element in an Array
4) Merge Two Arrays
5) Search an Element in an Array
6) Sort an Array in Ascending and Descending Order*/

public class Programs {
	public static void main(String[] args) {
		Programs obj = new Programs();
		obj.P01_FindLargestElementInArray();
		obj.P02_RemoveDuplicateElementsFromArray();
		obj.P03_RemoveAllOccurrencesElementInArray();
		obj.P04_MergeTwoArrays();
		obj.P05_SearchElementInArray();
		obj.P05_SortArrayInAscendingAndDescendingOrder();
	}

	public void P01_FindLargestElementInArray() {
		int[] arr = { 50, 2, 6, 8, 2, 10, 6 };
		int largest = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < largest) {
				arr[i] = largest;
			}
		}
		System.out.println(largest);
	}

	public void P02_RemoveDuplicateElementsFromArray() {
		int[] arr = { 50, 2, 6, 8, 2, 10, 6 };

		for (int i = 0; i < arr.length; i++) {
			boolean duplicate = false;

			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					duplicate = true;
					break;
				}
			}
			if (!duplicate) {
				System.out.println(arr[i]);
			}
		}

	}

	public void P03_RemoveAllOccurrencesElementInArray() {

		int[] arr = { 50, 2, 6, 8, 2, 10, 6 };
		int remove = 2;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == remove) {
				continue;
			}

			System.out.println(arr[i]);
		}
	}

	public void P04_MergeTwoArrays() {

		int[] arr = { 50, 2, 6 };
		int[] arr1 = { 6, 8, 1, 5 };
		int[] arr2 = new int[arr.length + arr1.length];

		int count = 0;
		for (int i = 0; i < arr.length; i++) {

			arr2[count] = arr[i];
			count++;

		}
		for (int i = 0; i < arr1.length; i++) {

			arr2[count] = arr1[i];
			count++;
		}

		for (int i : arr2) {
			System.out.println(i);
		}

	}

	public void P05_SearchElementInArray() {

		int[] arr = { 50, 2, 6, 8, 2, 10, 6 };
		int search = 2;

		int count = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == search) {

				System.out.println(search + " found at index :- " + i);
				count++;
			}
		}

		if (count == 0) {
			System.out.println("Element not found");
		}
	}

	public void P05_SortArrayInAscendingAndDescendingOrder() {
		int[] arr = { 50, 6, 8, 2, 10, 22, 1 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

		}

		System.out.println("Ascending order");
		for (int i : arr) {
			System.out.println(i);
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

		}

		System.out.println("Descending order");
		for (int i : arr) {
			System.out.println(i);
		}

	}
}
