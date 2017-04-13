/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class AddUnsubscribesInputBuilder {
    //the instance to build
    private AddUnsubscribesInput addUnsubscribesInput;

    /**
     * Default constructor to initialize the instance
     */
    public AddUnsubscribesInputBuilder() {
        addUnsubscribesInput = new AddUnsubscribesInput();
    }

    /**
     * The email to add to the unsubscribe list
     */
    public AddUnsubscribesInputBuilder email(String email) {
        addUnsubscribesInput.setEmail(email);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public AddUnsubscribesInputBuilder responseType(String responseType) {
        addUnsubscribesInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public AddUnsubscribesInput build() {
        return addUnsubscribesInput;
    }
}