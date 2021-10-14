/**
 * 1.类的对象只有有限个，确定的时候，用枚举类
 * 如：星期一--星期日、性别、季节、支付方式、各种状态变化
 *
 * 2.当需要定义一组常量时，强烈建议使用枚举类
 * 3.如果枚举类只有一个对象，就可以作为单例模式的实现方式
 * jdk5.0新增，以前：自定义枚举类
 *
 * @author qgyiimer
 * @create 2021-{05}--15:51
 */
public class 初识枚举类 {

}
class Season{
    //1.声明Season对象的属性,final修饰
    private final String seasonName;
    private final String seasonDesc;

    //1.私有化类的构造器，并给属性初始化
    private Season(String seasonName,String seasonDesc){
        this.seasonDesc = seasonDesc;
        this.seasonName = seasonName;
    }

    //枚举类的多个对象
    public static final Season SPRING = new Season("春天","春暖花开");
    public static final Season SUMMER = new Season("夏天","夏日炎炎");
    public static final Season AUTUMN = new Season("秋天","秋高气爽");
    public static final Season WINTER = new Season("冬天", "冰天雪地");

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
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}