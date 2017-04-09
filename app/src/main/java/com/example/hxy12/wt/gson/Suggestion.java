package com.example.hxy12.wt.gson;

import com.google.gson.annotations.SerializedName;

public class Suggestion {

    @SerializedName("comf")//JSON字段和JAVA字段之间建立映射关系
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort {

        @SerializedName("txt")
        public String info;

    }

    public class CarWash {

        @SerializedName("txt")
        public String info;

    }

    public class Sport {

        @SerializedName("txt")
        public String info;

    }

}
