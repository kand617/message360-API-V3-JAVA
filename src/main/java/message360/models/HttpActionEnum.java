/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public enum HttpActionEnum {
    GET, //Get type
    POST; //Post Type

    private static TreeMap<String, HttpActionEnum> valueMap = new TreeMap<String, HttpActionEnum>();
    private String value;

    static {
        GET.value = "GET";
        POST.value = "POST";

        valueMap.put("GET", GET);
        valueMap.put("POST", POST);
    }

    /**
     * Returns the enum member associated with the given string value
     * @return The enum member against the given string value */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static HttpActionEnum fromString(String toConvert) {
        return valueMap.get(toConvert);
    }

    /**
     * Returns the string value associated with the enum member
     * @return The string value against enum member */
    @com.fasterxml.jackson.annotation.JsonValue
    public String value() {
        return value;
    }
        
    /**
     * Get string representation of this enum
     */
    @Override
    public String toString() {
        return value.toString();
    }

    /**
     * Convert list of HttpActionEnum values to list of string values
     * @param toConvert The list of HttpActionEnum values to convert
     * @return List of representative string values */
    public static List<String> toValue(List<HttpActionEnum> toConvert) {
        if(toConvert == null)
            return null;
        List<String> convertedValues = new ArrayList<String>();
        for (HttpActionEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 