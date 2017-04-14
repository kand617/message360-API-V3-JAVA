/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateListUnsubscribesInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5289600295757970634L;
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
     * Starting record of the list
     */
    @JsonGetter("offset")
    public String getOffset ( ) { 
        return this.offset;
    }
    
    /** SETTER
     * Starting record of the list
     */
    @JsonSetter("offset")
    public void setOffset (String value) { 
        this.offset = value;
    }
 
    /** GETTER
     * Maximum number of records to be returned
     */
    @JsonGetter("limit")
    public String getLimit ( ) { 
        return this.limit;
    }
    
    /** SETTER
     * Maximum number of records to be returned
     */
    @JsonSetter("limit")
    public void setLimit (String value) { 
        this.limit = value;
    }
 
}
 