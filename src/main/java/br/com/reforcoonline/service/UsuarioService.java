package br.com.reforcoonline.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.reforcoonline.dao.UsuarioDAO;
import br.com.reforcoonline.entity.Usuario;

@Service("usuarioService")
public class UsuarioService {

	@Autowired
	private UsuarioDAO usuarioDAO;

	public Usuario findUserByLogin(String userName, String senha) {
		return usuarioDAO.findByLogin(userName, senha);
	}
	
	
}
