package ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class OtrosDaños extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			OtrosDaños dialog = new OtrosDaños();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public OtrosDaños() {
		setBounds(100, 100, 875, 637);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 11, 363, 354);
			scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
			scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
			contentPanel.add(scrollPane);
			{
				JPanel panel = new JPanel();
				setBounds(100, 100, 875, 637);
				scrollPane.setViewportView(panel);
				panel.setLayout(null);
				{
					JLabel lblNewLabel_3 = new JLabel("New label");
					lblNewLabel_3.setBounds(201, 5, 46, 14);
					panel.add(lblNewLabel_3);
				}
				{
					JLabel lblNewLabel_2 = new JLabel("New label");
					lblNewLabel_2.setBounds(87, 227, 46, 14);
					panel.add(lblNewLabel_2);
				}
				{
					JLabel lblNewLabel_1 = new JLabel("New label");
					lblNewLabel_1.setBounds(201, 151, 46, 14);
					panel.add(lblNewLabel_1);
				}
				{
					JLabel lblNewLabel = new JLabel("New label");
					lblNewLabel.setBounds(229, 459, 46, 14);
					panel.add(lblNewLabel);
				}
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
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
