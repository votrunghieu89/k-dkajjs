/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recuse;

import java.util.Random;

/**
 *
 * @author This PC
 */
public class LinkList {

    public static Node head;

    public void input(int n) {
        int x;
        Node tail = null;
        for (int i = 0; i < n;) {
            Random rd = new Random();
            x = rd.nextInt() % 10;
            if (x > 0) {
                Node newNode = new Node(x);
                if (head == null) {
                    head = tail = newNode;
                } else {
                    tail.next = newNode;
                    tail = newNode;
                }
                i++;
            }
        }
    }

    public void output() {
        Node tam = head;
        while (tam != null) {
            System.out.print(tam.value + "->");
            tam = tam.next;
        }
        System.out.println("null");
    }

    public int dn(Node l) {
        if (l == null) {
            return 0;
        } else {
            return 1 + dn(l.next);
        }
    }

    public int tong(Node l) {
        if (l == null) {
            return 0;
        } else {
            return l.value + tong(l.next);
        }
    }

    public boolean Find(int x, Node l) {
        if (l == null) {
            return false;
        }
        if (x == l.value) {
            return true;
        } else {
            return Find(x, l.next);
        }
    }

    public int COunt_le(Node l) {
        if (l == null) {
            return 0;
        } else {
            if (l.value % 2 != 0) {
                return 1 + COunt_le(l.next);
            } else {
                return COunt_le(l.next);
            }
        }
    }

    public void Node_tail(Node l) {
        if (l == null) {
            System.out.println("ROng");
        } else {
            if (l.next == null) {
                System.out.println("Tail: " + l.value);
            } else {
                Node_tail(l.next);
            }
        }
    }

    public Node FindK(int k, Node l) {
        if (l == null || k < 1) {
            System.out.println("Rong");
        } else if (k == 1) {
            l=l.next;
        } else {
            l.next=Find(k-1, l.next);
        }
        return l;
    }

    public static void main(String[] args) {
        LinkList ll = new LinkList();
        ll.input(8);
        ll.output();
        System.out.println("Dem: " + ll.dn(head));
        System.out.println("Dem: " + ll.tong(head));
        if (ll.Find(3, head) == true) {
            System.out.println("Tim dc");
        } else {
            System.out.println("Khong tim duoc");
        }
        System.out.println("Dem: " + ll.COunt_le(head));
        ll.Node_tail(head);
    }
}
