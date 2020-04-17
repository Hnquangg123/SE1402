/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import org.junit.Test;
import static org.junit.Assert.*;
import static util.MyToys.cF; // lat hoi xai ham static eo can MyToys.
                              // goi cF() nhu ben C

/**
 *
 * @author Dell
 */
public class MyToyTest {
    
    // trong day se la nhung tinh huong minh ham can test (test cases)
    // vi du ta test tinh huong dua vao ngon lanh, nhan ve ngon lanh
    
    // vi du ta test tinh huong dua vao ca chon, nhan ve Exception
    // dam bao nhung tinh huong nay chay nhu du kien/mong doi/expected
    // luc do NetBeans nem mau xanh khi on, do khi co van de
    @Test
    public void testSuccessfullLower10Cases() {
        
        assertEquals(1, cF(0));
        assertEquals(2, cF(2));
        assertEquals(6, cF(3));
        assertEquals(24, cF(4));
        assertEquals(120, cF(5));
        assertEquals(720, cF(6));   // do? xay ra di 2 tinh huong
                                    // hoac ban xu li sai, hoac ban ki 
                                    // vong sai
                                    // co do?, kiem tra code di
    }
    
    @Test
    public void testSuccessfullGreater10Cases() {
        
        assertEquals(3_628_800, cF(10));
        assertEquals(36_916_800, cF(11));
    }
    
    // Ngoai le Exception la 1 thu ko the là value đe uoc luong
    // vay thi ko the assert đc, vi no can phai co value de so sanh 
    // xai them ki thuat bat ngoai le, coi ngoai le xay ra giong
    // nhu minh ki vong
    
    @Test(expected = IllegalArgumentException.class)
    public void testExceptionNegativeCases() {
        
        // ko co value de assert do ham cF() nem ra ngoai le
        cF(-5);
        cF(-100);        
        cF(-1);        
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testExceptionUpperBoundCases() {
        
        // ko co value de assert do ham cF() nem ra ngoai le
        cF(15);
        cF(16);        
        cF(17);        
    }
    
    
    // CODE KO BI LOI~ CU PHAP, THAM CHIEU THU VIEN, LUON CLEAN AND BUILD RA FILE JAR
    // TEST DUNG MAT, MAU, CAU CHUYEN LOGIC TRONG CODE, CHU KO PHAI LA CAU CHUYEN CUA BUILD JAR
    // BUILD JAR, .JAVA -> .CLASS, NEN .CLASS .CLASS -> .JAR  .WAR (.RAR)
    // TIEM AN RUI RO LON, CODE SAI LOGIC, KO SAI CU PHAP
    // NANG CAO, ME BO, NEU SAI LOGIC, DANG MAU DO - EO CHO RA .JAR
    // JUNIT DEU KET HOP DC VOI ANT DE CAM APP KO
    
}
