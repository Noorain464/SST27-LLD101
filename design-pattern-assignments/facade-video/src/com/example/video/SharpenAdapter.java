package com.example.video;

public class SharpenAdapter {
    LegacySharpen legacySharpen = new LegacySharpen();
    public Frame[] applySharpen(Frame[] frames, int strength) {
        String handle = "HANDLE:0"; 
        handle = legacySharpen.applySharpen(handle, strength);
        return frames;
    }
}
