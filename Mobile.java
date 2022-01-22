package week1.day1;

public class Mobile {
	int number =123456789;
	
	public void sendmsg()
	{
		System.out.println("Sending message");
	}
	
	private void makeCall()
	{
		System.out.println("Make a call"+ number);
	}
	
	void saveContact()
	{
		System.out.println("saving the contact"+ number);
	}
	public static void main(String[] args) {
	
		Mobile obj = new Mobile();
		obj.sendmsg();
		obj.makeCall();
		obj.saveContact();
		System.out.println(obj.number);
		
	}
	

}
