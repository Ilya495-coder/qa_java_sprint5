import com.example.Kittens;
import com.example.LionAlex;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class LionAlexTest {
    @Mock
    Kittens kittens;
    LionAlex lionAlex;
    @BeforeEach
    public void getObject()throws Exception{
        lionAlex = new LionAlex(kittens);
    }
    @Test
    public void testGetListFriends() throws Exception{
        List<String> actual = lionAlex.getFriends();
        assertEquals(List.of("Марти", "Глория","Мелман"),actual);
        System.out.println("Актуальное значение: " +actual + ", ожидаемое значение: Марти, Глория, Мелман" );
    }
    @Test
    public void testGetPlaceOfLiving()throws Exception{
        String actual = lionAlex.getPlaceOfLiving();
        assertEquals("Нью-Йоркский зоопарк",actual);
        System.out.println("Актуальное значение: " +actual + ", ожидаемое значение: Нью-Йоркский зоопарк" );
    }
    @Test
    public  void testGetKittens()throws Exception{
        int actual = lionAlex.getKittens();
        assertEquals(0,actual);
        System.out.println("Актуальное значение: " +actual + ", ожидаемое значение: 0" );
    }
}
