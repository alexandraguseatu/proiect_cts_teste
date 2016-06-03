package teste;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

import Builder.Angajat;
import Builder.AngajatBuilder;
import singleton.Companie;

public class testeCalcule {

	@Test
	public void testTotalSalarii(){
		Angajat angajat = new AngajatBuilder().Nume("Gigi").Departament("HR").Salatiu(20).Availability("StareLucru").build();
		Angajat angajat2 = new AngajatBuilder().Nume("Sandel").Departament("IT").Salatiu(40).Availability("StareLucru").build();
		ArrayList<Angajat> listaang = new ArrayList<Angajat>();
		listaang.add(angajat);
		listaang.add(angajat2);	
		Companie companie = Companie.getInstance();
		companie.setListaAngajati(listaang);
		float expected = 60;
		assertEquals(expected, companie.getInstance().totalSalarii(), 0.1);
	}
	
	@Test
	public void testTotalSalariiListaNull(){
		ArrayList<Angajat> listaang = null;
		Companie companie = Companie.getInstance();
		companie.setListaAngajatiNUll(listaang);
		float expected = -1;
		assertEquals(expected, companie.getInstance().totalSalarii(), 0.1);
	}
	
	@Test
	public void calculeazaSalariiListaGoala(){
		ArrayList<Angajat> listaA = new ArrayList<Angajat>();
		Companie c= Companie.getInstance();
		c.setListaAngajati(listaA);
		assertEquals(0, c.getInstance().totalSalarii(), 0);
	}
	
	
	
	@Test
	public void testTotalPrime() throws Exception{
		Angajat angajat = new AngajatBuilder().Nume("Gigi").Departament("HR").Salatiu(20).Availability("StareLucru").build();
		Angajat angajat2 = new AngajatBuilder().Nume("Sandel").Departament("IT").Salatiu(40).Availability("StareLucru").build();
		ArrayList<Angajat> listaang = new ArrayList<Angajat>();
		listaang.add(angajat);
		listaang.add(angajat2);	
		Companie companie = Companie.getInstance();
		companie.setListaAngajati(listaang);
		float expected = 8;
		assertEquals(expected, companie.getInstance().totalPrima(), 0.1);
	}
	
	@Test
	public void testTotalPrimeListaNull() throws Exception{
		ArrayList<Angajat> listaang = null;
		Companie companie = Companie.getInstance();
		companie.setListaAngajatiNUll(listaang);
		float expected = -1;
		assertEquals(expected, companie.getInstance().totalPrima(), 0.1);
	}
	
	@Test
	public void calculeazaPrimeListaGoala(){
		ArrayList<Angajat> listaA = new ArrayList<Angajat>();
		Companie c= Companie.getInstance();
		c.setListaAngajati(listaA);
		assertEquals(0, c.getInstance().totalSalarii(), 0);
	}
	
	@Test
	public void testTotalTaxe(){
		Angajat angajat = new AngajatBuilder().Nume("Gigi").Departament("HR").Salatiu(20).Availability("StareLucru").build();
		Angajat angajat2 = new AngajatBuilder().Nume("Sandel").Departament("IT").Salatiu(100).Availability("StareLucru").build();
		ArrayList<Angajat> listaang = new ArrayList<Angajat>();
		listaang.add(angajat);
		listaang.add(angajat2);	
		Companie companie = Companie.getInstance();
		companie.setListaAngajati(listaang);
		float expected = (float) 20;
		assertEquals(expected, (companie.getInstance()).totalTaxe(), 0.1);
	}
	
	@Test
	public void testTotalTaxeNull(){
		ArrayList<Angajat> listaang = null;
		Companie companie = Companie.getInstance();
		companie.setListaAngajatiNUll(listaang);
		float expected = -1;
		assertEquals(expected, companie.getInstance().totalTaxe(), 0.1);
	}
	
	@Test
	public void calculeazaTaxeListaGoala(){
		ArrayList<Angajat> listaA = new ArrayList<Angajat>();
		Companie c= Companie.getInstance();
		c.setListaAngajati(listaA);
		assertEquals(0, c.getInstance().totalTaxe(), 0);
	}
	
	@Test
	public void calculeazaTotalPlata() throws Exception{
		Angajat angajat = new AngajatBuilder().Nume("Gigi").Departament("HR").Salatiu(20).Availability("StareLucru").build();
		Angajat angajat2 = new AngajatBuilder().Nume("Sandel").Departament("IT").Salatiu(40).Availability("StareLucru").build();
		ArrayList<Angajat> listaang = new ArrayList<Angajat>();
		listaang.add(angajat);
		listaang.add(angajat2);	
		Companie companie = Companie.getInstance();
		companie.setListaAngajati(listaang);
		float expected = (float) 78.4;
		assertEquals(expected, companie.getInstance().totalDePlata(),0);	
		
	}

}
