package xyz.utkarshgoyal.dto;

public class Phone {
	
	private String countryCode;
	
	private String number;

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Phone [countryCode=" + countryCode + ", number=" + number + "]";
	}
	
	
}
