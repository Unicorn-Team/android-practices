package com.example.nova.novanews;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.nova.novanews.dummy.DummyContent;
import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;


public class OneFragment extends Fragment {
    RecyclerView mRecyclerView;
    List<DummyContent.DummyItem> dummyItems;

    Handler handler = new Handler();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_one, container, false);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.list);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));

        initializeData();
        mRecyclerView.setAdapter(new MyItemRecyclerViewAdapter(dummyItems, null));
        return view;
    }

    private void initializeData() {
        dummyItems = new ArrayList<>();
        new Thread() {
            public void run() {
                try {
                    String movieResult = GetData.getMovieData("https://api.douban.com/v2/movie/in_theaters?apikey=0b2bdeda43b5688921839c8ecb20399b&city=%E5%8C%97%E4%BA%AC&start=0&count=100&client=somemessage&udid=dddddddddddddddddddddd");
                    JSONObject jsonObject = new JSONObject(movieResult);
                    final JSONArray subjectsArray = jsonObject.optJSONArray("subjects");
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            for(int i = 0; i<subjectsArray.length(); i++) {
                                JSONObject eachMovie = subjectsArray.optJSONObject(i);
                                String movieTitle = eachMovie.optString("original_title");
                                String publishDate = eachMovie.optString("mainland_pubdate");
                                JSONArray directors = eachMovie.optJSONArray("directors");
                                JSONObject director = directors.optJSONObject(0);
                                String directorName = director.optString("name");
                                JSONObject posters = eachMovie.optJSONObject("images");
                                String posterUrl = posters.optString("large");
                                JSONArray genres = eachMovie.optJSONArray("genres");
                                String genresString = "";
                                for(int j = 0;j<genres.length(); j++) {
                                    genresString = genres.optString(j) + " ";
                                }
                                JSONArray actors = eachMovie.optJSONArray("casts");
                                String actorName = "";
                                for(int k = 0; k<actors.length(); k++) {
                                    JSONObject actorObject = actors.optJSONObject(k);
                                    actorName = actorObject.optString("name") + " ";

                                }
                                dummyItems.add(new DummyContent.DummyItem(genresString, movieTitle, directorName, posterUrl, actorName, publishDate));
                                mRecyclerView.setAdapter(new MyItemRecyclerViewAdapter(dummyItems, null));
                            }
                        }
                    });


                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }.start();

    }
}
