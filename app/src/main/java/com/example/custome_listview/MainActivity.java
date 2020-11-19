package com.example.custome_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ListView;

import com.example.custome_listview.Models.Movies;
import com.example.custome_listview.adpaters.MoviesCustomAdpater;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<Movies> movies;
    Integer[] imgid={
            R.drawable.gullyboy,R.drawable.bigbull,R.drawable.baaghi,
            R.drawable.kaabil,R.drawable.kabirsingh,
            R.drawable.laxmii,
    };

    public ArrayList<Movies> getArrayMovies(){
        ArrayList<Movies> movies=new ArrayList<>();
        movies.add(new Movies("Gully Boy","5/5","Story Oriented",imgid ));
        movies.add(new Movies("Big Bull","4.0/5","Harshad Mehta's life",imgid));
        movies.add(new Movies("Baaghi","3.0/5","Love And Action",imgid));
        movies.add(new Movies("Kabir Singh","4.5/5","Love And Romance",imgid));
        movies.add(new Movies("Laxmii","4/5","Comedy Horror",imgid));
        return movies;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.MoviesListView);
        movies=getArrayMovies();
        MoviesCustomAdpater adpater=new MoviesCustomAdpater(movies);
        listView.setAdapter(adpater);
    }
}