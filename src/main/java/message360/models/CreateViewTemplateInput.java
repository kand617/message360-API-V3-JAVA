/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateViewTemplateInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5678080096889704240L;
    private UUID templateid;
    private String responseType = "json";
    /** GETTER
     * The unique identifier for a template object
     */
    @JsonGetter("templateid")
    public UUID getTemplateid ( ) { 
        return this.templateid;
    }
    
    /** SETTER
     * The unique identifier for a template object
     */
    @JsonSetter("templateid")
    public void setTemplateid (UUID value) { 
        this.templateid = value;
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
 