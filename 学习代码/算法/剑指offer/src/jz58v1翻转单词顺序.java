/**
 * @author qgyiimer
 * @create 2021-{09}--16:30
 */
public class jz58v1翻转单词顺序 {
    public String reverseWords(String s) {
        s = s.trim();
        StringBuilder res = new StringBuilder();
        int j = s.length();
        for (int i = s.length()-1; i >=0 ; ) {
            while (i>=0 && s.charAt(i) != ' ') {
                i--;
            }
            res.append(s.substring(i+1,j)+" ");
            System.out.println(s.substring(i+1,j));
            while (i>=0 && s.charAt(i) == ' ') {
                i--;
            }
            j=i+1;
        }
        return res.toString().trim();
    }
}
