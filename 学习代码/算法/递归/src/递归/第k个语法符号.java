package 递归;

/**
 * @author qgyiimer
 * @create 2021-{04}--16:59
 */
public class 第k个语法符号 {
    public static void main(String[] args) {
        System.out.println(kthGrammar(30 ,434991990));
    }
    public static int kthGrammar(int N, int K) {
        if (N==1){
            return 0;
        }
        return kthGrammar(N-1,(K+1)/2) == 1 ? K%2:1- K%2;
    }
}
