/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public enum DirectionEnum {
    IN, //in direction
    OUT, //out direction
    BOTH; //both

    private static TreeMap<String, DirectionEnum> valueMap = new TreeMap<String, DirectionEnum>();
    private String value;

    static {
        IN.value = "in";
        OUT.value = "out";
        BOTH.value = "both";

        valueMap.put("in", IN);
        valueMap.put("out", OUT);
        valueMap.put("both", BOTH);
    }

    /**
     * Returns the enum member associated with the given string value
     * @return The enum member against the given string value */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static DirectionEnum fromString(String toConvert) {
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
     * Convert list of DirectionEnum values to list of string values
     * @param toConvert The list of DirectionEnum values to convert
     * @return List of representative string values */
    public static List<String> toValue(List<DirectionEnum> toConvert) {
        if(toConvert == null)
            return null;
        List<String> convertedValues = new ArrayList<String>();
        for (DirectionEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 