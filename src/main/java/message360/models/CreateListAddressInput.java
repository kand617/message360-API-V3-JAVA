/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateListAddressInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5525831448593681459L;
    private Integer page = 1;
    private Integer pageSize = 10;
    private String addressSID;
    private String dateCreated;
    private String responseType = "json";
    /** GETTER
     * Return requested # of items starting the value, default=0, must be an integer
     */
    @JsonGetter("Page")
    public Integer getPage ( ) { 
        return this.page;
    }
    
    /** SETTER
     * Return requested # of items starting the value, default=0, must be an integer
     */
    @JsonSetter("Page")
    public void setPage (Integer value) { 
        this.page = value;
    }
 
    /** GETTER
     * How many results to return, default is 10, max is 100, must be an integer
     */
    @JsonGetter("PageSize")
    public Integer getPageSize ( ) { 
        return this.pageSize;
    }
    
    /** SETTER
     * How many results to return, default is 10, max is 100, must be an integer
     */
    @JsonSetter("PageSize")
    public void setPageSize (Integer value) { 
        this.pageSize = value;
    }
 
    /** GETTER
     * addresses Sid
     */
    @JsonGetter("AddressSID")
    public String getAddressSID ( ) { 
        return this.addressSID;
    }
    
    /** SETTER
     * addresses Sid
     */
    @JsonSetter("AddressSID")
    public void setAddressSID (String value) { 
        this.addressSID = value;
    }
 
    /** GETTER
     * date created address.
     */
    @JsonGetter("DateCreated")
    public String getDateCreated ( ) { 
        return this.dateCreated;
    }
    
    /** SETTER
     * date created address.
     */
    @JsonSetter("DateCreated")
    public void setDateCreated (String value) { 
        this.dateCreated = value;
    }
 
    /** GETTER
     * Response Type either json or xml
     */
    @JsonGetter("ResponseType")
    public String getResponseType ( ) { 
        return this.responseType;
    }
    
    /** SETTER
     * Response Type either json or xml
     */
    @JsonSetter("ResponseType")
    public void setResponseType (String value) { 
        this.responseType = value;
    }
 
}
 