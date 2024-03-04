package com.plano.saude.cadastro.dto;

import java.time.LocalDate;

import com.plano.saude.cadastro.enuns.TipoDocumento;

//Sugestão: usar lombok
public class DocumentoDTO {
	private Long id;
	private TipoDocumento tipoDocumento;
	private String descricao;
	private LocalDate dataInclusao;
	private LocalDate dataAtualizacao;

	public DocumentoDTO() { 
	}

	public DocumentoDTO(Long id, TipoDocumento tipoDocumento, String descricao, LocalDate dataInclusao,
			LocalDate dataAtualizacao) {
		super();
		this.id = id;
		this.tipoDocumento = tipoDocumento;
		this.descricao = descricao;
		this.dataInclusao = dataInclusao;
		this.dataAtualizacao = dataAtualizacao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDate getDataInclusao() {
		return dataInclusao;
	}

	public void setDataInclusao(LocalDate dataInclusao) {
		this.dataInclusao = dataInclusao;
	}

	public LocalDate getDataAtualizacao() {
		return dataAtualizacao;
	}

	public void setDataAtualizacao(LocalDate dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}
}
