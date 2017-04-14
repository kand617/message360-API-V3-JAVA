/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateListBouncesInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5726820105779904822L;
    private String responseType = "json";
    private String offset;
    private String limit;
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
 
    /** GETTER
     * The record to start the list at
     */
    @JsonGetter("offset")
    public String getOffset ( ) { 
        return this.offset;
    }
    
    /** SETTER
     * The record to start the list at
     */
    @JsonSetter("offset")
    public void setOffset (String value) { 
        this.offset = value;
    }
 
    /** GETTER
     * The maximum number of records to return
     */
    @JsonGetter("limit")
    public String getLimit ( ) { 
        return this.limit;
    }
    
    /** SETTER
     * The maximum number of records to return
     */
    @JsonSetter("limit")
    public void setLimit (String value) { 
        this.limit = value;
    }
 
}
 