import java.util.*;
import java.io.*;

class BSTOPS {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();
            StringTokenizer st = new StringTokenizer(br.readLine());
            BST tree = new BST();
            int N = Integer.parseInt(st.nextToken());
            char queryType[] = new char[N];
            int data[] = new int[N];
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                queryType[i] = st.nextToken().charAt(0);
                data[i] = Integer.parseInt(st.nextToken());
                if (queryType[i] == 'i')
                   tree.root = tree.insert(tree.root, data[i], 1);
                if (queryType[i] == 'd')
                   tree.root =tree.delete(tree.root, data[i]);
            }
            System.out.print(tree.sb);
            br.close();
        } catch (Exception e) {
            // System.out.println(e);
        }
    }
}

class Node {
    int key, position;
    Node left, right;

    Node(int key, int position) {
        this.key = key;
        this.position = position;
    }
}

class BST {
    Node root = null;
    StringBuilder sb = new StringBuilder();

    Node insert(Node root, int key, int position) {
        if (root == null) {
            root = new Node(key, position);
            // if (rootE == null)
                // rootE = root;
            sb.append(root.position + "\n");
            return root;
        }
        if (key < root.key) {
            root.left = insert(root.left, key, 2 * position);
        } else if (key > root.key) {
            root.right = insert(root.right, key, 2 * position + 1);
        }
        return root;
    }

    Node delete(Node root, int key) {
        if (root == null)
            return null;
        if (key < root.key) {
            root.left = delete(root.left, key);
        } else if (key > root.key) {
            root.right = delete(root.right, key);
        } else {
            sb.append(root.position + "\n");
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                root.key = minValue(root.right);
                root.right = delete(root.right, root.key);
            }
        }
        return root;
    }

    int minValue(Node root) {
        int min = root.key;
        while (root.left != null) {
            min = root.left.key;
            root = root.left;
        }
        return min;
    }
}
