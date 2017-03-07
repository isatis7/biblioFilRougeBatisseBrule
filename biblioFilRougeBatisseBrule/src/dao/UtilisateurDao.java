package dao;

import java.util.Calendar;
import java.util.GregorianCalendar;

import biblio.Adherent;
import biblio.Employe;
import biblio.Utilisateur;
import enumeration.EnumCategorieEmploye;

public class UtilisateurDao {
	/**
	 * emulation de la base de donnée
	 */
	private Utilisateur[] UtilisateurDB = {
			new Adherent("Henry","Patrick",new GregorianCalendar(1956, 7,14), "oui", 1 ,"password", "Petit lapin","0745398906"),
			new Adherent("Louis", "Emile", new GregorianCalendar(1999, Calendar.SEPTEMBER,9),"oui" ,2,"password", "exterminator","0626321354"),
			new Employe("Georges","Guy", new GregorianCalendar(2011, Calendar.SEPTEMBER,11),"oui" ,3,"password", " The King","EmpDeLAnnee",EnumCategorieEmploye.BIBLIOTHECAIRE),
			new Employe("Fourniret","Michel", new GregorianCalendar(2016, Calendar.DECEMBER,12),"oui" ,4,"password", "Gangsta du 56","EmpDuMois",EnumCategorieEmploye.GESTIONNAIRE_DE_FONDS),
			new Adherent("Dupont de ligonesse","Xavier", new GregorianCalendar(1978, Calendar.DECEMBER,31),"oui" ,5,"password", "MichelTuning","0676859403"),
			new Employe ("Hubert","Caouissin",new GregorianCalendar(1968,Calendar.OCTOBER,3),"avec",6,"passeword","Killer","Agent",EnumCategorieEmploye.RESPONSABLE)};

	public Utilisateur findByKey(int idUtilisateur){
		for (Utilisateur utilisateur : UtilisateurDB){
			if ((utilisateur.getIdUtilisateur()==idUtilisateur))
				return utilisateur;
		}
		return null;
	}
}
