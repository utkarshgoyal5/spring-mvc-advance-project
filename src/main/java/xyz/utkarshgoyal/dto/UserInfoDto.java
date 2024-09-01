package xyz.utkarshgoyal.dto;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class UserInfoDto {
	
	@NotBlank(message=" * User Name cannot be empty")
	@Size(min = 3, max = 14, message=" * username size must be in the range of 3-14")
	private String userName;
	@NotBlank(message=" * Crush Name cannot be empty")
	@Size(min = 3, max = 14, message=" * Crush name size must be in the range of 3-14")
	private String crushName;
	@AssertTrue(message=" * Must accept condition to proceed")
	private boolean termAndConditions;
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getCrushName() {
		return crushName;
	}
	
	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}
	
	public boolean isTermAndConditions() {
		return termAndConditions;
	}

	public void setTermAndConditions(boolean termAndConditions) {
		this.termAndConditions = termAndConditions;
	}

	@Override
	public String toString() {
		return "UserInfoDto [userName=" + userName + ", crushName=" + crushName + ", termAndConditions="
				+ termAndConditions + "]";
	}

	
	
	
	
	

}
