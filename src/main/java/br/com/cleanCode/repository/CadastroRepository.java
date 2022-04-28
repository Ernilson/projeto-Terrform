package br.com.cleanCode.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cleanCode.model.CadastroModel;

public interface CadastroRepository extends JpaRepository<CadastroModel, Long>{

}
