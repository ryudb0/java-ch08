package example;

public class UnsupportedFuctionException extends RuntimeException {
	private final int ERROR_CODE;
	
	public int getErrorCode() {
		return ERROR_CODE;
	}
	
	public String getMessage() {
		return "["+ERROR_CODE+"]" +super.getMessage() ; 
	}
	
	public UnsupportedFuctionException(String msg, int errorCode) {
		super(msg);
		ERROR_CODE = errorCode;
	}
}
