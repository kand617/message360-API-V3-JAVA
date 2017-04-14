/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateListUsageInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5468927625958254073L;
    private ProductCodeEnum productCode = ProductCodeEnum.ALL;
    private String startDate = "2016-09-06";
    private String endDate = "2016-09-06";
    private String responseType = "json";
    /** GETTER
     * Product Code
     */
    @JsonGetter("ProductCode")
    public ProductCodeEnum getProductCode ( ) { 
        return this.productCode;
    }
    
    /** SETTER
     * Product Code
     */
    @JsonSetter("ProductCode")
    public void setProductCode (ProductCodeEnum value) { 
        this.productCode = value;
    }
 
    /** GETTER
     * Start Usage Date
     */
    @JsonGetter("startDate")
    public String getStartDate ( ) { 
        return this.startDate;
    }
    
    /** SETTER
     * Start Usage Date
     */
    @JsonSetter("startDate")
    public void setStartDate (String value) { 
        this.startDate = value;
    }
 
    /** GETTER
     * End Usage Date
     */
    @JsonGetter("endDate")
    public String getEndDate ( ) { 
        return this.endDate;
    }
    
    /** SETTER
     * End Usage Date
     */
    @JsonSetter("endDate")
    public void setEndDate (String value) { 
        this.endDate = value;
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
 