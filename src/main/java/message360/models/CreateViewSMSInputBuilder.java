/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class CreateViewSMSInputBuilder {
    //the instance to build
    private CreateViewSMSInput createViewSMSInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateViewSMSInputBuilder() {
        createViewSMSInput = new CreateViewSMSInput();
    }

    /**
     * Message sid
     */
    public CreateViewSMSInputBuilder messagesid(String messagesid) {
        createViewSMSInput.setMessagesid(messagesid);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public CreateViewSMSInputBuilder responseType(String responseType) {
        createViewSMSInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateViewSMSInput build() {
        return createViewSMSInput;
    }
}