import org.junit.Test;

import java.util.Scanner;

/**
 * @author qgyiimer
 * @create 2021-{04}--18:51
 */
public class ScannerTest {
    @Test
    public void test1() {
        Scanner sc= new Scanner(System.in);
        //输入一个int、double、String、一整行
//        int num = sc.nextInt();
//        double db = sc.nextDouble();
//        String s = sc.next();
//        String ss = sc.nextLine();
//        System.out.println(num);
//        System.out.println(db);
//        System.out.println(s);
//        System.out.println(ss);
//        输入
//        1 1.0 q 312432141
//        输出
//        1
//        1.0
//        q
//         312432141

        //判断是否有下一个输入
        //记录下每一个String
        // int、double与此相似
//        String s;
//        while (sc.hasNext()) {
//            s = sc.next();
//            System.out.println(s);
//        }

//        qw weqw
//        qw
//        weqw
//
//        432
//        432

        //记录下每一行String
//        while (sc.hasNextLine()) {
//            s = sc.nextLine();
//            System.out.println(s);
//        }
//        qw weqw
//        qw weqw
//        weweqw 234e32
//        weweqw 234e32
//
//
//        432
//        432

        //输入为0结束
//        int num;
//        while ((num = sc.nextInt())!=0){
//            System.out.println(num);
//        }

        //输入为空结束
        //错误实例：
        //next()永远接收不到""
//        String s;
//        while (!(s = sc.next()).equals("")){
//            System.out.println(s);
//        }
        //理解为输入为空行结束
        //这样才能获得为空的数据
//        String s;
//        while (!(s = sc.nextLine()).equals("")){
//            System.out.println(s);
//        }
//        21312
//        21421
//        3435
//        erw

        //输入n行数据，nextInt后的第一个nextLine检测到换行会接收掉空的字符串""
//        int n = sc.nextInt();
//        String ss = sc.nextLine();
//        System.out.println(ss);
//        while (n-- > 0) {
//            String s = sc.nextLine();
//            System.out.println(s);
//        }
        //输入
//        3
//        1
//        2
//        3
        //输出
//
//        1
//        2
//        3


    }
}
