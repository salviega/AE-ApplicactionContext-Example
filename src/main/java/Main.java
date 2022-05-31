import models.USDToMXNConverter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import repositories.IConverter;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        Double qty = 100D;
        IConverter c = (IConverter) applicationContext.getBean("usdToCop"); //usdToMxn
        System.out.println(c.convert(qty));

    }
}
