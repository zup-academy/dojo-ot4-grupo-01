package br.com.zupedu.dojo.ot4dojo.turma.validador;

import br.com.zupedu.dojo.ot4dojo.turma.Turma;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 * @author Robso
 */
public class ValidaDataInicioValidator implements ConstraintValidator<ValidaDataInicio, Turma> {

    @PersistenceContext
    private EntityManager manager;

    @Override
    public boolean isValid(Turma turma, ConstraintValidatorContext cvc) {
        Boolean valid = manager.createQuery("SELECT count(1) > 0 FROM Turma WHERE iniciaEm = :campo",
                Boolean.class)
                .setParameter("campo", turma.getIniciaEm())
                .getSingleResult();

        return !valid;
    }

}
