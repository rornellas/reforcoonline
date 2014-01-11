package br.com.reforcoonline.dao;

import org.springframework.stereotype.Repository;

import br.com.reforcoonline.entity.Perfil;

@Repository("perfilDAO")
public class PerfilDAO extends GenericJpaRepository<Perfil, Integer>  {

}