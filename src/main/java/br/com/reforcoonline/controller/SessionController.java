package br.com.reforcoonline.controller;

import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.com.reforcoonline.constant.PageConstant;
import br.com.reforcoonline.entity.Perfilusuario;
import br.com.reforcoonline.entity.Usuario;
import br.com.reforcoonline.service.UsuarioService;

@Controller("sessionController")
@Scope("session")
public class SessionController extends AbstractController {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Usuario usuario;
	
	@Autowired
	private UsuarioService usuarioService;
	
	@RequestMapping("/logout")
	public ModelAndView logout() {
		finishSession();

		return welcome();
	}
	
	private void finishSession() {
		setUsuario( null );
	}

	@RequestMapping("/index")
	public ModelAndView welcome() {
		if ( isNullOrEpty( getUsuario() ) ) {
			ModelAndView view = new ModelAndView();
			view.setViewName( PageConstant.INDEX );
			return view;
			
		}
		
		return getHomeView();
	}
	
	@RequestMapping("/login")
	public ModelAndView doLogin(@RequestParam(required=true) String login, @RequestParam(required=true) String senha) {
		boolean found = findUser(login, senha);
		System.out.println("1");
		if ( !found ) {
			ModelAndView view = new ModelAndView();
			view.addObject( "message", "Usu&aacute;rio n&atilde;o encontrado" );
			view.setViewName( PageConstant.INDEX );
			
			return view;
		}
		
		return getHomeView();
	}

	private Boolean findUser(String login, String senha) {
		Usuario findUserByLogin = usuarioService.findUserByLogin(login, senha);
		
		if ( isNullOrEpty( findUserByLogin ) ) {
			return false;
		}
		
		setUsuario( findUserByLogin );
		
		return true;
	}

	private ModelAndView getHomeView() {
		ModelAndView view = new ModelAndView();
		forwardResolver(view);
		return view;
	}
	
	private void forwardResolver(ModelAndView view) {
		if ( !isNullOrEpty( getUsuario().getPerfilusuarios() ) ) {
			Iterator<Perfilusuario> iterator = getUsuario().getPerfilusuarios().iterator();

			while (iterator.hasNext()) {
				Perfilusuario next = iterator.next();
				
				if ( next.getPerfil().isAdmin() && !iterator.hasNext() ) {
					view.setViewName( PageConstant.ADMIN_HOME );
				}
			}
		}		
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}