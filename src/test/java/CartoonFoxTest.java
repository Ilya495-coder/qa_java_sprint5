import com.example.CartoonFox;
import com.example.Foxkinds;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class CartoonFoxTest {
    @Mock
    Foxkinds foxkinds;

    @Test
    public void testgetFriends()throws Exception {
        CartoonFox cartoonFox = new CartoonFox(foxkinds,"Травоядное");
        List <String> actual =  cartoonFox.getFriends();
        assertEquals(List.of("Джуди Хоппс", "Флеш"),actual);
    }
    @Test
    public void testgetPlaceOfLiving() throws Exception {
        CartoonFox cartoonFox = new CartoonFox(foxkinds,"Травоядное");
        String actual =  cartoonFox.getPlaceOfLiving();
        assertEquals("город Зверополис",actual);
    }
    @Test
    public void testgetKitsCount() throws Exception {
        CartoonFox cartoonFox = new CartoonFox(foxkinds,"Травоядное");
        int actual =  cartoonFox.getKitsCount();
        assertEquals(0,actual);
    }
}
