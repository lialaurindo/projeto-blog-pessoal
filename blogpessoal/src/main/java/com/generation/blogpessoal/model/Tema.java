package com.generation.blogpessoal.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import antlr.collections.List;

@Entity
@Table(name = "tb_temas")
public class Tema {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;

		@NotNull(message = "O Atributo Descrição é obrigatório")
		private String descricao;
		
		@OneToMany(mappedBy = "tema", cascade = CascadeType.ALL)
		@JsonIgnoreProperties("tema")
		private java.util.List<Postagem> postagem;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getDescricao() {
			return this.descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}
		
		public java.util.List<Postagem> getPostagem() {
			return this.postagem;
		}

		public void setPostagem(java.util.List<Postagem> postagem) {
			this.postagem = postagem;
		}

	}

