package biblio;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import enumeration.EnumStatusExemplaire;

/**
 * @author Philippe BATISSE
 *
 */
public class EmpruntEnCours {
	/**
	 * Liste des attributs
	 */
	private Date dateEmprunt = new Date();
	private Date retour = new Date();
	private Utilisateur emprunteur;
	private EnumStatusExemplaire statut;
	private Exemplaire livre;
	
	DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

	public EmpruntEnCours(String laDateEmprunt, Exemplaire livre, Utilisateur emprunteur) throws ParseException {
		super();
		this.dateEmprunt = new SimpleDateFormat("dd/MM/yyyy").parse(laDateEmprunt);
		this.livre = livre;
		this.setEmprunteur(emprunteur);
	}

	/**
	 * @return the retour
	 */
	public Date getRetour() {
		return retour;
	}

	/**
	 * @param retour
	 *            the retour to set
	 */
	public void setRetour() {
		this.retour = retour;
	}

	public void setDateEmprunt(Date d) {
		this.dateEmprunt = d;
	}

	/**
	 * @param retour the retour to set
	 */

	public Date getDateEmprunt() {
		return dateEmprunt;
	}

	public Utilisateur getEmprunteur() {
		return emprunteur;
	}

	public void setEmprunteur(Utilisateur emprunteur) {
		this.emprunteur = emprunteur;
		emprunteur.addEmpruntEnCours(this);
	}

	public void setEnumStatusExemplaire(EnumStatusExemplaire statut) {
		this.statut = statut;
	}

	

	public boolean isPretEnRetard(Date retour, Date dateEmprunt) {
		retour = new Date();
		long dif = (retour.getTime() - dateEmprunt.getTime());
		if (dif < 1296000000)
			return true;
		else
			return false;

	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EmpruntEnCours [dateEmprunt=" +df.format(dateEmprunt) + ", retour=" + df.format(retour)  + ", emprunteur=" + getEmprunteur().getIdUtilisateur()
				+ ", statut=" + statut + ", livre=" + livre + "]";
	}

}
