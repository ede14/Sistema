package com.br.sistema.controller;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.JOptionPane;

import com.br.sistema.model.admistrativo.Funcionario;
import com.br.sistema.util.GerarEntityManager;
import com.br.sistema.view.Loguin;
import com.br.sistema.view.Principal;

public class LoginController {
	
	public boolean login(String usuario, String senha) {
		EntityManager em = GerarEntityManager.getInstance().getEntityManager();
		Query qry = em.createQuery("from Funcionario where usuario = :usuario and senha = :senha");
		qry.setParameter("usuario", usuario);
		qry.setParameter("senha", senha);
		List<Funcionario> list = qry.getResultList(); 
               em.close(); 
		if (list.size() <= 0){
			System.out.println("nao");
			//usuarioLogado = null;
	        	FacesMessage mensagem = new FacesMessage(FacesMessage.SEVERITY_ERROR, 
                                        "Usuario ou senha inválida!" , "");
	        	FacesContext.getCurrentInstance().addMessage(null, mensagem); 	
	        	System.out.println("quase");
			return false ;
		}else{
			//usuarioLogado = list.get(0);
		
			//permissao = usuarioLogado.getPermissao();
			//System.out.println(permissao +"1");
			System.out.println("sim");
			JOptionPane.showMessageDialog(null, "usuario Logado");
			
			return true;
		}

	}

	

}
