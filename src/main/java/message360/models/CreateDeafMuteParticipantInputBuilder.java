/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class CreateDeafMuteParticipantInputBuilder {
    //the instance to build
    private CreateDeafMuteParticipantInput createDeafMuteParticipantInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateDeafMuteParticipantInputBuilder() {
        createDeafMuteParticipantInput = new CreateDeafMuteParticipantInput();
    }

    public CreateDeafMuteParticipantInputBuilder conferenceSid(String conferenceSid) {
        createDeafMuteParticipantInput.setConferenceSid(conferenceSid);
        return this;
    }

    public CreateDeafMuteParticipantInputBuilder participantSid(String participantSid) {
        createDeafMuteParticipantInput.setParticipantSid(participantSid);
        return this;
    }

    public CreateDeafMuteParticipantInputBuilder muted(Boolean muted) {
        createDeafMuteParticipantInput.setMuted(muted);
        return this;
    }

    public CreateDeafMuteParticipantInputBuilder deaf(Boolean deaf) {
        createDeafMuteParticipantInput.setDeaf(deaf);
        return this;
    }

    /**
     * Response Type either json or xml
     */
    public CreateDeafMuteParticipantInputBuilder responseType(String responseType) {
        createDeafMuteParticipantInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateDeafMuteParticipantInput build() {
        return createDeafMuteParticipantInput;
    }
}