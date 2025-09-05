package com.example.video;

import java.nio.file.Path;

public class VideoPipelineFacade {

    java.nio.file.Path process(java.nio.file.Path src, java.nio.file.Path out, boolean gray, Double scale,
            Integer sharpenStrength) {
        Decoder dec = new Decoder();
        FilterEngine fe = new FilterEngine();
        Encoder enc = new Encoder();
        SharpenAdapter sa = new SharpenAdapter();

        Frame[] frames = dec.decode(Path.of("in.mp4"));
        if (gray) {
            frames = fe.grayscale(frames);
        }
        if (scale != null) {
            frames = fe.scale(frames, scale);
        }
        if (sharpenStrength != null) {
            frames = sa.applySharpen(frames, sharpenStrength);
        }

        // Legacy filter not used due to odd API
        out = enc.encode(frames, Path.of("out.mp4"));
        System.out.println("Wrote " + out);
        return out;
    }
}
