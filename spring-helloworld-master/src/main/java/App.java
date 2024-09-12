import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");

        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");


        Cat cat1 = (Cat) applicationContext.getBean("cat");

        Cat cat2 = (Cat) applicationContext.getBean("cat");

        System.out.println("bean1 = " + bean1.getMessage());
        System.out.println("cat1 = " + cat1.getName());

        boolean b = bean1 == bean2;
        System.out.println("Бины HelloWorld равны по ссылке: " + b);

        boolean c = cat1 == cat2;
        System.out.println("Бины cat равны по ссылке: " + c);
    }
}