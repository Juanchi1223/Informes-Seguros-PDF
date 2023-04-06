package ui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTextArea;

public class inforSiniestro extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			inforSiniestro dialog = new inforSiniestro();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public inforSiniestro() {
		setBounds(100, 100, 721, 519);
		getContentPane().setLayout(null);
		contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));
		contentPanel.setPreferredSize(new Dimension(400, 300));
		contentPanel.setBounds(0, 0, 705, 447);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		for (int i = 1; i <= 50; i++) {
			contentPanel.add(new JLabel("Etiqueta " + i));
		}
		JScrollPane scrollPane = new JScrollPane(contentPanel);
		scrollPane.setViewportView(contentPanel);


		
		getContentPane().add(contentPanel);
		
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 447, 705, 33);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
