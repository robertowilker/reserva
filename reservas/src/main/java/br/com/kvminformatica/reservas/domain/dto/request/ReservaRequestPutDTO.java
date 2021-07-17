package br.com.kvminformatica.reservas.domain.dto.request;

import javax.validation.constraints.NotBlank;

public class ReservaRequestPutDTO {

	@NotBlank
	private String nomeDaReuniao;

	public String getNomeDaReuniao() {
		return nomeDaReuniao;
	}

	public void setNomeDaReuniao(String nomeDaReuniao) {
		this.nomeDaReuniao = nomeDaReuniao;
	}
}
