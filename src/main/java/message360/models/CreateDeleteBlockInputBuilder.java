/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class CreateDeleteBlockInputBuilder {
    //the instance to build
    private CreateDeleteBlockInput createDeleteBlockInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateDeleteBlockInputBuilder() {
        createDeleteBlockInput = new CreateDeleteBlockInput();
    }

    /**
     * Email address to remove from block list
     */
    public CreateDeleteBlockInputBuilder email(String email) {
        createDeleteBlockInput.setEmail(email);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public CreateDeleteBlockInputBuilder responseType(String responseType) {
        createDeleteBlockInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateDeleteBlockInput build() {
        return createDeleteBlockInput;
    }
}