package com.example.custome_listview.Models;

import android.media.Image;

public class Movies {

    String MovieName;
    String ratings;
    String Description;
    Integer[] image_file;

    public Movies(String movieName, String ratings, String description, Integer[] image_file) {
        this.MovieName = movieName;
        this.ratings = ratings;
        this.Description = description;
        this.image_file=image_file;

    }

    public String getMovieName() {
        return MovieName;
    }

    public void setMovieName(String movieName) {
        MovieName = movieName;
    }

    public String getRatings() {
        return ratings;
    }

    public void setRatings(String ratings) {
        this.ratings = ratings;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Integer getImage_file(int position) {
        return image_file[position];
    }

    public void setImage_file(Integer[] image_file) {
        this.image_file = image_file;
    }
}
