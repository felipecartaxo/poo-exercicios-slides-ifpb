package partida;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Interface {

	private JFrame frame;
	private JLabel labelTime1;
	private JLabel labelTime2;
	private JButton buttonGol1;
	private JButton buttonGol2;
	private JLabel labelPlacar1;
	private JLabel labelPlacar2;
	private JLabel labelNome1;
	private JLabel labelNome2;
	private JButton buttonReiniciar;
	
	private Main time1;
	private Main time2;
	
	// Atualiza o placar dos times
	private void atualizarPlacar(Main time, int quantGols) {
		if(time == time1) {
			labelPlacar1.setText(Integer.toString(time.getQuantGols()));
		}
		else {
			labelPlacar2.setText(Integer.toString(time.getQuantGols()));
		}
	}
	
	private JLabel log;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface window = new Interface();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interface() {
		initialize();
		
		time1 = new Main();
		time2 = new Main();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Cartaxo\\Documents\\neraky\\cursos\\systems-for-internet-ifpb\\periodo-3\\programacao-orientada-a-objetos\\poo-material-de-apoio-ifpb\\slides-7-codes\\src\\images\\icon-campo-futebol.png"));
		frame.setTitle("Partida");
		frame.setBounds(100, 100, 340, 270);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		labelTime1 = new JLabel("");
		labelTime1.setBounds(37, 38, 46, 43);
		frame.getContentPane().add(labelTime1);

		// Setando o ícone do Brasil
		ImageIcon icon = new ImageIcon(Interface.class.getResource("/images/icon-brasil.png"));
		
		icon.setImage(icon.getImage().getScaledInstance(
				labelTime1.getWidth(),
				labelTime1.getHeight(),
				Image.SCALE_DEFAULT
		));
		labelTime1.setIcon(icon);
		
		labelTime2 = new JLabel("");
		labelTime2.setBounds(37, 92, 46, 43);
		frame.getContentPane().add(labelTime2);
		
		// Setando o ícone da Argentina
		ImageIcon icon2 = new ImageIcon(Interface.class.getResource("/images/icon-argentina.png"));
		
		icon2.setImage(icon2.getImage().getScaledInstance(
				labelTime2.getWidth(),
				labelTime2.getHeight(),
				Image.SCALE_DEFAULT
		));
		labelTime2.setIcon(icon2);
		
		// Marcar gol para o time1
		buttonGol1 = new JButton("Goool!");
		buttonGol1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					time1.marcarGol();
		            atualizarPlacar(time1, time1.getQuantGols());
					
					if(time1.fimDePartida()) {
						
						// Desabilita os botões se o time1 alcançar 5 gols
						buttonGol1.setEnabled(false);
						buttonGol2.setEnabled(false);
						log.setText("Vitória do Brasil!");
					}
				}
				catch (Exception ex) {
					log.setText(ex.getMessage());
				}
			}
		});
		
		// Marcar gol para o time2
		buttonGol1.setBounds(169, 48, 89, 23);
		frame.getContentPane().add(buttonGol1);
		
		buttonGol2 = new JButton("Goool!");
		buttonGol2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					time2.marcarGol();
		            atualizarPlacar(time2, time2.getQuantGols());

					if(time2.fimDePartida()) {
						
						// Desabilita os botões de marcar gols
						buttonGol1.setEnabled(false);
						buttonGol2.setEnabled(false);
						log.setText("Vitória da Argentina!");
					}
				}
				catch (Exception ex) {
					log.setText(ex.getMessage());
				}
			}
		});
		
		// Reinicia a partida
		buttonReiniciar = new JButton("Reiniciar");
		buttonReiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 time1.reiniciarPartida();
				 time2.reiniciarPartida();
				 labelPlacar1.setText("0");
				 labelPlacar2.setText("0");
				 buttonGol1.setEnabled(true);
				 buttonGol2.setEnabled(true);
				 
				 // Limpando o log
				 log.setText("");
			}
		});
		
		buttonReiniciar.setBounds(115, 166, 89, 23);
		frame.getContentPane().add(buttonReiniciar);
		
		log = new JLabel("");
		log.setBounds(10, 206, 304, 14);
		frame.getContentPane().add(log);
		
		buttonGol2.setBounds(169, 105, 89, 23);
		frame.getContentPane().add(buttonGol2);
		
		labelPlacar1 = new JLabel("0");
		labelPlacar1.setBounds(290, 52, 46, 14);
		frame.getContentPane().add(labelPlacar1);
		
		labelPlacar2 = new JLabel("0");
		labelPlacar2.setBounds(290, 109, 46, 14);
		frame.getContentPane().add(labelPlacar2);
		
		labelNome1 = new JLabel("Brasil");
		labelNome1.setBounds(93, 52, 46, 14);
		frame.getContentPane().add(labelNome1);
		
		labelNome2 = new JLabel("Argentina");
		labelNome2.setBounds(93, 109, 66, 14);
		frame.getContentPane().add(labelNome2);
	}
}
