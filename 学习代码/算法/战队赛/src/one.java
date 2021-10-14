import java.util.ArrayList;
import java.util.List;

/**
 * @author qgyiimer
 * @create 2021-{04}--15:01
 */
public class one {
    public int storeWater(int[] bucket, int[] vat) {
        if(bucket.length == 0){
            return 0;
        }
        int count = 0;
        int[] num = new int[bucket.length];
        for(int i = 0; i < bucket.length; i++){
            if(bucket[i] == 0&&vat[i] != 0){
                bucket[i]++;
                count++;
            }
            num[i] = (int)Math.ceil((double)vat[i]/bucket[i]);
        }
        int tcount = count;
        while(true){
            int max = maxIndex(num);
            List<Integer> maxLen = maxList(num,max);
            boolean flag = true;
            for (int i = 0; i < maxLen.size(); i++) {
                if (num[maxLen.get(i)]+tcount<=
                (int)Math.ceil((double)vat[maxLen.get(i)]/(bucket[maxLen.get(i)]+1))+tcount+1){
                    flag = false;
                }
            }
            int maxCount = Math.min(num[max]+tcount,
                    (int)Math.ceil((double)vat[max]/(bucket[max]+1))+tcount+maxLen.size());
            if (flag && maxCount != (num[max]+tcount)){
                tcount+=maxLen.size();
                for (int i = 0; i < maxLen.size(); i++) {
                    bucket[maxLen.get(i)]++;
                    num[maxLen.get(i)] = (int)Math.ceil((double)vat[maxLen.get(i)]/bucket[maxLen.get(i)]);
                }
            }else {
                count = maxCount;
                break;
            }
        }
        return count;

    }

    public void test(int[] b, int[] n, int[] v){

    }

    public int maxIndex(int[] c){
        int m = 0;
        for(int i = 1; i < c.length; i++){
            if(c[m] < c[i]){
                m = i;
            }
        }
        return m;
    }
    public List<Integer> maxList(int[] c,int max){
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < c.length; i++){
            if (c[max] == c[i]){
                list.add(i);
            }
        }
        return list;
    }
}
