import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld beanHW2 = applicationContext.getBean(HelloWorld.class);

        Cat beanCat1 = applicationContext.getBean(Cat.class);
        Cat beanCat2 = applicationContext.getBean(Cat.class);

        System.out.println(bean ==  beanHW2);
        System.out.println(beanCat1 ==  beanCat2);
    }
}