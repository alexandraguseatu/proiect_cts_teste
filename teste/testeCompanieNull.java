package teste;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import Builder.Angajat;
import SimpleFactory.DepartamenteInterface;
import singleton.Companie;

public class testeCompanieNull {
	
	@Test
	public void testListaDepNull(){
		ArrayList<DepartamenteInterface> listaNull = null;
		Companie c = Companie.getInstance();
		c.setListaDepartamenteNull(listaNull);
		try {			
			System.out.println(c.getListaDepartamente());
			fail("need an exception");

		} catch (NullPointerException ex) {
			System.out.println("  ");
		}		
	}	

	@Test
	public void testListaNull(){
		ArrayList<Angajat> listaNull = null;
		Companie c = Companie.getInstance();
		c.setListaAngajatiNUll(listaNull);
		try {			
			System.out.println(c.getListaAngajati());
			fail("need an exception");

		} catch (NullPointerException ex) {
			System.out.println("  ");
		}
		
	}
	
	

}
