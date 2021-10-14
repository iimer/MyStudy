import org.junit.Test;

import java.io.*;

/**
 * @author qgyiimer
 * @create 2021-{05}--16:50
 */

public class ReaderWriterTest {
    /**
     *节点流中的字符流中的输入流
     */

    //如果抛出异常可能成功创建了流，但是因为阻塞等情况抛出异常，无法关闭，涉及内存泄漏
    //必须要try-catch
    //不过使用try-catch也需要对关闭时的流进行null的判断，因为出异常的话，得不到具体的流对象，而是null
    @Test
    public void readerTest1() throws IOException {
        //junit测试下，相对路径是module下的
        //1.实例化File对象，一定要存在，否则会报FileNotFoundException
        File file = new File("hello2.txt");
        //2.提供具体的流
        FileReader fr = new FileReader(file);

        //3.数据的读入
        //read():返回读入的一个字符，如果达到文件末尾，则返回-1
        //方式一
//        int data = fr.read();
//        while (data!=-1) {
//            System.out.println((char)data);
//            data = fr.read();
//        }
        //方式二
        int data;
        while ((data = fr.read()) != -1) {
            System.out.println(data);
        }
        //4.流的关闭
        fr.close();
    }

    //由于read()只能读取每个字符，而且返回的是int
    //这里使用read()的重载方法
    @Test
    public void readerTest2() throws Exception {
        //1.File类的实例化
        File file = new File("hello");

        //2.创建基于file的流
        FileReader fr = new FileReader(file);

        //3.读入的操作
        //这里使用read()的重载,目的是为了一次性读入的数据多一些，效率会高一些
        //read()方法返回的是每次读入的字符的个数
        //字符流用char数组接收
        char[] cs = new char[5];

        //记录每次读入的字符的个数
        int len;
        //满的时候进入下一次循环从下标0开始替换
        //错误的写法是遍历cs.length数量的值
        while ((len = fr.read(cs)) != -1) {
//            for (int i = 0; i < len; i++) {
//                System.out.print(cs[i]);
//            }
            String s = String.valueOf(cs, 0, len);
            System.out.print(s);
        }

        //4.流的关闭
        fr.close();
    }

    @Test
    public void writerTest() throws IOException {
        //1.获得File类的对象
        File file = new File("hello3");

        //2.基于file对象创建流
        //对比写入，这里的file可以是不存在的，会创建一个file，或者覆盖这个file
        //不过虽然不在乎file存不存在，还是要try-catch，但不会报异常
//        FileWriter fw = new FileWriter(file);
        //还有个重载的方法
        //如果第二个参数设置为true则是对已有的文件在后面追加内容
        //如果第二个参数设置为false则是上面的情况，即默认情况，覆盖
        //特殊情况：写了true，但文件不存在，则和上面的方法一样，创建一个file
        FileWriter fw = new FileWriter(file,true);

        //3.写出的操作
        fw.write("I do not believe love");

        //4.流的关闭
        fw.close();
    }

    /**
     * 综合运用写入写出
     */
    @Test
    public void readerWriterTest() throws IOException {
        //1.获取File类的实例
        File from = new File("hello");
        File to = new File("toHello");

        //2.基于file实例创建流
        FileReader fr = new FileReader(from);
        FileWriter fw = new FileWriter(to);

        //3.数据输入和输出
        char[] cs = new char[5];
        int len;
        while ((len = fr.read(cs))!=-1) {
            fw.write(String.valueOf(cs,0,len));
        }

        //4.流的关闭
        fr.close();
        fw.close();
    }
}
