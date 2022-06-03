package domaine;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Versement extends Operation{

	public Versement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Versement(double montant, LocalDate date) {
		super(montant, date);
		// TODO Auto-generated constructor stub
	}

	public Versement(int idOperation, double montant, LocalDate date) {
		super(idOperation, montant, date);
		// TODO Auto-generated constructor stub
	}
	

}
