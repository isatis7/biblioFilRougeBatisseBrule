package biblio;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author Philippe BATISSE
 *
 */
public class Personne {
	/**
	 * Liste des attributs
	 */
	private String nom;
	private String prenom;
	private GregorianCalendar dateNaissance;
	private String sexe;
	
	DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

	/**
	 * Constructeur complet ; nom, prenom, date de naissance, sexe.
	 */
	public Personne(String nom, String prenom, GregorianCalendar uneDateNaissance, String sexe){
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = uneDateNaissance;
		this.sexe = sexe;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom
	 *            the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return the dateNaissance
	 */
	public GregorianCalendar getDateNaissance() {
		return dateNaissance;
	}

	/**
	 * @param dateNaissance
	 *            the dateNaissance to set
	 */
	public void setDateNaissance(GregorianCalendar dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	/**
	 * @return the sexe
	 */
	public String getSexe() {
		return sexe;
	}

	/**
	 * @param sexe
	 *            the sexe to set
	 */
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", dateNaissance=" +df.format(dateNaissance.getTimeInMillis()) +", sexe=" + sexe
				+ "]\n";
	}
	

}
