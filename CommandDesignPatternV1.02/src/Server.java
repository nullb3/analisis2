
public class Server {
	private Command command;
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void runGenCookie() {
		String cookie = command.execute();
		System.out.println(cookie);
	}
}
