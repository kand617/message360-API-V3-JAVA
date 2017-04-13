/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class CreateViewParticipantInputBuilder {
    //the instance to build
    private CreateViewParticipantInput createViewParticipantInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateViewParticipantInputBuilder() {
        createViewParticipantInput = new CreateViewParticipantInput();
    }

    /**
     * unique conference sid
     */
    public CreateViewParticipantInputBuilder conferenceSid(String conferenceSid) {
        createViewParticipantInput.setConferenceSid(conferenceSid);
        return this;
    }

    public CreateViewParticipantInputBuilder participantSid(String participantSid) {
        createViewParticipantInput.setParticipantSid(participantSid);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public CreateViewParticipantInputBuilder responseType(String responseType) {
        createViewParticipantInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateViewParticipantInput build() {
        return createViewParticipantInput;
    }
}