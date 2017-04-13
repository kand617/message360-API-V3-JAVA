/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class CreateListCallsInputBuilder {
    //the instance to build
    private CreateListCallsInput createListCallsInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateListCallsInputBuilder() {
        createListCallsInput = new CreateListCallsInput();
    }

    /**
     * Which page of the overall response will be returned. Zero indexed
     */
    public CreateListCallsInputBuilder page(Integer page) {
        createListCallsInput.setPage(page);
        return this;
    }

    /**
     * Number of individual resources listed in the response per page
     */
    public CreateListCallsInputBuilder pageSize(Integer pageSize) {
        createListCallsInput.setPageSize(pageSize);
        return this;
    }

    /**
     * Only list calls to this number
     */
    public CreateListCallsInputBuilder to(String to) {
        createListCallsInput.setTo(to);
        return this;
    }

    /**
     * Only list calls from this number
     */
    public CreateListCallsInputBuilder from(String from) {
        createListCallsInput.setFrom(from);
        return this;
    }

    /**
     * Only list calls starting within the specified date range
     */
    public CreateListCallsInputBuilder dateCreated(String dateCreated) {
        createListCallsInput.setDateCreated(dateCreated);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public CreateListCallsInputBuilder responseType(String responseType) {
        createListCallsInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateListCallsInput build() {
        return createListCallsInput;
    }
}