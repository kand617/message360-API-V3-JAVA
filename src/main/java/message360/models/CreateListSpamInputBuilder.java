/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class CreateListSpamInputBuilder {
    //the instance to build
    private CreateListSpamInput createListSpamInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateListSpamInputBuilder() {
        createListSpamInput = new CreateListSpamInput();
    }

    /**
     * Response type format xml or json
     */
    public CreateListSpamInputBuilder responseType(String responseType) {
        createListSpamInput.setResponseType(responseType);
        return this;
    }

    /**
     * The record number to start the list at
     */
    public CreateListSpamInputBuilder offset(String offset) {
        createListSpamInput.setOffset(offset);
        return this;
    }

    /**
     * Maximum number of records to return
     */
    public CreateListSpamInputBuilder limit(String limit) {
        createListSpamInput.setLimit(limit);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateListSpamInput build() {
        return createListSpamInput;
    }
}