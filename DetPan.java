import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;


public class PangramTest {
    @Test
    public void test1() {
      String pangram1 = "The quick brown fox jumps over the lazy dog.";
      PangramChecker pc = new PangramChecker();
      assertEquals(true, pc.check(pangram1));
    }
    @Test
    public void test2() {
      String pangram2 = "You shall not pass!";
      PangramChecker pc = new PangramChecker();
      assertEquals(false, pc.check(pangram2));
    }
}

public class PangramChecker {
  public boolean check(String sentence){
    
  // For que nos permite "rodar el abecedario"
   for(char i = 'a'; i <= 'z'; i++)
     // Comprueba que i este en la palabra si no esta devuelve false, y si están todas las letras devuelve true.
      if(!sentence.toLowerCase().contains("" + i)) return false;
    
      
    return true;
  }
}
