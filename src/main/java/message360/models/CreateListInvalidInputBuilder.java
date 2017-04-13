/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class CreateListInvalidInputBuilder {
    //the instance to build
    private CreateListInvalidInput createListInvalidInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateListInvalidInputBuilder() {
        createListInvalidInput = new CreateListInvalidInput();
    }

    /**
     * Response type format xml or json
     */
    public CreateListInvalidInputBuilder responseType(String responseType) {
        createListInvalidInput.setResponseType(responseType);
        return this;
    }

    /**
     * Starting record for listing out emails
     */
    public CreateListInvalidInputBuilder offet(String offet) {
        createListInvalidInput.setOffet(offet);
        return this;
    }

    /**
     * Maximum number of records to return
     */
    public CreateListInvalidInputBuilder limit(String limit) {
        createListInvalidInput.setLimit(limit);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateListInvalidInput build() {
        return createListInvalidInput;
    }
}