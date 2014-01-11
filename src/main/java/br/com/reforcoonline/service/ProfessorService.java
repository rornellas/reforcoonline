package br.com.reforcoonline.service;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.reforcoonline.dao.PerfilDAO;
import br.com.reforcoonline.dao.PessoaDAO;
import br.com.reforcoonline.entity.Perfil;
import br.com.reforcoonline.entity.Perfilusuario;
import br.com.reforcoonline.entity.Pessoa;
import br.com.reforcoonline.entity.Usuario;

@Service("professorService")
public class ProfessorService {

	@Autowired
	private PessoaDAO pessoaDAO;
	
	@Autowired
	private PerfilDAO perfilDAO;

	@Transactional(propagation=Propagation.REQUIRED)
	public Pessoa salvar(String nome, String cpf, String email, String nomeUsuario, String senha) {
		Usuario usuario = new Usuario();
		usuario.setNome( nomeUsuario );
		usuario.setSenha( senha );
		usuario.setCreateTime( Calendar.getInstance().getTime() );

		Perfil perfil = perfilDAO.findById( Perfil.PERFIL_PROFESSOR );
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome( nome );
		pessoa.setCpf( cpf );
		pessoa.setEmail( email );
		pessoa.setUsuario( usuario );
		
		usuario.getPerfilusuarios().add( new Perfilusuario(perfil, usuario) );
		
		return pessoaDAO.save(pessoa);
	}
	
}
