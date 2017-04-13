/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class CreateVerifyAddressInputBuilder {
    //the instance to build
    private CreateVerifyAddressInput createVerifyAddressInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateVerifyAddressInputBuilder() {
        createVerifyAddressInput = new CreateVerifyAddressInput();
    }

    /**
     * The identifier of the address to be verified.
     */
    public CreateVerifyAddressInputBuilder addressSID(String addressSID) {
        createVerifyAddressInput.setAddressSID(addressSID);
        return this;
    }

    /**
     * Response type either json or xml
     */
    public CreateVerifyAddressInputBuilder responseType(String responseType) {
        createVerifyAddressInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateVerifyAddressInput build() {
        return createVerifyAddressInput;
    }
}