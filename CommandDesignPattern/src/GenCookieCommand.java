interface Command {
	String execute();
}

public class GenCookieCommand implements Command {
	private Cookie cookie;
	
	public GenCookieCommand(Cookie cookie) {
		this.cookie = cookie;
	}
	
	@Override
	public String execute() {
		String cookieId = this.cookie.genCookie();
		return cookieId;
	}
}
