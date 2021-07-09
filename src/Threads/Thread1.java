package Threads;

public class Thread1 extends Thread {
    // 다른 쓰레드로 실행할 코드
    public void run() {
        System.out.println("thread run.");
    }

    public static void main(String[] args) {
        Thread1 test = new Thread1(); // 쓰레드 객체 생성
        test.start(); // 코드 실행
    }
}
