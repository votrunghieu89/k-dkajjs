/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Binary_Trê;

/**
 *
 * @author Admin
 */
public class Node {

    int value;
    Node left, right;

    public Node(int value) {
        this.value = value;
        left = right = null;
    }

    public Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

}
