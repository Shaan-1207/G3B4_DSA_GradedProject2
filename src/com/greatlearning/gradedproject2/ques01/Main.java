package com.greatlearning.gradedproject2.ques01;

public class Main {
	public static void main(String[] args) {
		BuildingConstruction myDriverObj = new BuildingConstruction();

		myDriverObj.getInputs();
		myDriverObj.calculateAndPrintOrderOfConstruction(myDriverObj.totalFloorSize);
	}
}



