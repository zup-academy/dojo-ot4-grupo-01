package br.com.zupedu.dojo.ot4dojo.turma;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;


public class TurmaRequest {
	
	@NotBlank
	@Length(max = 50)
	private String nome;
	
	@NotNull
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
