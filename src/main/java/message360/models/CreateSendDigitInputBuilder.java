/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class CreateSendDigitInputBuilder {
    //the instance to build
    private CreateSendDigitInput createSendDigitInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateSendDigitInputBuilder() {
        createSendDigitInput = new CreateSendDigitInput();
    }

    /**
     * The unique identifier of each call resource
     */
    public CreateSendDigitInputBuilder callSid(String callSid) {
        createSendDigitInput.setCallSid(callSid);
        return this;
    }

    /**
     * DTMF digits to play to the call. 0-9, #, *, W, or w
     */
    public CreateSendDigitInputBuilder playDtmf(String playDtmf) {
        createSendDigitInput.setPlayDtmf(playDtmf);
        return this;
    }

    /**
     * The leg of the call DTMF digits should be sent to
     */
    public CreateSendDigitInputBuilder playDtmfDirection(DirectionEnum playDtmfDirection) {
        createSendDigitInput.setPlayDtmfDirection(playDtmfDirection);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public CreateSendDigitInputBuilder responseType(String responseType) {
        createSendDigitInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateSendDigitInput build() {
        return createSendDigitInput;
    }
}