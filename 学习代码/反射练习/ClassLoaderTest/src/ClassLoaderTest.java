import org.junit.Test;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author qgyiimer
 * @create 2021-{05}--20:11
 */
public class ClassLoaderTest {
    /**
     * 引导类加载器、扩展类加载器、系统类加载器的获取
     */
    @Test
    public void test1() {
        //系统类加载器-----一般是通过自定义的类获取
        ClassLoader classLoader1 = ClassLoaderTest.class.getClassLoader();
        System.out.println(classLoader1);
        //扩展类加载器-----一般是jre/libs/etc下的jar包下的类
        //这里用系统类的父类得到
        ClassLoader classLoader1Parent = classLoader1.getParent();
        System.out.println(classLoader1Parent);
        //引导类加载器-----String等类，C++编写，获取不到，null
        System.out.println(classLoader1Parent.getParent());
        System.out.println(String.class.getClassLoader());
        /*
        输出：
        sun.misc.Launcher$AppClassLoader@18b4aac2
        sun.misc.Launcher$ExtClassLoader@a09ee92
        null
        null
         */
    }

    @Test
    public void test2() throws Exception{
        Properties pro = new Properties();
        //流的相对路径是从module下开始的
//        FileInputStream fis = new FileInputStream("src/jdbc.properties");
//        pro.load(fis);
        //通过系统类下载器给文件造流，但是相对路径变为module的src下
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        InputStream ras = classLoader.getResourceAsStream("jdbc.properties");
        pro.load(ras);
        String user = pro.getProperty("user");
        String pwd = pro.getProperty("password");
        System.out.println(user);
        System.out.println(pwd);
    }
}
