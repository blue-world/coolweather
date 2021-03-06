package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

public class Country extends DataSupport {
    private int id;
    private String countryName;
    private int weatherID;
    private int cityID;
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id=id;
    }

    public String getCountryName(){
        return countryName;
    }

    public void setCountryName(String countryName){
        this.countryName=countryName;
    }

    public int getWeatherID(){
        return weatherID;
    }

    public void setWeatherID(int weatherID){
        this.weatherID=weatherID;
    }

    public int getCityID(){
        return cityID;
    }

    public void setCityID(int cityID){
        this.cityID=cityID;
    }

}
