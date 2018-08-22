package com.example.liushukun.examone.Adapter.Entrance.Main;

import java.util.ArrayList;
import java.util.HashMap;

public class CardListAdapterModel {
    private ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();
    private String[] strings = {"head", "title", "author", "content"};

    public CardListAdapterModel() {
        mockList();
    }

    private void mockList() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("head", "- ONE STORY -");
        map.put("title", "第三人称");
        map.put("author", "词 / 刘书昆");
        map.put("content", "她想知道那是谁，为何总沉默寡言，人群中也算抢眼，抢眼的孤独难免。快乐当然多一点，也许寂寞更强烈，难过时候不流泪，流泪也不算伤悲。天真以为是他的独特品味，殊不知是他，难以言喻的对决。");
        map.put("time", "今天");

        list.add(0, map);
    }

    public ArrayList<HashMap<String, String>> getList() {
        return list;
    }

    public String[] getStrings() {
        return strings;
    }
}
