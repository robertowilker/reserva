package br.com.kvminformatica.reservas.domain.dto.request;

import javax.validation.constraints.NotBlank;

public class SalaRequestPutDTO {

	@NotBlank
	private String nomeDaSala;

	public String getNomeDaSala() {
		return nomeDaSala;
	}

	public void setNomeDaSala(String nomeDaSala) {
		this.nomeDaSala = nomeDaSala;
	}
}
