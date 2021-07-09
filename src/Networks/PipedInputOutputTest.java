package Networks;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedInputOutputTest extends Thread {

    InputStream input;
    OutputStream output;

    PipedInputOutputTest(InputStream input, OutputStream output) {
        this.input = input;
        this.output = output;
    }

    public void run() {
        byte[] buf = new byte[1024];
        int i = 0;

        try {
            while (true) {
                i = input.read(buf);

                if (i != -1)
                    output.write(buf, 0, i);
                 else
                    return;
            }
        } catch (Exception e) {
            // 파일이 존재하지 않을 때 등등의 예외처리
        }
    }

    public static void main(String[] args) throws IOException {
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream(pis);
        // pis, pos 객체를 따로 만들고 pis.connect(pos)로 연결해주어도 된다.

        PipedInputOutputTest p1 = new PipedInputOutputTest(System.in, pos);
        PipedInputOutputTest p2 = new PipedInputOutputTest(pis, System.out);

        p1.start();
        p2.start();
    }
}