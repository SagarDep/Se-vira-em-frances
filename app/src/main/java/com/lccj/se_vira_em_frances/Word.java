package com.lccj.se_vira_em_frances;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains resource IDs for the default translation, French translation, audio file, and
 * optional image file for that word.
 */
public class Word {

    /** String resource ID for the default translation of the word */
    private int defaultTranslationId;

    /** String resource ID for the French translation of the word */
    private int frenchTranslationId;

    /** Image resource ID for the word */
    private int imageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;


    /**
     * Create a new Word object.
     *
     * @param defaultTranslationId is the string resource ID for the word in a language that the
     *                             user is already familiar with (such as English)
     * @param frenchTranslationId is the string resource Id for the word in the French language
     * @param imageResourceId is the drawable resource ID for the image associated with the word
     */
    public Word(int defaultTranslationId, int frenchTranslationId, int imageResourceId) {
        this.defaultTranslationId = defaultTranslationId;
        this.frenchTranslationId = frenchTranslationId;
        this.imageResourceId = imageResourceId;
    }

    public Word(int defaultTranslationId, int frenchTranslationId) {
        this.defaultTranslationId = defaultTranslationId;
        this.frenchTranslationId = frenchTranslationId;
    }

    /**
     * Get the string resource ID for the default translation of the word.
     */
    public int getDefaultTranslationId() {
        return defaultTranslationId;
    }

    /**
     * Get the string resource ID for the French translation of the word.
     */
    public int getFrenchTranslationId() {
        return frenchTranslationId;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return imageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return imageResourceId != NO_IMAGE_PROVIDED;
    }

}