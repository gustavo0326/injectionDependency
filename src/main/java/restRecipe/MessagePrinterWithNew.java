package restRecipe;

public class MessagePrinterWithNew {
	
	/*usa el servicio happymessageService pero como utiliza un new para esto ... se hace muy
	engorroso tener que crear un servicio para cada servicio ejemplo
	happyMessageService y badMessageService 
	final private MessageService service =
			new HappyMessageService();
			final private MessageService service =
			new badMessageService();
	*/
	/*por eso se creara solo una instancia del servicio y se setea su implementacion
	 * a travez de los getter y setter.*/
	private MessageService service;
	
	
	public void printMessage() {
		System.out.println(this.service.getMessage());
	}


	public MessageService getService() {
		return service;
	}


	public void setService(MessageService service) {
		this.service = service;
	}
	
	

}
