/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class CreateDeleteSubAccountInputBuilder {
    //the instance to build
    private CreateDeleteSubAccountInput createDeleteSubAccountInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateDeleteSubAccountInputBuilder() {
        createDeleteSubAccountInput = new CreateDeleteSubAccountInput();
    }

    /**
     * The SubaccountSid to be deleted
     */
    public CreateDeleteSubAccountInputBuilder subAccountSID(String subAccountSID) {
        createDeleteSubAccountInput.setSubAccountSID(subAccountSID);
        return this;
    }

    /**
     * 0 to delete or 1 to merge numbers to parent account.
     */
    public CreateDeleteSubAccountInputBuilder mergeNumber(MergeNumberStatusEnum mergeNumber) {
        createDeleteSubAccountInput.setMergeNumber(mergeNumber);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public CreateDeleteSubAccountInputBuilder responseType(String responseType) {
        createDeleteSubAccountInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateDeleteSubAccountInput build() {
        return createDeleteSubAccountInput;
    }
}