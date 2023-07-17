package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

import controller.CtrlTableauDesVentes;

public class VueTableauDesVentes extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField[][] quantiteFields;
	private JButton validerButton;
	public String[] vendeurs = { "Alexis", "Paul", "Emmanuelle", "Gregory", "Théo" };
	public String[] listeSmartphones = { "Samsung Galaxy S22", "iPhone 14", "Xiaomi 12 Pro", "Honor Magic 4 Pro" };

	public VueTableauDesVentes() {
		CtrlTableauDesVentes ctrlTableauDesVentes = new CtrlTableauDesVentes();
		this.setLayout(new GridLayout(7, 4));
		this.setBorder(getCoolBorder("Tableau des ventes"));
		// En-têtes des colonnes pour les smartphones
		add(new JLabel());
		add(new JLabel("Samsung Galaxy S22"));
		add(new JLabel("iPhone 14"));
		add(new JLabel("Xiaomi 12 Pro"));
		add(new JLabel("Honor Magic 4 Pro"));

		// Champs de texte pour les quantités des vendeurs
		quantiteFields = new JTextField[5][4];

		for (int i = 0; i < 5; i++) {
			add(new JLabel(vendeurs[i]));

			for (int j = 0; j < 4; j++) {
				quantiteFields[i][j] = new JTextField(5);
				add(quantiteFields[i][j]);
			}
		}

		// Bouton Valider
		validerButton = new JButton("Afficher les résultats");
		validerButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int[][] quantites = new int[5][4];

				for (int i = 0; i < 5; i++) {
					for (int j = 0; j < 4; j++) {
						String quantiteText = quantiteFields[i][j].getText();

						try {
							quantites[i][j] = Integer.parseInt(quantiteText);
						} catch (NumberFormatException ex) {
							System.out.println("La quantité saisie par le vendeur " + vendeurs[i]
									+ " pour le smartphone " + (j + 1) + " n'est pas un nombre valide");
						}
					}
				}
				ctrlTableauDesVentes.afficherQuantiteTelephone(quantites);
			}
		});
		add(validerButton);
	}

	public Border getCoolBorder(String titre) {
		Border lowBorder = BorderFactory.createBevelBorder(35);
		Border titleBorder = BorderFactory.createTitledBorder(lowBorder, titre, TitledBorder.LEFT, TitledBorder.TOP,
				new Font("Arial", Font.BOLD, 14), Color.black);
		return titleBorder;
	}
}
