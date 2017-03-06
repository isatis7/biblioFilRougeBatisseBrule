package dao;

import java.util.Calendar;
import java.util.GregorianCalendar;

import biblio.Exemplaire;
import enumeration.EnumStatusExemplaire;

/**
 * @author Philippe BATISSE
 *
 */
public class ExemplaireDao {

	/**
	 * emulation de la base de donnée
	 */
	private static Exemplaire[] exemplaireDB = {
			new Exemplaire(4,new GregorianCalendar(1632, Calendar.AUGUST,14) , EnumStatusExemplaire.DISPONIBLE, "978-0-7334-2609-4"),
			new Exemplaire(5, new GregorianCalendar(1999, Calendar.SEPTEMBER,9), EnumStatusExemplaire.DISPONIBLE, "978-0747595823"),
			new Exemplaire(8, new GregorianCalendar(2011, Calendar.SEPTEMBER,11), EnumStatusExemplaire.DISPONIBLE, " 978-2234082472"),
			new Exemplaire(6, new GregorianCalendar(2016, Calendar.DECEMBER,12), EnumStatusExemplaire.DISPONIBLE, "978-2212134995"),
			new Exemplaire(2, new GregorianCalendar(1978, Calendar.DECEMBER,31), EnumStatusExemplaire.DISPONIBLE, "978-2072693144"),
			new Exemplaire (3, new GregorianCalendar(2009, Calendar.MARCH, 04),EnumStatusExemplaire.DISPONIBLE, "978-3749019463"),
			new Exemplaire (1, new GregorianCalendar(2012, Calendar.MAY,8),EnumStatusExemplaire.DISPONIBLE,"978-3987654045")};

	public Exemplaire findByKey(int idExemplaire){
		for (Exemplaire exemplaire : exemplaireDB){
			if (exemplaire.getIdExemplaire()==idExemplaire)
				return exemplaire;
		}
		return null;
	}
}
