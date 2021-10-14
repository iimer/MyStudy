import org.junit.Test;

import java.io.*;

/**
 * @author qgyiimer
 * @create 2021-{05}--15:46
 */
public class DataInputOutputStreamTest {
    /**
     * 数据流
     * @throws Exception
     */
    @Test
    public void dataInputOutputStream() throws Exception {
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("dataTest.txt",true));
        dos.writeUTF("哈哈哈");
        dos.writeBoolean(true);
        dos.writeInt(100);
        dos.close();
        DataInputStream dis = new DataInputStream(new FileInputStream("dataTest.txt"));
        String now;
        while (!(now = dis.readUTF() ).isEmpty()) {
            System.out.println(now);
            System.out.println(dis.readBoolean());
            System.out.println(dis.readInt());
        }
        dis.close();
    }
}
