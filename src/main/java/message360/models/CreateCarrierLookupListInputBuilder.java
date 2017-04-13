/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class CreateCarrierLookupListInputBuilder {
    //the instance to build
    private CreateCarrierLookupListInput createCarrierLookupListInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateCarrierLookupListInputBuilder() {
        createCarrierLookupListInput = new CreateCarrierLookupListInput();
    }

    /**
     * Page Number
     */
    public CreateCarrierLookupListInputBuilder page(Integer page) {
        createCarrierLookupListInput.setPage(page);
        return this;
    }

    /**
     * Page Size
     */
    public CreateCarrierLookupListInputBuilder pagesize(Integer pagesize) {
        createCarrierLookupListInput.setPagesize(pagesize);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public CreateCarrierLookupListInputBuilder responseType(String responseType) {
        createCarrierLookupListInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateCarrierLookupListInput build() {
        return createCarrierLookupListInput;
    }
}