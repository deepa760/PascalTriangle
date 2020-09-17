package com.novare.pascal;


public class PascalTriangle {

    public static void main(String[] args) {
        int countOfTotalRows = 10;
        int startvalue= 1;

        //LOOP iterates once per row
        for(int start= 0; start < countOfTotalRows; start++) {

            //Creates left triangle slope.
            for(int left= 1; left < countOfTotalRows- start; left++) {
                System.out.print("  ");
            }

            //Print the right and center   values
            for(int centervalue = 0; centervalue <= start; centervalue++) {
                if (centervalue == 0 || start == 0)
                    startvalue = 1;
                else
                   startvalue = startvalue* (start - centervalue + 1) / centervalue;
                System.out.printf(String.valueOf(startvalue)));
            }
            System.out.println(); //Loop reiterates....
        }

        }
}