package teste;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ testareFisier.class, testeAngajati.class, testeCalcule.class, testeCompanie.class, testeCompanieNull.class })
public class AllTests {

}
