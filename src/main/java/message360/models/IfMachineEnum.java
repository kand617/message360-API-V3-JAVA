/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public enum IfMachineEnum {
    CONTINUE, //TODO: Write general description for this element
    HANGUP; //TODO: Write general description for this element

    private static TreeMap<String, IfMachineEnum> valueMap = new TreeMap<String, IfMachineEnum>();
    private String value;

    static {
        CONTINUE.value = "continue";
        HANGUP.value = "hangup";

        valueMap.put("continue", CONTINUE);
        valueMap.put("hangup", HANGUP);
    }

    /**
     * Returns the enum member associated with the given string value
     * @return The enum member against the given string value */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static IfMachineEnum fromString(String toConvert) {
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
     * Convert list of IfMachineEnum values to list of string values
     * @param toConvert The list of IfMachineEnum values to convert
     * @return List of representative string values */
    public static List<String> toValue(List<IfMachineEnum> toConvert) {
        if(toConvert == null)
            return null;
        List<String> convertedValues = new ArrayList<String>();
        for (IfMachineEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 