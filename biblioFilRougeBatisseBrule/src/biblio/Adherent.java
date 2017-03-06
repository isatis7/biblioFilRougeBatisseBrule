package biblio;

import java.text.ParseException;
import java.util.GregorianCalendar;

import enumeration.EnumStatusExemplaire;

//Source file: K:\\fil rouge bibliotheque\\Vue logique\\code java genere a partir de la recette partie 3\\Adherent.java


/**
 * Un adh�rent est une personne �tranger au personnel de la biblioth�que souhaitant 
 * 
 * 
 * 
 * emprunter des livres.
 */
public class Adherent extends Utilisateur 
{
   private String telephone;
   private static Integer nbMaxPrets = 3;
   private static Integer dureeMaxPrets = 15;
   private boolean conditionsPretAcceptees = true;
   private int nbRetard;
   private EnumStatusExemplaire statusExemplaire;
   /**
    * @throws ParseException 
    * @roseuid 58B5775C0391
    */
   public Adherent(String nom,String prenom,GregorianCalendar dateNaissance,String sexe, int idUtilisateur, String pwd, String pseudonyme,String telephone)  
   {
     super(nom,prenom,dateNaissance,sexe,idUtilisateur,pwd,pseudonyme);
     this.telephone=telephone;
//     this.nbMaxPrets=nbMaxPrets;
//     this.dureeMaxPrets=dureeMaxPrets;
   }
   
   /**
    * @return Boolean
    * @roseuid 58B576CE02FC
    */
   public Boolean isConditionsPretAcceptees(){
		if(getEmpruntEnCours().size() > this.nbMaxPrets || this.nbRetard != 0){
			this.conditionsPretAcceptees = false;
			return false;
		}else{
			this.conditionsPretAcceptees = true;
			return true;
		}
   }
   
   
   public void addEmpruntEnCours(EmpruntEnCours ep){
  	   if(getConditionsPretAcceptees() == true){
	   getEmpruntEnCours().add(ep);
	   ep.setEnumStatusExemplaire(EnumStatusExemplaire.PRETE); 
	   setNbEmpruntsEnCours(getNbEmpruntsEnCours() + 1);
  	   }else{
//  		   throw new IllegalArgumentException("L'adherent ne peut pas emprunter de livre");
  	   }
}
   
   /**
    * @return Integer
    * @roseuid 58B576EE03E5
    */
   public int getNbRetards(){
	   return nbRetard;
   }
   

   public void setConditionsPretAcceptees(boolean conditionsPretAcceptees) {
	this.conditionsPretAcceptees = conditionsPretAcceptees;
   }
   
   public boolean getConditionsPretAcceptees(){
	   return conditionsPretAcceptees;
   }

/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return super.toString()+"Adherent [telephone=" + telephone + ", conditionsPretAcceptees=" + conditionsPretAcceptees + ", nbRetard="
			+ nbRetard + ", statusExemplaire=" + statusExemplaire + ", empruntEnCours=" + empruntEnCours + "]\n\n";
}
   
}
