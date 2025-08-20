package com.rodox.dslist.dto;

import com.rodox.dslist.entities.Game;

public class GameMinDto {

   
    private  long   id;
    private  String title;
    private  int    year;
    private  String imgUrl;
    private  String shortDescription;
    
    public GameMinDto(){
        
    }

    public GameMinDto(Game entity) {
       id = entity.getId();
       title = entity.getTitle();
       year = entity.getYear();
       imgUrl = entity.getImgUrl();
       shortDescription = entity.getShortDescription();
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
    


}
