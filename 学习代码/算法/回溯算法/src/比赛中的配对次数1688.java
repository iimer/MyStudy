import org.junit.Test;

/**
 * @author qgyiimer
 * @create 2021-{04}--19:34
 */
public class 比赛中的配对次数1688 {
    @Test
    public void test() {
        System.out.println(numberOfMatches(13));
    }


    public int numberOfMatches(int n) {
        if (n==0 || n==1) {
            return 0;
        }
        if (n%2==1) {
            return n/2+numberOfMatches(n/2+1);
        } else {
            return n/2+numberOfMatches(n/2);
        }
    }
}
