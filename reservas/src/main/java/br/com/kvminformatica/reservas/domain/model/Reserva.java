package br.com.kvminformatica.reservas.domain.model;

import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Reserva {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	@ManyToOne
	private Sala sala;
	private String data;
	private LocalTime horarioDeInicio;
	private LocalTime horarioDeTermino;
	private String nomeDaReuniao;
	private String colaborador;
	@Enumerated(EnumType.STRING)
	private Status status = Status.AGENDADA;
	
	public Reserva() {}
	
	public Reserva(Sala sala, String data, LocalTime horarioDeInicio, LocalTime horarioDeTermino,
			String nomeDaReuniao, String colaborador) {
		this.sala = sala;
		this.data = data;
		this.horarioDeInicio = horarioDeInicio;
		this.horarioDeTermino = horarioDeTermino;
		this.nomeDaReuniao = nomeDaReuniao;
		this.colaborador = colaborador;
	}

	public Reserva(String id, Sala sala, String data, LocalTime horarioDeInicio, LocalTime horarioDeTermino,
			String nomeDaReuniao, String colaborador, Status status) {
		super();
		this.id = id;
		this.sala = sala;
		this.data = data;
		this.horarioDeInicio = horarioDeInicio;
		this.horarioDeTermino = horarioDeTermino;
		this.nomeDaReuniao = nomeDaReuniao;
		this.colaborador = colaborador;
		this.status = status;
	}

	
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public LocalTime getHorarioDeTermino() {
		return horarioDeTermino;
	}

	public void setHorarioDeTermino(LocalTime horarioDeTermino) {
		this.horarioDeTermino = horarioDeTermino;
	}

	public String getNomeDaReuniao() {
		return nomeDaReuniao;
	}

	public void setNomeDaReuniao(String nomeDaReuniao) {
		this.nomeDaReuniao = nomeDaReuniao;
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
		return "Reserva [id=" + id + ", sala=" + sala + ", data=" + data + ", horarioDeInicio=" + horarioDeInicio
				+ ", horarioDeTermino=" + horarioDeTermino + ", nomeDaReuniao=" + nomeDaReuniao + ", colaborador="
				+ colaborador + ", status=" + status + "]";
	}
}
