/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fu.util.test;

import fu.util.MathUtility;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ASUS
 */
public class MathUtilityTest {
    
    //minh sẽ test các tình huống xài hàm getFactory() ở đây
    // tình huống là tham số đưa vào: dương ,âm, dương trong khoảng 0..20, ngoài
    // tình huống xài hàm , test hàm gọi là TEST CASE
    // thường ta có tinh huống thành cong và thất bại
    //thành công: đưa vào value hợp lệ 0.20
    //thất bại: đưa vào âm, >20, bị ăn đòn
    //hàm phải bắt các tình huống này, và giờ ta test thử coi hàm xử lí đúng không
    
    @Test //biến hàm này thành static void main()
    //quy tắc đặt tên hàm cho việc test phần mềm: rất nhiều quy tắc
    // nhưng nói chung tên hàm sẽ bao gồm ngữ nghĩa kết quả trả về, tình trạng test 
    //kh giống quy tắc đặt tên hàm khi viết app
    //mình đang viết code để test app
    
    //mình mún test hàm trả về ngon nếu đưa tham số ngon
    public void getFactorial_RunsWell_IfValidArgument(){
        assertEquals(120, MathUtility.getFactorial(5));
        
        // tui mún check coi có đúng là gọi hàm 5! thì ói về 120 hay kh?
        // có XANH, không, ĐỎ
        assertEquals(720, MathUtility.getFactorial(6));
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(1, MathUtility.getFactorial(0));
        assertEquals(1, MathUtility.getFactorial(1));
        assertEquals(6, MathUtility.getFactorial(3));
    }// tui muốn thấy xanh trên GIT
    
}

//MẶC ĐỊNH CODE TEST ĐỘC LẬP VỚI CODE CHÍNH
// ĐỘC LẬP VỚI QUÁ TRÌNH CLEAN&BUILD , TỨC LÀ DÙ CODE BẠN XANH HAY ĐỎ
//MIỄN LÀ KH BỊ ERROR CÚ PHÁP
//BẠN LUÔN ĐÓNG GÓI BUILD RA DC FILE .JAR .WAR (CHẤP XANH ĐỎ)

// HỢP LOGIC THÌ MÀU XANH, TỨC LÀM HÀM CHUẨN THÌ MỚI NÊN RA DC .JAR .WAR
// VẬY TA CẦN CÓ 1 CÁCH GÀI XANH ĐỎ VÀO QUY TRÌNH BUILD .JAR .WAR
// CÁCH KHÁC: NẾU CODE TEST ĐANG MÀU ĐỎ THÌ DISABLE CÁI NÚT BẤM CLEAN%BUILD
