package teste;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.EmptyStackException;

import org.junit.Test;

import Builder.Angajat;
import Builder.AngajatBuilder;
import SimpleFactory.DepartamentFactory;
import SimpleFactory.Departamente;
import SimpleFactory.DepartamenteInterface;
import singleton.Companie;

public class testeCompanie {

	@Test
	public void testAdaugarecompanie() {
		Angajat angajat = new AngajatBuilder().Nume("Gigi").Departament("HR").Salatiu(20).Availability("StareLucru").build();
		Angajat angajat2 = new AngajatBuilder().Nume("Sandel").Departament("IT").Salatiu(40).Availability("StareLucru").build();
		ArrayList<Angajat> listaang = new ArrayList<Angajat>();
		listaang.add(angajat);
		listaang.add(angajat2);	
		Companie companie = Companie.getInstance();
		companie.setListaAngajati(listaang);
		assertEquals(listaang, companie.getListaAngajati());		
	}
	
	@Test
	public void testListaNotNull() {
		Angajat angajat = new AngajatBuilder().Nume("Gigi").Departament("HR").Salatiu(20).Availability("StareLucru").build();
		Angajat angajat2 = new AngajatBuilder().Nume("Sandel").Departament("IT").Salatiu(40).Availability("StareLucru").build();
		ArrayList<Angajat> listaang = new ArrayList<Angajat>();
		listaang.add(angajat);
		listaang.add(angajat2);	
		Companie companie = Companie.getInstance();
		companie.setListaAngajati(listaang);
		assertNotNull(companie.getListaAngajati());		
	}
	
	
	@Test
	public void testAdaugareDepartament(){
		Companie companie = Companie.getInstance();
		DepartamenteInterface departamentIT;
		DepartamenteInterface departamentHR;
		DepartamenteInterface departamentFINANCE;
		DepartamentFactory departamentFactory = new DepartamentFactory();
		
		departamentIT = departamentFactory.createDepartament(Departamente.IT);
		departamentHR = departamentFactory.createDepartament(Departamente.HR);
		departamentFINANCE = departamentFactory.createDepartament(Departamente.FINANCE);
				
		ArrayList<DepartamenteInterface> listDep = new ArrayList<DepartamenteInterface>();
		listDep.add(departamentIT);
		listDep.add(departamentHR);
		listDep.add(departamentFINANCE);
		companie.setListaDepartamente(listDep);
		
		assertEquals(listDep, companie.getListaDepartamente());		
	}
	
	@Test
	public void testDepartamenteNotNull(){
		Companie companie = Companie.getInstance();
		DepartamenteInterface departamentIT;
		DepartamenteInterface departamentHR;
		DepartamenteInterface departamentFINANCE;
		DepartamentFactory departamentFactory = new DepartamentFactory();
		
		departamentIT = departamentFactory.createDepartament(Departamente.IT);
		departamentHR = departamentFactory.createDepartament(Departamente.HR);
		departamentFINANCE = departamentFactory.createDepartament(Departamente.FINANCE);
				
		ArrayList<DepartamenteInterface> listDep = new ArrayList<DepartamenteInterface>();
		listDep.add(departamentIT);
		listDep.add(departamentHR);
		listDep.add(departamentFINANCE);
		companie.setListaDepartamente(listDep);
		
		assertNotNull(companie.getListaDepartamente());	
	}
	
	@Test
	public void salariuMaxim(){
		Angajat angajat = new AngajatBuilder().Nume("Gigi").Departament("HR").Salatiu(20).Availability("StareLucru").build();
		Angajat angajat2 = new AngajatBuilder().Nume("Sandel").Departament("IT").Salatiu(40).Availability("StareLucru").build();
		ArrayList<Angajat> listaang = new ArrayList<Angajat>();
		listaang.add(angajat);
		listaang.add(angajat2);	
		Companie companie = Companie.getInstance();
		companie.setListaAngajati(listaang);
		assertEquals(angajat2, companie.calculSalariuMaxim());		
	}
	
	@Test
	public void salariuMaximNull(){
	ArrayList<Angajat> listaAng	= null;
	try{
		Companie c = singleton.Companie.getInstance();
		c.setListaAngajati(listaAng);
		System.out.println(c.calculSalariuMaxim());
		fail("null list");
	}catch(NullPointerException e){}
	}
	
	@Test
	public void salariuMaximEmptyList(){
	ArrayList<Angajat> listaAng	= new ArrayList<Angajat>();
	try{
		Companie c = singleton.Companie.getInstance();
		c.setListaAngajati(listaAng);
		System.out.println(c.calculSalariuMaxim());
		fail("empty list");
	}catch(Exception es ){}
	}
}
