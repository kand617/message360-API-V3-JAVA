/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class CreateAddressInputBuilder {
    //the instance to build
    private CreateAddressInput createAddressInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateAddressInputBuilder() {
        createAddressInput = new CreateAddressInput();
    }

    /**
     * Name of user
     */
    public CreateAddressInputBuilder name(String name) {
        createAddressInput.setName(name);
        return this;
    }

    /**
     * Address of user.
     */
    public CreateAddressInputBuilder address(String address) {
        createAddressInput.setAddress(address);
        return this;
    }

    /**
     * Must be a 2 letter country short-name code (ISO 3166)
     */
    public CreateAddressInputBuilder country(String country) {
        createAddressInput.setCountry(country);
        return this;
    }

    /**
     * Must be a 2 letter State eg. CA for US. For Some Countries it can be greater than 2 letters.
     */
    public CreateAddressInputBuilder state(String state) {
        createAddressInput.setState(state);
        return this;
    }

    /**
     * City Name.
     */
    public CreateAddressInputBuilder city(String city) {
        createAddressInput.setCity(city);
        return this;
    }

    /**
     * Zip code of city.
     */
    public CreateAddressInputBuilder zip(String zip) {
        createAddressInput.setZip(zip);
        return this;
    }

    /**
     * Description of addresses.
     */
    public CreateAddressInputBuilder description(String description) {
        createAddressInput.setDescription(description);
        return this;
    }

    /**
     * Email Id of user.
     */
    public CreateAddressInputBuilder email(String email) {
        createAddressInput.setEmail(email);
        return this;
    }

    /**
     * Phone number of user.
     */
    public CreateAddressInputBuilder phone(String phone) {
        createAddressInput.setPhone(phone);
        return this;
    }

    /**
     * Response type either json or xml
     */
    public CreateAddressInputBuilder responseType(String responseType) {
        createAddressInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateAddressInput build() {
        return createAddressInput;
    }
}