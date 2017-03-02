package biblio;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
//import java.util.GregorianCalendar;

/**
 * @author Philippe BATISSE
 * @version 0.0
 */
public class Exemplaire {
	/**
	 * Liste des attributs
	 */
	private int idExemplaire;
	private Date dateAchat;
	private EnumStatusExemplaire status = EnumStatusExemplaire.DISPONIBLE;
	private String isbn;
	@SuppressWarnings("unused")
	private static class empruntEnCourt{
		private Date setDateEmprunt;
	}
	DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

	public Exemplaire(int idExemplaire, String laDateAchat, EnumStatusExemplaire status, String isbn) throws ParseException {
		super();
		this.idExemplaire = idExemplaire;
		this.dateAchat = new SimpleDateFormat ("dd/MM/yyyy").parse(laDateAchat);
		this.status = status;
		this.isbn = isbn;
	}

	public Exemplaire(int idExemplaire, String isbn) {
		super();
		this.idExemplaire = idExemplaire;
		this.isbn = isbn;
	}

	public Exemplaire() {
		super();
	}

	/**
	 * @return the idExemplaire
	 */
	public int getIdExemplaire() {
		return idExemplaire;
	}

	/**
	 * @param idExemplaire
	 *            the idExemplaire to set
	 */
	public void setIdExemplaire(int idExemplaire) {
		this.idExemplaire = idExemplaire;
	}

	/**
	 * @return the dateAchat
	 */
	public Date getDateAchat() {
//		Date dateAchat = GregorianCalendar.getInstance().getTime();
//		String laDateAchat = df.format(laDateAchat);
		return dateAchat;
	}

	/**
	 * @param dateAchat
	 *            the dateAchat to set
	 * @throws ParseException 
	 */
	public void setDateAchat(String laDateAchat) throws ParseException {
		this.dateAchat = new SimpleDateFormat ("dd/MM/yyyy").parse(laDateAchat);
	}

	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}

	/**
	 * @param isbn
	 *            the isbn to set
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public EnumStatusExemplaire getStatus() {
		return status;
	}

	public void setStatus(EnumStatusExemplaire status) {
		this.status = status;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Exemplaire [idExemplaire=" + idExemplaire + ", dateAchat=" + dateAchat + ", status=" + status
				+ ", isbn=" + isbn + "]";
	}
	
}
