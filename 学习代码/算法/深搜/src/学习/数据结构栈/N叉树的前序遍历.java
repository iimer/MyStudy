package 学习.数据结构栈;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qgyiimer
 * @create 2021-{09}--10:46
 */
public class N叉树的前序遍历 {
    public static void main(String[] args) {

    }

    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    List<Integer> res = new ArrayList<>();

    public List<Integer> preorder(Node root) {
        dfs(root);
        return null;
    }

    private void dfs(Node root) {
        if (root == null) {
            return;
        }

    }

}
