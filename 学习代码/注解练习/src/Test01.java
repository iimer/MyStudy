import java.util.ArrayList;
import java.util.List;

/**
 * @author qgyiimer
 * @create 2021-{05}--11:00
 */
public class Test01 extends Object{
    //重写注解
    @Override
    public String toString() {
        return super.toString();
    }

    //废弃注解,不推荐使用但是可以使用
    @Deprecated
    public void test1(){}

    //去警告
    @SuppressWarnings("all")
    public void test2(){
        List list = new ArrayList<>();
    }
}
