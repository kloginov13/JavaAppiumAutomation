
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MainClassTest {


    @Test
    public void testGetLocalNumber(){
        MainClass el = new MainClass();
        Integer result = el.getLocalNumber();
        assertEquals("Результат вызова функции отличен от 14",result,(Integer) 14);
    }
}
