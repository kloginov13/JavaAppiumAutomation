
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.junit.Assert.assertEquals;
import static org.hamcrest.BaseMatcher.*;
import static org.junit.Assert.assertTrue;

public class MainClassTest {


    @Test @Ignore
    public void testGetLocalNumber(){
        MainClass el = new MainClass();
        Integer result = el.getLocalNumber();
        assertEquals("Результат вызова функции отличен от 14",result,(Integer) 14);
    }


    @Test @Ignore
    public void testGetCLassNumber(){
        MainClass el = new MainClass();
        assertTrue("Значение "+ el.getClassNumber() + " меньше, чем 45." ,el.getClassNumber()>45);
    }

    @Test
    public void testGetClassString(){
        MainClass el = new  MainClass();
        String stringFromClass = el.getClassString();
        Assert.assertThat("В строке "+stringFromClass+" отсутствует искомая подстрока",stringFromClass.toLowerCase(),CoreMatchers.containsString("hello"));
    }
}
