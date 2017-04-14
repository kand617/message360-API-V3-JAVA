/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateViewCallInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4850805686974972580L;
    private String callsid;
    private String responseType = "json";
    /** GETTER
     * Call Sid id for particular Call
     */
    @JsonGetter("callsid")
    public String getCallsid ( ) { 
        return this.callsid;
    }
    
    /** SETTER
     * Call Sid id for particular Call
     */
    @JsonSetter("callsid")
    public void setCallsid (String value) { 
        this.callsid = value;
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
 