/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class CreateSendEmailInputBuilder {
    //the instance to build
    private CreateSendEmailInput createSendEmailInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateSendEmailInputBuilder() {
        createSendEmailInput = new CreateSendEmailInput();
    }

    /**
     * The to email address
     */
    public CreateSendEmailInputBuilder to(String to) {
        createSendEmailInput.setTo(to);
        return this;
    }

    /**
     * The from email address
     */
    public CreateSendEmailInputBuilder from(String from) {
        createSendEmailInput.setFrom(from);
        return this;
    }

    /**
     * email format type, html or text
     */
    public CreateSendEmailInputBuilder type(SendEmailAsEnum type) {
        createSendEmailInput.setType(type);
        return this;
    }

    /**
     * Email subject
     */
    public CreateSendEmailInputBuilder subject(String subject) {
        createSendEmailInput.setSubject(subject);
        return this;
    }

    /**
     * The body of the email message
     */
    public CreateSendEmailInputBuilder message(String message) {
        createSendEmailInput.setMessage(message);
        return this;
    }

    /**
     * CC Email address
     */
    public CreateSendEmailInputBuilder cc(String cc) {
        createSendEmailInput.setCc(cc);
        return this;
    }

    /**
     * BCC Email address
     */
    public CreateSendEmailInputBuilder bcc(String bcc) {
        createSendEmailInput.setBcc(bcc);
        return this;
    }

    /**
     * File to be attached.File must be less than 7MB.
     */
    public CreateSendEmailInputBuilder attachment(String attachment) {
        createSendEmailInput.setAttachment(attachment);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public CreateSendEmailInputBuilder responseType(String responseType) {
        createSendEmailInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateSendEmailInput build() {
        return createSendEmailInput;
    }
}