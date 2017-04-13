/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class CreateDeleteBouncesInputBuilder {
    //the instance to build
    private CreateDeleteBouncesInput createDeleteBouncesInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateDeleteBouncesInputBuilder() {
        createDeleteBouncesInput = new CreateDeleteBouncesInput();
    }

    /**
     * The email address to remove from the bounce list
     */
    public CreateDeleteBouncesInputBuilder email(String email) {
        createDeleteBouncesInput.setEmail(email);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public CreateDeleteBouncesInputBuilder responseType(String responseType) {
        createDeleteBouncesInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateDeleteBouncesInput build() {
        return createDeleteBouncesInput;
    }
}