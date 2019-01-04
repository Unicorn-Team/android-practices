package com.example.liushukun.examone.Adapter.Entrance.Main;

import java.util.ArrayList;
import java.util.HashMap;

public class CardListAdapterModel {
    private ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();
    private String[] strings = {"head", "title", "author", "content"};

    private void getMockList() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("type", "0");
        map.put("photo", "Photo | Liu Yanzu");
        map.put("slogan", "Legends never die! This world need more heroes!");
        map.put("author", "Lu Xun");
        list.add(0, map);

        map = new HashMap<String, String>();
        map.put("type", "1");
        map.put("head", "- ONE STORY -");
        map.put("title", "第三人称");
        map.put("author", "词 / 刘书昆");
        map.put("content", "她想知道那是谁，为何总沉默寡言，人群中也算抢眼，抢眼的孤独难免。快乐当然多一点，也许寂寞更强烈，难过时候不流泪，流泪也不算伤悲。天真以为是他的独特品味，殊不知是他，难以言喻的对决。");
        map.put("time", "今天");

        list.add(1, map);
    }

    public ArrayList<HashMap<String, String>> getList() {
        return this.list;
    }

//    public static updateItemList() {
//        HashMap<String, String> map = new HashMap<String, String>();
//        map.put("type", "0");
//        map.put("photo", "Photo | Liu Yanzu");
//        map.put("slogan", "Legends never die! This world need more heroes!");
//        map.put("author", "Lu Xun");
//        this.list.add(0, map);
//
//        map = new HashMap<String, String>();
//        map.put("type", "1");
//        map.put("head", "- ONE STORY -");
//        map.put("title", "第三人称");
//        map.put("author", "词 / 刘书昆");
//        map.put("content", "她想知道那是谁，为何总沉默寡言，人群中也算抢眼，抢眼的孤独难免。快乐当然多一点，也许寂寞更强烈，难过时候不流泪，流泪也不算伤悲。天真以为是他的独特品味，殊不知是他，难以言喻的对决。");
//        map.put("time", "今天");
//
//        this.list.add(1, map);
//    }

    public String[] getStrings() {
        return strings;
    }
}
