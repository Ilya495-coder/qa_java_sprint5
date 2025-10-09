package com.example;

import java.util.List;

public class CartoonFox extends Fox{
    public CartoonFox(Foxkinds foxkinds, String kind) throws Exception {
        super(foxkinds, kind);
    }
   public List<String> getFriends(){
        return List.of("Джуди Хоппс", "Флеш");
    }
    public String getPlaceOfLiving(){
        return "город Зверополис";
    }
    @Override
    public int getKitsCount(){
        return 0;
    }
}


