import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * @author qgyiimer
 * @create 2021-{05}--17:11
 */
public class 创建xml {
    public static void main(String[] args) throws IOException {
        // 1.通过DocumentHelper生成一个Document对象
        Document doc = DocumentHelper.createDocument();
        // 2.添加并得到根元素
        Element books = doc.addElement("books");
        // 3.为根元素添加子元素
        Element book = books.addElement("book");
        // 4.添加属性
        book.addAttribute("id","01");
        // 5.为book添加子元素
        Element name = book.addElement("name");
        Element author = book.addElement("author");
        Element price = book.addElement("price");
        // 6.为子元素添加文本
        Element java = name.addText("Java");
        Element 小明 = author.addText("小明");
        Element element = price.addText("12.5");
//        // 7.输出流把doc输出到xml文件
//        FileWriter writer = new FileWriter("books.xml");
//        doc.write(writer);
//        // 8.关闭流
//        writer.close();

        //7.美化输出
        OutputFormat format = OutputFormat.createPrettyPrint();
        FileWriter writer = new FileWriter("books2.xml");
        XMLWriter xmlWriter = new XMLWriter(writer,format);
        xmlWriter.write(doc);
        //关闭
        xmlWriter.close();
    }
}
