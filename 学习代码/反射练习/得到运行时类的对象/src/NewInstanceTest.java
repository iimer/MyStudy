import org.junit.Test;

/**
 * @author qgyiimer
 * @create 2021-{05}--20:26
 */
public class NewInstanceTest {
    @Test
    public void test1()throws Exception{
        //通过Class类的实例调用newInstance
        //前提：有空参构造方法，且权限足够


        //Class.forName()才比较有动态性
        Class clazz = Person.class;
        //习惯将每一个类都弄一个空参构造器，这样这个方式就可以是动态的了
        //这个只有空参的，想用有参数的需要先得到clazz的特定构造器
        Person p = (Person) clazz.newInstance();



    }
}
