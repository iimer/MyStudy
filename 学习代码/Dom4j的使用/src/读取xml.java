import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.Iterator;

/**
 * @author qgyiimer
 * @create 2021-{05}--17:29
 */
public class 读取xml {
    public static void main(String[] args) throws DocumentException {
        //1.创建SAXReader对象，用于读取xml文件
        SAXReader reader = new SAXReader();
        //2.读取xml文件，得到Document对象
        Document doc = reader.read("books2.xml");
        //3.获取根元素
        Element rootElement = doc.getRootElement();
        //4.取元素
        Iterator<Element> iterator = rootElement.elementIterator();
        while (iterator.hasNext()) {
            Element next = iterator.next();
            Attribute attribute = next.attribute(0);
            Element name = next.element("name");
            Element author = next.element("author");
            Element price = next.element("price");
            System.out.println(next.getName());
            System.out.println(attribute.getText());
            System.out.println(name.getText());
            System.out.println(author.getText());
            System.out.println(price.getText());
            System.out.println("-------------------");
        }
    }
}
