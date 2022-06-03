package presentation;

import domaine.CompteCourant;
import domaine.CompteEparge;
import service.Journalisation;
import service.ThreadDepot;
import service.ThreadRetrait;

public class Test {
	public static void main(String[] args) {
		//test des methodes du compte courant
		CompteCourant compte1=new CompteCourant("cp001", 0, 15000);
		//versement sur un compte
		compte1.verser(25000);
		compte1.verser(35000);
		//retrait avec un bon solde
		compte1.retirer(15000);
		//retrait avec un bon solde
		compte1.retirer(150000);
		//test de la methode de consultation d'un compte
		System.out.println(compte1.consultersolde());
		//test de la journalisation
		String log = Journalisation.getInstance().afficheHistorique();
		System.out.println(log);
		
		System.out.println("--------------------------------------------------------------------");
		
		        //test des methodes du  compte epargne
				CompteEparge compte2=new CompteEparge("cp002", 0, 0);
				//versement sur un compte
				compte2.verser(25000);
				compte2.verser(35000);
				//retrait avec un bon solde
				compte2.retirer(15000);
				//retrait avec un bon solde
				compte2.retirer(150000);

				String log2 = Journalisation.getInstance().afficheHistorique();
				System.out.println(log2);
				
				System.out.println("*******************************************************************");
				
				CompteCourant compte3=new CompteCourant("cp001", 0, 15000);
				//test tread de depot
				ThreadDepot thread=new ThreadDepot(1500, compte3);
				thread.start();
				//test tread de retrait
				ThreadRetrait threadRetrait=new ThreadRetrait(500, compte3);
				threadRetrait.start();
				compte3.consultersolde();
				
	}
}
