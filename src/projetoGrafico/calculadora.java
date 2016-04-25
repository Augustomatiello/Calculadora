package projetoGrafico;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;

public class calculadora extends JFrame {

	private JPanel contentPane;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;
	private JButton btnNewButton_8;
	private JButton btnNewButton_9;
	private JButton btnNewButton_10;
	private JButton btnNewButton_11;
	private JButton btnNewButton_12;
	private JButton btnNewButton_13;
	private JButton btnNewButton_14;
	private JTextField textField;
	
	
	double numero1;
	double numero2;
	double resultado;
	double botao;
	String operacao; 
	private JButton btnNewButton_15;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculadora frame = new calculadora();
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
	public calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("7");
				botao = 7;
			}
		});
		btnNewButton.setBounds(35, 99, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("8");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("8");
				botao = 8;
			}
		});
		btnNewButton_1.setBounds(134, 99, 89, 23);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("9");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("9");
				botao = 9;
			}
		});
		btnNewButton_2.setBounds(233, 99, 89, 23);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("4");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("4");
				botao = 4;
			}
		});
		btnNewButton_3.setBounds(35, 133, 89, 23);
		contentPane.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("5");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("5");
				botao = 5;
			}
		});
		btnNewButton_4.setBounds(134, 133, 89, 23);
		contentPane.add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("6");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("6");
				botao = 6;
			}
		});
		btnNewButton_5.setBounds(233, 133, 89, 23);
		contentPane.add(btnNewButton_5);
		
		btnNewButton_6 = new JButton("1");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("1");
				botao = 1;
			}
		});
		btnNewButton_6.setBounds(35, 167, 89, 23);
		contentPane.add(btnNewButton_6);
		
		btnNewButton_7 = new JButton("2");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("2");
				botao = 2;
			}
		});
		btnNewButton_7.setBounds(134, 167, 89, 23);
		contentPane.add(btnNewButton_7);
		
		btnNewButton_8 = new JButton("3");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("3");
				botao = 3;
			}
		});
		btnNewButton_8.setBounds(233, 167, 89, 23);
		contentPane.add(btnNewButton_8);
		
		btnNewButton_9 = new JButton("+");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operacao = "+";
				numero1 = botao;
			}
		});
		
		btnNewButton_9.setBounds(335, 99, 89, 23);
		contentPane.add(btnNewButton_9);
		
		btnNewButton_10 = new JButton("-");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operacao = "-";
				numero1 = botao;
			}
		});
		
		btnNewButton_10.setBounds(332, 133, 89, 23);
		contentPane.add(btnNewButton_10);
		
		btnNewButton_11 = new JButton("*");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operacao = "*";
				numero1 = botao;
			}
		});
		
		btnNewButton_11.setBounds(335, 167, 89, 23);
		contentPane.add(btnNewButton_11);
		
		btnNewButton_12 = new JButton("/");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operacao = "/";
				numero1 = botao;
			}
		});
		
		btnNewButton_12.setBounds(335, 201, 89, 23);
		contentPane.add(btnNewButton_12);
		
		btnNewButton_13 = new JButton("0");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("0");
				botao = 0;
			}
		});
		btnNewButton_13.setBounds(134, 201, 89, 23);
		contentPane.add(btnNewButton_13);
		
		btnNewButton_14 = new JButton("=");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch (operacao){
				 case "+": 
					 resultado = numero1 + botao;
					 textField.setText(String.valueOf(resultado));
					 break;
				 case "-": 
					 resultado = numero1 - botao;
					 textField.setText(String.valueOf(resultado));
					 break;
				 case "*": 
					 resultado = numero1 * botao;
					 textField.setText(String.valueOf(resultado));
					 break;	 
				 case "/": 
					 resultado = numero1 / botao;
					 textField.setText(String.valueOf(resultado));
					 break;	 
				}
				
				
			}
		});
		btnNewButton_14.setBounds(335, 227, 89, 23);
		contentPane.add(btnNewButton_14);
		
		textField = new JTextField();
		textField.setBounds(35, 11, 328, 62);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnNewButton_15 = new JButton("CE");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero1 = 0;
				botao = 0;
				textField.setText(null);
			}
		});
		btnNewButton_15.setBounds(35, 227, 89, 23);
		contentPane.add(btnNewButton_15);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "SwingAction_1");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
