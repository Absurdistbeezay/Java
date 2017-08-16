package com.hfad.favoritemovies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class GetFavMovie extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_fav_movie);
    }

    public void onClickGetFavMovie(View view){
        TextView movies = (TextView) findViewById(R.id.movies);
        Spinner favorites = (Spinner) findViewById(R.id.favorites);

        String movieType = String.valueOf(favorites.getSelectedItem());

       movies.setText(movieType);
    }
}
