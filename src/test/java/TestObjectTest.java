import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

/**
 * Created by hitek on 08.06.2017.
 */
public class TestObjectTest {




    @Test
    public void getID() throws Exception {
        TestObject testObject = Mockito.mock(TestObject.class);
        Mockito.when(testObject.getID()).thenReturn(1);
        assertEquals((int)testObject.getID(),1);
        /*assertEquals(testObject.getNAME(),null);*/ // Если это вызвать будет ошибка вызова лишнего метода без verify
        Mockito.verify(testObject).getID(); //проверили, что вызывался
        Mockito.verifyNoMoreInteractions(testObject); //и больше ничего
        /*Mockito.verifyZeroInteractions(testObject);*/// Тут ошибка, потому что был вызван метод мокка

    }

    @Test
    public void setID() throws Exception {
    }

    @Test
    public void getNAME() throws Exception {

    }

    @Test
    public void setNAME() throws Exception {
    }

    @Test
    public void getAGE() throws Exception {
    }

    @Test
    public void setAGE() throws Exception {
    }

}