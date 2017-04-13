/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class CreateListNumberInputBuilder {
    //the instance to build
    private CreateListNumberInput createListNumberInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateListNumberInputBuilder() {
        createListNumberInput = new CreateListNumberInput();
    }

    /**
     * Which page of the overall response will be returned. Zero indexed
     */
    public CreateListNumberInputBuilder page(Integer page) {
        createListNumberInput.setPage(page);
        return this;
    }

    /**
     * Number of individual resources listed in the response per page
     */
    public CreateListNumberInputBuilder pageSize(Integer pageSize) {
        createListNumberInput.setPageSize(pageSize);
        return this;
    }

    public CreateListNumberInputBuilder numberType(NumberTypeEnum numberType) {
        createListNumberInput.setNumberType(numberType);
        return this;
    }

    public CreateListNumberInputBuilder friendlyName(String friendlyName) {
        createListNumberInput.setFriendlyName(friendlyName);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public CreateListNumberInputBuilder responseType(String responseType) {
        createListNumberInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateListNumberInput build() {
        return createListNumberInput;
    }
}