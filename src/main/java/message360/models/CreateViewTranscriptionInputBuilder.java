/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class CreateViewTranscriptionInputBuilder {
    //the instance to build
    private CreateViewTranscriptionInput createViewTranscriptionInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateViewTranscriptionInputBuilder() {
        createViewTranscriptionInput = new CreateViewTranscriptionInput();
    }

    /**
     * Unique Transcription ID
     */
    public CreateViewTranscriptionInputBuilder transcriptionSid(String transcriptionSid) {
        createViewTranscriptionInput.setTranscriptionSid(transcriptionSid);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public CreateViewTranscriptionInputBuilder responseType(String responseType) {
        createViewTranscriptionInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateViewTranscriptionInput build() {
        return createViewTranscriptionInput;
    }
}