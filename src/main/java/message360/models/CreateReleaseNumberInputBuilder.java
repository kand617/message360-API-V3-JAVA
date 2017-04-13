/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class CreateReleaseNumberInputBuilder {
    //the instance to build
    private CreateReleaseNumberInput createReleaseNumberInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateReleaseNumberInputBuilder() {
        createReleaseNumberInput = new CreateReleaseNumberInput();
    }

    /**
     * Phone number to be relase
     */
    public CreateReleaseNumberInputBuilder phoneNumber(String phoneNumber) {
        createReleaseNumberInput.setPhoneNumber(phoneNumber);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public CreateReleaseNumberInputBuilder responseType(String responseType) {
        createReleaseNumberInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateReleaseNumberInput build() {
        return createReleaseNumberInput;
    }
}