package biblio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
	private Date dateNaissance;
	private String sexe;

	/**
	 * Constructeur complet ; nom, prenom, date de naissance, sexe.
	 */
	public Personne(String nom, String prenom, String uneDateNaissance, String sexe) throws ParseException {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = new SimpleDateFormat ("dd/MM/yyyy").parse(uneDateNaissance);
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
	public Date getDateNaissance() {
		return dateNaissance;
	}

	/**
	 * @param dateNaissance
	 *            the dateNaissance to set
	 */
	public void setDateNaissance(Date dateNaissance) {
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
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", dateNaissance=" + dateNaissance + ", sexe=" + sexe
				+ "]";
	}
	

}
