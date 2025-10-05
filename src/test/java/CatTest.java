//import com.example.Cat;
//import com.example.Feline;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.*;
//import org.mockito.junit.jupiter.MockitoExtension;
//import org.junit.jupiter.api.Test;
//import java.util.List;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//@ExtendWith(MockitoExtension.class)
//public class CatTest {
//
//    @Mock
//    Feline feline;
//
//    @Test
//    public void testGetSound(){
//        Cat cat = new Cat(feline);
//        String actual = cat.getSound();
//        assertEquals("Мяу",actual);
//    }
//    @Test
//    public void testGetFood() throws Exception {
//        Cat cat = new Cat(feline);
//        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные"));
//        List<String> resoult = cat.getFood();
//        assertEquals(List.of("Животные"),resoult);
//    }
//    @Test
//    public void print() throws Exception {
//        Cat cat = new Cat(feline);
//        cat.getFood();
//        Mockito.verify(feline,Mockito.times(1)).eatMeat();
//    }
//}
