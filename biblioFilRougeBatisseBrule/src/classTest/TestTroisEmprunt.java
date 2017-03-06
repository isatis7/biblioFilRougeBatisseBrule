package classTest;

import java.text.ParseException;

import biblio.EmpruntEnCours;
import biblio.Exemplaire;
import biblio.Utilisateur;
import dao.ExemplaireDao;
import dao.UtilisateurDao;

public class TestTroisEmprunt {

	public static void main(String[] args) throws ParseException {
		System.out.println("\n\n\nTestAdherentTroisEmprunt\n---------------------------");
		ExemplaireDao scenario3 = new ExemplaireDao();
		Exemplaire cinq = scenario3.findByKey(17);
		Exemplaire six = scenario3.findByKey(2);
		Exemplaire sept = scenario3.findByKey(8);
		Exemplaire huit = scenario3.findByKey(67);
		UtilisateurDao lambda3 = new UtilisateurDao();
		Utilisateur ad5 = lambda3.findByKey(5);
		EmpruntEnCours le2 = new EmpruntEnCours("02/03/2017",cinq,ad5);
		EmpruntEnCours le3 = new EmpruntEnCours("02/03/2017",six,ad5);
		EmpruntEnCours le4 = new EmpruntEnCours("02/03/2017",sept,ad5);
		EmpruntEnCours le5 = new EmpruntEnCours("02/03/2017",huit,ad5);
		System.out.println(ad5.getEmpruntEnCours());
		System.out.println(ad5.getNbEmpruntsEnCours());
		System.out.println(ad5.toString());
		
		

	}

}
