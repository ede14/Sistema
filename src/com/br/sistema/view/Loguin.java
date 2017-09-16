package com.br.sistema.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.StyledEditorKit.BoldAction;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

import com.br.sistema.controller.LoginController;
import com.br.sistema.model.admistrativo.Funcionario;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Loguin extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JPasswordField passwordField;
	protected JComponent dialog;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Loguin dialog = new Loguin();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
			dialog.setLocationRelativeTo(null);
			dialog.setTitle("Sistema");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Loguin() {
		setBounds(100, 100, 382, 244);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Login:");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUsuario.setBounds(102, 22, 71, 27);
		contentPanel.add(lblUsuario);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSenha.setBounds(102, 77, 71, 27);
		contentPanel.add(lblSenha);
		
		textField = new JTextField();
		textField.setBounds(102, 49, 162, 20);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(102, 105, 162, 20);
		contentPanel.add(passwordField);
		
		JButton btnLogin = new JButton("OK");
		btnLogin.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				LoginController logar = new LoginController();
				logar.login(textField.getText(), passwordField.getText());
				if(true){
				
					System.out.println("oi");
					Principal principal = new Principal();
					principal.setVisible(true);
					dispose();
					
				}
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnLogin.setBounds(136, 149, 89, 27);
		contentPanel.add(btnLogin);
	}
}
