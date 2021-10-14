import java.io.*;

/**
 * @author qgyiimer
 * @create 2021-{05}--21:40
 */
public class SystemIn {
    /*
    阅读部分源码后，总结
    读入字符串需要System.in,而因为是字节输入，需要转成字符输入才能让用户输入字符，就使用了转换流
    如果要readLine就要用buffered，不然只能用read，会读进去\n
    当然解决\n也有巧妙地方法，如char[10],可以以10个e的输入进行结束，这样\n就会读到下一次读取的len长度的String里面
     */
    public static void main(String[] args) throws Exception {
        BufferedReader br = null;
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            br = new BufferedReader(isr);
            char[] cs = new char[10];
            while (true) {
                System.out.println("请输入字符串：");
                //使用read而不使用buffered的readLine会一直读到一个\n
//                int len = isr.read(cs);
//                String data = String.valueOf(cs,0,len);
                String data = br.readLine();
                if ("e".equalsIgnoreCase(data) || "exit".equalsIgnoreCase(data)) {
                    System.out.println("程序结束");
                    break;
                }
                String upperCase = data.toUpperCase();
                System.out.println(upperCase);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
