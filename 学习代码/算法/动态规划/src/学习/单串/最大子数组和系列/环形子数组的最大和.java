package 学习.单串.最大子数组和系列;

/**
 * @author qgyiimer
 * @create 2021-{04}--13:50
 */
public class 环形子数组的最大和 {
    public static void main(String[] args) {
        System.out.println(maxSubarraySumCircular(new int[]{5,-3,5}));
    }
    public static int maxSubarraySumCircular(int[] A) {
        int pre = A[0],maxSum = A[0];
        //连续单串
        for (int i = 1; i < A.length; i++) {
            pre = Math.max(A[i],pre+A[i]);
            maxSum = Math.max(pre,maxSum);
        }
        //双区间连续单串
        int[] rightSum = new int[A.length];
        rightSum[A.length-1] = A[A.length-1];
        for (int i = A.length-2; i >1 ; i--) {
            rightSum[i] = rightSum[i+1] + A[i];
        }
        int[] maxRight = new int[A.length];
        maxRight[A.length-1] = A[A.length-1];
        for (int i = A.length-2; i > 1; i--) {
            maxRight[i] = Math.max(maxRight[i+1],rightSum[i]);
        }
        pre = 0;
        for (int i = 0; i < A.length-2; i++) {
            pre = pre + A[i];
            maxSum = Math.max(pre+maxRight[i+2],maxSum);
        }
        return maxSum;
    }
}
