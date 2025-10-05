//import com.example.Feline;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.Mockito;
//import org.mockito.Spy;
//import org.mockito.junit.jupiter.MockitoExtension;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//@ExtendWith(MockitoExtension.class)
//public class FelineTest {
//    @Spy
//    Feline feline;
//    @Test
//    public void testeatMeatCheckMethodCall() throws Exception{
//        feline.eatMeat();
//        Mockito.verify(feline,Mockito.times(1)).getFood("Хищник");
//    }
//    @Test
//    public void testGetFamily(){
//        String actual = feline.getFamily();
//        assertEquals("Кошачьи", actual);
//        System.out.println("Актуальное значение: " + actual + ", ожидаемое значение: Кошачьи");
//    }
//    @Test
//    public void testGetKittens(){
//        Mockito.when(feline.getKittens(Mockito.anyInt())).thenReturn(2);
//        int actual = feline.getKittens();
//        assertEquals(2,actual);
//        System.out.println("Актуальное значение: " + actual+ ", ожидаемое значение: 2");
//    }
//    @Test
//    public void testGetKittensWithParameters(){
//        int actual = feline.getKittens(50);
//        assertEquals(50,actual);
//        System.out.println("Актуальное значение: " + actual+ ", ожидаемое значение: 50");
//    }
//}
