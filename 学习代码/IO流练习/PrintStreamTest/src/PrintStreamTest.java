import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * @author qgyiimer
 * @create 2021-{05}--15:29
 */
public class PrintStreamTest {
    public static void main(String[] args) throws Exception{
        //打印流的构造器只有字节流
        //没有涉及到编码要求，默认，不需要转换流
        PrintStream ps = new PrintStream(new FileOutputStream("print.txt"));

        System.setOut(ps);

        for (int i = 0; i < 255; i++) {
            System.out.println(i);
        }
    }
}
