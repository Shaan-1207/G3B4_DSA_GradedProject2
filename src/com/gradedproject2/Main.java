package com.gradedproject2;

public class Main {
    public static void main(String[] args) {
        Driver myDriverObj = new Driver();

        myDriverObj.getInputs();
        myDriverObj.calculateAndPrintOrderOfConstruction(myDriverObj.totalFloorSize);
    }
}
