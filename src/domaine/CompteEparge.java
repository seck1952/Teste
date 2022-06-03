package domaine;

import java.time.LocalDate;

import service.Journalisation;

public class CompteEparge extends Compte {
	private double taux;
	boolean isOk = false;

	public CompteEparge(String numeroCompte, double solde, double taux) {
		super(numeroCompte, solde);
		this.taux = taux;
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
			if (montant < solde) {
				Retrait retrait = new Retrait(montant, LocalDate.now());
				operations.add(retrait);
				solde = solde - montant;
				isOk = true;
				Journalisation.getInstance().ajouterLog(
						"Retrait de " + montant + " Fcfa  " + " le solde du compte actuelle est de " + solde);
			} else {
				Journalisation.getInstance().ajouterLog("le solde demande n'est pas autorise");
			}

		} else {
			Journalisation.getInstance().ajouterLog("le montant doit etre superieur a 0");
		}

	}

}
