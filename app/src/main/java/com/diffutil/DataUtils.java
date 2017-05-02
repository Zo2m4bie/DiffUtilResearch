package com.diffutil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dima on 5/2/17.
 */

public class DataUtils {

    public static List<CityModel> getFirstData(){
        List<CityModel> data = new ArrayList<>();
        data.add(new CityModel(1, "France"));
        data.add(new CityModel(2, "German"));
        data.add(new CityModel(3, "USA"));
        data.add(new CityModel(4, "Ukraine"));
        data.add(new CityModel(5, "Afghanistan"));
        data.add(new CityModel(6, "Albania"));
        data.add(new CityModel(7, "Algeria"));
        data.add(new CityModel(8, "Andorra"));
        data.add(new CityModel(9, "Angola"));
        data.add(new CityModel(10, "Argentina"));
        data.add(new CityModel(11, "Armenia"));
        data.add(new CityModel(12, "Aruba"));
        data.add(new CityModel(13, "Australia"));
        return data;
    }


    public static List<CityModel> getFirstDataDeletedAndInsertedAndUpdated(){
        List<CityModel> data = new ArrayList<>();
        data.add(new CityModel(1, "Bahrain"));
        data.add(new CityModel(32, "Cambodia"));
        data.add(new CityModel(3, "Djibouti"));
        data.add(new CityModel(4, "Ukraine"));
        data.add(new CityModel(6, "Albania"));
        data.add(new CityModel(15, "Estonia"));
        data.add(new CityModel(7, "Algeria"));
        data.add(new CityModel(8, "Andorra"));
        data.add(new CityModel(25, "Finland"));
        data.add(new CityModel(9, "Angola"));
        data.add(new CityModel(5, "Afghanistan"));
        data.add(new CityModel(10, "Argentina"));
        data.add(new CityModel(11, "Armenia"));
        data.add(new CityModel(12, "Aruba"));
        data.add(new CityModel(13, "Australia"));
        return data;
    }

}
