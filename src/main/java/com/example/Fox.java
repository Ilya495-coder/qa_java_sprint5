package com.example;

import java.util.List;
import java.util.Map;

public class Fox {
    boolean isWild;
    Foxkinds foxkinds;
    String kind;

    public Fox(Foxkinds foxkinds, String kind) throws Exception {
        this.foxkinds = foxkinds;
        if (kind.equals("Хищник")) {
            isWild = true;
        } else if (kind.equals("Травоядное")) {
            isWild = false;
        } else {
            throw new Exception("Может быть только хищник или травоядное");
        }
        this.kind = kind;
    }

    public int getKitsCount() {
        return 3;
    }

    public boolean getIsWild() {
        return isWild;
    }

    public List<String> getFood() throws Exception {
        return foxkinds.getFood("Хищник");
    }

    public boolean doesLiveInCity(boolean isWild) {
        if (!isWild) {
            return true;
        } else {
            return false;
        }
    }

    public String printOIffo(String shemaMap, String versionSOD) {
        if (shemaMap == null || shemaMap.isBlank() || versionSOD.isBlank() || versionSOD == null) {
            throw new IllegalArgumentException("Схема не должна быть пстой");
        } else if (shemaMap.equals("BuildingInfo") && versionSOD != null) {
            return "Регистрационная запись ГосСтройНадзора в общем журнале работ";
        } else if (shemaMap.equals("BuildingParticipants") && versionSOD != null) {
            return "Данные генподрядчика о представителях (Представители лица, осуществляющего строительство)";
        } else if (shemaMap.equals("DataSetComments") && versionSOD != null) {
            return "Список замечаний к набору данных";
        } else if (shemaMap.equals("Participants") && versionSOD != null) {
            return "Данные застройщика о представителях";
        } else if (shemaMap.equals("participants") && versionSOD != null) {
            return "Данные застройщика о представителях";
        } else if (shemaMap.equals("generalWorkJournalTitlePage")) {
           return printGetInfo(versionSOD);
        }
         throw new IllegalArgumentException("Неизвестная схема: " + shemaMap);
    }
public String printGetInfo(String  versionSOD) {
    if( versionSOD.equals("draft.1")){
        return "Титульный лист общего журнала работ. TitlePage_001";
    }  else if (versionSOD.equals("11.1")) {
            return "Титульный лист общего журнала работ. TitlePage_002";

    } else if (versionSOD.equals("12.0")) {
            return "Титульный лист общего журнала работ. TitlePage_003";

    } else if ( versionSOD.equals("16.2")) {
            return "Титульный лист общего журнала работ. TitlePage_004";
    }
    else{
        return "Неизвестная вермия : " + versionSOD;
    }
}
}
