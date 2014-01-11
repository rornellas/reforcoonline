package br.com.reforcoonline.dao;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import br.com.reforcoonline.entity.Usuario;

@Repository("usuarioDAO")
public class UsuarioDAO extends GenericJpaRepository<Usuario, Integer>  {

	public Usuario findByLogin(String userName,
			String senha) {
		Query query = getSession().createQuery( "from Usuario where nome = :usuario and senha = :senha" );
		query.setParameter( "usuario" , userName );
		query.setParameter( "senha" , senha );

		Usuario result = null;
		try {
			result = (Usuario) query.uniqueResult();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}