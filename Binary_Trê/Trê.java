/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Binary_Trê;

import static java.lang.Math.abs;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Admin
 */
public class Trê {

    public static Node root;

    public int countNode(Node T) {
        if (T == null) {
            return 0;
        } else {
            return 1 + countNode(T.left) + countNode(T.right);
        }
    }

    public Node nhet(int x, Node T) {
        if (T == null) {
            T = new Node(x);
        } else {
            if (countNode(T.left) > countNode(T.right)) {
                T.right = nhet(x, T.right);
            } else {
                T.left = nhet(x, T.left);
            }
        }
        return T;
    }

    public void input() {
        for (int i = 0; i < 6;) {
            Random rd = new Random();
            int x = rd.nextInt() % 10;
            if (x > 0) {
                root = nhet(x, root);
                i++;
            }
        }
    }

    public void output(Node T) {
        if (T != null) {
            System.out.print(T.value + " ");
            output(T.left);
            output(T.right);
        }
    }

    public int hight(Node T) {
        if (T == null) {
            return 0;
        } else {
            return 1 + Math.max(hight(T.left), hight(T.right));
        }
    }

    public boolean Balance(Node T) {
        if (T == null) {
            return false;
        } else {
            if (abs(hight(T.left) - hight(T.right)) <= 1) {
                return true;
            }

        }
        return false;
    }

    public boolean Find(int x, Node T) {
        if (T == null) {
            return false;
        } else if (T.value == x) {
            return true;
        } else {
            return Find(x, T.left)
                    || Find(x, T.right);
        }

    }

    public void MucCua1Node(int x, Node T, int level) {

        if (T == null) {
            System.out.println("Rong");
        } else if (T.value == x) {
            System.out.println("Muc cua " + x + " la: " + level);
        } else {
            MucCua1Node(x, T.left, level + 1);
            MucCua1Node(x, T.right, level + 1);
        }
    }

    public void Muc(int x, Node T) {
        MucCua1Node(x, root, 1);
    }

    public void InNode(Node T, int level, int k) {
        if (T == null) {
            return;
        } else {
            if (level == k) {
                System.out.println("" + T.value);

            }
            InNode(T.left, level + 1, k);
            InNode(T.right, level + 1, k);
        }
    }

  

    public static void main(String[] args) {
        Trê t = new Trê();
        t.input();
        t.output(root);
        System.out.println("");
        System.out.println("Heigh: " + t.hight(root));
        System.out.println("Balance: " + t.Balance(root));
        System.out.println("Find: " + t.Find(3, root));
        t.Muc(7, root);
        t.InNode(root, 1, 2);

    }
}
