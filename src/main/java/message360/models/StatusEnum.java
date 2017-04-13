/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public enum StatusEnum {
    INPROGRESS, //TODO: Write general description for this element
    SUCCESS, //TODO: Write general description for this element
    FAILURE; //TODO: Write general description for this element

    private static TreeMap<String, StatusEnum> valueMap = new TreeMap<String, StatusEnum>();
    private String value;

    static {
        INPROGRESS.value = "inprogress";
        SUCCESS.value = "success";
        FAILURE.value = "failure";

        valueMap.put("inprogress", INPROGRESS);
        valueMap.put("success", SUCCESS);
        valueMap.put("failure", FAILURE);
    }

    /**
     * Returns the enum member associated with the given string value
     * @return The enum member against the given string value */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static StatusEnum fromString(String toConvert) {
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
     * Convert list of StatusEnum values to list of string values
     * @param toConvert The list of StatusEnum values to convert
     * @return List of representative string values */
    public static List<String> toValue(List<StatusEnum> toConvert) {
        if(toConvert == null)
            return null;
        List<String> convertedValues = new ArrayList<String>();
        for (StatusEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 