package 不同包的内部类;

import 第二个包.Person;

/**
 * @author qgyiimer
 * @create 2021-{05}--12:41
 */
public class test {
    public static void main(String[] args) {
        Class<Person> personClass = Person.class;
        Person person = new Person();
        Class<?>[] declaredClasses = personClass.getDeclaredClasses();
        System.out.println(declaredClasses.length);
    }
}
