/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class CreateDeleteSpamInputBuilder {
    //the instance to build
    private CreateDeleteSpamInput createDeleteSpamInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateDeleteSpamInputBuilder() {
        createDeleteSpamInput = new CreateDeleteSpamInput();
    }

    /**
     * Email address
     */
    public CreateDeleteSpamInputBuilder email(String email) {
        createDeleteSpamInput.setEmail(email);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public CreateDeleteSpamInputBuilder responseType(String responseType) {
        createDeleteSpamInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateDeleteSpamInput build() {
        return createDeleteSpamInput;
    }
}