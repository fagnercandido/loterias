package view;

import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import controle.Loterias;

/**
 * @author eduardo.andrade
 * @since 01/09/2014
 */
public class LoteriaView extends JFrame{

	private static final long serialVersionUID = -6673004886460089120L;

	private JPanel jContentPane = null;
	private JLabel lbNumerosSorteados = null;
	private JTextField txtNumerosSorteadosMegaSena = null;
	private JTextField txtNumerosSorteadosLotofacil = null;
	private JTextField txtNumerosSorteadosQuina = null;
	private JTextArea txtaMensagem = null;
	private JButton btnSortear = null;
	private JButton btnFechar = null;

	private JCheckBox ckMegaSena = null;
	private JCheckBox ckLotofacil = null;
	private JCheckBox ckQuina = null;

	public LoteriaView() throws HeadlessException {
		super();
		initialize();
	}

	public void initialize() {
		this.setSize(500, 235);
		this.setContentPane(getJContentPane());
		this.setTitle("SGNLoterias V.3");
		adicionarComponentesNoLayout();
		ckMegaSena.setSelected(true);
		acaoCheckbox();
		acaoComponentes();
		definirNomeComponente();
		definirTamanhoComponentes();
		habilitarComponentes();
	}

	private void limparCampos(){
		txtaMensagem.setText("");
		txtNumerosSorteadosLotofacil.setText("");
		txtNumerosSorteadosMegaSena.setText("");
		txtNumerosSorteadosQuina.setText("");
	}

	/**
	 * Metodo responsavel pelas as acoes dos componentes.
	 */
	private void acaoComponentes(){
		ckMegaSena.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {}
			@Override
			public void mousePressed(MouseEvent e) {}
			@Override
			public void mouseExited(MouseEvent e) {}
			@Override
			public void mouseEntered(MouseEvent e) {}
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount() >= 1){
					ckLotofacil.setSelected(false);
					ckQuina.setSelected(false);
					acaoCheckbox();
					limparCampos();

				}
			}
		});
		ckLotofacil.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {}
			@Override
			public void mousePressed(MouseEvent e) {}
			@Override
			public void mouseExited(MouseEvent e) {}
			@Override
			public void mouseEntered(MouseEvent e) {}
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount() >= 1){
					ckMegaSena.setSelected(false);
					ckQuina.setSelected(false);
					acaoCheckbox();
					limparCampos();
				}
			}
		});
		ckQuina.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {}
			@Override
			public void mousePressed(MouseEvent e) {}
			@Override
			public void mouseExited(MouseEvent e) {}
			@Override
			public void mouseEntered(MouseEvent e) {}
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount() >= 1){
					ckMegaSena.setSelected(false);
					ckLotofacil.setSelected(false);
					acaoCheckbox();
					limparCampos();
				}
			}
		});
		btnFechar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnSortear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Loterias loterias = new Loterias();

				if(ckMegaSena.isSelected()){
					loterias.sortearNumerosMegaSena();
					txtNumerosSorteadosMegaSena.setText(loterias.getNumerosSorteados());

				}else if(ckLotofacil.isSelected()){
					loterias.sortearNumerosLotofacil();
					txtNumerosSorteadosLotofacil.setText(loterias.getNumerosSorteados());

				}else if(ckQuina.isSelected()){
					loterias.sortearNumerosQuina();
					txtNumerosSorteadosQuina.setText(loterias.getNumerosSorteados());
				}
				txtaMensagem.setText(loterias.getMensagemBancaria());
			}
		});
	}

	/**
	 * Metodo responsavel por definir as
	 * acoes dos checkboxs.
	 */
	private void acaoCheckbox(){
		if(ckMegaSena.isSelected()){
			ckLotofacil.setSelected(false);
			ckQuina.setSelected(false);
			txtNumerosSorteadosLotofacil.setVisible(false);
			txtNumerosSorteadosQuina.setVisible(false);
			txtNumerosSorteadosMegaSena.setVisible(true);
		}

		if(ckLotofacil.isSelected()){
			ckMegaSena.setSelected(false);
			ckQuina.setSelected(false);
			txtNumerosSorteadosMegaSena.setVisible(false);
			txtNumerosSorteadosQuina.setVisible(false);
			txtNumerosSorteadosLotofacil.setVisible(true);
		}

		if(ckQuina.isSelected()){
			ckLotofacil.setSelected(false);
			ckMegaSena.setSelected(false);
			txtNumerosSorteadosMegaSena.setVisible(false);
			txtNumerosSorteadosLotofacil.setVisible(false);
			txtNumerosSorteadosQuina.setVisible(true);
		}
	}

	private void definirNomeComponente(){
		lbNumerosSorteados.setText("Números Sorteados:");
		ckMegaSena.setText("Mega Sena");
		ckLotofacil.setText("Lotofácil");
		ckQuina.setText("Quina");
		btnSortear.setText("Sortear");
		btnFechar.setText("Fechar");
	}

	private void definirTamanhoComponentes(){
		lbNumerosSorteados.setBounds(new Rectangle(20, 45, 150, 25));
		txtaMensagem.setBounds(new Rectangle(30, 80, 440, 70));
		txtNumerosSorteadosMegaSena.setBounds(new Rectangle(150, 45, 170, 25));
		txtNumerosSorteadosLotofacil.setBounds(new Rectangle(150, 45, 320, 25));
		txtNumerosSorteadosQuina.setBounds(new Rectangle(150, 45, 150, 25));
		ckMegaSena.setBounds(new Rectangle(20, 10, 110, 25));
		ckLotofacil.setBounds(new Rectangle(150, 10, 110, 25));
		ckQuina.setBounds(new Rectangle(260, 10, 110, 25));
		btnSortear.setBounds(new Rectangle(130, 160, 82, 25));
		btnFechar.setBounds(new Rectangle(260, 160, 82, 25));
	}

	private void habilitarComponentes(){
		txtNumerosSorteadosMegaSena.setEditable(false);
		txtNumerosSorteadosLotofacil.setEditable(false);
		txtNumerosSorteadosQuina.setEditable(false);
		txtaMensagem.setEditable(false);
	}

	private void adicionarComponentesNoLayout(){
		jContentPane.add(lbNumerosSorteados, null);
		jContentPane.add(getTxtNumerosSorteadosMegaSena(), null);
		jContentPane.add(getTxtNumerosSorteadosLotofacil(), null);
		jContentPane.add(getTxtNumerosSorteadosQuina(), null);
		jContentPane.add(getTxtaMensagem(), null);
		jContentPane.add(getCkMegaSena(), null);
		jContentPane.add(getCkLotofacil(), null);
		jContentPane.add(getCkQuina(), null);
		jContentPane.add(getBtnSortear(), null);
		jContentPane.add(getBtnFechar(), null);
	}

	private JPanel getJContentPane() {
		if (jContentPane == null) {
			lbNumerosSorteados = new JLabel();
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
		}
		return jContentPane;
	}

	public JTextArea getTxtaMensagem() {
		if(txtaMensagem == null){
			txtaMensagem = new JTextArea();
		}
		return txtaMensagem;
	}

	private JTextField getTxtNumerosSorteadosMegaSena() {
		if (txtNumerosSorteadosMegaSena == null) {
			txtNumerosSorteadosMegaSena = new JTextField();
		}
		return txtNumerosSorteadosMegaSena;
	}

	private JTextField getTxtNumerosSorteadosLotofacil() {
		if (txtNumerosSorteadosLotofacil == null) {
			txtNumerosSorteadosLotofacil = new JTextField();
		}
		return txtNumerosSorteadosLotofacil;
	}

	private JTextField getTxtNumerosSorteadosQuina() {
		if (txtNumerosSorteadosQuina == null) {
			txtNumerosSorteadosQuina = new JTextField();
		}
		return txtNumerosSorteadosQuina;
	}

	private JCheckBox getCkMegaSena(){
		if(ckMegaSena == null){
			ckMegaSena = new JCheckBox();
		}
		return ckMegaSena;
	}

	private JCheckBox getCkLotofacil(){
		if(ckLotofacil == null){
			ckLotofacil = new JCheckBox();
		}
		return ckLotofacil;
	}

	private JCheckBox getCkQuina(){
		if(ckQuina == null){
			ckQuina = new JCheckBox();
		}
		return ckQuina;
	}

	private JButton getBtnSortear() {
		if (btnSortear == null) {
			btnSortear = new JButton();
		}
		return btnSortear;
	}

	private JButton getBtnFechar() {
		if (btnFechar == null) {
			btnFechar = new JButton();
		}
		return btnFechar;
	}
}
