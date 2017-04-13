/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class CreateListInboundShortCodeInputBuilder {
    //the instance to build
    private CreateListInboundShortCodeInput createListInboundShortCodeInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateListInboundShortCodeInputBuilder() {
        createListInboundShortCodeInput = new CreateListInboundShortCodeInput();
    }

    /**
     * Which page of the overall response will be returned. Zero indexed
     */
    public CreateListInboundShortCodeInputBuilder page(Integer page) {
        createListInboundShortCodeInput.setPage(page);
        return this;
    }

    /**
     * Number of individual resources listed in the response per page
     */
    public CreateListInboundShortCodeInputBuilder pagesize(Integer pagesize) {
        createListInboundShortCodeInput.setPagesize(pagesize);
        return this;
    }

    /**
     * From Number to Inbound ShortCode
     */
    public CreateListInboundShortCodeInputBuilder from(String from) {
        createListInboundShortCodeInput.setFrom(from);
        return this;
    }

    /**
     * Only list messages sent to this Short Code
     */
    public CreateListInboundShortCodeInputBuilder shortcode(String shortcode) {
        createListInboundShortCodeInput.setShortcode(shortcode);
        return this;
    }

    /**
     * Only list messages sent with the specified date
     */
    public CreateListInboundShortCodeInputBuilder dateReceived(String dateReceived) {
        createListInboundShortCodeInput.setDateReceived(dateReceived);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public CreateListInboundShortCodeInputBuilder responseType(String responseType) {
        createListInboundShortCodeInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateListInboundShortCodeInput build() {
        return createListInboundShortCodeInput;
    }
}