package Threads;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class Thread2 implements Runnable {
    int seq;

    public Thread2(int seq) {
        this.seq = seq;
    }

    public void run() {
        System.out.println(this.seq + " thread start.");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        System.out.println(this.seq + " thread end.");
    }

    public static void main(String[] args) {
        ArrayList<Thread> threads = new ArrayList<Thread>();

        IntStream.range(0, 10)
                .mapToObj(i -> new Thread(new Thread2(i)))
                .forEach(t -> {
                    t.start();
                    threads.add(t);
                });

        threads.stream()
                .forEach(t -> {
                    try {
                        t.join();
                    } catch (Exception e) {
                    }
                });
        System.out.println("main end.");
    }
}