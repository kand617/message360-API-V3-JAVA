/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class CreateListInboundSMSInputBuilder {
    //the instance to build
    private CreateListInboundSMSInput createListInboundSMSInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateListInboundSMSInputBuilder() {
        createListInboundSMSInput = new CreateListInboundSMSInput();
    }

    /**
     * Which page of the overall response will be returned. Zero indexed
     */
    public CreateListInboundSMSInputBuilder page(Integer page) {
        createListInboundSMSInput.setPage(page);
        return this;
    }

    /**
     * Number of individual resources listed in the response per page
     */
    public CreateListInboundSMSInputBuilder pagesize(String pagesize) {
        createListInboundSMSInput.setPagesize(pagesize);
        return this;
    }

    /**
     * From Number to Inbound SMS
     */
    public CreateListInboundSMSInputBuilder from(String from) {
        createListInboundSMSInput.setFrom(from);
        return this;
    }

    /**
     * To Number to get Inbound SMS
     */
    public CreateListInboundSMSInputBuilder to(String to) {
        createListInboundSMSInput.setTo(to);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public CreateListInboundSMSInputBuilder responseType(String responseType) {
        createListInboundSMSInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateListInboundSMSInput build() {
        return createListInboundSMSInput;
    }
}