package domaine;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Retrait extends Operation{

	public Retrait() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Retrait(double montant, LocalDate date) {
		super(montant, date);
		// TODO Auto-generated constructor stub
	}

	public Retrait(int idOperation, double montant, LocalDate date) {
		super(idOperation, montant, date);
		// TODO Auto-generated constructor stub
	}
	

}
