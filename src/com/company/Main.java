package com.company;

public class Main {

    public static void main(String[] args) {

        //let the lockers be an int array of 100
        int[] lockers = new int[100+1];
        //Initially all the lockers are in closed position represented by 1 and open represented by 0
        for(int i = 1; i <= 100; i++)
            lockers[i] = 1;

        for(int i = 1; i <= 100; i++) {
            for(int j = 1; j <= 100; j++) {
                if(j%i == 0) {
                    if(lockers[j] == 0)
                        lockers[j] = 1;
                    else
                        lockers[j] = 0;
                }
            }
        }
        //Print out the lockers that remain open
        for(int i = 1; i <= 100; i++) {
            if(lockers[i] == 0)
                System.out.println("locker# " +i +" is open");
        }
    }
}
