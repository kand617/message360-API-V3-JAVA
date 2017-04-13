/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class CreateListUsageInputBuilder {
    //the instance to build
    private CreateListUsageInput createListUsageInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateListUsageInputBuilder() {
        createListUsageInput = new CreateListUsageInput();
    }

    /**
     * Product Code
     */
    public CreateListUsageInputBuilder productCode(ProductCodeEnum productCode) {
        createListUsageInput.setProductCode(productCode);
        return this;
    }

    /**
     * Start Usage Date
     */
    public CreateListUsageInputBuilder startDate(String startDate) {
        createListUsageInput.setStartDate(startDate);
        return this;
    }

    /**
     * End Usage Date
     */
    public CreateListUsageInputBuilder endDate(String endDate) {
        createListUsageInput.setEndDate(endDate);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public CreateListUsageInputBuilder responseType(String responseType) {
        createListUsageInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateListUsageInput build() {
        return createListUsageInput;
    }
}