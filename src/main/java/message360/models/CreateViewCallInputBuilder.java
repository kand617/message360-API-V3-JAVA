/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class CreateViewCallInputBuilder {
    //the instance to build
    private CreateViewCallInput createViewCallInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateViewCallInputBuilder() {
        createViewCallInput = new CreateViewCallInput();
    }

    /**
     * Call Sid id for particular Call
     */
    public CreateViewCallInputBuilder callsid(String callsid) {
        createViewCallInput.setCallsid(callsid);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public CreateViewCallInputBuilder responseType(String responseType) {
        createViewCallInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateViewCallInput build() {
        return createViewCallInput;
    }
}