/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class CreateDeleteRecordingInputBuilder {
    //the instance to build
    private CreateDeleteRecordingInput createDeleteRecordingInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateDeleteRecordingInputBuilder() {
        createDeleteRecordingInput = new CreateDeleteRecordingInput();
    }

    /**
     * Unique Recording Sid to be delete
     */
    public CreateDeleteRecordingInputBuilder recordingSid(String recordingSid) {
        createDeleteRecordingInput.setRecordingSid(recordingSid);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public CreateDeleteRecordingInputBuilder responseType(String responseType) {
        createDeleteRecordingInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateDeleteRecordingInput build() {
        return createDeleteRecordingInput;
    }
}