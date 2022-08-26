package com.sharshag;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    private static List<TestPojo> list = new ArrayList<>();

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {

        int counter = 1000000;
        for (int i = 0; i < counter; i++) {
            list.add(new TestPojo(i+1, Integer.toString(i+1)));

            if((i+1)%100 == 0) {
                System.out.println("Monitoring app running and waiting for 1 sec.");
                Thread.sleep(1000);
            }

        }
        System.out.println("Program ended. loop ended.");
    }
}
