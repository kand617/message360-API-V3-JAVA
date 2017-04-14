/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateRecordingTranscriptionInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5250311440880138749L;
    private String recordingSid;
    private String responseType = "json";
    /** GETTER
     * Unique Recording sid
     */
    @JsonGetter("RecordingSid")
    public String getRecordingSid ( ) { 
        return this.recordingSid;
    }
    
    /** SETTER
     * Unique Recording sid
     */
    @JsonSetter("RecordingSid")
    public void setRecordingSid (String value) { 
        this.recordingSid = value;
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
 