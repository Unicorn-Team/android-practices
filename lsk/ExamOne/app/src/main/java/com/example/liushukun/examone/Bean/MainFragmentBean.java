package com.example.liushukun.examone.Bean;

import java.util.List;

public class MainFragmentBean {

    /**
     * date : 20181231
     * stories : [{"title":"不再穿得自以为帅气，是新年第一天最该学会的","ga_prefix":"123119","images":["https://pic2.zhimg.com/v2-3655d7266128e28bd3e0c89cb2c08ea9.jpg"],"multipic":true,"type":0,"id":9704699},{"title":"买波音还是买空客？航空公司们是这么博弈的","ga_prefix":"123116","images":["https://pic3.zhimg.com/v2-bdd42bc32f971a9bec35b036b7f184de.jpg"],"multipic":true,"type":0,"id":9683388},{"images":["https://pic2.zhimg.com/v2-5bfe39b72de4cf38bdb4720181f2f3e9.jpg"],"type":0,"id":9677384,"ga_prefix":"123112","title":"大误 · 雾城事"},{"title":"风光摄影的 PS 痕迹这么明显，是不是违背了摄影的初衷？","ga_prefix":"123110","images":["https://pic4.zhimg.com/v2-706d61874476d738906c2715cb9af0d7.jpg"],"multipic":true,"type":0,"id":9704340},{"images":["https://pic4.zhimg.com/v2-b5fe9bce7f4ddbdd79b1234d7b4b24c3.jpg"],"type":0,"id":9704608,"ga_prefix":"123108","title":"为什么男生不愿意追女生了？因为在这样的社会中别无选择"},{"images":["https://pic1.zhimg.com/v2-ff3cfaefa181a05f5d84adbf83b3a3d4.jpg"],"type":0,"id":9704192,"ga_prefix":"123107","title":"资深口腔溃疡患者告诉你，这病治不好"},{"title":"2018 年度盘点 · 这些科幻小说，真的很棒 / 很烂","ga_prefix":"123107","images":["https://pic4.zhimg.com/v2-3d8c922b333d099e37588075e11707d7.jpg"],"multipic":true,"type":0,"id":9704787},{"images":["https://pic4.zhimg.com/v2-b16f16c9af8da14a7aa8593a8cf8bb47.jpg"],"type":0,"id":9696898,"ga_prefix":"123106","title":"瞎扯 · 如何正确地吐槽"},{"images":["https://pic2.zhimg.com/v2-df5ac675c0ae66e2036d3e5a6b3a1d99.jpg"],"type":0,"id":9704778,"ga_prefix":"123100","title":"特别版大误 · 今年下半年的最后一天，我们终于等到了它"}]
     * top_stories : [{"image":"https://pic2.zhimg.com/v2-a7dd3477801941b15ff051cf5f4b537d.jpg","type":0,"id":9683388,"ga_prefix":"123116","title":"买波音还是买空客？航空公司们是这么博弈的"},{"image":"https://pic1.zhimg.com/v2-462170039089fccf8721d147a1bc58f8.jpg","type":0,"id":9704787,"ga_prefix":"123107","title":"2018 年度盘点 · 这些科幻小说，真的很棒 / 很烂"},{"image":"https://pic4.zhimg.com/v2-4daf67bb9962d7f938a95bfd41903363.jpg","type":0,"id":9704778,"ga_prefix":"123100","title":"特别版大误 · 今年下半年的最后一天，我们终于等到了它"},{"image":"https://pic1.zhimg.com/v2-71bbeea1b33d1406b0670a4af00ddcac.jpg","type":0,"id":9704295,"ga_prefix":"123021","title":"我给这部电影半颗星，只因它竟然拍出来了"},{"image":"https://pic3.zhimg.com/v2-6cf6cda2255a296210eaca6ca1bd3e4e.jpg","type":0,"id":9704608,"ga_prefix":"123108","title":"为什么男生不愿意追女生了？因为在这样的社会中别无选择"}]
     */

    private String date;
    private List<MainFragmentItemStoriesBean> stories;
    private List<MainFragmentItemTopStoriesBean> top_stories;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<MainFragmentItemStoriesBean> getStories() {
        return stories;
    }

    public void setStories(List<MainFragmentItemStoriesBean> stories) {
        this.stories = stories;
    }

    public List<MainFragmentItemTopStoriesBean> getTop_stories() {
        return top_stories;
    }

    public void setTop_stories(List<MainFragmentItemTopStoriesBean> top_stories) {
        this.top_stories = top_stories;
    }
}
