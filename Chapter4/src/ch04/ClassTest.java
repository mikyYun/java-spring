package ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class cls = Class.forName("ch04.Person");

        Person person = (Person)cls.newInstance();
        person.setName("Lee");
        System.out.println(person);

        Class cls2 = person.getClass();
        Person p = (Person)cls2.newInstance();
        System.out.println(p);// null -> name not set

        // 1 => in case the class is not exist in local..
        Class[] parameterType = {String.class};
        Constructor cons = cls2.getConstructor(parameterType);

        Object[] initargets = {"Kim"};
        Person kim = (Person)cons.newInstance(initargets);
        System.out.println(kim);

        // 2
        //Person kim2 = new Person("kim");
    }
}
