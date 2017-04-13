/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class CreateListTranscriptionInputBuilder {
    //the instance to build
    private CreateListTranscriptionInput createListTranscriptionInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateListTranscriptionInputBuilder() {
        createListTranscriptionInput = new CreateListTranscriptionInput();
    }

    public CreateListTranscriptionInputBuilder page(Integer page) {
        createListTranscriptionInput.setPage(page);
        return this;
    }

    public CreateListTranscriptionInputBuilder pageSize(Integer pageSize) {
        createListTranscriptionInput.setPageSize(pageSize);
        return this;
    }

    public CreateListTranscriptionInputBuilder status(StatusEnum status) {
        createListTranscriptionInput.setStatus(status);
        return this;
    }

    public CreateListTranscriptionInputBuilder dateTranscribed(String dateTranscribed) {
        createListTranscriptionInput.setDateTranscribed(dateTranscribed);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public CreateListTranscriptionInputBuilder responseType(String responseType) {
        createListTranscriptionInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateListTranscriptionInput build() {
        return createListTranscriptionInput;
    }
}