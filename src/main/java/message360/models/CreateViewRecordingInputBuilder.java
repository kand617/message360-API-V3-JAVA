/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class CreateViewRecordingInputBuilder {
    //the instance to build
    private CreateViewRecordingInput createViewRecordingInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateViewRecordingInputBuilder() {
        createViewRecordingInput = new CreateViewRecordingInput();
    }

    /**
     * Search Recording sid
     */
    public CreateViewRecordingInputBuilder recordingSid(String recordingSid) {
        createViewRecordingInput.setRecordingSid(recordingSid);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public CreateViewRecordingInputBuilder responseType(String responseType) {
        createViewRecordingInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateViewRecordingInput build() {
        return createViewRecordingInput;
    }
}