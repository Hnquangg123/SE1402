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
        if (n == 0 || n == 1) {
            return 1;
        }
        return cF(n-1) * n;

    }
    
    // moi doan code ban viet ra phai dam bao co chat luong
    // chat luong nghia la: ham tra ve, xu li dung nhu minh du kien
    // expected
    // vi du tinh giai thua() thi ta dua vao 5, hy vong nhan ve 120
    // vay ta phai chuan bi bo du lieu de test tung ham, dam bao no xu li dung
    // tung ham xu li dung, class xu li dung
    // viec dam bao cho tung class/module/tung don the/tung ham chay nhu
    // du kien -> DEV co trach nhiem vu nay, viec nay song song viet code
    // qua trinh nay goi la UNIT TESTING
    // lam sao test ham() chay dung ko
    // chuan bi data -> dua data -> goi ham -> nhin ket qua -> so voi du kien
    // nhin ket qua: mat 
    
}
