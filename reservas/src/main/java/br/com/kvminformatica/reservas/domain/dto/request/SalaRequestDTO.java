package br.com.kvminformatica.reservas.domain.dto.request;

public class SalaRequestDTO {

	private String nomeDaSala;
	private String andar;
	
	public SalaRequestDTO() {}

	public SalaRequestDTO(String nomeDaSala, String andar) {
		this.nomeDaSala = nomeDaSala;
		this.andar = andar;
	}

	public String getNomeDaSala() {
		return nomeDaSala;
	}

	public void setNomeDaSala(String nomeDaSala) {
		this.nomeDaSala = nomeDaSala;
	}

	public String getAndar() {
		return andar;
	}

	public void setAndar(String andar) {
		this.andar = andar;
	}
}
