import com.example.Kittens;
import com.example.Lion;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
@ExtendWith(MockitoExtension.class)
public class LionParameterizedTest {
    @Mock
    Kittens kittens;
    @ParameterizedTest
    @CsvSource({
            "Самец , true",
            "Самка , false"
    })

    public void doesHaveManeGetResoultForsex(String sex,boolean expected) throws Exception{
        Lion lion = new Lion(sex, kittens);
        boolean actual = lion.doesHaveMane();
        assertEquals(expected , actual, "Пол животного должен быть - Cамец или Cамка");
        //System.out.println();
    }
    @ParameterizedTest
    @ValueSource( strings = {"САМЕЦ ", "САМКА",  "  ", "оно", "самка", "самец"})
    public void doesHaveManeCheckException(String sex)throws Exception{
        //Lion lion = new Lion(sex, kittens);
        assertThrows(Exception.class , () -> new Lion(sex, kittens));

    }

}
