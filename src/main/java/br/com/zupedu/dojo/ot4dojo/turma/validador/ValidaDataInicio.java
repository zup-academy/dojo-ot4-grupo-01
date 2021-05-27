package br.com.zupedu.dojo.ot4dojo.turma.validador;

import java.lang.annotation.Target;
import javax.validation.Constraint;
import java.lang.annotation.Retention;
import java.lang.annotation.Documented;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import javax.validation.Payload;

/**
 *
 * @author Robso
 */
@Target({FIELD})
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = {UniqueValidValidator.class})
public @interface ValidaDataInicio {

    String message() default "{javax.validation.constraints.turma.dojo-ot4}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
