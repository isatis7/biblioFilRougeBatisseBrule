package biblio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Philippe BATISSE
 *
 */
public class EmpruntEnCours {
	/**
	 * Liste des attributs
	 */
	private Date dateEmprunt;
	private Date retour;
	private Utilisateur emprunteur;

	public EmpruntEnCours(String laDateEmprunt, String leRetour, Utilisateur emprunteur) throws ParseException {
		super();
		this.dateEmprunt = new SimpleDateFormat ("dd/MM/yyyy").parse(laDateEmprunt);
		this.retour = new SimpleDateFormat ("dd/MM/yyyy").parse(leRetour);
		this.emprunteur = emprunteur;
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
		retour.getTime();
	}

	public void setDateEmprunt(Date d) {
		this.dateEmprunt = d;
	}

	public Date getDateEmprunt() {
		return dateEmprunt;
	}

	long dif = (retour.getTime() - dateEmprunt.getTime());

	public boolean isPretEnRetard(Date retour) {
		if (dif < 1296000000)
			return true;
		else
			return false;

	}
}
