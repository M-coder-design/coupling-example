package autowirebyname;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowirebyname.xml");

        Specification specification = (Specification) context.getBean("specification");

        MyCar myCar = (MyCar) context.getBean("myCar");

        System.out.println(myCar);
    }
}
