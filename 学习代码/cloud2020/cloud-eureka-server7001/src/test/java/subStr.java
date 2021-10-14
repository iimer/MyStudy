import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author qgyiimer
 * @create 2021-{07}--21:40
 */
@SpringBootTest
public class subStr {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(s.substring(0, 4));
    }
}
