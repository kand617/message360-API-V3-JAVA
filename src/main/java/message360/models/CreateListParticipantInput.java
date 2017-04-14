/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateListParticipantInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5208846686450556620L;
    private String conferenceSid;
    private Integer page;
    private Integer pagesize;
    private Boolean muted;
    private Boolean deaf;
    private String responseType = "json";
    /** GETTER
     * unique conference sid
     */
    @JsonGetter("ConferenceSid")
    public String getConferenceSid ( ) { 
        return this.conferenceSid;
    }
    
    /** SETTER
     * unique conference sid
     */
    @JsonSetter("ConferenceSid")
    public void setConferenceSid (String value) { 
        this.conferenceSid = value;
    }
 
    /** GETTER
     * page number
     */
    @JsonGetter("Page")
    public Integer getPage ( ) { 
        return this.page;
    }
    
    /** SETTER
     * page number
     */
    @JsonSetter("Page")
    public void setPage (Integer value) { 
        this.page = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Pagesize")
    public Integer getPagesize ( ) { 
        return this.pagesize;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Pagesize")
    public void setPagesize (Integer value) { 
        this.pagesize = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Muted")
    public Boolean getMuted ( ) { 
        return this.muted;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Muted")
    public void setMuted (Boolean value) { 
        this.muted = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Deaf")
    public Boolean getDeaf ( ) { 
        return this.deaf;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Deaf")
    public void setDeaf (Boolean value) { 
        this.deaf = value;
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
 