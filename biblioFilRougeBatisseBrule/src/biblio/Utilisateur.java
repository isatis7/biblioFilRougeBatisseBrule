package biblio;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;

//Source file: K:\\fil rouge bibliotheque\\Vue logique\\code java genere a partir de la recette partie 3\\Utilisateur.java


/**
 * Il y a deux types d'utilisateur pouvant emprunter des livres. Les adh�rants et 
 * les employ�s. Les adh�rents sont soumis � des contraintes que n'ont pas les 
 * employ�s.
 */
public class Utilisateur extends Personne 
{
   private Integer idUtilisateur;
   private String pwd;
   private String pseudonyme;
   protected ArrayList<EmpruntEnCours> empruntEnCours = new ArrayList<>();
   private int NbEmpruntsEnCours = 0;
   
   
   /**
    * @throws ParseException 
 * @roseuid 58B5752B00DF
    */
   public Utilisateur() throws ParseException 
   {
	   super();
   }
   
   /**
    * @param ep
    * @roseuid 58B570370284
    */
   public void addEmpruntEnCours(EmpruntEnCours ep){
	  	   empruntEnCours.add(ep);
		   ep.setEnumStatusExemplaire(EnumStatusExemplaire.PRETE); 
		   setNbEmpruntsEnCours(getNbEmpruntsEnCours() + 1);
   }
   
   /**
    * @return Integer
    * @roseuid 58B570A20254
    */
   public int getNbEmpruntsEnCours() 
   {
    return NbEmpruntsEnCours;
   }

   public void setNbEmpruntsEnCours(int nbEmpruntsEnCours) {
	   NbEmpruntsEnCours = nbEmpruntsEnCours;
   }
   
   /**
    * @return EmpruntEnCours
    * @roseuid 58B5706B012C
    */
   public ArrayList<EmpruntEnCours> getEmpruntEnCours(){
	   return empruntEnCours;
   }
   
@Override
public String toString() {
	return "Utilisateur [idUtilisateur=" + idUtilisateur + ", pwd=" + pwd + ", pseudonyme=" + pseudonyme
			+ ", empruntEnCours=" + empruntEnCours + "]";
}



public static void main(String[] args) throws ParseException {
	
	Utilisateur utilisateur = new Utilisateur();
	System.out.println(utilisateur);
	
	
	
	
	
	
	
}

}
