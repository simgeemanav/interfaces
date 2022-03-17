package interfaces;

public class SmsLogger implements Message{

	@Override
	public void sendMessage(String message) {
        System.out.println(message + " sms gönderildi");		
	}

}
