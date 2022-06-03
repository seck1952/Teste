package domaine;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Operation {
	private int idOperation;
	private double montant;
	private LocalDate date;

	public Operation() {
		super();
	}

	public Operation(double montant, LocalDate date) {
		super();
		this.montant = montant;
		this.date = date;
	}

	public Operation(int idOperation, double montant, LocalDate date) {
		super();
		this.idOperation = idOperation;
		this.montant = montant;
		this.date = date;
	}

	public int getIdOperation() {
		return idOperation;
	}

	public void setIdOperation(int idOperation) {
		this.idOperation = idOperation;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

}
