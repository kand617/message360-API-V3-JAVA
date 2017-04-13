/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class CreateVoiceEffectInputBuilder {
    //the instance to build
    private CreateVoiceEffectInput createVoiceEffectInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateVoiceEffectInputBuilder() {
        createVoiceEffectInput = new CreateVoiceEffectInput();
    }

    public CreateVoiceEffectInputBuilder callSid(String callSid) {
        createVoiceEffectInput.setCallSid(callSid);
        return this;
    }

    public CreateVoiceEffectInputBuilder audioDirection(AudioDirectionEnum audioDirection) {
        createVoiceEffectInput.setAudioDirection(audioDirection);
        return this;
    }

    /**
     * value between -14 and 14
     */
    public CreateVoiceEffectInputBuilder pitchSemiTones(Double pitchSemiTones) {
        createVoiceEffectInput.setPitchSemiTones(pitchSemiTones);
        return this;
    }

    /**
     * value between -1 and 1
     */
    public CreateVoiceEffectInputBuilder pitchOctaves(Double pitchOctaves) {
        createVoiceEffectInput.setPitchOctaves(pitchOctaves);
        return this;
    }

    /**
     * value greater than 0
     */
    public CreateVoiceEffectInputBuilder pitch(Double pitch) {
        createVoiceEffectInput.setPitch(pitch);
        return this;
    }

    /**
     * value greater than 0
     */
    public CreateVoiceEffectInputBuilder rate(Double rate) {
        createVoiceEffectInput.setRate(rate);
        return this;
    }

    /**
     * value greater than 0
     */
    public CreateVoiceEffectInputBuilder tempo(Double tempo) {
        createVoiceEffectInput.setTempo(tempo);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public CreateVoiceEffectInputBuilder responseType(String responseType) {
        createVoiceEffectInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateVoiceEffectInput build() {
        return createVoiceEffectInput;
    }
}