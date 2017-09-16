package com.br.sistema.util;



import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class TrataException {

	public static void pegaMensagem(Exception e, FacesContext currentInstance) {
		// TODO Auto-generated method stub
		Throwable t = e.getCause();
		while(t.getCause() != null){
			t = t.getCause();
			
		}
		
		// personalizar a mensagem
		String msgErro = t.getLocalizedMessage();
		if (msgErro.contains("chave na mensagem ")){
			msgErro = "Mensagem personalizada!";
		}
		if (msgErro.contains("interpolatedMessage ")){
		msgErro = "Mensagem personalizada!";
		}
		if (msgErro.contains("interpolatedMessage ")){
			msgErro = "Mensagem personalizada!";
			}
		if (msgErro.contains("cpf")){
			msgErro = "CPF Já esta Cadastrado!";
			}
		if (msgErro.contains("rg")){
			msgErro = "RG Já esta Cadastrado!";
			}
		if (msgErro.contains("usuario")){
			msgErro = " Já  existe um usuario com esse nome Cadastrado!";
			}
		if (msgErro.contains("viola restrição de chave estrangeira")){
			msgErro = " Não é possivel excluir essa pessoa!";
			}
		FacesMessage msg = new FacesMessage(
				FacesMessage.SEVERITY_ERROR,
        		"Erro ao gravar: "+ msgErro, 
        		"");
		currentInstance.addMessage("Erro", msg);

	}

}
