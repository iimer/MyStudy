import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * @author qgyiimer
 * @create 2021-{09}--17:21
 */
public class jz38字符串的排列 {
    String ss;
    List<String> ress= new LinkedList<>();
    boolean[] visited;
    public String[] permutation(String s) {
        StringBuilder sb = new StringBuilder();
        ss = s;
        visited = new boolean[ss.length()];
        backTracking(sb);
        return ress.toArray(new String[ress.size()]);
    }

    private void backTracking(StringBuilder sb) {
        if (sb.length() == ss.length()) {
            ress.add(sb.toString());
            return;
        }
        HashSet<Character> has = new HashSet<>();
        for (int i = 0; i < ss.length(); i++) {
            if (!visited[i] && !has.contains(ss.charAt(i))) {
                sb.append(ss.charAt(i));
                has.add(ss.charAt(i));
                visited[i] = true;
                backTracking(sb);
                visited[i] = false;
                sb.deleteCharAt(sb.length()-1);
            }
        }
    }
}
