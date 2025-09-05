package com.example.render;

import java.util.HashMap;
import java.util.Map;

public class TextStyleFactory{
    Map<String, TextStyle> styles = new HashMap<>();
    
    public TextStyle getTextStyle(String font, int size, boolean bold) {
        String key = font + "|" + size + "|" + (bold ? "B" : "N");
        if (!styles.containsKey(key)) {
            styles.put(key, new TextStyle(font, size, bold));
        }
        return styles.get(key);
    }
    
}
