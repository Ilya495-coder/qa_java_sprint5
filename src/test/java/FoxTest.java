import com.example.Fox;
import com.example.Foxkinds;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.spy;

@ExtendWith(MockitoExtension.class)
public class FoxTest {
    @Mock
    Foxkinds foxkinds;

    Fox fox1;
    @BeforeEach
public void getObject()throws Exception{
    fox1 = spy(new Fox(foxkinds, "Хищник"));
}
    @Test
    public void printOIffoTestGetMethodPrintGetInfo() throws Exception{
        fox1.printOIffo("generalWorkJournalTitlePage" ,"draft.1 ");
        Mockito.verify(fox1,Mockito.times(1)).printGetInfo(Mockito.anyString());
    }
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
    @Test
    public void getTroeExeption()throws Exception{
        Fox fox = new Fox(foxkinds, "Хищник");
        assertThrows(IllegalArgumentException.class, () -> fox.printOIffo("тест" , "test"));
    }

@ParameterizedTest
@CsvSource({
        "BuildingInfo , 'Регистрационная запись ГосСтройНадзора в общем журнале работ'" ,
        "BuildingParticipants , 'Данные генподрядчика о представителях (Представители лица, осуществляющего строительство)'" ,
        "DataSetComments, Список замечаний к набору данных",
        "Participants, Данные застройщика о представителях " ,
        " participants , Данные застройщика о представителях"
})
public void testprintOIffoTrue(String test , String expected)throws Exception{
      Fox fox = new Fox(foxkinds,"Хищник");
      String actual = fox.printOIffo(test , "12.1");
    System.out.println(actual);
      assertEquals(expected ,actual );
}
@ParameterizedTest
@CsvSource({"draft.1 , 'Титульный лист общего журнала работ. TitlePage_001'",
        "11.1 ,'Титульный лист общего журнала работ. TitlePage_002'" ,
        " 12.0, 'Титульный лист общего журнала работ. TitlePage_003'" ,
        "16.2,'Титульный лист общего журнала работ. TitlePage_004'"})
public void testPrintInfoTruegeneralWorkJournalTitlePage(String test, String expected)throws Exception{
    Fox fox = new Fox(foxkinds,"Хищник");
    String actual = fox.printOIffo("generalWorkJournalTitlePage" , test);
    System.out.println(test);
    assertEquals(expected,actual );
}

@ParameterizedTest
@CsvSource({
        " '' , 12.2",
        "  , 12.2",
        " '  ' , draft.1",
        " 'хищник' , ''",
        " 'хищник' , '  '"
})
public void printOIffoGetThrow (String shemaMap, String versionSOD)throws Exception{
    Fox fox = new Fox(foxkinds, "Хищник");
    assertThrows(IllegalArgumentException.class, () ->fox.printOIffo(shemaMap,versionSOD));

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
