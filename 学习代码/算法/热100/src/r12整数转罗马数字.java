/**
 * @author qgyiimer
 * @create 2021-{09}--10:07
 */
public class r12整数转罗马数字 {
//    I             1
//    V             5
//    X             10
//    L             50
//    C             100
//    D             500
//    M             1000

    public String intToRoman(int num) {
        StringBuilder res = new StringBuilder();
        while (num>=1000) {
            res.append('M');
            num-=1000;
        }
        if (num>=900) {
            res.append("CM");
            num-=900;
        }
        while (num>=500) {
            res.append('D');
            num-=500;
        }
        if (num>=400) {
            res.append("CD");
            num-=400;
        }
        while (num>=100) {
            res.append('C');
            num-=100;
        }
        if (num>=90) {
            res.append("XC");
            num-=90;
        }
        while (num>=50) {
            res.append('L');
            num-=50;
        }
        if (num>=40) {
            res.append("XL");
            num-=40;
        }
        while (num>=10) {
            res.append('X');
            num-=10;
        }
        if (num>=9) {
            res.append("IX");
            num-=9;
        }
        while (num>=5) {
            res.append('V');
            num-=5;
        }
        if (num>=4) {
            res.append("IV");
            num-=4;
        }
        while (num>0) {
            res.append('I');
            num--;
        }
        return res.toString();
    }
}
