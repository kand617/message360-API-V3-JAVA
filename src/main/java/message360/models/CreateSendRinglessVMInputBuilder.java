/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class CreateSendRinglessVMInputBuilder {
    //the instance to build
    private CreateSendRinglessVMInput createSendRinglessVMInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateSendRinglessVMInputBuilder() {
        createSendRinglessVMInput = new CreateSendRinglessVMInput();
    }

    /**
     * From country code
     */
    public CreateSendRinglessVMInputBuilder fromCountryCode(String fromCountryCode) {
        createSendRinglessVMInput.setFromCountryCode(fromCountryCode);
        return this;
    }

    /**
     * This number to display on Caller ID as calling
     */
    public CreateSendRinglessVMInputBuilder from(String from) {
        createSendRinglessVMInput.setFrom(from);
        return this;
    }

    /**
     * To country code
     */
    public CreateSendRinglessVMInputBuilder toCountryCode(String toCountryCode) {
        createSendRinglessVMInput.setToCountryCode(toCountryCode);
        return this;
    }

    /**
     * To number
     */
    public CreateSendRinglessVMInputBuilder to(String to) {
        createSendRinglessVMInput.setTo(to);
        return this;
    }

    /**
     * URL to an audio file
     */
    public CreateSendRinglessVMInputBuilder voiceMailURL(String voiceMailURL) {
        createSendRinglessVMInput.setVoiceMailURL(voiceMailURL);
        return this;
    }

    /**
     * Not currently used in this version
     */
    public CreateSendRinglessVMInputBuilder method(String method) {
        createSendRinglessVMInput.setMethod(method);
        return this;
    }

    /**
     * URL to post the status of the Ringless request
     */
    public CreateSendRinglessVMInputBuilder statusCallBackUrl(String statusCallBackUrl) {
        createSendRinglessVMInput.setStatusCallBackUrl(statusCallBackUrl);
        return this;
    }

    /**
     * POST or GET
     */
    public CreateSendRinglessVMInputBuilder statsCallBackMethod(String statsCallBackMethod) {
        createSendRinglessVMInput.setStatsCallBackMethod(statsCallBackMethod);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public CreateSendRinglessVMInputBuilder responseType(String responseType) {
        createSendRinglessVMInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateSendRinglessVMInput build() {
        return createSendRinglessVMInput;
    }
}