import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

/**
 * Created by hitek on 08.06.2017.
 */
@RunWith(MockitoJUnitRunner.class)
public class MainTest {

    @Mock
    private TestObject testObjectTest;

    @InjectMocks
    private TestObject mockTestObjectTest;

    private Main main;

    @Before
    public void getMain() throws Exception{
        System.out.println("New Object");
        main = Main.getMain();
    }

    @After
    public void cleanMain(){
        System.out.println("Start GC");
        System.gc();
    }

    @BeforeClass
    public static void beforeClass() throws Exception{
        System.out.println("Start All Test");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("And All Test");
    }

    @Test
    public void incr() throws Exception {
        assertEquals(main.incr(1),2);
    }

    @Test
    public void decr() throws Exception {
        assertEquals(main.decr(2),1);
    }

    @Test(timeout = 1300)
    public void cicle() throws Exception {
        main.cicle();
    }

    @Test
    public void booleanTest() throws Exception {
        assertFalse(main.booleanTest());
    }
    @Test
    public void kakJeYaIzabellaTest(){
        assertEquals(main.kakJeYaIzabella(mockTestObjectTest),1);

    }

}