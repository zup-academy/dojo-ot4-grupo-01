package br.com.zupedu.dojo.ot4dojo.turma.validador;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UniqueValidValidator implements ConstraintValidator<UniqueValid, String> {
	
	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		Boolean valid = manager.createQuery("SELECT count(1) > 0 FROM Turma WHERE nome = :campo",
				Boolean.class)
	    .setParameter("campo", value)
	    .getSingleResult();
		
		return !valid;
	}

}
