/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateTokenInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5459178385193707290L;
    private String accountSid;
    private String authToken;
    private String username;
    private String password;
    /** GETTER
     * Your message360 Account SID
     */
    @JsonGetter("account_sid")
    public String getAccountSid ( ) { 
        return this.accountSid;
    }
    
    /** SETTER
     * Your message360 Account SID
     */
    @JsonSetter("account_sid")
    public void setAccountSid (String value) { 
        this.accountSid = value;
    }
 
    /** GETTER
     * Your message360 Token
     */
    @JsonGetter("auth_token")
    public String getAuthToken ( ) { 
        return this.authToken;
    }
    
    /** SETTER
     * Your message360 Token
     */
    @JsonSetter("auth_token")
    public void setAuthToken (String value) { 
        this.authToken = value;
    }
 
    /** GETTER
     * WebRTC username authentication
     */
    @JsonGetter("username")
    public String getUsername ( ) { 
        return this.username;
    }
    
    /** SETTER
     * WebRTC username authentication
     */
    @JsonSetter("username")
    public void setUsername (String value) { 
        this.username = value;
    }
 
    /** GETTER
     * WebRTC password authentication
     */
    @JsonGetter("password")
    public String getPassword ( ) { 
        return this.password;
    }
    
    /** SETTER
     * WebRTC password authentication
     */
    @JsonSetter("password")
    public void setPassword (String value) { 
        this.password = value;
    }
 
}
 