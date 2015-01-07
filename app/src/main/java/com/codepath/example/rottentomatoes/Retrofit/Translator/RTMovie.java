package com.codepath.example.rottentomatoes.Retrofit.Translator;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by mitch on 2/24/14.
 */
public class RTMovie {

   public String id;
   public String title;
   public int year;
   public String mpaa_rating;

    @SerializedName("posters")
    public Posters posters;

    @SerializedName("abridged_cast")
    public ArrayList<Actor> cast;

    public Ratings ratings;

    public class Actor {
        public String name;     
    }
    
    public class Ratings {
        public String critics_rating;
        public int critics_score;
        public String audience_rating;
        public int audience_score;
    }

    public class Posters {
        public String thumbnail;
        public String profile;
    }
}
