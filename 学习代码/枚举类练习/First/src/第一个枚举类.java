/**
 *
 * 1.继承class java.lang.Enum，不是Object
 * toString()发生了改变，默认打印常量名
 * 常用方法：values(),valueOf()
 *
 *
 * 2.实现接口
 * （1）：实现接口，在枚举类中实现接口方法
 * （2）：在枚举类中的每个对象实现各自的接口方法
 *
 * 总结：
 * 枚举类就是把public static final常量对象进行了简化，并给了一些遍历等的方法。
 * 他还是继承Object类的，但是重写了toString()
 * @author qgyiimer
 * @create 2021-{05}--16:03
 */
public class 第一个枚举类 {
    public static void main(String[] args) {
        Season1 spring = Season1.SPRING;
        System.out.println(spring);
        spring.getS();
//        System.out.println(spring.getClass().getSuperclass());
        //values():返回含所有枚举对象的数组
        Season1[] values = Season1.values();
        for (Season1 v :
                values) {
            System.out.println(v);
        }
        Thread.State[] values1 = Thread.State.values();
        for (Thread.State s :
                values1) {
            System.out.println(s);
        }
        //valueOf(String objName):找到就调用toString()方法，找不到就抛出异常
        System.out.println(Season1.valueOf("SPRING"));
        System.out.println(Season1.valueOf("SING"));
    }
}

interface info extends info2,info3{
    public void getS();
}
interface info2{

}
interface info3{

}
enum Season1 implements info{
    //枚举类的多个对象,省略修饰符、类名、new。用","分割";"结尾
    SPRING("春天","春暖花开"){
        @Override
        public void getS() {
            System.out.println("我是春天");
        }
    },
    SUMMER("夏天","夏日炎炎"){
        @Override
        public void getS() {
            System.out.println("我是夏天");
        }
    },
    AUTUMN("秋天","秋高气爽"){
        @Override
        public void getS() {
            System.out.println("我是秋天");
        }
    },
    WINTER("冬天", "冰天雪地"){
        @Override
        public void getS() {
            System.out.println("我是冬天");
        }
    };
    //声明Season对象的属性,final修饰
    private final String seasonName;
    private final String seasonDesc;

    //私有化类的构造器，并给属性初始化
    private Season1(String seasonName,String seasonDesc){
        this.seasonDesc = seasonDesc;
        this.seasonName = seasonName;
    }

    //提供get方法
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {

        return seasonDesc;
    }

    //提供toString()的重写
    @Override
    public String toString() {
        return "Season1{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }

    @Override
    public void getS() {
        System.out.println("默认方法");
    }
}
