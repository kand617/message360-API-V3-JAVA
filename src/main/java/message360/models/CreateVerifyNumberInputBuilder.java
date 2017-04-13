/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class CreateVerifyNumberInputBuilder {
    //the instance to build
    private CreateVerifyNumberInput createVerifyNumberInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateVerifyNumberInputBuilder() {
        createVerifyNumberInput = new CreateVerifyNumberInput();
    }

    public CreateVerifyNumberInputBuilder phonenumber(String phonenumber) {
        createVerifyNumberInput.setPhonenumber(phonenumber);
        return this;
    }

    public CreateVerifyNumberInputBuilder type(String type) {
        createVerifyNumberInput.setType(type);
        return this;
    }

    /**
     * Response Type either json or xml
     */
    public CreateVerifyNumberInputBuilder responseType(String responseType) {
        createVerifyNumberInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateVerifyNumberInput build() {
        return createVerifyNumberInput;
    }
}