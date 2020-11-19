/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.util;

import fu.util.MathUtility;

/**
 *
 * @author ASUS
 */
public class MathUtil {
    public static void main(String[] args) {
        //2.test ham = mat
        System.out.println("5! : " + MathUtility.getFactorial(5));
        // expected: 120
        //va test bo data khac
        System.out.println("0! : " + MathUtility.getFactorial(0));
        //      e:1 , a:1 -> ok
        //e: ném về ngoại lệ IllegalArgumentException
        System.out.println("CI for today");
    }
    //Code viet ra thi Developer phai test truoc cai da
    //1. TDD, Test Driven Development
    //Viet dan khung cua ham getFactorial(int n)
    //sau do dung ham test()
    //chay thu coi xanh đỏ, đỏ là lỗi, xanh là ổn
    // cứ liên tục xanh đỏ như thế trong quá trình viết code
    //và sửa coded, ng ta gọi là lập trình hướng theo thỏa mãn
    //việc test , tdd
    
    //2. sout(hàm kèm data) để coi kq ra sao, có đúng như mình kỳ vọng
    // nó phải trả về như thế hay kh -> xem kết quả test=mắt
}
