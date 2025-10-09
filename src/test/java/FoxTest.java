import com.example.Fox;
import com.example.Foxkinds;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class FoxTest {
    @Mock
    Foxkinds foxkinds;

    @Test
            public void getKitsCountTest()throws Exception{
        Fox fox = new Fox(foxkinds, "Хищник");
        int actual = fox.getKitsCount();
        assertEquals(3,actual);
    }

 @Test
    public void testGetFoodIsVegan()throws Exception{
        Fox fox = new Fox(foxkinds, "Хищник");
        fox.getFood();
     Mockito.verify(foxkinds,Mockito.times(1)).getFood("Хищник");
    }
    @Test
    public void testGetFoodIsMeet()throws Exception{
        Fox fox = new Fox(foxkinds, "Хищник");
        Mockito.when(foxkinds.getFood(Mockito.anyString())).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actual = fox.getFood();
        assertEquals(List.of("Животные", "Птицы", "Рыба"),actual);
    }


    @ParameterizedTest
    @ValueSource(strings = {"хищник" , "травоядное", "всеядное" , "рыбное"})
    public void testGetFoodIsFalse(String kind)throws Exception{

        assertThrows(Exception.class, () -> new Fox(foxkinds, kind));

    }
    @Test
    public void testDoesLiveInCityFalse()throws Exception{
        Fox fox = new Fox(foxkinds, "Хищник");
        boolean  test = fox.getIsWild();
        boolean actual = fox.doesLiveInCity(test);
        assertFalse(actual);
    }
    @Test
    public void testDoesLiveInCityTrue()throws Exception{
        Fox fox = new Fox(foxkinds, "Травоядное");
        boolean  test = fox.getIsWild();
        boolean actual = fox.doesLiveInCity(test);
        assertTrue(actual);
    }

}
