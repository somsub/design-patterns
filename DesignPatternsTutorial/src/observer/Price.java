package observer;

public class Price {
	public double aaplPrice;
	public double googPrice;
	public double fbPrice;

	public Price(double aaplPrice, double googPrice, double fbPrice) {
		this.aaplPrice = aaplPrice;
		this.googPrice = googPrice;
		this.fbPrice = fbPrice;
	}

	public double getAaplPrice() {
		return aaplPrice;
	}

	public void setAaplPrice(double aaplPrice) {
		this.aaplPrice = aaplPrice;
	}

	public double getGoogPrice() {
		return googPrice;
	}

	public void setGoogPrice(double googPrice) {
		this.googPrice = googPrice;
	}

	public double getFbPrice() {
		return fbPrice;
	}

	public void setFbPrice(double fbPrice) {
		this.fbPrice = fbPrice;
	}
	public String toString(){
		return String.format("AAPL %.3f GOOG %.3f FB %.3f", this.aaplPrice, this.googPrice, this.fbPrice) ;
	}
	
}