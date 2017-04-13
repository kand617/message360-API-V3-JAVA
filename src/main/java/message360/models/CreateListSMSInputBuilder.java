/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class CreateListSMSInputBuilder {
    //the instance to build
    private CreateListSMSInput createListSMSInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateListSMSInputBuilder() {
        createListSMSInput = new CreateListSMSInput();
    }

    /**
     * Which page of the overall response will be returned. Zero indexed
     */
    public CreateListSMSInputBuilder page(Integer page) {
        createListSMSInput.setPage(page);
        return this;
    }

    /**
     * Number of individual resources listed in the response per page
     */
    public CreateListSMSInputBuilder pagesize(Integer pagesize) {
        createListSMSInput.setPagesize(pagesize);
        return this;
    }

    /**
     * Messages sent from this number
     */
    public CreateListSMSInputBuilder from(String from) {
        createListSMSInput.setFrom(from);
        return this;
    }

    /**
     * Messages sent to this number
     */
    public CreateListSMSInputBuilder to(String to) {
        createListSMSInput.setTo(to);
        return this;
    }

    /**
     * Only list SMS messages sent in the specified date range
     */
    public CreateListSMSInputBuilder datesent(String datesent) {
        createListSMSInput.setDatesent(datesent);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public CreateListSMSInputBuilder responseType(String responseType) {
        createListSMSInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateListSMSInput build() {
        return createListSMSInput;
    }
}