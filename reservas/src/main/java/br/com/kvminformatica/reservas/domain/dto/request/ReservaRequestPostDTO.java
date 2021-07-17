package br.com.kvminformatica.reservas.domain.dto.request;

import java.time.LocalTime;

import javax.validation.constraints.NotBlank;

public class ReservaRequestPostDTO {
	
	@NotBlank
	private String nomeSala;
	@NotBlank
	private String data;
	// Não existe anotação no Hibernate ou um Bean Validation para
	// validar LocalTime e LocalDate ainda.
	private LocalTime horarioDeInicio;
	private LocalTime horarioDeTermino;
	@NotBlank
	private String nomeDaReuniao;
	@NotBlank
	private String colaborador;
	
	public ReservaRequestPostDTO() {}

	public ReservaRequestPostDTO(String nomeSala, String data, LocalTime horarioDeInicio,
			LocalTime horarioDeTermino, String nomeDaReuniao, String colaborador) {
		this.nomeSala = nomeSala;
		this.data = data;
		this.horarioDeInicio = horarioDeInicio;
		this.horarioDeTermino = horarioDeTermino;
		this.nomeDaReuniao = nomeDaReuniao;
		this.colaborador = colaborador;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getNomeSala() {
		return nomeSala;
	}

	public void setSala(String nomeSala) {
		this.nomeSala = nomeSala;
	}

	public LocalTime getHorarioDeInicio() {
		return horarioDeInicio;
	}

	public void setHorarioDeInicio(LocalTime horarioDeInicio) {
		this.horarioDeInicio = horarioDeInicio;
	}

	public LocalTime getHorariodeTermino() {
		return horarioDeTermino;
	}

	public void setHorariodeTermino(LocalTime horariodeTermino) {
		this.horarioDeTermino = horariodeTermino;
	}

	public String getNomeDaReuniao() {
		return nomeDaReuniao;
	}

	public void setNomeDaReuniao(String nomeDaReunião) {
		this.nomeDaReuniao = nomeDaReunião;
	}

	public String getColaborador() {
		return colaborador;
	}

	public void setColaborador(String colaborador) {
		this.colaborador = colaborador;
	}
}
