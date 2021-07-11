package br.com.kvminformatica.reservas.domain.dto.request;

import java.time.LocalDateTime;

import javax.validation.constraints.NotEmpty;

import br.com.kvminformatica.reservas.domain.model.Sala;
import br.com.kvminformatica.reservas.domain.model.Status;

public class ReservaRequestDTO {
	
	@NotEmpty
	private Sala sala;
	@NotEmpty
	private LocalDateTime horarioDeInicio;
	@NotEmpty
	private LocalDateTime horariodeTermino;
	private String nomeDaReunião;
	@NotEmpty
	private String colaborador;
	@NotEmpty
	private Status status;

	
	public ReservaRequestDTO() {}

	public ReservaRequestDTO(Sala sala, LocalDateTime horarioDeInicio, LocalDateTime horariodeTermino,
			String nomeDaReunião, String colaborador, Status status) {
		this.sala = sala;
		this.horarioDeInicio = horarioDeInicio;
		this.horariodeTermino = horariodeTermino;
		this.nomeDaReunião = nomeDaReunião;
		this.colaborador = colaborador;
		this.status = status;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	public LocalDateTime getHorarioDeInicio() {
		return horarioDeInicio;
	}

	public void setHorarioDeInicio(LocalDateTime horarioDeInicio) {
		this.horarioDeInicio = horarioDeInicio;
	}

	public LocalDateTime getHorariodeTermino() {
		return horariodeTermino;
	}

	public void setHorariodeTermino(LocalDateTime horariodeTermino) {
		this.horariodeTermino = horariodeTermino;
	}

	public String getNomeDaReunião() {
		return nomeDaReunião;
	}

	public void setNomeDaReunião(String nomeDaReunião) {
		this.nomeDaReunião = nomeDaReunião;
	}

	public String getColaborador() {
		return colaborador;
	}

	public void setColaborador(String colaborador) {
		this.colaborador = colaborador;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
}
