package classTest;

import java.text.ParseException;

import biblio.EmpruntEnCours;
import biblio.Exemplaire;
import biblio.Utilisateur;
import dao.ExemplaireDao;
import dao.UtilisateurDao;



public class TestRetard {
	
	public static void main(String[] args) throws ParseException{
	
	System.out.println("\n\n\nTestAdherentEnRetard\n---------------------------");
	ExemplaireDao scenario2 = new ExemplaireDao();
	Exemplaire trois = scenario2.findByKey(3);
	System.out.println(trois);
	Exemplaire quatre = scenario2.findByKey(4);
	System.out.println(quatre);
	UtilisateurDao lambda2 = new UtilisateurDao();
	Utilisateur ad3 = lambda2.findByKey(5);
	System.out.println(ad3);
	Utilisateur ad4=lambda2.findByKey(6);
	System.out.println(ad4);
	EmpruntEnCours le1 = new EmpruntEnCours("02/02/2017",trois,ad3);
	//System.out.println(new SimpleDateFormat("dd/MM/yyyy").format(le.getDateEmprunt()));
	ad3.addEmpruntEnCours(le1);
//	un.setEmpruntEnCours(le);
	EmpruntEnCours la1=new EmpruntEnCours("01/02/2017",quatre,ad4);
	ad4.addEmpruntEnCours(la1);
//	deux.setEmpruntEnCours(la);
	System.out.println(ad3.getNbEmpruntsEnCours());
	System.out.println(ad3.toString());
	System.out.println(ad4.getNbEmpruntsEnCours());
	System.out.println(ad4.getEmpruntEnCours());
	
	
}
}
