package br.com.reforcoonline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.com.reforcoonline.constant.PageConstant;
import br.com.reforcoonline.service.ProfessorService;

@Controller("professorController")
public class ProfessorController extends AbstractBaseController {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	private ProfessorService professorService;

	@RequestMapping("/professor/salvar")
	public ModelAndView salvar(@RequestParam(value="nome", required = true) String nome,
			@RequestParam(value="cpf",required = true) String cpf,
			@RequestParam(value="email",required = true) String email,
			@RequestParam(value="nomeUsuario",required = true) String nomeUsuario,
			@RequestParam(value="senha",required = true) String senha) {
		professorService.salvar(nome, cpf, email, nomeUsuario, senha);
		
		ModelAndView view = new ModelAndView();
		view.addObject( "message", "Ensinador cadastrado com sucesso!" );
		view.setViewName(PageConstant.CADASTRO_PROFESSOR);
		
		return view;
	}

	@RequestMapping("/professor")
	public ModelAndView index() {
		ModelAndView view = new ModelAndView();
		view.setViewName(PageConstant.CADASTRO_PROFESSOR);

		return view;
	}

}