/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class CreateListTemplatesInputBuilder {
    //the instance to build
    private CreateListTemplatesInput createListTemplatesInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateListTemplatesInputBuilder() {
        createListTemplatesInput = new CreateListTemplatesInput();
    }

    /**
     * The type (category) of template Valid values: marketing, authorization
     */
    public CreateListTemplatesInputBuilder type(String type) {
        createListTemplatesInput.setType(type);
        return this;
    }

    /**
     * The page count to retrieve from the total results in the collection. Page indexing starts at 1.
     */
    public CreateListTemplatesInputBuilder page(Integer page) {
        createListTemplatesInput.setPage(page);
        return this;
    }

    /**
     * The count of objects to return per page.
     */
    public CreateListTemplatesInputBuilder pagesize(Integer pagesize) {
        createListTemplatesInput.setPagesize(pagesize);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public CreateListTemplatesInputBuilder responseType(String responseType) {
        createListTemplatesInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateListTemplatesInput build() {
        return createListTemplatesInput;
    }
}