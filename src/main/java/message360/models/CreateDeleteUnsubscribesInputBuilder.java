/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class CreateDeleteUnsubscribesInputBuilder {
    //the instance to build
    private CreateDeleteUnsubscribesInput createDeleteUnsubscribesInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateDeleteUnsubscribesInputBuilder() {
        createDeleteUnsubscribesInput = new CreateDeleteUnsubscribesInput();
    }

    /**
     * The email to remove from the unsubscribe list
     */
    public CreateDeleteUnsubscribesInputBuilder email(String email) {
        createDeleteUnsubscribesInput.setEmail(email);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public CreateDeleteUnsubscribesInputBuilder responseType(String responseType) {
        createDeleteUnsubscribesInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateDeleteUnsubscribesInput build() {
        return createDeleteUnsubscribesInput;
    }
}