/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class CreatePlayAudioInputBuilder {
    //the instance to build
    private CreatePlayAudioInput createPlayAudioInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreatePlayAudioInputBuilder() {
        createPlayAudioInput = new CreatePlayAudioInput();
    }

    /**
     * The unique identifier of each call resource
     */
    public CreatePlayAudioInputBuilder callSid(String callSid) {
        createPlayAudioInput.setCallSid(callSid);
        return this;
    }

    /**
     * URL to sound that should be played. You also can add more than one audio file using semicolons e.g. http://example.com/audio1.mp3;http://example.com/audio2.wav
     */
    public CreatePlayAudioInputBuilder audioUrl(String audioUrl) {
        createPlayAudioInput.setAudioUrl(audioUrl);
        return this;
    }

    /**
     * Time limit in seconds for audio play back
     */
    public CreatePlayAudioInputBuilder length(Integer length) {
        createPlayAudioInput.setLength(length);
        return this;
    }

    /**
     * The leg of the call audio will be played to
     */
    public CreatePlayAudioInputBuilder direction(DirectionEnum direction) {
        createPlayAudioInput.setDirection(direction);
        return this;
    }

    /**
     * Repeat audio playback indefinitely
     */
    public CreatePlayAudioInputBuilder loop(Boolean loop) {
        createPlayAudioInput.setLoop(loop);
        return this;
    }

    /**
     * If false, all other audio will be muted
     */
    public CreatePlayAudioInputBuilder mix(Boolean mix) {
        createPlayAudioInput.setMix(mix);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public CreatePlayAudioInputBuilder responseType(String responseType) {
        createPlayAudioInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreatePlayAudioInput build() {
        return createPlayAudioInput;
    }
}