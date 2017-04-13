/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class CreateViewNumberDetailsInputBuilder {
    //the instance to build
    private CreateViewNumberDetailsInput createViewNumberDetailsInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateViewNumberDetailsInputBuilder() {
        createViewNumberDetailsInput = new CreateViewNumberDetailsInput();
    }

    /**
     * Get Phone number Detail
     */
    public CreateViewNumberDetailsInputBuilder phoneNumber(String phoneNumber) {
        createViewNumberDetailsInput.setPhoneNumber(phoneNumber);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public CreateViewNumberDetailsInputBuilder responseType(String responseType) {
        createViewNumberDetailsInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateViewNumberDetailsInput build() {
        return createViewNumberDetailsInput;
    }
}