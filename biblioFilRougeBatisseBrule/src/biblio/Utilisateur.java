package biblio;

import java.text.ParseException;
import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Date;
import java.util.GregorianCalendar;

import enumeration.EnumStatusExemplaire;

//Source file: K:\\fil rouge bibliotheque\\Vue logique\\code java genere a partir de la recette partie 3\\Utilisateur.java

/**
 * Il y a deux types d'utilisateur pouvant emprunter des livres. Les adh�rants
 * et les employ�s. Les adh�rents sont soumis � des contraintes que n'ont pas
 * les employ�s.
 */
public class Utilisateur extends Personne {
	private Integer idUtilisateur;
	private String pwd;
	private String pseudonyme;
	protected ArrayList<EmpruntEnCours> empruntEnCours = new ArrayList<>();
	private int NbEmpruntsEnCours = 0;

	/**
	 * @throws ParseException
	 * @roseuid 58B5752B00DF
	 */
	public Utilisateur(String nom,String prenom,GregorianCalendar dateNaissance,String sexe, int idUtilisateur, String pwd, String pseudonyme){
		super(nom, prenom, dateNaissance, sexe);
		this.idUtilisateur=idUtilisateur;
		this.pwd=pwd;
		this.pseudonyme=pseudonyme;
	}

	/**
	 * @param ep
	 * @roseuid 58B570370284
	 */
	public void addEmpruntEnCours(EmpruntEnCours ep) {
		empruntEnCours.add(ep);
		ep.setEnumStatusExemplaire(EnumStatusExemplaire.PRETE);
		setNbEmpruntsEnCours(getNbEmpruntsEnCours() + 1);
	}

	/**
	 * @return Integer
	 * @roseuid 58B570A20254
	 */
	public int getNbEmpruntsEnCours() {
		return NbEmpruntsEnCours;
	}

	public void setNbEmpruntsEnCours(int nbEmpruntsEnCours) {
		NbEmpruntsEnCours = nbEmpruntsEnCours;
	}

	/**
	 * @return the idUtilisateur
	 */
	public Integer getIdUtilisateur() {
		return idUtilisateur;
	}

	/**
	 * @param idUtilisateur the idUtilisateur to set
	 */
	public void setIdUtilisateur(Integer idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	/**
	 * @return the pwd
	 */
	public String getPwd() {
		return pwd;
	}

	/**
	 * @param pwd the pwd to set
	 */
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	/**
	 * @return the pseudonyme
	 */
	public String getPseudonyme() {
		return pseudonyme;
	}

	/**
	 * @param pseudonyme the pseudonyme to set
	 */
	public void setPseudonyme(String pseudonyme) {
		this.pseudonyme = pseudonyme;
	}

	/**
	 * @param empruntEnCours the empruntEnCours to set
	 */
	public void setEmpruntEnCours(ArrayList<EmpruntEnCours> empruntEnCours) {
		this.empruntEnCours = empruntEnCours;
	}

	/**
	 * @return EmpruntEnCours
	 * @roseuid 58B5706B012C
	 */
	public ArrayList<EmpruntEnCours> getEmpruntEnCours() {
		return empruntEnCours;
	}

	@Override
	public String toString() {
		
		return super.toString()+"Utilisateur [idUtilisateur=" + idUtilisateur + ", pwd=" + pwd + ", pseudonyme=" + pseudonyme
				+ ", empruntEnCours=" + empruntEnCours + "]\n";
	}

	public static void main(String[] args) throws ParseException {

//		Utilisateur utilisateur = new Utilisateur();
//		System.out.println(utilisateur);

	}

}
