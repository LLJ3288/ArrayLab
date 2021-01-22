package com.tts.weekNine;

public class DayTwo {

    double result = 0;

    public DayTwo(double result) {
        this.result = result;
    }

    public DayTwo() {

    }

    public void arraySum(int[] sum) {
        for (int idx = 0; idx < sum.length; idx++) {
            result += sum[idx];
        }
        System.out.println(result);
    }

    public void brokenCode() {
        double[ ] exampleArray = {1,5,6,5,4,1};

        double maximum = exampleArray[0];

        int index = 0;

        for (int i = 1; i<exampleArray.length; i++) {

            if (exampleArray[i] > maximum) {

                maximum = exampleArray[i];

                index = i;

            }
        }

        System.out.println(index);



    }

    @Override
    public String toString() {
        return "DayTwo{" +
                "result=" + result +
                '}';
    }



    }



