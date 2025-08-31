package com.example.config;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;

/**
 * FAULTY "Singleton": public constructor, getInstance() returns a NEW instance each time,
 * not thread-safe, reload allowed anytime, mutable global state, reflection+serialization-friendly.
 */
public class AppSettings implements Serializable {
    private final Properties props = new Properties();
    private static volatile AppSettings appSettings;
    // public AppSettings() { } // should not be public for true singleton
    private AppSettings() { } // private constructor

    public static AppSettings getInstance() {
        if(appSettings == null) {
            synchronized (AppSettings.class) {
                if(appSettings == null) {
                    appSettings = new AppSettings();
                }
            }
        }
        // return new AppSettings(); // returns a fresh instance (bug)
        return appSettings;
    }

    public void loadFromFile(Path file) {
        try (InputStream in = Files.newInputStream(file)) {
            props.load(in);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    public String get(String key) {
        return props.getProperty(key);
    }
}
