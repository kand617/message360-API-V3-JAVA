/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class CreateMakeCallInputBuilder {
    //the instance to build
    private CreateMakeCallInput createMakeCallInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateMakeCallInputBuilder() {
        createMakeCallInput = new CreateMakeCallInput();
    }

    /**
     * from country code
     */
    public CreateMakeCallInputBuilder fromCountryCode(String fromCountryCode) {
        createMakeCallInput.setFromCountryCode(fromCountryCode);
        return this;
    }

    /**
     * This number to display on Caller ID as calling
     */
    public CreateMakeCallInputBuilder from(String from) {
        createMakeCallInput.setFrom(from);
        return this;
    }

    /**
     * To cuntry code number
     */
    public CreateMakeCallInputBuilder toCountryCode(String toCountryCode) {
        createMakeCallInput.setToCountryCode(toCountryCode);
        return this;
    }

    /**
     * To number
     */
    public CreateMakeCallInputBuilder to(String to) {
        createMakeCallInput.setTo(to);
        return this;
    }

    /**
     * URL requested once the call connects
     */
    public CreateMakeCallInputBuilder url(String url) {
        createMakeCallInput.setUrl(url);
        return this;
    }

    /**
     * Specifies the HTTP method used to request the required URL once call connects.
     */
    public CreateMakeCallInputBuilder method(HttpActionEnum method) {
        createMakeCallInput.setMethod(method);
        return this;
    }

    /**
     * specifies the HTTP methodlinkclass used to request StatusCallbackUrl.
     */
    public CreateMakeCallInputBuilder statusCallBackUrl(String statusCallBackUrl) {
        createMakeCallInput.setStatusCallBackUrl(statusCallBackUrl);
        return this;
    }

    /**
     * Specifies the HTTP methodlinkclass used to request StatusCallbackUrl.
     */
    public CreateMakeCallInputBuilder statusCallBackMethod(HttpActionEnum statusCallBackMethod) {
        createMakeCallInput.setStatusCallBackMethod(statusCallBackMethod);
        return this;
    }

    /**
     * URL requested if the initial Url parameter fails or encounters an error
     */
    public CreateMakeCallInputBuilder fallBackUrl(String fallBackUrl) {
        createMakeCallInput.setFallBackUrl(fallBackUrl);
        return this;
    }

    /**
     * Specifies the HTTP method used to request the required FallbackUrl once call connects.
     */
    public CreateMakeCallInputBuilder fallBackMethod(HttpActionEnum fallBackMethod) {
        createMakeCallInput.setFallBackMethod(fallBackMethod);
        return this;
    }

    /**
     * URL that can be requested every 60 seconds during the call to notify of elapsed tim
     */
    public CreateMakeCallInputBuilder heartBeatUrl(String heartBeatUrl) {
        createMakeCallInput.setHeartBeatUrl(heartBeatUrl);
        return this;
    }

    /**
     * Specifies the HTTP method used to request HeartbeatUrl.
     */
    public CreateMakeCallInputBuilder heartBeatMethod(Boolean heartBeatMethod) {
        createMakeCallInput.setHeartBeatMethod(heartBeatMethod);
        return this;
    }

    /**
     * Time (in seconds) Message360 should wait while the call is ringing before canceling the call
     */
    public CreateMakeCallInputBuilder timeout(Integer timeout) {
        createMakeCallInput.setTimeout(timeout);
        return this;
    }

    /**
     * DTMF Digits to play to the call once it connects. 0-9, #, or *
     */
    public CreateMakeCallInputBuilder playDtmf(String playDtmf) {
        createMakeCallInput.setPlayDtmf(playDtmf);
        return this;
    }

    /**
     * Specifies if the caller id will be hidden
     */
    public CreateMakeCallInputBuilder hideCallerId(Boolean hideCallerId) {
        createMakeCallInput.setHideCallerId(hideCallerId);
        return this;
    }

    /**
     * Specifies if the call should be recorded
     */
    public CreateMakeCallInputBuilder record(Boolean record) {
        createMakeCallInput.setRecord(record);
        return this;
    }

    /**
     * Recording parameters will be sent here upon completion
     */
    public CreateMakeCallInputBuilder recordCallBackUrl(String recordCallBackUrl) {
        createMakeCallInput.setRecordCallBackUrl(recordCallBackUrl);
        return this;
    }

    /**
     * Method used to request the RecordCallback URL.
     */
    public CreateMakeCallInputBuilder recordCallBackMethod(HttpActionEnum recordCallBackMethod) {
        createMakeCallInput.setRecordCallBackMethod(recordCallBackMethod);
        return this;
    }

    /**
     * Specifies if the call recording should be transcribed
     */
    public CreateMakeCallInputBuilder transcribe(Boolean transcribe) {
        createMakeCallInput.setTranscribe(transcribe);
        return this;
    }

    /**
     * Transcription parameters will be sent here upon completion
     */
    public CreateMakeCallInputBuilder transcribeCallBackUrl(String transcribeCallBackUrl) {
        createMakeCallInput.setTranscribeCallBackUrl(transcribeCallBackUrl);
        return this;
    }

    /**
     * How Message360 should handle the receiving numbers voicemail machine
     */
    public CreateMakeCallInputBuilder ifMachine(IfMachineEnum ifMachine) {
        createMakeCallInput.setIfMachine(ifMachine);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public CreateMakeCallInputBuilder responseType(String responseType) {
        createMakeCallInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateMakeCallInput build() {
        return createMakeCallInput;
    }
}