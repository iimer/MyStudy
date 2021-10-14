package 常用类;

import java.math.BigDecimal;
import java.text.ParseException;

/**
 * @author qgyiimer
 * @create 2021-{04}--19:09
 */
public class 高精度 {
    public static void main(String[] args) throws ParseException {
        BigDecimal bigDecimal = new BigDecimal(11);
        BigDecimal bigDecimal1 = new BigDecimal(3);
        System.out.println(bigDecimal.divide(bigDecimal1,2,BigDecimal.ROUND_DOWN));
        System.out.println(bigDecimal.divide(bigDecimal1,2,BigDecimal.ROUND_CEILING));
        System.out.println(bigDecimal.divide(bigDecimal1,2,BigDecimal.ROUND_HALF_UP));
        System.out.println("----------------------------------");
        BigDecimal bigDecimal2 = new BigDecimal(10);
        BigDecimal bigDecimal3 = new BigDecimal(3);
        System.out.println(bigDecimal2.divide(bigDecimal3,2,BigDecimal.ROUND_DOWN));
        System.out.println(bigDecimal2.divide(bigDecimal3,2,BigDecimal.ROUND_CEILING));
        System.out.println(bigDecimal2.divide(bigDecimal3,2,BigDecimal.ROUND_HALF_UP));
        System.out.println(BigDecimal.ROUND_HALF_UP);
        System.out.println("==========================================");
        BigDecimal bigDecimal4 = new BigDecimal("0.312526");
        System.out.println(bigDecimal4.setScale(3, 1));
        System.out.println(bigDecimal4.setScale(3, 2));
        System.out.println(bigDecimal4.setScale(3, 4));
        //或者用RoundingMode
    }
}
