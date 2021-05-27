package br.com.zupedu.dojo.ot4dojo.turma.validador;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ FIELD })
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = {UniqueValidValidator.class })
public @interface UniqueValid {
	
	String message() default "{javax.validation.constraints.turma.dojo-ot4}";

	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };
	
	
}
