/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recuse;

/**
 *
 * @author This PC
 */
public class De_quy {

    public void hn(int n, String A, String B, String C) {
        if (n == 1) {
            System.out.println("Chuyen 1 dia tu " + A + "sang " + C);
        } else {
            hn(n - 1, A, C, B);
            hn(1, A, B, C);
            hn(n - 1, B, A, C);

        }
    }

    public static void main(String[] args) {
        De_quy q = new De_quy();
        q.hn(5, "A", "B", "C");
    }
}
