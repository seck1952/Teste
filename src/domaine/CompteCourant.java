package domaine;

import java.time.LocalDate;

import service.Journalisation;

public class CompteCourant extends Compte {
	private double decouvert;
	boolean isOk = false;

	public CompteCourant(String numeroCompte, double solde, double decouvert) {
		super(numeroCompte, solde);
		this.decouvert = decouvert;
	}

	public CompteCourant(String numeroCompte, double solde) {
		super(numeroCompte, solde);
	}

	@Override
	public void verser(double montant) {
		if (montant > 0) {
			Versement verser = new Versement(montant, LocalDate.now());
			operations.add(verser);
			solde += montant;
			isOk = true;
			Journalisation.getInstance().ajouterLog(
					"Versemement de " + montant + " Fcfa  " + " le solde du compte actuelle est de " + solde);
		} else {
			Journalisation.getInstance().ajouterLog("le montant doit etre superieur a 0");
		}

	}

	@Override
	public void retirer(double montant) {
		if (montant > 0) {
			if (montant < solde + decouvert) {
				Retrait retrait = new Retrait(montant, LocalDate.now());
				operations.add(retrait);
				solde = solde - montant;
				isOk = true;
				Journalisation.getInstance().ajouterLog(
						"Retrait de " + montant + " Fcfa  " + " le solde du compte actuelle est de " + solde);
			} else {
				Journalisation.getInstance().ajouterLog("le solde demande nest autorisé ");
			}

		} else {
			Journalisation.getInstance().ajouterLog("le montant doit etre superieur a 0");
		}

	}

}
