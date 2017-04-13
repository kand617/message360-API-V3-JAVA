/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class CreateSuspendSubAccountInputBuilder {
    //the instance to build
    private CreateSuspendSubAccountInput createSuspendSubAccountInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateSuspendSubAccountInputBuilder() {
        createSuspendSubAccountInput = new CreateSuspendSubAccountInput();
    }

    /**
     * The SubaccountSid to be activated or suspended
     */
    public CreateSuspendSubAccountInputBuilder subAccountSID(String subAccountSID) {
        createSuspendSubAccountInput.setSubAccountSID(subAccountSID);
        return this;
    }

    /**
     * 0 to suspend or 1 to activate
     */
    public CreateSuspendSubAccountInputBuilder activate(ActivateStatusEnum activate) {
        createSuspendSubAccountInput.setActivate(activate);
        return this;
    }

    public CreateSuspendSubAccountInputBuilder responseType(String responseType) {
        createSuspendSubAccountInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateSuspendSubAccountInput build() {
        return createSuspendSubAccountInput;
    }
}