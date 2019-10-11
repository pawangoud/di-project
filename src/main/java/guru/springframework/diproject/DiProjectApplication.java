package guru.springframework.diproject;

import guru.springframework.diproject.controllers.ConstructorInjectedController;
import guru.springframework.diproject.controllers.GetterInjectedController;
import guru.springframework.diproject.controllers.MyController;
import guru.springframework.diproject.controllers.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiProjectApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiProjectApplication.class, args);

		MyController controller = (MyController) ctx.getBean("myController");

		System.out.println(controller.hello());
		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
	}
}
