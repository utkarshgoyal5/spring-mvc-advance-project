package xyz.utkarshgoyal.dto;

import java.util.Arrays;
import java.util.List;

import xyz.utkarshgoyal.validator.Age;

public class UserRegisterDto {
	
	private String name;
	
	private String username;
	
	private char[] password;
	
	private String country;
	
	private List<String> hobby;
	
	private String gender;

	@Age(lower = 30 , upper = 45)
	private Integer age;
	
	private Communication communication;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String userName) {
		this.username = userName;
	}

	public char[] getPassword() {
		return password;
	}

	public void setPassword(char[] password) {
		this.password = password;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public List<String> getHobby() {
		return hobby;
	}

	public void setHobby(List<String> hobby) {
		this.hobby = hobby;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Communication getCommunication() {
		return communication;
	}

	public void setCommunication(Communication communication) {
		this.communication = communication;
	}

	@Override
	public String toString() {
		return "UserRegisterDto [name=" + name + ", username=" + username + ", password=" + Arrays.toString(password)
				+ ", country=" + country + ", hobby=" + hobby + ", gender=" + gender + ", age=" + age
				+ ", communication=" + communication + "]";
	}

	
	
}
