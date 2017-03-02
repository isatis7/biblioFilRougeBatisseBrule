package biblio;

import java.text.ParseException;

//Source file: K:\\fil rouge bibliotheque\\Vue logique\\code java genere a partir de la recette partie 3\\Employe.java


public class Employe extends Utilisateur 
{
   private String codeMatricule;
   private EnumCategorieEmploye categorieEmploye;
   
   
   
   /**
    * @throws ParseException 
 * @roseuid 58B57353016D
    */
   public Employe() throws ParseException 
   {
    super();
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
	return "Employe [codeMatricule=" + codeMatricule + ", categorieEmploye=" + categorieEmploye + "]";
}

public static void main(String[] args) throws ParseException {
	
	Employe employe = new Employe();
	employe.setCategorieEmploye(EnumCategorieEmploye.BIBLIOTHECAIRE);
	System.out.println(employe.getCategorieEmploye());
	employe.setCodeMatricule("Manu");
	System.out.println(employe.getCodeMatricule());
	System.out.println(employe);
	
	
}
}
