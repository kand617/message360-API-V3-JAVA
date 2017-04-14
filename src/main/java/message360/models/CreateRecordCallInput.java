/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateRecordCallInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5705867770220300487L;
    private String callSid;
    private boolean record;
    private DirectionEnum direction;
    private Integer timeLimit;
    private String callBackUrl;
    private AudioFormatEnum fileformat;
    private String responseType = "json";
    /** GETTER
     * The unique identifier of each call resource
     */
    @JsonGetter("CallSid")
    public String getCallSid ( ) { 
        return this.callSid;
    }
    
    /** SETTER
     * The unique identifier of each call resource
     */
    @JsonSetter("CallSid")
    public void setCallSid (String value) { 
        this.callSid = value;
    }
 
    /** GETTER
     * Set true to initiate recording or false to terminate recording
     */
    @JsonGetter("Record")
    public boolean getRecord ( ) { 
        return this.record;
    }
    
    /** SETTER
     * Set true to initiate recording or false to terminate recording
     */
    @JsonSetter("Record")
    public void setRecord (boolean value) { 
        this.record = value;
    }
 
    /** GETTER
     * The leg of the call to record
     */
    @JsonGetter("Direction")
    public DirectionEnum getDirection ( ) { 
        return this.direction;
    }
    
    /** SETTER
     * The leg of the call to record
     */
    @JsonSetter("Direction")
    public void setDirection (DirectionEnum value) { 
        this.direction = value;
    }
 
    /** GETTER
     * Time in seconds the recording duration should not exceed
     */
    @JsonGetter("TimeLimit")
    public Integer getTimeLimit ( ) { 
        return this.timeLimit;
    }
    
    /** SETTER
     * Time in seconds the recording duration should not exceed
     */
    @JsonSetter("TimeLimit")
    public void setTimeLimit (Integer value) { 
        this.timeLimit = value;
    }
 
    /** GETTER
     * URL consulted after the recording completes
     */
    @JsonGetter("CallBackUrl")
    public String getCallBackUrl ( ) { 
        return this.callBackUrl;
    }
    
    /** SETTER
     * URL consulted after the recording completes
     */
    @JsonSetter("CallBackUrl")
    public void setCallBackUrl (String value) { 
        this.callBackUrl = value;
    }
 
    /** GETTER
     * Format of the recording file. Can be .mp3 or .wav
     */
    @JsonGetter("Fileformat")
    public AudioFormatEnum getFileformat ( ) { 
        return this.fileformat;
    }
    
    /** SETTER
     * Format of the recording file. Can be .mp3 or .wav
     */
    @JsonSetter("Fileformat")
    public void setFileformat (AudioFormatEnum value) { 
        this.fileformat = value;
    }
 
    /** GETTER
     * Response format, xml or json
     */
    @JsonGetter("ResponseType")
    public String getResponseType ( ) { 
        return this.responseType;
    }
    
    /** SETTER
     * Response format, xml or json
     */
    @JsonSetter("ResponseType")
    public void setResponseType (String value) { 
        this.responseType = value;
    }
 
}
 