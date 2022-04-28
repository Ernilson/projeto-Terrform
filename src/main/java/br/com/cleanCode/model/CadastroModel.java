package br.com.cleanCode.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cadastro")
public class CadastroModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(nullable = false)
	private String nome;
	@Column(nullable = false)
	private String Endereco;
	@Column(nullable = false)
	private String Telefone;
	
	public CadastroModel() {
		// TODO Auto-generated constructor stub
	}
	
	public CadastroModel(Long id, String nome, String endereco, String telefone) {
		super();
		this.id = id;
		this.nome = nome;
		Endereco = endereco;
		Telefone = telefone;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return Endereco;
	}

	public void setEndereco(String endereco) {
		Endereco = endereco;
	}

	public String getTelefone() {
		return Telefone;
	}

	public void setTelefone(String telefone) {
		Telefone = telefone;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Endereco, Telefone, id, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CadastroModel other = (CadastroModel) obj;
		return Objects.equals(Endereco, other.Endereco) && Objects.equals(Telefone, other.Telefone)
				&& Objects.equals(id, other.id) && Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "CadastroModel [id=" + id + ", nome=" + nome + ", Endereco=" + Endereco + ", Telefone=" + Telefone + "]";
	}
	
	

}
