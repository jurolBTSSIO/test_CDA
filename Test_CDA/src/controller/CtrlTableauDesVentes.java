package controller;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

import view.AppFrame;

public class CtrlTableauDesVentes {
	private String[] listeSmartphones = { "Samsung Galaxy S22", "iPhone 14", "Xiaomi 12 Pro", "Honor Magic 4 Pro" };
	private String[] vendeurs = { "Alexis", "Paul", "Emmanuelle", "Gregory", "Théo" };

	private int[] prixTelephone = { 820, 450, 300, 971 };

	public CtrlTableauDesVentes() {

	}

	public void afficherQuantiteTelephone(int quantite[][]) {
		JPanel panelResultat = new JPanel();
		JPanel panelQteTel = new JPanel();
		panelQteTel.setLayout(new GridLayout(4, 1));
		panelQteTel.setBorder(getCoolBorder("Nombre d’exemplaires vendus pour chacun des téléphones"));
		JPanel panelCA = new JPanel();
		panelCA.setLayout(new GridLayout(5, 1));
		panelCA.setBorder(getCoolBorder(" Chiffre d’affaires généré par chacun des vendeurs"));
		panelResultat.setLayout(new GridLayout(3, 1));
		panelResultat.setBorder(getCoolBorder("Résultats"));

		// Calcul de la quantité totale par téléphone
		int[] quantiteTotaleParTelephone = new int[4];

		for (int j = 0; j < 4; j++) {
			int quantiteTotale = 0;

			for (int i = 0; i < 5; i++) {
				quantiteTotale += quantite[i][j];
			}

			quantiteTotaleParTelephone[j] = quantiteTotale;
		}

		// Affichage des quantités totales par téléphone
		for (int j = 0; j < 4; j++) {
			JLabel label = new JLabel(
					"Nombre de ventes du " + listeSmartphones[j] + " : " + quantiteTotaleParTelephone[j]);
			panelQteTel.add(label);
		}

		// Calcul du chiffre d'affaires par vendeur
		int[] chiffreAffairesParVendeur = new int[5];

		for (int i = 0; i < 5; i++) {
			int chiffreAffaires = 0;

			for (int j = 0; j < 4; j++) {
				chiffreAffaires += quantite[i][j] * prixTelephone[j];
			}

			chiffreAffairesParVendeur[i] = chiffreAffaires;
		}
		// Affichage du CA par vendeurs

		for (int k = 0; k < 5; k++) {
			JLabel label = new JLabel("Vente de " + vendeurs[k] + " : " + chiffreAffairesParVendeur[k] + " euros");
			panelCA.add(label);
		}
		panelResultat.add(panelQteTel);
		panelResultat.add(panelCA);

		AppFrame.appFrame.controlHost.remove(1);
		AppFrame.appFrame.controlHost.add(panelResultat, BorderLayout.CENTER);
		AppFrame.appFrame.controlHost.repaint();
		AppFrame.appFrame.controlHost.revalidate();
	}

	public Border getCoolBorder(String titre) {
		Border lowBorder = BorderFactory.createBevelBorder(35);
		Border titleBorder = BorderFactory.createTitledBorder(lowBorder, titre, TitledBorder.LEFT, TitledBorder.TOP,
				new Font("Arial", Font.BOLD, 14), Color.black);
		return titleBorder;
	}
}
