import org.junit.Test;

/**
 * @author qgyiimer
 * @create 2021-{04}--20:41
 */

/*
    对比String、StringBuffer、StringBuilder三者的效率：
    从高到低排列：StringBuilder > StringBuffer > String
     */

      /*
    StringBuffer的常用方法：
StringBuffer append(xxx)：提供了很多的append()方法，用于进行字符串拼接
StringBuffer delete(int start,int end)：删除指定位置的内容
StringBuffer replace(int start, int end, String str)：把[start,end)位置替换为str
StringBuffer insert(int offset, xxx)：在指定位置插入xxx
StringBuffer reverse() ：把当前字符序列逆转
public int indexOf(String str)
public String substring(int start,int end):返回一个从start开始到end索引结束的左闭右开区间的子字符串
public int length()
public char charAt(int n )
public void setCharAt(int n ,char ch)

        总结：
        增：append(xxx)
        删：delete(int start,int end)
        改：setCharAt(int n ,char ch) / replace(int start, int end, String str)
        查：charAt(int n )
        插：insert(int offset, xxx)
        长度：length();
        *遍历：for() + charAt() / toString()
     */
public class StringBuilderTest {
    @Test
    public void test1() {
        String s = "123456";
        StringBuilder stringBuilder1 = new StringBuilder(s);
//        StringBuilder[] stringBuilder1 = new StringBuilder[3];
//        stringBuilder1[0] = new StringBuilder("abc");
//        stringBuilder1[1] = new StringBuilder("abd");
//        stringBuilder1[2] = new StringBuilder("aba");
//        Arrays.sort(stringBuilder1);
//        for (int i=0;i<stringBuilder1.length;i++){
//            System.out.println(stringBuilder1[i]);
//        }
        //java.lang.ClassCastException: java.lang.StringBuilder cannot be cast to java.lang.Comparable
       //没重写equals和compareTo方法

        stringBuilder1.delete(0,2);
        System.out.println(stringBuilder1);
        stringBuilder1.replace(0, 2, "99");
        System.out.println(stringBuilder1);
    }
}
