
package main.Ejercicio_03_listLeves;

import java.util.*;

public class ListLevels {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static List<LinkedList<Integer>> listLevels(TreeNode root) {
        List<LinkedList<Integer>> result = new ArrayList<>();
        if (root == null)
            return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            LinkedList<Integer> level = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                level.add(node.val);
                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);
            }
            result.add(level);
        }
        return result;
    }

    // Método de utilidad para imprimir los niveles
    public static void printLevels(List<LinkedList<Integer>> levels) {
        for (LinkedList<Integer> level : levels) {
            Iterator<Integer> it = level.iterator();
            while (it.hasNext()) {
                System.out.print(it.next());
                if (it.hasNext())
                    System.out.print(" → ");
            }
            System.out.println();
        }
    }
}
