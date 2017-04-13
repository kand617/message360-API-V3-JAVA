/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class CreateViewAccountInputBuilder {
    //the instance to build
    private CreateViewAccountInput createViewAccountInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateViewAccountInputBuilder() {
        createViewAccountInput = new CreateViewAccountInput();
    }

    public CreateViewAccountInputBuilder date(String date) {
        createViewAccountInput.setDate(date);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public CreateViewAccountInputBuilder responseType(String responseType) {
        createViewAccountInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateViewAccountInput build() {
        return createViewAccountInput;
    }
}