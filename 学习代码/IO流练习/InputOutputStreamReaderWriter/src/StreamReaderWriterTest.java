import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * @author qgyiimer
 * @create 2021-{05}--21:06
 */
public class StreamReaderWriterTest {
    /**
     * 封装复制函数
     */
    public void copyFile(String file1,String file2) throws Exception{
        InputStreamReader isr = new InputStreamReader(new FileInputStream(file1));
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(file2),"gbk");

        char[] cs = new char[1024];
        int len;
        while ((len = isr.read(cs)) != -1) {
            osw.write(cs,0,len);
        }
        isr.close();
        osw.close();
    }

    /*
    String也能动态解码，为什么还要单独弄出一个转换流呢？
    因为使用其他的流，解码需要读byte而通过String读就有可能会丢失字节，这样就会出现乱码
     */
    @Test
    public void test() throws Exception {
        copyFile("hello2","hello3.txt");
    }
}
