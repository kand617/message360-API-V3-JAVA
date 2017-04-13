/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class CreateListRecordingInputBuilder {
    //the instance to build
    private CreateListRecordingInput createListRecordingInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateListRecordingInputBuilder() {
        createListRecordingInput = new CreateListRecordingInput();
    }

    /**
     * Which page of the overall response will be returned. Zero indexed
     */
    public CreateListRecordingInputBuilder page(Integer page) {
        createListRecordingInput.setPage(page);
        return this;
    }

    /**
     * Number of individual resources listed in the response per page
     */
    public CreateListRecordingInputBuilder pageSize(Integer pageSize) {
        createListRecordingInput.setPageSize(pageSize);
        return this;
    }

    public CreateListRecordingInputBuilder dateCreated(String dateCreated) {
        createListRecordingInput.setDateCreated(dateCreated);
        return this;
    }

    public CreateListRecordingInputBuilder callSid(String callSid) {
        createListRecordingInput.setCallSid(callSid);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public CreateListRecordingInputBuilder responseType(String responseType) {
        createListRecordingInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateListRecordingInput build() {
        return createListRecordingInput;
    }
}