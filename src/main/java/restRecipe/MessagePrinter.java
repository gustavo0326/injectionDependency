package restRecipe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*esta anotacion component le indica al sistema q es un componente que le debe inyectar las dependencias
 * y si alguien depende de el tambien se las debe inyectar*/
@Component
public class MessagePrinter {
	
	final private MessageService service;
	/*el autowired se puede hacer a nivel de constructor o a nivel de propiedad -- es recomendable a nivel de constructor
	 * le indica que llame y cablie las dependencia aqui instanciadass en este casp le inyecta todas las dependencia
	 * ,messageservice, */
	@Autowired
	public MessagePrinter(MessageService service) {
		this.service = service;
	}

	public void printMessage() {
		// TODO Auto-generated method stub
		System.out.println(this.service.getMessage());
		
	}
	
	
	
	
	
	

}
