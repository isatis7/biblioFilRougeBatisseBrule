package biblio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Philippe BATISSE
 *
 */
public class EmpruntArchive {
	/**
	 * Liste des attributs
	 */
	private Date dateRestitutionEff;
	private Date dateEmprunt;
	private Exemplaire exemplaire;
	private Utilisateur emprunteur;
	String laDateRestitutionEff;
	String laDateEmprunt;
	
	public EmpruntArchive(Date dateRestitutionEff, Date dateEmprunt) throws ParseException {
		super();
		this.dateRestitutionEff = new SimpleDateFormat ("dd/MM/yyyy").parse(laDateRestitutionEff);
		this.dateEmprunt = new SimpleDateFormat ("dd/MM/yyyy").parse(laDateEmprunt);
	}

	/**
	 * @return the dateRestitutionEff
	 */
	public Date getDateRestitutionEff() {
		return dateRestitutionEff;
	}

	/**
	 * @param dateRestitutionEff
	 *            the dateRestitutionEff to set
	 */
	public void setDateRestitutionEff(Date dateRestitutionEff) {
		this.dateRestitutionEff = dateRestitutionEff;
	}

	/**
	 * @return the dateEmprunt
	 */
	public Date getDateEmprunt() {
		return dateEmprunt;
	}

	/**
	 * @param dateEmprunt
	 *            the dateEmprunt to set
	 */
	public void setDateEmprunt(Date dateEmprunt) {
		this.dateEmprunt = dateEmprunt;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EmpruntArchive [dateRestitutionEff=" + dateRestitutionEff + ", dateEmprunt=" + dateEmprunt + "]";
	}
	

}
