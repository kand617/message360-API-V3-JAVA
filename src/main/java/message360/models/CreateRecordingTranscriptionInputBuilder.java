/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class CreateRecordingTranscriptionInputBuilder {
    //the instance to build
    private CreateRecordingTranscriptionInput createRecordingTranscriptionInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateRecordingTranscriptionInputBuilder() {
        createRecordingTranscriptionInput = new CreateRecordingTranscriptionInput();
    }

    /**
     * Unique Recording sid
     */
    public CreateRecordingTranscriptionInputBuilder recordingSid(String recordingSid) {
        createRecordingTranscriptionInput.setRecordingSid(recordingSid);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public CreateRecordingTranscriptionInputBuilder responseType(String responseType) {
        createRecordingTranscriptionInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateRecordingTranscriptionInput build() {
        return createRecordingTranscriptionInput;
    }
}