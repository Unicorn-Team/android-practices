package com.example.nova.novanews.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();


    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String cardCategory;
        public final String cardTitle;
        public final String cardSubTitle;
        public final String posterUrl;
        public final String cardDesc;
        public final String cardTime;

        public DummyItem(String cardCategory, String cardTitle, String cardSubTitle, String posterUrl, String cardDesc, String cardTime) {
            this.cardCategory = cardCategory;
            this.cardTitle = cardTitle;
            this.cardSubTitle = cardSubTitle;
            this.posterUrl = posterUrl;
            this.cardDesc = cardDesc;
            this.cardTime = cardTime;
        }
    }
}
