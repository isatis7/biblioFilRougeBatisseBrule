package classTest;

import java.text.ParseException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import biblio.EmpruntEnCours;
import biblio.Exemplaire;
import biblio.Utilisateur;
import dao.ExemplaireDao;
import dao.UtilisateurDao;
import enumeration.EnumStatusExemplaire;

/**
 * @author Philippe BATISSE
 *
 */
public class TestClass {

	public static void main(String[] args) throws ParseException{
		
		
		
		
		
		
		System.out.println("TestDeBase\n---------------------------");
		ExemplaireDao scenario1 = new ExemplaireDao();
//		System.out.println(scenario1.findByKey(17));
		Exemplaire un = new Exemplaire(); 
		un = scenario1.findByKey(1);
		System.out.println(un);
		Exemplaire deux = new Exemplaire();
		deux = scenario1.findByKey(2);
		System.out.println(deux);
		

		
		
		UtilisateurDao lambda = new UtilisateurDao();
		Utilisateur ad1 = lambda.findByKey(1);
		System.out.println(ad1);
		Utilisateur ad2=lambda.findByKey(3);
		System.out.println(ad2);
		EmpruntEnCours le = new EmpruntEnCours("02/03/2017",un,ad1);
		//EmpruntEnCours li = new EmpruntEnCours ("01/01/2017",deux,ad1);
		//System.out.println(new SimpleDateFormat("dd/MM/yyyy").format(le.getDateEmprunt()));
		//System.out.println("Adhérent : "+le+"Employé : "+li);
//		ad1.addEmpruntEnCours(le);
//		ad1.addEmpruntEnCours(li);
//		un.setEmpruntEnCours(le);
		EmpruntEnCours la=new EmpruntEnCours("01/03/2017",deux,ad2);
		//ad2.addEmpruntEnCours(la);
//		deux.setEmpruntEnCours(la);
		System.out.println(ad1.getNbEmpruntsEnCours());
		System.out.println(ad1.getEmpruntEnCours());
		System.out.println(ad2.getNbEmpruntsEnCours());
		System.out.println(ad2.toString());
		
	
	}

}
