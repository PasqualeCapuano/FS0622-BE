package day3;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

class SommaThread extends Thread {
    private int[] array;
    private int start;
    private int end;
    private AtomicInteger result;

    public SommaThread(int[] array, int start, int end, AtomicInteger result) {
        this.array = array;
        this.start = start;
        this.end = end;
        this.result = result;
    }

    public void run() {
        for (int i = start; i < end; i++) {
            result.addAndGet(array[i]);
        }
    }
}

public class Esercizio2 {
    public static void main(String[] args) {
        int[] array = new int[3000];
        Random rand = new Random();
        for (int i = 0; i < 3000; i++) {
            array[i] = rand.nextInt(100);
        }
        AtomicInteger result1 = new AtomicInteger();
        AtomicInteger result2 = new AtomicInteger();
        AtomicInteger result3 = new AtomicInteger();

        SommaThread thread1 = new SommaThread(array, 0, 1000, result1);
        SommaThread thread2 = new SommaThread(array, 1000, 2000, result2);
        SommaThread thread3 = new SommaThread(array, 2000, 3000, result3);

        thread1.start();
        thread2.start();
        thread3.start();
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int finalResult = result1.get() + result2.get() + result3.get();
        System.out.println("La somma dell'array è: " + finalResult);
    }
}
