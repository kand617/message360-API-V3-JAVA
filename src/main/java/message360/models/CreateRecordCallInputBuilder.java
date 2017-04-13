/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class CreateRecordCallInputBuilder {
    //the instance to build
    private CreateRecordCallInput createRecordCallInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateRecordCallInputBuilder() {
        createRecordCallInput = new CreateRecordCallInput();
    }

    /**
     * The unique identifier of each call resource
     */
    public CreateRecordCallInputBuilder callSid(String callSid) {
        createRecordCallInput.setCallSid(callSid);
        return this;
    }

    /**
     * Set true to initiate recording or false to terminate recording
     */
    public CreateRecordCallInputBuilder record(boolean record) {
        createRecordCallInput.setRecord(record);
        return this;
    }

    /**
     * The leg of the call to record
     */
    public CreateRecordCallInputBuilder direction(DirectionEnum direction) {
        createRecordCallInput.setDirection(direction);
        return this;
    }

    /**
     * Time in seconds the recording duration should not exceed
     */
    public CreateRecordCallInputBuilder timeLimit(Integer timeLimit) {
        createRecordCallInput.setTimeLimit(timeLimit);
        return this;
    }

    /**
     * URL consulted after the recording completes
     */
    public CreateRecordCallInputBuilder callBackUrl(String callBackUrl) {
        createRecordCallInput.setCallBackUrl(callBackUrl);
        return this;
    }

    /**
     * Format of the recording file. Can be .mp3 or .wav
     */
    public CreateRecordCallInputBuilder fileformat(AudioFormatEnum fileformat) {
        createRecordCallInput.setFileformat(fileformat);
        return this;
    }

    /**
     * Response format, xml or json
     */
    public CreateRecordCallInputBuilder responseType(String responseType) {
        createRecordCallInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateRecordCallInput build() {
        return createRecordCallInput;
    }
}