package br.com.kvminformatica.reservas.domain.dto.response;

public class ReservaResponseDTO {

	private String sala;
	private String data;
	private String horarioDeInicio;
	private String nomeDaReunião;
	private String colaborador;
	private String status;
	
	public ReservaResponseDTO(String sala, String data, String horarioDeInicio, String nomeDaReunião, String colaborador,
			String status) {
		this.sala = sala;
		this.data = data;
		this.horarioDeInicio = horarioDeInicio;
		this.nomeDaReunião = nomeDaReunião;
		this.colaborador = colaborador;
		this.status = status;
	}
	
	public String getData() {
		return data;
	}
	public String getSala() {
		return sala;
	}
	public String getHorarioDeInicio() {
		return horarioDeInicio;
	}
	public String getNomeDaReunião() {
		return nomeDaReunião;
	}
	public String getColaborador() {
		return colaborador;
	}
	public String getStatus() {
		return status;
	}
}
