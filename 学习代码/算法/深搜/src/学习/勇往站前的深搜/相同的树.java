package 学习.勇往站前的深搜;

/**
 * @author qgyiimer
 * @create 2021-{04}--20:12
 */
public class 相同的树 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if ( p == null || q == null) {
            if (p == null && q == null){
                return true;
            } else{
                return false;
            }
        }
        return p.val == q.val&&isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    }
}
