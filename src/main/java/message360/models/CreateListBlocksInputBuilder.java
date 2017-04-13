/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class CreateListBlocksInputBuilder {
    //the instance to build
    private CreateListBlocksInput createListBlocksInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateListBlocksInputBuilder() {
        createListBlocksInput = new CreateListBlocksInput();
    }

    /**
     * Where to start in the output list
     */
    public CreateListBlocksInputBuilder offset(String offset) {
        createListBlocksInput.setOffset(offset);
        return this;
    }

    /**
     * Maximum number of records to return
     */
    public CreateListBlocksInputBuilder limit(String limit) {
        createListBlocksInput.setLimit(limit);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public CreateListBlocksInputBuilder responseType(String responseType) {
        createListBlocksInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateListBlocksInput build() {
        return createListBlocksInput;
    }
}