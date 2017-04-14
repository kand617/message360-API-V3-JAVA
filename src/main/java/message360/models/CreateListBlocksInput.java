/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateListBlocksInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5042476013605025113L;
    private String offset;
    private String limit;
    private String responseType = "json";
    /** GETTER
     * Where to start in the output list
     */
    @JsonGetter("offset")
    public String getOffset ( ) { 
        return this.offset;
    }
    
    /** SETTER
     * Where to start in the output list
     */
    @JsonSetter("offset")
    public void setOffset (String value) { 
        this.offset = value;
    }
 
    /** GETTER
     * Maximum number of records to return
     */
    @JsonGetter("limit")
    public String getLimit ( ) { 
        return this.limit;
    }
    
    /** SETTER
     * Maximum number of records to return
     */
    @JsonSetter("limit")
    public void setLimit (String value) { 
        this.limit = value;
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
 