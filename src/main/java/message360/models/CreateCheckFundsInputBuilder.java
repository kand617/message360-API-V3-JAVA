/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class CreateCheckFundsInputBuilder {
    //the instance to build
    private CreateCheckFundsInput createCheckFundsInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateCheckFundsInputBuilder() {
        createCheckFundsInput = new CreateCheckFundsInput();
    }

    /**
     * Your message360 Account SID
     */
    public CreateCheckFundsInputBuilder accountSid(String accountSid) {
        createCheckFundsInput.setAccountSid(accountSid);
        return this;
    }

    /**
     * Your message360 Token
     */
    public CreateCheckFundsInputBuilder authToken(String authToken) {
        createCheckFundsInput.setAuthToken(authToken);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateCheckFundsInput build() {
        return createCheckFundsInput;
    }
}