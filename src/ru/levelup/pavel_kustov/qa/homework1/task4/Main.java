package ru.levelup.pavel_kustov.qa.homework1.task4;


/**
 *  Class show answer on 1st home work
 *  tasks 4:
 *  random filling array
 *
 * @version 1.0
 * @author  Kustov Pavel
 */

public class Main {

    static int vArr[] = { 11, 22, 34, 65, 2, 5, 12, 63, 54, 3, 32, 4, 85};  // main working array

    /**
     *  Entry point
     */
    public static void main(String[] args)
    {
        Main app = new Main();
        app.startApp();
    }

    /**
     *  Function that todo all work
     */
    public void startApp()
    {
        System.out.println("Input array:");
        printArr();

        randArr(vArr);
        System.out.println("Random array:");
        printArr();
    }

    /**
     *  Method for printing main array
     */
    static void printArr() {
        for (int i = 0; i < vArr.length; i++) {
            System.out.print(vArr[i]);
            System.out.print(" ");
        }
        System.out.println(";");
    }

    /**
     *  Algorithm filling an array with random numbers
     */
    static void randArr(int[] arr) {
        int BASE = 0;       // set minimum number
        int MAX = 100;      // set maximum number

        for (int i = 0; i < arr.length ; i++) {
            arr[i] = BASE + (int)(Math.random() * MAX);
        }
    }
}
