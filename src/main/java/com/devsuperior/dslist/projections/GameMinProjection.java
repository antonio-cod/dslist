package com.devsuperior.dslist.projections;

// Incluir todos os campos da tabela da consulta referenciado da classe GameRepository
public interface GameMinProjection {
//incluir os tipos de cada campo.
	Long getId();
	String getTitle();
	Integer getYear();
	String getImgUrl();
	String getShortDescription();
	Integer getPosition();
}
