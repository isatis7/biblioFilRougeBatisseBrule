package biblio;

import java.text.ParseException;
import java.text.SimpleDateFormat;

//Source file: K:\\fil rouge bibliotheque\\Vue logique\\code java genere a partir de la recette partie 3\\Personne.java

import java.util.Date;

public class Personne 
{
   private String nom;
   private String prenom;
   private Date dateNaissance ;
   private String sexe;
   
   public Personne(String unNom, String unPrenom, String uneDateNaissance, String unSexe) throws ParseException{
	   this.nom = unNom;
	   this.prenom = unPrenom;
	   this.dateNaissance = new SimpleDateFormat("dd/MM/yyyy").parse(uneDateNaissance);
	   this.sexe = unSexe;
   }
   
   public Personne(String unNom, String unPrenom, String uneDateNaissance) throws ParseException{
	   this(unNom, unPrenom, uneDateNaissance, "Non renseigne");
   }
   
   public Personne(String unNom, String unPrenom) throws ParseException{
	   this(unNom, unPrenom, "00/00/0000","Non renseigne");
   }
   
   public Personne(String unNom) throws ParseException{
	   this(unNom,"Prenom inconnu","00/00/0000","Non renseigne");
   }
   
   /**
    * @throws ParseException 
 * @roseuid 58B57353039C
    */
   public Personne() throws ParseException 
   {
	   this("Nom inconnu","Prenom inconnu","00/00/0000","Non renseigne");
   }



@Override
public String toString() {
	return "Personne [nom=" + nom + ", prenom=" + prenom + ", dateNaissance=" + dateNaissance + ", sexe=" + sexe + "]";
}
   
//   public static void main(String[] args) throws ParseException {
//	   
//	   Personne personne =new Personne();
//	   Personne personne1 = new Personne("brule", "arnaud", "17/07/1988","masculin");
//	   Personne personne2 = new Personne("brule", "valentin", "18/09/1982");
//	   Personne personne3 = new Personne("brule", "valentin");
//	   Personne personne4 = new Personne("brule");
//	   
//	   
//	   System.out.println(personne);
//	   System.out.println(personne1);
//	   System.out.println(personne2);
//	   System.out.println(personne3);
//	   System.out.println(personne4);
//
//
//}
}
