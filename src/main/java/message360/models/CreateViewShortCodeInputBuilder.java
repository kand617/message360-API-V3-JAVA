/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class CreateViewShortCodeInputBuilder {
    //the instance to build
    private CreateViewShortCodeInput createViewShortCodeInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateViewShortCodeInputBuilder() {
        createViewShortCodeInput = new CreateViewShortCodeInput();
    }

    /**
     * Message sid
     */
    public CreateViewShortCodeInputBuilder messagesid(String messagesid) {
        createViewShortCodeInput.setMessagesid(messagesid);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public CreateViewShortCodeInputBuilder responseType(String responseType) {
        createViewShortCodeInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateViewShortCodeInput build() {
        return createViewShortCodeInput;
    }
}