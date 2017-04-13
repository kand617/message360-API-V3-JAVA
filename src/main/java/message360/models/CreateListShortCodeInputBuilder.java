/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class CreateListShortCodeInputBuilder {
    //the instance to build
    private CreateListShortCodeInput createListShortCodeInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateListShortCodeInputBuilder() {
        createListShortCodeInput = new CreateListShortCodeInput();
    }

    /**
     * Which page of the overall response will be returned. Zero indexed
     */
    public CreateListShortCodeInputBuilder page(Integer page) {
        createListShortCodeInput.setPage(page);
        return this;
    }

    /**
     * Number of individual resources listed in the response per page
     */
    public CreateListShortCodeInputBuilder pagesize(Integer pagesize) {
        createListShortCodeInput.setPagesize(pagesize);
        return this;
    }

    /**
     * Messages sent from this number
     */
    public CreateListShortCodeInputBuilder from(String from) {
        createListShortCodeInput.setFrom(from);
        return this;
    }

    /**
     * Messages sent to this number
     */
    public CreateListShortCodeInputBuilder to(String to) {
        createListShortCodeInput.setTo(to);
        return this;
    }

    /**
     * Only list SMS messages sent in the specified date range
     */
    public CreateListShortCodeInputBuilder datesent(String datesent) {
        createListShortCodeInput.setDatesent(datesent);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public CreateListShortCodeInputBuilder responseType(String responseType) {
        createListShortCodeInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateListShortCodeInput build() {
        return createListShortCodeInput;
    }
}