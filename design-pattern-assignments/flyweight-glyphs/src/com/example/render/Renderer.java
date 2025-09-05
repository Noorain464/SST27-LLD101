package com.example.render;

public class Renderer {
    TextStyleFactory factory = new TextStyleFactory();
    public int render(String text) {
        int cost = 0;
         TextStyle style = factory.getTextStyle("Inter", 14, true);
        for (char c : text.toCharArray()) {
            Glyph g = new Glyph(c,style); // TODO: refactor with TextStyle flyweights
            cost += g.drawCost();
        }
        return cost;
    }
}
