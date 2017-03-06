package biblio;

import java.text.ParseException;
import java.util.GregorianCalendar;

import enumeration.EnumCategorieEmploye;

//Source file: K:\\fil rouge bibliotheque\\Vue logique\\code java genere a partir de la recette partie 3\\Employe.java


public class Employe extends Utilisateur 
{
   private String codeMatricule;
   private EnumCategorieEmploye categorieEmploye;
   
   
   
   /**
    * @throws ParseException 
 * @roseuid 58B57353016D
    */
   public Employe(String nom,String prenom,GregorianCalendar dateNaissance,String sexe, int idUtilisateur, String pwd, String pseudonyme, String codeMatricule, EnumCategorieEmploye categorie)  
   {
    super(nom,prenom,dateNaissance,sexe,idUtilisateur,pwd,pseudonyme);
    this.codeMatricule=codeMatricule;
    this.categorieEmploye=categorie;
   }

public String getCodeMatricule() {
	return codeMatricule;
}

public void setCodeMatricule(String codeMatricule) {
	this.codeMatricule = codeMatricule;
}

public EnumCategorieEmploye getCategorieEmploye() {
	return categorieEmploye;
}

public void setCategorieEmploye(EnumCategorieEmploye categorieEmploye) {
	this.categorieEmploye = categorieEmploye;
}
   
@Override
public String toString() {
	return super.toString()+"Employe [codeMatricule=" + codeMatricule + ", categorieEmploye=" + categorieEmploye + "]\n\n";
}

public static void main(String[] args) throws ParseException {
	
//	Employe employe = new Employe();
//	employe.setCategorieEmploye(EnumCategorieEmploye.BIBLIOTHECAIRE);
//	System.out.println(employe.getCategorieEmploye());
//	employe.setCodeMatricule("Manu");
//	System.out.println(employe.getCodeMatricule());
//	System.out.println(employe);
	
	
}
}
