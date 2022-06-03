package domaine;

import java.util.ArrayList;
import java.util.List;

public abstract class Compte {
	protected int idCompte;
	protected String numeroCompte;
	protected double solde;
	List<Operation> operations = new ArrayList<>();

	public Compte(String numeroCompte, double solde) {
		super();
		this.numeroCompte = numeroCompte;
		this.solde = solde;
	}

	public abstract void verser(double montant);

	public abstract void retirer(double montant);

	public double consultersolde() {
		return solde;
	}

}
