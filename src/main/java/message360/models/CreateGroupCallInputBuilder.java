/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class CreateGroupCallInputBuilder {
    //the instance to build
    private CreateGroupCallInput createGroupCallInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateGroupCallInputBuilder() {
        createGroupCallInput = new CreateGroupCallInput();
    }

    public CreateGroupCallInputBuilder fromCountryCode(String fromCountryCode) {
        createGroupCallInput.setFromCountryCode(fromCountryCode);
        return this;
    }

    public CreateGroupCallInputBuilder from(String from) {
        createGroupCallInput.setFrom(from);
        return this;
    }

    public CreateGroupCallInputBuilder toCountryCode(String toCountryCode) {
        createGroupCallInput.setToCountryCode(toCountryCode);
        return this;
    }

    public CreateGroupCallInputBuilder to(String to) {
        createGroupCallInput.setTo(to);
        return this;
    }

    public CreateGroupCallInputBuilder url(String url) {
        createGroupCallInput.setUrl(url);
        return this;
    }

    public CreateGroupCallInputBuilder method(HttpActionEnum method) {
        createGroupCallInput.setMethod(method);
        return this;
    }

    public CreateGroupCallInputBuilder statusCallBackUrl(String statusCallBackUrl) {
        createGroupCallInput.setStatusCallBackUrl(statusCallBackUrl);
        return this;
    }

    public CreateGroupCallInputBuilder statusCallBackMethod(HttpActionEnum statusCallBackMethod) {
        createGroupCallInput.setStatusCallBackMethod(statusCallBackMethod);
        return this;
    }

    public CreateGroupCallInputBuilder fallBackUrl(String fallBackUrl) {
        createGroupCallInput.setFallBackUrl(fallBackUrl);
        return this;
    }

    public CreateGroupCallInputBuilder fallBackMethod(HttpActionEnum fallBackMethod) {
        createGroupCallInput.setFallBackMethod(fallBackMethod);
        return this;
    }

    public CreateGroupCallInputBuilder heartBeatUrl(String heartBeatUrl) {
        createGroupCallInput.setHeartBeatUrl(heartBeatUrl);
        return this;
    }

    public CreateGroupCallInputBuilder heartBeatMethod(HttpActionEnum heartBeatMethod) {
        createGroupCallInput.setHeartBeatMethod(heartBeatMethod);
        return this;
    }

    public CreateGroupCallInputBuilder timeout(Integer timeout) {
        createGroupCallInput.setTimeout(timeout);
        return this;
    }

    public CreateGroupCallInputBuilder playDtmf(String playDtmf) {
        createGroupCallInput.setPlayDtmf(playDtmf);
        return this;
    }

    public CreateGroupCallInputBuilder hideCallerId(String hideCallerId) {
        createGroupCallInput.setHideCallerId(hideCallerId);
        return this;
    }

    public CreateGroupCallInputBuilder record(Boolean record) {
        createGroupCallInput.setRecord(record);
        return this;
    }

    public CreateGroupCallInputBuilder recordCallBackUrl(String recordCallBackUrl) {
        createGroupCallInput.setRecordCallBackUrl(recordCallBackUrl);
        return this;
    }

    public CreateGroupCallInputBuilder recordCallBackMethod(HttpActionEnum recordCallBackMethod) {
        createGroupCallInput.setRecordCallBackMethod(recordCallBackMethod);
        return this;
    }

    public CreateGroupCallInputBuilder transcribe(Boolean transcribe) {
        createGroupCallInput.setTranscribe(transcribe);
        return this;
    }

    public CreateGroupCallInputBuilder transcribeCallBackUrl(String transcribeCallBackUrl) {
        createGroupCallInput.setTranscribeCallBackUrl(transcribeCallBackUrl);
        return this;
    }

    public CreateGroupCallInputBuilder responseType(String responseType) {
        createGroupCallInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateGroupCallInput build() {
        return createGroupCallInput;
    }
}