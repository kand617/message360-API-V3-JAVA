/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public enum NumberTypeEnum {
    ALL, //Get all phone Number type
    VOICE, //Get only voice number type
    SMS; //Get Only SMs number type

    private static TreeMap<String, NumberTypeEnum> valueMap = new TreeMap<String, NumberTypeEnum>();
    private String value;

    static {
        ALL.value = "all";
        VOICE.value = "voice";
        SMS.value = "sms";

        valueMap.put("all", ALL);
        valueMap.put("voice", VOICE);
        valueMap.put("sms", SMS);
    }

    /**
     * Returns the enum member associated with the given string value
     * @return The enum member against the given string value */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static NumberTypeEnum fromString(String toConvert) {
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
     * Convert list of NumberTypeEnum values to list of string values
     * @param toConvert The list of NumberTypeEnum values to convert
     * @return List of representative string values */
    public static List<String> toValue(List<NumberTypeEnum> toConvert) {
        if(toConvert == null)
            return null;
        List<String> convertedValues = new ArrayList<String>();
        for (NumberTypeEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 