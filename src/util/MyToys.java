/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author Dell
 */
public class MyToys {

    // bo thu vien ham xai chung, cho nen chung la static
    // cF: compute factorial, tính n giai thua n! = 1.2.3....n
    // 0! = 1
    // n! tang nhanh lam, cho nen de long do~
    public static long cF(int n) {

        if (n < 0 || n > 15) {
            throw new IllegalArgumentException("Sorry, n must be >= 0");
        }
        if (n == 0) {
            return 1;
        } else {    // phan con lai la hop le, tinh bt
            long product = 1;

            for (int i = 0; i < n; i++) {
                product = product * (i+1);
            }
            return product;
        }

    }

}
