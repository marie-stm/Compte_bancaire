package TP2;

public class CompteBancaire {

private int noDeCompte;
private int id;
private String nomDuTitulaire;
private double solde;
private double debitMax; 
private double decouvertMax;
  
//Constructeurs
public CompteBancaire(String nomDuTitulaire, double solde, double debitMax, double decouvertMax) {
	numero++;
	this.id=numero;
	this.nomDuTitulaire = nomDuTitulaire;
	this.solde = solde;
	this.debitMax = debitMax;
	this.decouvertMax = decouvertMax;
}

public CompteBancaire(String nomDuTitulaire, double solde) {
	numero++;
	this.id=numero;
	this.nomDuTitulaire = nomDuTitulaire;
	this.solde = solde;
	this.debitMax = 1000;
	this.decouvertMax = 800;
}
	
public CompteBancaire(String nomDuTitulaire) {
	numero++;
	this.id=numero;
	this.nomDuTitulaire = nomDuTitulaire;
	this.solde = 0;
	this.debitMax = 1000;
	this.decouvertMax = 800;
}

@Override
public String toString() {
	return "CompteBancaire [noDeCompte=" + id + ", nomDuTitulaire=" + nomDuTitulaire + ", solde=" + solde
			+ ", debitMax=" + debitMax + ", decouvertMax=" + decouvertMax + "]";
}

}