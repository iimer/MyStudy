/**
 * @author qgyiimer
 * @create 2021-{09}--14:40
 */
public class jz15v2剪绳子 {
    //结论：贪心，如果剩余的大于4尽量分为3
    public int cuttingRope(int n) {
        if (n<4) {
            return n-1;
        }
        long res = 1;
        int go = (int) (1e9+7);
        while (n>4) {
            res=res*3%go;
            n-=3;
        }
        return (int) (res*n%go);
    }
}
