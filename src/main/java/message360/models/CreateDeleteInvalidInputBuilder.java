/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class CreateDeleteInvalidInputBuilder {
    //the instance to build
    private CreateDeleteInvalidInput createDeleteInvalidInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateDeleteInvalidInputBuilder() {
        createDeleteInvalidInput = new CreateDeleteInvalidInput();
    }

    public CreateDeleteInvalidInputBuilder email(String email) {
        createDeleteInvalidInput.setEmail(email);
        return this;
    }

    public CreateDeleteInvalidInputBuilder responseType(String responseType) {
        createDeleteInvalidInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateDeleteInvalidInput build() {
        return createDeleteInvalidInput;
    }
}