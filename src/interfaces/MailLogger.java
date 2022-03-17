package interfaces;

public class MailLogger implements Message{

	@Override
	public void sendMessage(String message) {
       System.out.println(message + " Mail gönderildi");
	}

}
