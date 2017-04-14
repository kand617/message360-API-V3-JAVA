/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateSuspendSubAccountInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5417511619357384375L;
    private String subAccountSID;
    private ActivateStatusEnum activate = ActivateStatusEnum.DEACTIVATE;
    private String responseType;
    /** GETTER
     * The SubaccountSid to be activated or suspended
     */
    @JsonGetter("SubAccountSID")
    public String getSubAccountSID ( ) { 
        return this.subAccountSID;
    }
    
    /** SETTER
     * The SubaccountSid to be activated or suspended
     */
    @JsonSetter("SubAccountSID")
    public void setSubAccountSID (String value) { 
        this.subAccountSID = value;
    }
 
    /** GETTER
     * 0 to suspend or 1 to activate
     */
    @JsonGetter("Activate")
    public ActivateStatusEnum getActivate ( ) { 
        return this.activate;
    }
    
    /** SETTER
     * 0 to suspend or 1 to activate
     */
    @JsonSetter("Activate")
    public void setActivate (ActivateStatusEnum value) { 
        this.activate = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("ResponseType")
    public String getResponseType ( ) { 
        return this.responseType;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("ResponseType")
    public void setResponseType (String value) { 
        this.responseType = value;
    }
 
}
 