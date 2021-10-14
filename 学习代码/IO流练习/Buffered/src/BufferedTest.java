import org.junit.Test;

import java.io.*;

/**
 * @author qgyiimer
 * @create 2021-{05}--19:55
 */
public class BufferedTest {
    @Test
    public void BufferedStreamTest() throws Exception{
        //
        File file1 = new File("阳光小狗.jpg");
        File file2 = new File("ygxg2.jpg");
        //
        FileInputStream fis = new FileInputStream(file1);
        FileOutputStream fos = new FileOutputStream(file2);

        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        //
        byte[] buffer = new byte[1024];
        int len;
        while ((len = bis.read(buffer))!= -1) {
            bos.write(buffer,0,len);
        }

        //有关闭要求，先关闭外层的流,不然报异常java.io.IOException: Stream Closed
        bis.close();
        bos.close();
        //bis和bos关闭时，会把传进去的流也关闭，不需要手动关，不过关闭也不会报错
//        fis.close();
//        fos.close();
    }

    public void bufferedCopy(String filee1,String filee2) throws Exception {
        //
        File file1 = new File(filee1);
        File file2 = new File(filee2);
        //
        FileInputStream fis = new FileInputStream(file1);
        FileOutputStream fos = new FileOutputStream(file2);

        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        //
        byte[] buffer = new byte[9999];
        int len;
        while ((len = bis.read(buffer))!= -1) {
            bos.write(buffer,0,len);
        }

        //有关闭要求，先关闭外层的流,不然报异常java.io.IOException: Stream Closed
        bis.close();
        bos.close();

    }

    /*
    根据以下实验，可以得知缓冲区就是设置了8KB，等到满的时候再跟系统进行IO操作
    与直接给非缓冲流设置8KB字节大小的效果是一样的
    既然跟IO操作的次数是影响速度的重大因素，那为什么很大又远没有文件大的时候速度还变慢了？
    因为超出了内存的限制，会产生内存和外村的IO时间
    那为什么提供了缓冲区呢？
    应该是对大部分数据进行了综合评定后得到的大小，但对于一个文件来说一定不是最优的
    大小如何制定的？
    针对当时的硬件进行的较为合适的设置
     */
    @Test
    public void testBufferedCopy() throws Exception {
        long time1 = System.currentTimeMillis();
        bufferedCopy("26.mp4","26++.mp4");//buffered:8192  315  9999 273
                                          //noBuffered:1024 1474 8192  300  9999 272
        long time2 = System.currentTimeMillis();
        System.out.println(time2 - time1);
    }
}
