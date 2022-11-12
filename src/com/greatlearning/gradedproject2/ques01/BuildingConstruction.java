package com.greatlearning.gradedproject2.ques01;

import java.util.*;

public class BuildingConstruction {
	public Integer totalFloors;
	public Integer[] totalFloorSize;

	public void getInputs() {
		System.out.println("Enter the total no. of floors in the building: ");
		Scanner sc = new Scanner(System.in);
		totalFloors = sc.nextInt();
		totalFloorSize = new Integer[totalFloors];

		for (int i = 1; i <= totalFloors; i++) {
			System.out.println("Enter the floor size given on day: " + i);
			totalFloorSize[i - 1] = sc.nextInt();
		}
		sc.close();
	}

	// Calculate and print order of construction and totalFloorSize
	public void calculateAndPrintOrderOfConstruction(Integer[] totalFloorSize) {
		System.out.println("\nThe order of construction is as follows");

		int j = 0;
		Integer[] FloorSizeSorted = totalFloorSize.clone();
		Arrays.sort(FloorSizeSorted, Collections.reverseOrder());

		Stack<Integer> myStack = new Stack<Integer>();

		// Loop over the unsorted data and when you see the entry is matched then pop all Stack elements
		for (int i = 0; i < totalFloorSize.length; i++) {
			if (totalFloorSize[i] == FloorSizeSorted[j]) {
				if (i == totalFloorSize.length - 1)
					j = i;
				else
					j = i + 1;

				System.out.println("Day: " + (i + 1));
				if (myStack != null) {
					System.out.print(totalFloorSize[i] + " ");
					while (!myStack.isEmpty()) {
						int val = myStack.pop();
						if (val >= FloorSizeSorted[j]) {
							System.out.print(val + " ");
						} else {
							myStack.push(val);
							j -= myStack.size();
							break;
						}
					}
					System.out.println(" ");

				} else {
					System.out.println(totalFloorSize[i]);

				}
			} else
			// Add the element to Stack
			{
				System.out.println("Day:" + (i + 1));
				myStack.push(totalFloorSize[i]);
				System.out.println();
			}
		}
	}
}
