package br.com.kvminformatica.reservas.domain.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Reserva {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	@ManyToOne
	private Sala sala;
	private LocalDateTime horarioDeInicio;
	private LocalDateTime horarioDeTermino;
	private String nomeDaReuniao;
	private String colaborador;
	@Enumerated(EnumType.STRING)
	private Status status;
	
	public Reserva() {}
	
	public Reserva(Sala sala, LocalDateTime horarioDeInicio, LocalDateTime horariodeTermino, String nomeDaReunião,
			String colaborador, Status status) {
		this.sala = sala;
		this.horarioDeInicio = horarioDeInicio;
		this.horarioDeTermino = horariodeTermino;
		this.nomeDaReuniao = nomeDaReunião;
		this.colaborador = colaborador;
		this.status = status;
	}

	public Reserva(String id, Sala sala, LocalDateTime horarioDeInicio, LocalDateTime horariodeTermino, String nomeDaReunião,
			String colaborador, Status status) {
		this.id = id;
		this.sala = sala;
		this.horarioDeInicio = horarioDeInicio;
		this.horarioDeTermino = horariodeTermino;
		this.nomeDaReuniao = nomeDaReunião;
		this.colaborador = colaborador;
		this.status = status;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
		return horarioDeTermino;
	}

	public void setHorariodeTermino(LocalDateTime horariodeTermino) {
		this.horarioDeTermino = horariodeTermino;
	}

	public String getNomeDaReunião() {
		return nomeDaReuniao;
	}

	public void setNomeDaReunião(String nomeDaReunião) {
		this.nomeDaReuniao = nomeDaReunião;
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

	@Override
	public String toString() {
		return "Reserva [id=" + id + ", sala=" + sala + ", horarioDeInicio=" + horarioDeInicio + ", horariodeTermino="
				+ horarioDeTermino + ", nomeDaReunião=" + nomeDaReuniao + ", colaborador=" + colaborador + ", status="
				+ status + "]";
	}
}
