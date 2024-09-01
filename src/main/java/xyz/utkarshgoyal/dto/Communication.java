package xyz.utkarshgoyal.dto;

public class Communication {
	
	private String email;
	
	private Phone phone;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Communication [email=" + email + ", phone=" + phone + "]";
	}
	
	

}
