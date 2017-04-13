/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public enum MergeNumberStatusEnum {
    DELETE, //TODO: Write general description for this element
    MERGE; //TODO: Write general description for this element

    private static TreeMap<Integer, MergeNumberStatusEnum> valueMap = new TreeMap<Integer, MergeNumberStatusEnum>();
    private Integer value;

    static {
        DELETE.value = 0;
        MERGE.value = 1;

        valueMap.put(0, DELETE);
        valueMap.put(1, MERGE);
    }

    /**
     * Returns the enum member associated with the given integer value
     * @return The enum member against the given integer value */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static MergeNumberStatusEnum fromInteger(Integer toConvert) {
        return valueMap.get(toConvert);
    }

    /**
     * Returns the integer value associated with the enum member
     * @return The integer value against enum member */
    @com.fasterxml.jackson.annotation.JsonValue
    public Integer value() {
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
     * Convert list of MergeNumberStatusEnum values to list of integer values
     * @param toConvert The list of MergeNumberStatusEnum values to convert
     * @return List of representative integer values */
    public static List<Integer> toValue(List<MergeNumberStatusEnum> toConvert) {
        if(toConvert == null)
            return null;
        List<Integer> convertedValues = new ArrayList<Integer>();
        for (MergeNumberStatusEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 