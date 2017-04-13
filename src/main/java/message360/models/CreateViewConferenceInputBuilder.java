/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class CreateViewConferenceInputBuilder {
    //the instance to build
    private CreateViewConferenceInput createViewConferenceInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateViewConferenceInputBuilder() {
        createViewConferenceInput = new CreateViewConferenceInput();
    }

    /**
     * The unique identifier of each conference resource
     */
    public CreateViewConferenceInputBuilder conferencesid(String conferencesid) {
        createViewConferenceInput.setConferencesid(conferencesid);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public CreateViewConferenceInputBuilder responseType(String responseType) {
        createViewConferenceInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateViewConferenceInput build() {
        return createViewConferenceInput;
    }
}