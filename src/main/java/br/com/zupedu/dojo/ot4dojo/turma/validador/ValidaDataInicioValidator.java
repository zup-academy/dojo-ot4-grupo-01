package br.com.zupedu.dojo.ot4dojo.turma.validador;

import br.com.zupedu.dojo.ot4dojo.turma.Turma;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDate;

/**
 *
 * @author Robso
 */
public class ValidaDataInicioValidator implements ConstraintValidator<ValidaDataInicio, LocalDate> {

    @PersistenceContext
    private EntityManager manager;

    @Override
    public boolean isValid(LocalDate iniciaEm, ConstraintValidatorContext cvc) {
        Boolean valid = manager.createQuery("SELECT count(1) > 0 FROM Turma WHERE iniciaEm = :campo",
                Boolean.class)
                .setParameter("campo", iniciaEm)
                .getSingleResult();

        return !valid;
    }

}
