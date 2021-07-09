package Threads;

public class Test extends Thread {
    // 다른 쓰레드로 실행할 코드
    public void run() {
        System.out.println("thread run.");
    }

    public static void main(String[] args) {
        Test test = new Test(); // 쓰레드 객체 생성
        test.start(); // 코드 실행
    }
}
