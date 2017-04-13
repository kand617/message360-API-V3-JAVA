/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public enum SendEmailAsEnum {
    TEXT, //Email send as text format
    HTML; //Email send as HTML format

    private static TreeMap<String, SendEmailAsEnum> valueMap = new TreeMap<String, SendEmailAsEnum>();
    private String value;

    static {
        TEXT.value = "text";
        HTML.value = "html";

        valueMap.put("text", TEXT);
        valueMap.put("html", HTML);
    }

    /**
     * Returns the enum member associated with the given string value
     * @return The enum member against the given string value */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static SendEmailAsEnum fromString(String toConvert) {
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
     * Convert list of SendEmailAsEnum values to list of string values
     * @param toConvert The list of SendEmailAsEnum values to convert
     * @return List of representative string values */
    public static List<String> toValue(List<SendEmailAsEnum> toConvert) {
        if(toConvert == null)
            return null;
        List<String> convertedValues = new ArrayList<String>();
        for (SendEmailAsEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 