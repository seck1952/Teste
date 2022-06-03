package service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Cette classe est basée sur le pattern singleton et permet de centraliser tous
 * les logs du systeme
 * 
 * @author Elhadji
 * @since 02/06/2022
 */

public class Journalisation {
	private String journal;
	public static Journalisation unique = null;

	public Journalisation() {
		super();
		journal = new String();
	}

	/**
	 * Cette méthode permet de retourner l'unique instance de la classe
	 * journalisation
	 * 
	 * @return
	 */
	public static Journalisation getInstance() {
		if (unique == null) {
			unique = new Journalisation();
		}
		return unique;
	}

	/**
	 * Cette méthode permet d'ajouter un log dans le journal. Un log est caracterisé
	 * par la date du jour et le message.
	 * 
	 * @param message
	 */
	public void ajouterLog(String message) {
		LocalDate localDate = LocalDate.now();
		String date = localDate.format(DateTimeFormatter.ofPattern("dd/ MMM/ yyyy"));
		// System.out.println(date);
		this.journal += " " + date + " " + message + "\n";

	}

	public String afficheHistorique() {
		return this.journal;
	}

}
