package homework3;

public enum Error {
	BadRequest(400),
	Unauthorized(401),
	PaymentRequired(402),
	Forbidden(403),
	NotFound(404),
	MethodNotAllowed(405), 
	NotAcceptable(406),
	ProxyAuthenticationRequired(407),
	RequestTimeout(408),
	Conflict(409),
	Gone(410);
	
	int number;
	private Error(int number) {
		this.number = number;
	}
	
	public int getNumber(){
		return this.number;
	}
	
}
