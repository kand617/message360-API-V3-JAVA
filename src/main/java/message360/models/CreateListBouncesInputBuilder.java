/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class CreateListBouncesInputBuilder {
    //the instance to build
    private CreateListBouncesInput createListBouncesInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateListBouncesInputBuilder() {
        createListBouncesInput = new CreateListBouncesInput();
    }

    /**
     * Response type format xml or json
     */
    public CreateListBouncesInputBuilder responseType(String responseType) {
        createListBouncesInput.setResponseType(responseType);
        return this;
    }

    /**
     * The record to start the list at
     */
    public CreateListBouncesInputBuilder offset(String offset) {
        createListBouncesInput.setOffset(offset);
        return this;
    }

    /**
     * The maximum number of records to return
     */
    public CreateListBouncesInputBuilder limit(String limit) {
        createListBouncesInput.setLimit(limit);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateListBouncesInput build() {
        return createListBouncesInput;
    }
}