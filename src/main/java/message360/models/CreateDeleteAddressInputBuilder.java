/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class CreateDeleteAddressInputBuilder {
    //the instance to build
    private CreateDeleteAddressInput createDeleteAddressInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateDeleteAddressInputBuilder() {
        createDeleteAddressInput = new CreateDeleteAddressInput();
    }

    /**
     * The identifier of the address to be deleted.
     */
    public CreateDeleteAddressInputBuilder addressSID(String addressSID) {
        createDeleteAddressInput.setAddressSID(addressSID);
        return this;
    }

    /**
     * Response type either json or xml
     */
    public CreateDeleteAddressInputBuilder responseType(String responseType) {
        createDeleteAddressInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateDeleteAddressInput build() {
        return createDeleteAddressInput;
    }
}