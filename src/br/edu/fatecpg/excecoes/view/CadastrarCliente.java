package br.edu.fatecpg.excecoes.view;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.edu.fatecpg.excecoes.exception.ValidarEmail;
import br.edu.fatecpg.excecoes.exception.ValidarNome;
import br.edu.fatecpg.excecoes.model.Cliente;
import br.edu.fatecpg.excecoes.services.ValidarCampos;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class CadastrarCliente extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtEmail;
	private JTextField txtNome;
	private JTextField txtIdade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarCliente frame = new CadastrarCliente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CadastrarCliente() {
		
		ValidarCampos validacao = new ValidarCampos();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 250, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(84, 120, 263, 20);
		txtEmail.setToolTipText("Digite o seu nome");
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Cadastrar Clientes");
		lblNewLabel.setForeground(new Color(250, 128, 114));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(49, 14, 194, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Email");
		lblNewLabel_1.setForeground(new Color(250, 128, 114));
		lblNewLabel_1.setBounds(49, 126, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nome");
		lblNewLabel_1_1.setForeground(new Color(250, 128, 114));
		lblNewLabel_1_1.setBounds(49, 83, 46, 14);
		contentPane.add(lblNewLabel_1_1);
		
		txtNome = new JTextField();
		txtNome.setToolTipText("Digite o seu nome");
		txtNome.setColumns(10);
		txtNome.setBounds(84, 77, 141, 20);
		contentPane.add(txtNome);
		
		txtIdade = new JTextField();
		txtIdade.setToolTipText("Digite o seu nome");
		txtIdade.setColumns(10);
		txtIdade.setBounds(283, 77, 64, 20);
		contentPane.add(txtIdade);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Idade");
		lblNewLabel_1_1_1.setForeground(new Color(250, 128, 114));
		lblNewLabel_1_1_1.setBounds(248, 83, 46, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBorder(new LineBorder(new Color(250, 128, 114), 1, true));
		btnCadastrar.setBackground(new Color(255, 250, 250));
		btnCadastrar.setForeground(new Color(250, 128, 114));
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        try {
		            String nome = txtNome.getText();
		            int idade = Integer.parseInt(txtIdade.getText());
		            String email = txtEmail.getText();

		            validacao.validarNome(nome);
		            validacao.validarEmail(email);

		            Cliente cliente = new Cliente(nome, idade, email);
		            JOptionPane.showMessageDialog(CadastrarCliente.this,"Cliente " + cliente.getNome() + " cadastrado com sucesso!\n" , "Sucesso", JOptionPane.INFORMATION_MESSAGE);

		        }catch (ValidarNome err) {
		            JOptionPane.showMessageDialog(CadastrarCliente.this, err.getMessage(),"Erro", JOptionPane.ERROR_MESSAGE);
		        } catch (NumberFormatException error) {
		            JOptionPane.showMessageDialog(CadastrarCliente.this, error.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
		        } catch (ValidarEmail erro) {
		            JOptionPane.showMessageDialog(CadastrarCliente.this, erro.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
		        }  catch (Exception er) {
		            JOptionPane.showMessageDialog(CadastrarCliente.this, "Erro inesperado: " + er.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
		        }	    
			}
		});
		btnCadastrar.setBounds(234, 195, 113, 23);
		contentPane.add(btnCadastrar);
	}
}
