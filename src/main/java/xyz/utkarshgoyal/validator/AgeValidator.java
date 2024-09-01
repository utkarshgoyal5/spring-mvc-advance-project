package xyz.utkarshgoyal.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class AgeValidator implements ConstraintValidator<Age, Integer>{

	private int lower;
	private int upper;
	
	@Override
	public void initialize(Age age) {
		//Here we can add post construct logic
		this.lower = age.lower();
		this.upper = age.upper();
	}
	
	@Override
	public boolean isValid(Integer age, ConstraintValidatorContext context) {
		if(age == null || age < lower || age > upper) {
			return false;
		}
		return true;
	}

}
