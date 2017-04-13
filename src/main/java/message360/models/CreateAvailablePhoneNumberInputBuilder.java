/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class CreateAvailablePhoneNumberInputBuilder {
    //the instance to build
    private CreateAvailablePhoneNumberInput createAvailablePhoneNumberInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateAvailablePhoneNumberInputBuilder() {
        createAvailablePhoneNumberInput = new CreateAvailablePhoneNumberInput();
    }

    /**
     * Number type either SMS,Voice or all
     */
    public CreateAvailablePhoneNumberInputBuilder numberType(NumberTypeEnum numberType) {
        createAvailablePhoneNumberInput.setNumberType(numberType);
        return this;
    }

    /**
     * Phone Number Area Code
     */
    public CreateAvailablePhoneNumberInputBuilder areaCode(String areaCode) {
        createAvailablePhoneNumberInput.setAreaCode(areaCode);
        return this;
    }

    /**
     * Page Size
     */
    public CreateAvailablePhoneNumberInputBuilder pageSize(Integer pageSize) {
        createAvailablePhoneNumberInput.setPageSize(pageSize);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public CreateAvailablePhoneNumberInputBuilder responseType(String responseType) {
        createAvailablePhoneNumberInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateAvailablePhoneNumberInput build() {
        return createAvailablePhoneNumberInput;
    }
}