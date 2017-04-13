/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class CreateListParticipantInputBuilder {
    //the instance to build
    private CreateListParticipantInput createListParticipantInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateListParticipantInputBuilder() {
        createListParticipantInput = new CreateListParticipantInput();
    }

    /**
     * unique conference sid
     */
    public CreateListParticipantInputBuilder conferenceSid(String conferenceSid) {
        createListParticipantInput.setConferenceSid(conferenceSid);
        return this;
    }

    /**
     * page number
     */
    public CreateListParticipantInputBuilder page(Integer page) {
        createListParticipantInput.setPage(page);
        return this;
    }

    public CreateListParticipantInputBuilder pagesize(Integer pagesize) {
        createListParticipantInput.setPagesize(pagesize);
        return this;
    }

    public CreateListParticipantInputBuilder muted(Boolean muted) {
        createListParticipantInput.setMuted(muted);
        return this;
    }

    public CreateListParticipantInputBuilder deaf(Boolean deaf) {
        createListParticipantInput.setDeaf(deaf);
        return this;
    }

    /**
     * Response format, xml or json
     */
    public CreateListParticipantInputBuilder responseType(String responseType) {
        createListParticipantInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateListParticipantInput build() {
        return createListParticipantInput;
    }
}