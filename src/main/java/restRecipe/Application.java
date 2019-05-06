package restRecipe;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


/*clase que le indica a travez de la anotacion configuration a sprint que contiene los beans
 * que inyectan las dependencias
 * con la anotacion componentscan le indico que busque todas las clases que tienen la anotacion
 * component y inyectele las dependencias, ejemplo messageprinter*/

@Configuration
@ComponentScan
public class Application {
	
	/*bean que contiene el serivicio */
	@Bean
	MessageService happyMessage() {
		return new HappyMessageService();
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// crea el contexto y le digo que la clase que contiene los beans se llama application class
		ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
		//creo una onstancia de messageprinter y obtengo el bean del contexto que necesita la clase messaprinter
		MessagePrinter printer = context.getBean(MessagePrinter.class);
		//y puedo usar el metodo printmessage.
		printer.printMessage();
		

	}
	

}
