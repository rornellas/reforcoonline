package br.com.reforcoonline.dao;

import org.springframework.stereotype.Repository;

import br.com.reforcoonline.entity.Pessoa;

@Repository("pessoaDAO")
public class PessoaDAO extends GenericJpaRepository<Pessoa, Integer>  {

}