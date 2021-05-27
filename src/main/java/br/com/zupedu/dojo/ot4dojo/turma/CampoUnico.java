package br.com.zupedu.dojo.ot4dojo.turma;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class CampoUnico implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		
		return TurmaRequest.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		if(errors.hasErrors()) {
			return;
		}
		
		TurmaRequest turmaRequest = (TurmaRequest) target;
		
	}
	
	
	
}
