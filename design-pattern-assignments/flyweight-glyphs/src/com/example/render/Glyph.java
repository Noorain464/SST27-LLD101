package com.example.render;

public class Glyph{
    // Smell: style stored per instance → not memory efficient
    char ch;
    TextStyle style;

    public Glyph(char ch, TextStyle style) {
        this.ch = ch; 
        this.style = style;
    }

    public int drawCost() { return style.size + (style.bold ? 10 : 0); }
    public char getCh() { return ch; }
    public TextStyle getStyle() { return style; }
    // public String getFont() { return font; }
    // public int getSize() { return size; }
    // public boolean isBold() { return bold; }
}
