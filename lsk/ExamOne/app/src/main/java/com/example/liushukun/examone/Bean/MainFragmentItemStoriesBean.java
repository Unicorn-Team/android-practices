package com.example.liushukun.examone.Bean;

import java.util.List;

public class MainFragmentItemStoriesBean {
    /**
     * title : 不再穿得自以为帅气，是新年第一天最该学会的
     * ga_prefix : 123119
     * images : ["https://pic2.zhimg.com/v2-3655d7266128e28bd3e0c89cb2c08ea9.jpg"]
     * multipic : true
     * type : 0
     * id : 9704699
     */

    private String title;
    private String ga_prefix;
    private boolean multipic;
    private int type;
    private int id;
    private List<String> images;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGa_prefix() {
        return ga_prefix;
    }

    public void setGa_prefix(String ga_prefix) {
        this.ga_prefix = ga_prefix;
    }

    public boolean isMultipic() {
        return multipic;
    }

    public void setMultipic(boolean multipic) {
        this.multipic = multipic;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }
}
