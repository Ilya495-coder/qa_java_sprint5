import com.example.Feline;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;
@ExtendWith(MockitoExtension.class)
public class FelineTest {

    @Spy
    Feline feline;
    Feline feline1 = new Feline();

    @Test
    public void testeatMeatCheckMethodCall() throws Exception{
        feline.eatMeat();
        Mockito.verify(feline,Mockito.times(1)).getFood("Хищник");
    }

    @Test
    public void testGetFamily(){
        String actual = feline1.getFamily();
        assertEquals("Кошачьи", actual);
        System.out.println("Актуальное значение: " + actual + ", ожидаемое значение: Кошачьи");
    }

    @Test
    public void testGetKittens(){
        Mockito.when(feline.getKittens(Mockito.anyInt())).thenReturn(1);
        int actual = feline.getKittens();
        assertEquals(1,actual);
        System.out.println("Актуальное значение: " + actual+ ", ожидаемое значение: 1");
    }

    @Test
    public void testGetKittensWithParameters(){
        int actual = feline1.getKittens(50);
        assertEquals(50,actual);
        System.out.println("Актуальное значение: " + actual+ ", ожидаемое значение: 50");
    }
}
