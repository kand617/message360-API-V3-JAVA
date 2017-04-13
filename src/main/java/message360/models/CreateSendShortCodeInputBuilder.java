/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class CreateSendShortCodeInputBuilder {
    //the instance to build
    private CreateSendShortCodeInput createSendShortCodeInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateSendShortCodeInputBuilder() {
        createSendShortCodeInput = new CreateSendShortCodeInput();
    }

    /**
     * The Short Code number that is the sender of this message
     */
    public CreateSendShortCodeInputBuilder shortcode(String shortcode) {
        createSendShortCodeInput.setShortcode(shortcode);
        return this;
    }

    /**
     * The country code for sending this message
     */
    public CreateSendShortCodeInputBuilder tocountrycode(String tocountrycode) {
        createSendShortCodeInput.setTocountrycode(tocountrycode);
        return this;
    }

    /**
     * A valid 10-digit number that should receive the message+
     */
    public CreateSendShortCodeInputBuilder to(String to) {
        createSendShortCodeInput.setTo(to);
        return this;
    }

    /**
     * The unique identifier for the template used for the message
     */
    public CreateSendShortCodeInputBuilder templateid(UUID templateid) {
        createSendShortCodeInput.setTemplateid(templateid);
        return this;
    }

    /**
     * Specifies the HTTP method used to request the required URL once the Short Code message is sent.
     */
    public CreateSendShortCodeInputBuilder method(String method) {
        createSendShortCodeInput.setMethod(method);
        return this;
    }

    /**
     * URL that can be requested to receive notification when Short Code message was sent.
     */
    public CreateSendShortCodeInputBuilder messageStatusCallback(String messageStatusCallback) {
        createSendShortCodeInput.setMessageStatusCallback(messageStatusCallback);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public CreateSendShortCodeInputBuilder responseType(String responseType) {
        createSendShortCodeInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateSendShortCodeInput build() {
        return createSendShortCodeInput;
    }
}