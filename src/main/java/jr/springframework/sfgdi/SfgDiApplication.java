package jr.springframework.sfgdi;

import jr.springframework.sfgdi.controllers.ConstructorInjectedController;
import jr.springframework.sfgdi.controllers.MyController;
import jr.springframework.sfgdi.controllers.PropertyInjectedController;
import jr.springframework.sfgdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(SfgDiApplication.class, args);
		var myController = (MyController) context.getBean("myController");
		System.out.println(myController.sayHi());

		System.out.println("------ Property");
		var propertyInjectedController = (PropertyInjectedController) context.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("--------- Setter");
		var setterInjectedController = (SetterInjectedController) context.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("-------- Constructor" );
		var constructorInjectedController = (ConstructorInjectedController) context.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());

	}
}
