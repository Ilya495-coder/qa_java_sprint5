import com.example.Kittens;
import com.example.Lion;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class LionTest {

    @Mock
    Kittens kittens;

    @Test
    public void testGetKittens() throws Exception {
        Lion lion = new Lion("Самец", kittens);
        lion.getKittens();
        Mockito.verify(kittens,Mockito.times(1)).getKittens();

    }
    @Test
    public void testGetFood() throws Exception{
        Lion lion = new Lion("Самец", kittens);
        lion.getFood();
        Mockito.verify(kittens,Mockito.times(1)).getFood("Хищник");
    }
}
