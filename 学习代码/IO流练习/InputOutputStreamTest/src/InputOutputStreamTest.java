import org.junit.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * @author qgyiimer
 * @create 2021-{05}--18:45
 */
public class InputOutputStreamTest {
    //字节流对文本文件的操作，如果有文字，是有可能会产生乱码的
    //在规定大小的字节数组中只剩下了1或2个字节，则会有字节并未存入而丢失
    //只有处理文本文件的时候有这个问题，如果想打印出来看看，
    //就必须要用到String对象，取到对应字节的映射
    //而从前往后读的时候，可能会出现字节缺少(实际上是没有丢失的)，就会对映射产生影响，继而乱码

    //所以复制文本类型文件操作的时候就不会有问题
    //注意：doc不算文本类型文件
    @Test
    public void inputStreamTest() throws IOException {
        //1.获取文件
        File file = new File("hello2");

        //2.基于文件创建流
        FileInputStream fis = new FileInputStream(file);


        //3.读数据,通常设为1024
        byte[] bs = new byte[5];
        int len;
        while ((len = fis.read(bs))!=-1) {
//            for (int i = 0; i < len; i++) {
//                System.out.println(bs[i]);
//            }
            System.out.println(new String(bs, 0, len, StandardCharsets.UTF_8));
//            System.out.print(new String(bs,0,len));
        }
        //4.关闭流
        fis.close();
    }

    /**
     * 综合运用字节流，实现图片复制
     */
    @Test
    public void inputOutputStream() throws IOException {
        File file1 = new File("阳光小狗.jpg");
        File file2 = new File("阳光小狗two.jpg");

        FileInputStream fis = new FileInputStream(file1);
        FileOutputStream fos = new FileOutputStream(file2);

        byte[] bs = new byte[5];

        int len;
        while ((len = fis.read(bs))!= -1) {
            fos.write(bs);
        }

        fis.close();
        fos.close();
    }

    /**
     * 复制文件操作的封装
     */
    public void copyFile(String filee1,String filee2) throws Exception {
        File file1 = new File(filee1);
        File file2 = new File(filee2);

        FileInputStream fis = new FileInputStream(file1);
        FileOutputStream fos = new FileOutputStream(file2);

        byte[] bs = new byte[90000];
        int len;
        while ((len = fis.read(bs))!= -1) {
            fos.write(bs);
        }

        fis.close();
        fos.close();
    }

    /**
     * 复制文件函数的测试
     */
    @Test
    public void copyTest() throws Exception {
//        copyFile("阳光小狗.jpg","阳光小狗copyTest.jpg");
        long time1 = System.currentTimeMillis();
        copyFile("26.mp4","26++.mp4");//buffered:8192  315  9999 273
                                      //noBuffered:1024 1474 8192  300  9999 272
        long time2 = System.currentTimeMillis();
        System.out.println(time2 - time1);
    }
}
