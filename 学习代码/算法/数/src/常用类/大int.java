package 常用类;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * @author qgyiimer
 * @create 2021-{04}--19:02
 */
public class 大int {
    public static void main(String[] args) {
        String s = "21";
        BigInteger bigInteger = new BigInteger(s);
//        int j = Integer.parseInt(String.valueOf(bigInteger));
        System.out.println(bigInteger);
        BigInteger e = bigInteger.add(new BigInteger(String.valueOf(6)));
        System.out.println(e);
        e = bigInteger.subtract(new BigInteger(String.valueOf(6)));
        System.out.println(e);
        e = bigInteger.multiply(new BigInteger(String.valueOf(6)));
        System.out.println(e);
        e = bigInteger.divide(new BigInteger(String.valueOf(6)));
        System.out.println(e);
        e = bigInteger.mod(new BigInteger(String.valueOf(6)));
        System.out.println(e);
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    }
}
