/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateMakeCallInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4774333914958852510L;
    private String fromCountryCode;
    private String from;
    private String toCountryCode;
    private String to;
    private String url;
    private HttpActionEnum method;
    private String statusCallBackUrl;
    private HttpActionEnum statusCallBackMethod;
    private String fallBackUrl;
    private HttpActionEnum fallBackMethod;
    private String heartBeatUrl;
    private Boolean heartBeatMethod;
    private Integer timeout;
    private String playDtmf;
    private Boolean hideCallerId;
    private Boolean record;
    private String recordCallBackUrl;
    private HttpActionEnum recordCallBackMethod;
    private Boolean transcribe;
    private String transcribeCallBackUrl;
    private IfMachineEnum ifMachine;
    private String responseType = "json";
    /** GETTER
     * from country code
     */
    @JsonGetter("FromCountryCode")
    public String getFromCountryCode ( ) { 
        return this.fromCountryCode;
    }
    
    /** SETTER
     * from country code
     */
    @JsonSetter("FromCountryCode")
    public void setFromCountryCode (String value) { 
        this.fromCountryCode = value;
    }
 
    /** GETTER
     * This number to display on Caller ID as calling
     */
    @JsonGetter("From")
    public String getFrom ( ) { 
        return this.from;
    }
    
    /** SETTER
     * This number to display on Caller ID as calling
     */
    @JsonSetter("From")
    public void setFrom (String value) { 
        this.from = value;
    }
 
    /** GETTER
     * To cuntry code number
     */
    @JsonGetter("ToCountryCode")
    public String getToCountryCode ( ) { 
        return this.toCountryCode;
    }
    
    /** SETTER
     * To cuntry code number
     */
    @JsonSetter("ToCountryCode")
    public void setToCountryCode (String value) { 
        this.toCountryCode = value;
    }
 
    /** GETTER
     * To number
     */
    @JsonGetter("To")
    public String getTo ( ) { 
        return this.to;
    }
    
    /** SETTER
     * To number
     */
    @JsonSetter("To")
    public void setTo (String value) { 
        this.to = value;
    }
 
    /** GETTER
     * URL requested once the call connects
     */
    @JsonGetter("Url")
    public String getUrl ( ) { 
        return this.url;
    }
    
    /** SETTER
     * URL requested once the call connects
     */
    @JsonSetter("Url")
    public void setUrl (String value) { 
        this.url = value;
    }
 
    /** GETTER
     * Specifies the HTTP method used to request the required URL once call connects.
     */
    @JsonGetter("Method")
    public HttpActionEnum getMethod ( ) { 
        return this.method;
    }
    
    /** SETTER
     * Specifies the HTTP method used to request the required URL once call connects.
     */
    @JsonSetter("Method")
    public void setMethod (HttpActionEnum value) { 
        this.method = value;
    }
 
    /** GETTER
     * specifies the HTTP methodlinkclass used to request StatusCallbackUrl.
     */
    @JsonGetter("StatusCallBackUrl")
    public String getStatusCallBackUrl ( ) { 
        return this.statusCallBackUrl;
    }
    
    /** SETTER
     * specifies the HTTP methodlinkclass used to request StatusCallbackUrl.
     */
    @JsonSetter("StatusCallBackUrl")
    public void setStatusCallBackUrl (String value) { 
        this.statusCallBackUrl = value;
    }
 
    /** GETTER
     * Specifies the HTTP methodlinkclass used to request StatusCallbackUrl.
     */
    @JsonGetter("StatusCallBackMethod")
    public HttpActionEnum getStatusCallBackMethod ( ) { 
        return this.statusCallBackMethod;
    }
    
    /** SETTER
     * Specifies the HTTP methodlinkclass used to request StatusCallbackUrl.
     */
    @JsonSetter("StatusCallBackMethod")
    public void setStatusCallBackMethod (HttpActionEnum value) { 
        this.statusCallBackMethod = value;
    }
 
    /** GETTER
     * URL requested if the initial Url parameter fails or encounters an error
     */
    @JsonGetter("FallBackUrl")
    public String getFallBackUrl ( ) { 
        return this.fallBackUrl;
    }
    
    /** SETTER
     * URL requested if the initial Url parameter fails or encounters an error
     */
    @JsonSetter("FallBackUrl")
    public void setFallBackUrl (String value) { 
        this.fallBackUrl = value;
    }
 
    /** GETTER
     * Specifies the HTTP method used to request the required FallbackUrl once call connects.
     */
    @JsonGetter("FallBackMethod")
    public HttpActionEnum getFallBackMethod ( ) { 
        return this.fallBackMethod;
    }
    
    /** SETTER
     * Specifies the HTTP method used to request the required FallbackUrl once call connects.
     */
    @JsonSetter("FallBackMethod")
    public void setFallBackMethod (HttpActionEnum value) { 
        this.fallBackMethod = value;
    }
 
    /** GETTER
     * URL that can be requested every 60 seconds during the call to notify of elapsed tim
     */
    @JsonGetter("HeartBeatUrl")
    public String getHeartBeatUrl ( ) { 
        return this.heartBeatUrl;
    }
    
    /** SETTER
     * URL that can be requested every 60 seconds during the call to notify of elapsed tim
     */
    @JsonSetter("HeartBeatUrl")
    public void setHeartBeatUrl (String value) { 
        this.heartBeatUrl = value;
    }
 
    /** GETTER
     * Specifies the HTTP method used to request HeartbeatUrl.
     */
    @JsonGetter("HeartBeatMethod")
    public Boolean getHeartBeatMethod ( ) { 
        return this.heartBeatMethod;
    }
    
    /** SETTER
     * Specifies the HTTP method used to request HeartbeatUrl.
     */
    @JsonSetter("HeartBeatMethod")
    public void setHeartBeatMethod (Boolean value) { 
        this.heartBeatMethod = value;
    }
 
    /** GETTER
     * Time (in seconds) Message360 should wait while the call is ringing before canceling the call
     */
    @JsonGetter("Timeout")
    public Integer getTimeout ( ) { 
        return this.timeout;
    }
    
    /** SETTER
     * Time (in seconds) Message360 should wait while the call is ringing before canceling the call
     */
    @JsonSetter("Timeout")
    public void setTimeout (Integer value) { 
        this.timeout = value;
    }
 
    /** GETTER
     * DTMF Digits to play to the call once it connects. 0-9, #, or *
     */
    @JsonGetter("PlayDtmf")
    public String getPlayDtmf ( ) { 
        return this.playDtmf;
    }
    
    /** SETTER
     * DTMF Digits to play to the call once it connects. 0-9, #, or *
     */
    @JsonSetter("PlayDtmf")
    public void setPlayDtmf (String value) { 
        this.playDtmf = value;
    }
 
    /** GETTER
     * Specifies if the caller id will be hidden
     */
    @JsonGetter("HideCallerId")
    public Boolean getHideCallerId ( ) { 
        return this.hideCallerId;
    }
    
    /** SETTER
     * Specifies if the caller id will be hidden
     */
    @JsonSetter("HideCallerId")
    public void setHideCallerId (Boolean value) { 
        this.hideCallerId = value;
    }
 
    /** GETTER
     * Specifies if the call should be recorded
     */
    @JsonGetter("Record")
    public Boolean getRecord ( ) { 
        return this.record;
    }
    
    /** SETTER
     * Specifies if the call should be recorded
     */
    @JsonSetter("Record")
    public void setRecord (Boolean value) { 
        this.record = value;
    }
 
    /** GETTER
     * Recording parameters will be sent here upon completion
     */
    @JsonGetter("RecordCallBackUrl")
    public String getRecordCallBackUrl ( ) { 
        return this.recordCallBackUrl;
    }
    
    /** SETTER
     * Recording parameters will be sent here upon completion
     */
    @JsonSetter("RecordCallBackUrl")
    public void setRecordCallBackUrl (String value) { 
        this.recordCallBackUrl = value;
    }
 
    /** GETTER
     * Method used to request the RecordCallback URL.
     */
    @JsonGetter("RecordCallBackMethod")
    public HttpActionEnum getRecordCallBackMethod ( ) { 
        return this.recordCallBackMethod;
    }
    
    /** SETTER
     * Method used to request the RecordCallback URL.
     */
    @JsonSetter("RecordCallBackMethod")
    public void setRecordCallBackMethod (HttpActionEnum value) { 
        this.recordCallBackMethod = value;
    }
 
    /** GETTER
     * Specifies if the call recording should be transcribed
     */
    @JsonGetter("Transcribe")
    public Boolean getTranscribe ( ) { 
        return this.transcribe;
    }
    
    /** SETTER
     * Specifies if the call recording should be transcribed
     */
    @JsonSetter("Transcribe")
    public void setTranscribe (Boolean value) { 
        this.transcribe = value;
    }
 
    /** GETTER
     * Transcription parameters will be sent here upon completion
     */
    @JsonGetter("TranscribeCallBackUrl")
    public String getTranscribeCallBackUrl ( ) { 
        return this.transcribeCallBackUrl;
    }
    
    /** SETTER
     * Transcription parameters will be sent here upon completion
     */
    @JsonSetter("TranscribeCallBackUrl")
    public void setTranscribeCallBackUrl (String value) { 
        this.transcribeCallBackUrl = value;
    }
 
    /** GETTER
     * How Message360 should handle the receiving numbers voicemail machine
     */
    @JsonGetter("IfMachine")
    public IfMachineEnum getIfMachine ( ) { 
        return this.ifMachine;
    }
    
    /** SETTER
     * How Message360 should handle the receiving numbers voicemail machine
     */
    @JsonSetter("IfMachine")
    public void setIfMachine (IfMachineEnum value) { 
        this.ifMachine = value;
    }
 
    /** GETTER
     * Response type format xml or json
     */
    @JsonGetter("ResponseType")
    public String getResponseType ( ) { 
        return this.responseType;
    }
    
    /** SETTER
     * Response type format xml or json
     */
    @JsonSetter("ResponseType")
    public void setResponseType (String value) { 
        this.responseType = value;
    }
 
}
 