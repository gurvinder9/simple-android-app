package com.wmi.simplefunfacts;

public class NativeWord {
    private String defaultTranslation;
    private String translatedWord;

    public NativeWord(String defaultTranslation, String translatedWord) {
        this.defaultTranslation = defaultTranslation;
        this.translatedWord = translatedWord;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    public String getTranslatedWord() {
        return translatedWord;
    }
}
