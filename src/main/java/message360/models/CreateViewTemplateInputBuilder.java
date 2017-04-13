/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;

public class CreateViewTemplateInputBuilder {
    //the instance to build
    private CreateViewTemplateInput createViewTemplateInput;

    /**
     * Default constructor to initialize the instance
     */
    public CreateViewTemplateInputBuilder() {
        createViewTemplateInput = new CreateViewTemplateInput();
    }

    /**
     * The unique identifier for a template object
     */
    public CreateViewTemplateInputBuilder templateid(UUID templateid) {
        createViewTemplateInput.setTemplateid(templateid);
        return this;
    }

    /**
     * Response type format xml or json
     */
    public CreateViewTemplateInputBuilder responseType(String responseType) {
        createViewTemplateInput.setResponseType(responseType);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public CreateViewTemplateInput build() {
        return createViewTemplateInput;
    }
}