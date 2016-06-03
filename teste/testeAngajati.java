package teste;

import org.junit.Test;

import Builder.Angajat;
import junit.framework.Assert;

public class testeAngajati {

	@Test
	public void testCalculeazaPrimaHR() throws Exception {
		Angajat a = new Angajat("Gigel","HR",20,"LUCRU");
		float actual = a.calculPrima(a.getDepartament(), a.getSalariu());
		float expected = (float) 2.0;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testCalculeazaPrimaIT() throws Exception {
		Angajat a = new Angajat("Gigel","IT",20,"LUCRU");
		float actual = a.calculPrima(a.getDepartament(), a.getSalariu());
		float expected = (float) 3.0;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testCalculeazaPrimaFINANCE() throws Exception {
		Angajat a = new Angajat("Gigel","FINANCE",20,"LUCRU");
		float actual = a.calculPrima(a.getDepartament(), a.getSalariu());
		float expected = (float) 4.0;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testCalculeazaTaxeIT() throws Exception {
		Angajat a = new Angajat("Gigel","IT",20,"LUCRU");
		float actual = a.calculTaxe(a.getDepartament(), a.getSalariu());
		float expected = (float) 3.2;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testCalculeazaTaxeAltii() throws Exception {
		Angajat a = new Angajat("Gigel","FINANCE",20,"LUCRU");
		float actual = a.calculTaxe(a.getDepartament(), a.getSalariu());
		float expected = (float) 4.0;
		Assert.assertEquals(expected, actual);
	}

}
