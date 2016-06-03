package teste;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Builder.Angajat;
import singleton.Companie;


public class testareFisier {
	FileReader reader;
	BufferedReader buffer;
	
	@Before
	public void setUp() throws Exception {
		reader = new FileReader("angajatTest.txt");
		buffer = new BufferedReader(reader);
	}
	

	@Test
	public void test() {
		Companie companie=singleton.Companie.getInstance();
		
		try{
			 reader=new FileReader("angajatTest.txt");
			 buffer=new BufferedReader(reader);
			String line=null;
			while((line=buffer.readLine())!=null && (line.length())!=0){
				line=buffer.readLine();
				 String[] atribute = line.split(",");
	                if(atribute.length!=4){
	                    throw new Exception("Wrong line!");
	                }
	                Angajat a = new Angajat();
	                a.setNume(atribute[0]);
	                a.setDepartament(atribute[1]);
	                a.setSalariu(Integer.parseInt(atribute[2]));
	                a.setAvailability(atribute[3]);    
	                line = buffer.readLine();
	                companie.getListaAngajati().add(a);	
	                
	                assertEquals("HR", a.getDepartament());
	                assertEquals(100, a.getSalariu());
	                assertEquals("Gigel", a.getNume());  
			}			
			
		}
		catch(FileNotFoundException ex){}
		catch(Exception ex){}
		}

	@After
	public void tearDown() throws Exception {
		reader.close();
		buffer.close();
	}
	
	}
