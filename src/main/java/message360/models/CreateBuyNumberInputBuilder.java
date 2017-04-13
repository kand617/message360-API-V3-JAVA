/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class CreateBuyNumberInputBuilder {
    //the instance to build
    private CreateBuyNumberInput createBuyNumberInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateBuyNumberInputBuilder() {
        createBuyNumberInput = new CreateBuyNumberInput();
    }

    /**
     * Phone number to be purchase
     */
    public CreateBuyNumberInputBuilder phoneNumber(String phoneNumber) {
        createBuyNumberInput.setPhoneNumber(phoneNumber);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public CreateBuyNumberInputBuilder responseType(String responseType) {
        createBuyNumberInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateBuyNumberInput build() {
        return createBuyNumberInput;
    }
}