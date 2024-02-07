/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package forwhile;

import java.util.Scanner;

/**
 *
 * @author Behruz Tapdiqov
 */
public class salam13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int eded = (int) (Math.random() * 10);
        System.out.println("1 ve 10 arasi texmini eded daxil edin");
        int texmin = sc.nextInt();
        int say = 1;

        while (texmin != eded) {
            if (texmin > eded) {
                System.out.println("daha kicik reqem yazin");
                texmin = sc.nextInt();
            } else if (texmin < eded) {
                System.out.println("daha boyuk reqem yazin");
                texmin = sc.nextInt();
            }
            say++;

        }
        System.out.println("siz oyunu " + say + " sayda qazandiniz");

    }
}
