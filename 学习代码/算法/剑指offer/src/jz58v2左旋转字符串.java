/**
 * @author qgyiimer
 * @create 2021-{09}--17:18
 */
public class jz58v2左旋转字符串 {
    public String reverseLeftWords(String s, int n) {
        StringBuilder sb = new StringBuilder(s.substring(n));
        sb.append(s.substring(0,n));
        return sb.toString();
    }
}
