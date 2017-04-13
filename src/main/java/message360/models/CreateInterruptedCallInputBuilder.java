/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class CreateInterruptedCallInputBuilder {
    //the instance to build
    private CreateInterruptedCallInput createInterruptedCallInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateInterruptedCallInputBuilder() {
        createInterruptedCallInput = new CreateInterruptedCallInput();
    }

    /**
     * Call SId
     */
    public CreateInterruptedCallInputBuilder callSid(String callSid) {
        createInterruptedCallInput.setCallSid(callSid);
        return this;
    }

    /**
     * URL the in-progress call will be redirected to
     */
    public CreateInterruptedCallInputBuilder url(String url) {
        createInterruptedCallInput.setUrl(url);
        return this;
    }

    /**
     * The method used to request the above Url parameter
     */
    public CreateInterruptedCallInputBuilder method(HttpActionEnum method) {
        createInterruptedCallInput.setMethod(method);
        return this;
    }

    /**
     * Status to set the in-progress call to
     */
    public CreateInterruptedCallInputBuilder status(InterruptedCallStatusEnum status) {
        createInterruptedCallInput.setStatus(status);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public CreateInterruptedCallInputBuilder responseType(String responseType) {
        createInterruptedCallInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateInterruptedCallInput build() {
        return createInterruptedCallInput;
    }
}