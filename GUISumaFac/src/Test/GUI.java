package Test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import servicio_met.SerSumaFacProxy;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.rmi.RemoteException;

public class GUI extends JFrame {

	private JPanel contentPane;
	private JTextField num1;
	private JTextField num2;
	private JTextField num3;

	SerSumaFacProxy obj = new SerSumaFacProxy();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
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
	public GUI() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelSuma = new JLabel("");
		labelSuma.setBounds(78, 153, 89, 14);
		contentPane.add(labelSuma);
		
		num1 = new JTextField();
		num1.setBounds(27, 48, 86, 20);
		contentPane.add(num1);
		num1.setColumns(10);
		
		num2 = new JTextField();
		num2.setBounds(123, 48, 86, 20);
		contentPane.add(num2);
		num2.setColumns(10);
		
		JButton btnSumar = new JButton("Sumar");
		btnSumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int a = Integer.parseInt(num1.getText());
				int b = Integer.parseInt(num2.getText());
				
				try {
					labelSuma.setText(""+obj.sumar(a, b));
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnSumar.setBounds(78, 98, 89, 23);
		contentPane.add(btnSumar);
		
		num3 = new JTextField();
		num3.setBounds(266, 48, 86, 20);
		contentPane.add(num3);
		num3.setColumns(10);
		
		JLabel labelFactorial = new JLabel("");
		labelFactorial.setBounds(266, 153, 86, 14);
		contentPane.add(labelFactorial);
		
		JButton btnFactorial = new JButton("Factorial");
		btnFactorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int c = Integer.parseInt(num3.getText());
				
				try {
					labelFactorial.setText(""+obj.factorial(c));
				} catch (RemoteException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnFactorial.setBounds(266, 98, 89, 23);
		contentPane.add(btnFactorial);
		
	
	}

}
