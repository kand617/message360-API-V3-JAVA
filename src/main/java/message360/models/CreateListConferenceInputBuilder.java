/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class CreateListConferenceInputBuilder {
    //the instance to build
    private CreateListConferenceInput createListConferenceInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateListConferenceInputBuilder() {
        createListConferenceInput = new CreateListConferenceInput();
    }

    /**
     * Which page of the overall response will be returned. Zero indexed
     */
    public CreateListConferenceInputBuilder page(Integer page) {
        createListConferenceInput.setPage(page);
        return this;
    }

    /**
     * Number of individual resources listed in the response per page
     */
    public CreateListConferenceInputBuilder pageSize(Integer pageSize) {
        createListConferenceInput.setPageSize(pageSize);
        return this;
    }

    /**
     * Only return conferences with the specified FriendlyName
     */
    public CreateListConferenceInputBuilder friendlyName(String friendlyName) {
        createListConferenceInput.setFriendlyName(friendlyName);
        return this;
    }

    public CreateListConferenceInputBuilder status(InterruptedCallStatusEnum status) {
        createListConferenceInput.setStatus(status);
        return this;
    }

    public CreateListConferenceInputBuilder dateCreated(String dateCreated) {
        createListConferenceInput.setDateCreated(dateCreated);
        return this;
    }

    public CreateListConferenceInputBuilder dateUpdated(String dateUpdated) {
        createListConferenceInput.setDateUpdated(dateUpdated);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public CreateListConferenceInputBuilder responseType(String responseType) {
        createListConferenceInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateListConferenceInput build() {
        return createListConferenceInput;
    }
}