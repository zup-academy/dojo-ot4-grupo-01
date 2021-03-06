package br.com.zupedu.dojo.ot4dojo.turma;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.com.zupedu.dojo.ot4dojo.turma.validador.ValidaDataInicio;
import org.hibernate.validator.constraints.Length;

import br.com.zupedu.dojo.ot4dojo.turma.validador.UniqueValid;


public class TurmaRequest {
	
	@NotBlank
	@Length(max = 50)
	@UniqueValid
	private String nome;
	
	@NotNull
	@ValidaDataInicio
	private LocalDate iniciaEm;
	
	@NotNull
	private LocalDate terminaEm;

	public TurmaRequest(@NotBlank @Length(max = 50) String nome, @NotNull LocalDate iniciaEm,
			@NotNull LocalDate terminaEm) {
		super();
		this.nome = nome;
		this.iniciaEm = iniciaEm;
		this.terminaEm = terminaEm;
	}
	
	public Turma toModel() {
		return new Turma(nome,iniciaEm,terminaEm);
	}
	
	

}
