package service;

import domaine.CompteCourant;

public class ThreadDepot extends Thread {
	private double montant;

	CompteCourant compte;

	public ThreadDepot(double montant, CompteCourant compte) {
		super();
		this.montant = montant;
		this.compte = compte;
	}

	@Override
	public void run() {
		synchronized (compte) {
			try {
				System.out.println(" solde du compte avant le depot " + compte.consultersolde());
				compte.verser(montant);
				Thread.sleep(2000);
				System.out.println(" solde du compte apres le depot " + compte.consultersolde());
			} catch (Exception e) {
				System.out.println("depot non effectuer! probleme");
				e.printStackTrace();
			}

		}

	}

}
