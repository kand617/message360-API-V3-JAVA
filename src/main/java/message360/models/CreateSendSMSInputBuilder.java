/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class CreateSendSMSInputBuilder {
    //the instance to build
    private CreateSendSMSInput createSendSMSInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateSendSMSInputBuilder() {
        createSendSMSInput = new CreateSendSMSInput();
    }

    /**
     * From Country Code
     */
    public CreateSendSMSInputBuilder fromcountrycode(int fromcountrycode) {
        createSendSMSInput.setFromcountrycode(fromcountrycode);
        return this;
    }

    /**
     * SMS enabled Message360 number to send this message from
     */
    public CreateSendSMSInputBuilder from(String from) {
        createSendSMSInput.setFrom(from);
        return this;
    }

    /**
     * To country code
     */
    public CreateSendSMSInputBuilder tocountrycode(int tocountrycode) {
        createSendSMSInput.setTocountrycode(tocountrycode);
        return this;
    }

    /**
     * Number to send the SMS to
     */
    public CreateSendSMSInputBuilder to(String to) {
        createSendSMSInput.setTo(to);
        return this;
    }

    /**
     * Text Message To Send
     */
    public CreateSendSMSInputBuilder body(String body) {
        createSendSMSInput.setBody(body);
        return this;
    }

    /**
     * Specifies the HTTP method used to request the required URL once SMS sent.
     */
    public CreateSendSMSInputBuilder method(HttpActionEnum method) {
        createSendSMSInput.setMethod(method);
        return this;
    }

    /**
     * URL that can be requested to receive notification when SMS has Sent. A set of default parameters will be sent here once the SMS is finished.
     */
    public CreateSendSMSInputBuilder messagestatuscallback(String messagestatuscallback) {
        createSendSMSInput.setMessagestatuscallback(messagestatuscallback);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public CreateSendSMSInputBuilder responseType(String responseType) {
        createSendSMSInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateSendSMSInput build() {
        return createSendSMSInput;
    }
}