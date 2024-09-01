package xyz.utkarshgoyal.formatter;

import java.text.ParseException;
import java.util.Locale;

import javax.swing.Spring;

import org.springframework.format.Formatter;

import xyz.utkarshgoyal.dto.Phone;

public class PhoneNumberFormatter implements Formatter<Phone>{

	@Override
	public String print(Phone phone, Locale locale) {
		return phone.getCountryCode() + "-" + phone.getNumber();
	}

	@Override
	public Phone parse(String text, Locale locale) throws ParseException {
		
		String[] phoneData = text.split("-");
		
		if(text.indexOf("-") == -1) {
			return setPhoneObject("91", text);
		}
		
		if(phoneData[0].length() < 1) {
			return setPhoneObject("91", phoneData[1]);
		}
		
		return setPhoneObject(phoneData[0], phoneData[1]);
	}
	
	private Phone setPhoneObject(String countryCode, String phoneNumber) {
		Phone phone = new Phone();
		phone.setCountryCode(countryCode);
		phone.setNumber(phoneNumber);
		return phone;
	}
	

}
