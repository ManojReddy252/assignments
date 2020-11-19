package com.example.custome_listview.adpaters;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.custome_listview.Models.Movies;
import com.example.custome_listview.R;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MoviesCustomAdpater extends BaseAdapter {

    ArrayList<Movies> movies;

    public MoviesCustomAdpater(ArrayList<Movies> movies) {
        this.movies=movies;

    }

    @Override
    public int getCount() {
        return movies.size();
    }

    @Override
    public Movies getItem(int position) {
        return movies.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder viewHolder;
        if(convertView==null){
            convertView= LayoutInflater.from(parent.getContext()).inflate(R.layout.movies_layout, null);
            viewHolder=new ViewHolder(convertView);
            convertView.setTag(viewHolder);

        }
        else
        {
            viewHolder=(ViewHolder) convertView.getTag();
        }

        Movies movies=getItem( position);
        viewHolder.moviesNameTV.setText(movies.getMovieName());
        viewHolder.DescriptionTV.setText(movies.getDescription());
        viewHolder.RatingTV.setText(movies.getRatings());
        viewHolder.ImageTV.setImageResource(movies.getImage_file(position));



        return convertView;

    }

    class ViewHolder{

        TextView moviesNameTV;
        TextView RatingTV;
        TextView DescriptionTV;
        ImageView ImageTV;
        public  ViewHolder(View view)
        {
         moviesNameTV=view.findViewById(R.id.MovieName);
            RatingTV=view.findViewById(R.id.ratings);
            DescriptionTV=view.findViewById(R.id.Description);
                    ImageTV=view.findViewById(R.id.image_view);

        }
    }
}
