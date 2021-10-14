package 日期类;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author qgyiimer
 * @create 2021-{04}--18:27
 */
public class DateTest {
    @Test
    public void test2() throws ParseException {
        String str1 = "2020-02-10";
        String str2 = "2020-03-01";
        SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd");
        Date parse1 = sm.parse(str1);
        Date parse2 = sm.parse(str2);
        long days = (parse2.getTime() - parse1.getTime())/(1000*60*60*24)+1;
        System.out.println(days);
    }
}
