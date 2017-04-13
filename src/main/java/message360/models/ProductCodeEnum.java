/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public enum ProductCodeEnum {
    ALL, //TODO: Write general description for this element
    OUTBOUND_CALL, //TODO: Write general description for this element
    INBOUND_CALL, //TODO: Write general description for this element
    OUTBOUND_SMS, //TODO: Write general description for this element
    INBOUND_SMS, //TODO: Write general description for this element
    TRANSCRIPTION, //TODO: Write general description for this element
    EMAIL, //TODO: Write general description for this element
    CONFERENCE, //TODO: Write general description for this element
    CARRIER, //TODO: Write general description for this element
    NUMBER_PURCHASED, //TODO: Write general description for this element
    DIRECT_MAIL_AREAMAIL, //TODO: Write general description for this element
    DIRECT_MAIL_POSTCARD, //TODO: Write general description for this element
    DIRECT_MAIL_LETTERS, //TODO: Write general description for this element
    DIRECT_MAIL_VERIFIED_ADDRESS; //TODO: Write general description for this element

    private static TreeMap<Integer, ProductCodeEnum> valueMap = new TreeMap<Integer, ProductCodeEnum>();
    private Integer value;

    static {
        ALL.value = 0;
        OUTBOUND_CALL.value = 1;
        INBOUND_CALL.value = 2;
        OUTBOUND_SMS.value = 3;
        INBOUND_SMS.value = 4;
        TRANSCRIPTION.value = 5;
        EMAIL.value = 6;
        CONFERENCE.value = 7;
        CARRIER.value = 8;
        NUMBER_PURCHASED.value = 9;
        DIRECT_MAIL_AREAMAIL.value = 10;
        DIRECT_MAIL_POSTCARD.value = 11;
        DIRECT_MAIL_LETTERS.value = 12;
        DIRECT_MAIL_VERIFIED_ADDRESS.value = 13;

        valueMap.put(0, ALL);
        valueMap.put(1, OUTBOUND_CALL);
        valueMap.put(2, INBOUND_CALL);
        valueMap.put(3, OUTBOUND_SMS);
        valueMap.put(4, INBOUND_SMS);
        valueMap.put(5, TRANSCRIPTION);
        valueMap.put(6, EMAIL);
        valueMap.put(7, CONFERENCE);
        valueMap.put(8, CARRIER);
        valueMap.put(9, NUMBER_PURCHASED);
        valueMap.put(10, DIRECT_MAIL_AREAMAIL);
        valueMap.put(11, DIRECT_MAIL_POSTCARD);
        valueMap.put(12, DIRECT_MAIL_LETTERS);
        valueMap.put(13, DIRECT_MAIL_VERIFIED_ADDRESS);
    }

    /**
     * Returns the enum member associated with the given integer value
     * @return The enum member against the given integer value */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static ProductCodeEnum fromInteger(Integer toConvert) {
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
     * Convert list of ProductCodeEnum values to list of integer values
     * @param toConvert The list of ProductCodeEnum values to convert
     * @return List of representative integer values */
    public static List<Integer> toValue(List<ProductCodeEnum> toConvert) {
        if(toConvert == null)
            return null;
        List<Integer> convertedValues = new ArrayList<Integer>();
        for (ProductCodeEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 