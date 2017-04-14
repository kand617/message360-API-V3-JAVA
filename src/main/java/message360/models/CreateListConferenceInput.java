/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateListConferenceInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5668881329933902528L;
    private Integer page;
    private Integer pageSize;
    private String friendlyName;
    private InterruptedCallStatusEnum status;
    private String dateCreated;
    private String dateUpdated;
    private String responseType = "json";
    /** GETTER
     * Which page of the overall response will be returned. Zero indexed
     */
    @JsonGetter("Page")
    public Integer getPage ( ) { 
        return this.page;
    }
    
    /** SETTER
     * Which page of the overall response will be returned. Zero indexed
     */
    @JsonSetter("Page")
    public void setPage (Integer value) { 
        this.page = value;
    }
 
    /** GETTER
     * Number of individual resources listed in the response per page
     */
    @JsonGetter("PageSize")
    public Integer getPageSize ( ) { 
        return this.pageSize;
    }
    
    /** SETTER
     * Number of individual resources listed in the response per page
     */
    @JsonSetter("PageSize")
    public void setPageSize (Integer value) { 
        this.pageSize = value;
    }
 
    /** GETTER
     * Only return conferences with the specified FriendlyName
     */
    @JsonGetter("FriendlyName")
    public String getFriendlyName ( ) { 
        return this.friendlyName;
    }
    
    /** SETTER
     * Only return conferences with the specified FriendlyName
     */
    @JsonSetter("FriendlyName")
    public void setFriendlyName (String value) { 
        this.friendlyName = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("Status")
    public InterruptedCallStatusEnum getStatus ( ) { 
        return this.status;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("Status")
    public void setStatus (InterruptedCallStatusEnum value) { 
        this.status = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("DateCreated")
    public String getDateCreated ( ) { 
        return this.dateCreated;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("DateCreated")
    public void setDateCreated (String value) { 
        this.dateCreated = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("DateUpdated")
    public String getDateUpdated ( ) { 
        return this.dateUpdated;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("DateUpdated")
    public void setDateUpdated (String value) { 
        this.dateUpdated = value;
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
 