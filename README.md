# Getting started

## How to Build

The generated code uses a few Maven dependencies e.g., Jackson, UniRest,
and Apache HttpClient. The reference to these dependencies is already
added in the pom.xml file will be installed automatically. Therefore,
you will need internet access for a successful build.

* In order to open the client library in Eclipse click on ``` File -> Import ```.

![Importing SDK into Eclipse - Step 1](https://apidocs.io/illustration/java?step=import0&workspaceFolder=Message360-Java&workspaceName=Message360&projectName=Message360&rootNamespace=message360)

* In the import dialog, select ``` Existing Java Project ``` and click ``` Next ```.

![Importing SDK into Eclipse - Step 2](https://apidocs.io/illustration/java?step=import1&workspaceFolder=Message360-Java&workspaceName=Message360&projectName=Message360&rootNamespace=message360)

* Browse to locate the folder containing the source code. Select the detected location of the project and click ``` Finish ```.

![Importing SDK into Eclipse - Step 3](https://apidocs.io/illustration/java?step=import2&workspaceFolder=Message360-Java&workspaceName=Message360&projectName=Message360&rootNamespace=message360)

* Upon successful import, the project will be automatically built by Eclipse after automatically resolving the dependencies.

![Importing SDK into Eclipse - Step 4](https://apidocs.io/illustration/java?step=import3&workspaceFolder=Message360-Java&workspaceName=Message360&projectName=Message360&rootNamespace=message360)

## How to Use

The following section explains how to use the Message360 library in a new console project.

### 1. Starting a new project

For starting a new project, click the menu command ``` File > New > Project ```.

![Add a new project in Eclipse](https://apidocs.io/illustration/java?step=createNewProject0&workspaceFolder=Message360-Java&workspaceName=Message360&projectName=Message360&rootNamespace=message360)

Next, choose ``` Maven > Maven Project ```and click ``` Next ```.

![Create a new Maven Project - Step 1](https://apidocs.io/illustration/java?step=createNewProject1&workspaceFolder=Message360-Java&workspaceName=Message360&projectName=Message360&rootNamespace=message360)

Here, make sure to use the current workspace by choosing ``` Use default Workspace location ```, as shown in the picture below and click ``` Next ```.

![Create a new Maven Project - Step 2](https://apidocs.io/illustration/java?step=createNewProject2&workspaceFolder=Message360-Java&workspaceName=Message360&projectName=Message360&rootNamespace=message360)

Following this, select the *quick start* project type to create a simple project with an existing class and a ``` main ``` method. To do this, choose ``` maven-archetype-quickstart ``` item from the list and click ``` Next ```.

![Create a new Maven Project - Step 3](https://apidocs.io/illustration/java?step=createNewProject3&workspaceFolder=Message360-Java&workspaceName=Message360&projectName=Message360&rootNamespace=message360)

In the last step, provide a ``` Group Id ``` and ``` Artifact Id ``` as shown in the picture below and click ``` Finish ```.

![Create a new Maven Project - Step 4](https://apidocs.io/illustration/java?step=createNewProject4&workspaceFolder=Message360-Java&workspaceName=Message360&projectName=Message360&rootNamespace=message360)

### 2. Add reference of the library project

The created Maven project manages its dependencies using its ``` pom.xml ``` file. In order to add a dependency on the *Message360* client library, double click on the ``` pom.xml ``` file in the ``` Package Explorer ```. Opening the ``` pom.xml ``` file will render a graphical view on the cavas. Here, switch to the ``` Dependencies ``` tab and click the ``` Add ``` button as shown in the picture below.

![Adding dependency to the client library - Step 1](https://apidocs.io/illustration/java?step=testProject0&workspaceFolder=Message360-Java&workspaceName=Message360&projectName=Message360&rootNamespace=message360)

Clicking the ``` Add ``` button will open a dialog where you need to specify Message360 in ``` Group Id ``` and Message360 in the ``` Artifact Id ``` fields. Once added click ``` OK ```. Save the ``` pom.xml ``` file.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/java?step=testProject1&workspaceFolder=Message360-Java&workspaceName=Message360&projectName=Message360&rootNamespace=message360)

### 3. Write sample code

Once the ``` SimpleConsoleApp ``` is created, a file named ``` App.java ``` will be visible in the *Package Explorer* with a ``` main ``` method. This is the entry point for the execution of the created project.
Here, you can add code to initialize the client library and instantiate a *Controller* class. Sample code to initialize the client library and using controller methods is given in the subsequent sections.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/java?step=testProject2&workspaceFolder=Message360-Java&workspaceName=Message360&projectName=Message360&rootNamespace=message360)

## How to Test

The generated code and the server can be tested using automatically generated test cases. 
JUnit is used as the testing framework and test runner.

In Eclipse, for running the tests do the following:

1. Select the project *Message360* from the package explorer.
2. Select "Run -> Run as -> JUnit Test" or use "Alt + Shift + X" followed by "T" to run the Tests.

## Initialization

### Authentication
In order to setup authentication and initialization of the API client, you need the following information.

| Parameter | Description |
|-----------|-------------|
| basicAuthUserName | The username to use with basic authentication |
| basicAuthPassword | The password to use with basic authentication |



API client can be initialized as following.

```java
// Initializing Object Mapper for Serialization and Deserialization purposes
public static ObjectMapper mapper = new ObjectMapper()
{
	private static final long serialVersionUID = -174113593500315394L;
	{
		configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		setSerializationInclusion(JsonInclude.Include.NON_NULL);
	}
};

// Configuration parameters and credentials
String basicAuthUserName = "basicAuthUserName"; // The username to use with basic authentication
String basicAuthPassword = "basicAuthPassword"; // The password to use with basic authentication

Message360Client client = new Message360Client(basicAuthUserName, basicAuthPassword);
```

## Class Reference

### <a name="list_of_controllers"></a>List of Controllers

* [ShortCodeController](#short_code_controller)
* [ConferenceController](#conference_controller)
* [EmailController](#email_controller)
* [NumberVerificationController](#number_verification_controller)
* [CarrierController](#carrier_controller)
* [CallController](#call_controller)
* [WebRTCController](#web_rtc_controller)
* [SubAccountController](#sub_account_controller)
* [AddressController](#address_controller)
* [PhoneNumberController](#phone_number_controller)
* [RecordingController](#recording_controller)
* [SMSController](#sms_controller)
* [TranscriptionController](#transcription_controller)
* [UsageController](#usage_controller)
* [AccountController](#account_controller)

### <a name="short_code_controller"></a>![Class: ](https://apidocs.io/img/class.png "message360.controllers.ShortCodeController") ShortCodeController

#### Get singleton instance

The singleton instance of the ``` ShortCodeController ``` class can be accessed from the API Client.

```java
ShortCodeController shortCode = client.getShortCode();
```

#### <a name="create_view_template_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.ShortCodeController.createViewTemplateAsync") createViewTemplateAsync

> View a Shared ShortCode Template


```java
void createViewTemplateAsync(
        final CreateViewTemplateInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| templateid |  ``` Required ```  | The unique identifier for a template object |
| responseType |  ``` Required ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
CreateViewTemplateInput collect = new CreateViewTemplateInput();

UUID templateid = UUID.randomUUID();
collect.setTemplateid(templateid);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
shortCode.createViewTemplateAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


#### <a name="create_send_short_code_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.ShortCodeController.createSendShortCodeAsync") createSendShortCodeAsync

> Send an SMS from a message360 ShortCode


```java
void createSendShortCodeAsync(
        final CreateSendShortCodeInput input,
        Map<String, Object> fieldParameters,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| shortcode |  ``` Required ```  | The Short Code number that is the sender of this message |
| tocountrycode |  ``` Required ```  ``` DefaultValue ```  | The country code for sending this message |
| to |  ``` Required ```  | A valid 10-digit number that should receive the message+ |
| templateid |  ``` Required ```  | The unique identifier for the template used for the message |
| method |  ``` Optional ```  ``` DefaultValue ```  | Specifies the HTTP method used to request the required URL once the Short Code message is sent. |
| messageStatusCallback |  ``` Optional ```  | URL that can be requested to receive notification when Short Code message was sent. |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response type format xml or json |
| fieldParameters | ``` Optional ``` | Additional optional form parameters are supported by this method |


#### Example Usage

```java
CreateSendShortCodeInput collect = new CreateSendShortCodeInput();

String shortcode = "shortcode";
collect.setShortcode(shortcode);

String tocountrycode = "1";
collect.setTocountrycode(tocountrycode);

String to = "to";
collect.setTo(to);

UUID templateid = UUID.randomUUID();
collect.setTemplateid(templateid);

String method = "GET";
collect.setMethod(method);

String messageStatusCallback = "MessageStatusCallback";
collect.setMessageStatusCallback(messageStatusCallback);

String responseType = "json";
collect.setResponseType(responseType);

// key-value map for optional form parameters
Map<String, Object> formParams = new LinkedHashMap<String, Object>();
// Invoking the API call with sample inputs
shortCode.createSendShortCodeAsync(collect, , formParams, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


#### <a name="create_list_inbound_short_code_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.ShortCodeController.createListInboundShortCodeAsync") createListInboundShortCodeAsync

> List All Inbound ShortCode


```java
void createListInboundShortCodeAsync(
        final CreateListInboundShortCodeInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Optional ```  | Which page of the overall response will be returned. Zero indexed |
| pagesize |  ``` Optional ```  ``` DefaultValue ```  | Number of individual resources listed in the response per page |
| from |  ``` Optional ```  | From Number to Inbound ShortCode |
| shortcode |  ``` Optional ```  | Only list messages sent to this Short Code |
| dateReceived |  ``` Optional ```  | Only list messages sent with the specified date |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
CreateListInboundShortCodeInput collect = new CreateListInboundShortCodeInput();

Integer page = 27;
collect.setPage(page);

Integer pagesize = 10;
collect.setPagesize(pagesize);

String from = "from";
collect.setFrom(from);

String shortcode = "Shortcode";
collect.setShortcode(shortcode);

String dateReceived = "DateReceived";
collect.setDateReceived(dateReceived);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
shortCode.createListInboundShortCodeAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


#### <a name="create_list_short_code_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.ShortCodeController.createListShortCodeAsync") createListShortCodeAsync

> List ShortCode Messages


```java
void createListShortCodeAsync(
        final CreateListShortCodeInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Optional ```  | Which page of the overall response will be returned. Zero indexed |
| pagesize |  ``` Optional ```  ``` DefaultValue ```  | Number of individual resources listed in the response per page |
| from |  ``` Optional ```  | Messages sent from this number |
| to |  ``` Optional ```  | Messages sent to this number |
| datesent |  ``` Optional ```  | Only list SMS messages sent in the specified date range |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
CreateListShortCodeInput collect = new CreateListShortCodeInput();

Integer page = 27;
collect.setPage(page);

Integer pagesize = 10;
collect.setPagesize(pagesize);

String from = "from";
collect.setFrom(from);

String to = "to";
collect.setTo(to);

String datesent = "datesent";
collect.setDatesent(datesent);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
shortCode.createListShortCodeAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


#### <a name="create_list_templates_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.ShortCodeController.createListTemplatesAsync") createListTemplatesAsync

> List Shortcode Templates by Type


```java
void createListTemplatesAsync(
        final CreateListTemplatesInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| type |  ``` Optional ```  ``` DefaultValue ```  | The type (category) of template Valid values: marketing, authorization |
| page |  ``` Optional ```  | The page count to retrieve from the total results in the collection. Page indexing starts at 1. |
| pagesize |  ``` Optional ```  ``` DefaultValue ```  | The count of objects to return per page. |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
CreateListTemplatesInput collect = new CreateListTemplatesInput();

String type = "authorization";
collect.setType(type);

Integer page = 27;
collect.setPage(page);

Integer pagesize = 10;
collect.setPagesize(pagesize);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
shortCode.createListTemplatesAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


#### <a name="create_view_short_code_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.ShortCodeController.createViewShortCodeAsync") createViewShortCodeAsync

> View a ShortCode Message


```java
void createViewShortCodeAsync(
        final CreateViewShortCodeInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| messagesid |  ``` Required ```  | Message sid |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
CreateViewShortCodeInput collect = new CreateViewShortCodeInput();

String messagesid = "messagesid";
collect.setMessagesid(messagesid);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
shortCode.createViewShortCodeAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


[Back to List of Controllers](#list_of_controllers)

### <a name="conference_controller"></a>![Class: ](https://apidocs.io/img/class.png "message360.controllers.ConferenceController") ConferenceController

#### Get singleton instance

The singleton instance of the ``` ConferenceController ``` class can be accessed from the API Client.

```java
ConferenceController conference = client.getConference();
```

#### <a name="create_deaf_mute_participant_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.ConferenceController.createDeafMuteParticipantAsync") createDeafMuteParticipantAsync

> Deaf Mute Participant


```java
void createDeafMuteParticipantAsync(
        final CreateDeafMuteParticipantInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| conferenceSid |  ``` Required ```  | TODO: Add a parameter description |
| participantSid |  ``` Required ```  | TODO: Add a parameter description |
| muted |  ``` Optional ```  | TODO: Add a parameter description |
| deaf |  ``` Optional ```  | TODO: Add a parameter description |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response Type either json or xml |


#### Example Usage

```java
CreateDeafMuteParticipantInput collect = new CreateDeafMuteParticipantInput();

String conferenceSid = "conferenceSid";
collect.setConferenceSid(conferenceSid);

String participantSid = "ParticipantSid";
collect.setParticipantSid(participantSid);

Boolean muted = false;
collect.setMuted(muted);

Boolean deaf = false;
collect.setDeaf(deaf);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
conference.createDeafMuteParticipantAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


#### <a name="create_list_conference_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.ConferenceController.createListConferenceAsync") createListConferenceAsync

> List Conference


```java
void createListConferenceAsync(
        final CreateListConferenceInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Optional ```  | Which page of the overall response will be returned. Zero indexed |
| pageSize |  ``` Optional ```  | Number of individual resources listed in the response per page |
| friendlyName |  ``` Optional ```  | Only return conferences with the specified FriendlyName |
| status |  ``` Optional ```  | TODO: Add a parameter description |
| dateCreated |  ``` Optional ```  | TODO: Add a parameter description |
| dateUpdated |  ``` Optional ```  | TODO: Add a parameter description |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
CreateListConferenceInput collect = new CreateListConferenceInput();

Integer page = 27;
collect.setPage(page);

Integer pageSize = 27;
collect.setPageSize(pageSize);

String friendlyName = "FriendlyName";
collect.setFriendlyName(friendlyName);

InterruptedCallStatusEnum status = InterruptedCallStatusEnum.fromString("CANCELED");
collect.setStatus(status);

String dateCreated = "DateCreated";
collect.setDateCreated(dateCreated);

String dateUpdated = "DateUpdated";
collect.setDateUpdated(dateUpdated);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
conference.createListConferenceAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


#### <a name="create_view_conference_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.ConferenceController.createViewConferenceAsync") createViewConferenceAsync

> View Conference


```java
void createViewConferenceAsync(
        final CreateViewConferenceInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| conferencesid |  ``` Required ```  | The unique identifier of each conference resource |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
CreateViewConferenceInput collect = new CreateViewConferenceInput();

String conferencesid = "conferencesid";
collect.setConferencesid(conferencesid);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
conference.createViewConferenceAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


#### <a name="add_participant_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.ConferenceController.addParticipantAsync") addParticipantAsync

> Add Participant in conference 


```java
void addParticipantAsync(
        final AddParticipantInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| conferencesid |  ``` Required ```  | Unique Conference Sid |
| participantnumber |  ``` Required ```  | Particiant Number |
| tocountrycode |  ``` Required ```  | TODO: Add a parameter description |
| muted |  ``` Optional ```  | TODO: Add a parameter description |
| deaf |  ``` Optional ```  | TODO: Add a parameter description |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
AddParticipantInput collect = new AddParticipantInput();

String conferencesid = "conferencesid";
collect.setConferencesid(conferencesid);

String participantnumber = "participantnumber";
collect.setParticipantnumber(participantnumber);

int tocountrycode = 27;
collect.setTocountrycode(tocountrycode);

Boolean muted = false;
collect.setMuted(muted);

Boolean deaf = false;
collect.setDeaf(deaf);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
conference.addParticipantAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


#### <a name="create_list_participant_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.ConferenceController.createListParticipantAsync") createListParticipantAsync

> List Participant


```java
void createListParticipantAsync(
        final CreateListParticipantInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| conferenceSid |  ``` Required ```  | unique conference sid |
| page |  ``` Optional ```  | page number |
| pagesize |  ``` Optional ```  | TODO: Add a parameter description |
| muted |  ``` Optional ```  | TODO: Add a parameter description |
| deaf |  ``` Optional ```  | TODO: Add a parameter description |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response format, xml or json |


#### Example Usage

```java
CreateListParticipantInput collect = new CreateListParticipantInput();

String conferenceSid = "ConferenceSid";
collect.setConferenceSid(conferenceSid);

Integer page = 27;
collect.setPage(page);

Integer pagesize = 27;
collect.setPagesize(pagesize);

Boolean muted = false;
collect.setMuted(muted);

Boolean deaf = false;
collect.setDeaf(deaf);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
conference.createListParticipantAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


#### <a name="create_view_participant_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.ConferenceController.createViewParticipantAsync") createViewParticipantAsync

> View Participant


```java
void createViewParticipantAsync(
        final CreateViewParticipantInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| conferenceSid |  ``` Required ```  | unique conference sid |
| participantSid |  ``` Required ```  | TODO: Add a parameter description |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
CreateViewParticipantInput collect = new CreateViewParticipantInput();

String conferenceSid = "ConferenceSid";
collect.setConferenceSid(conferenceSid);

String participantSid = "ParticipantSid";
collect.setParticipantSid(participantSid);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
conference.createViewParticipantAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


[Back to List of Controllers](#list_of_controllers)

### <a name="email_controller"></a>![Class: ](https://apidocs.io/img/class.png "message360.controllers.EmailController") EmailController

#### Get singleton instance

The singleton instance of the ``` EmailController ``` class can be accessed from the API Client.

```java
EmailController email = client.getEmail();
```

#### <a name="create_delete_invalid_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.EmailController.createDeleteInvalidAsync") createDeleteInvalidAsync

> This endpoint allows you to delete entries in the Invalid Emails list.


```java
void createDeleteInvalidAsync(
        final CreateDeleteInvalidInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| email |  ``` Required ```  | TODO: Add a parameter description |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | TODO: Add a parameter description |


#### Example Usage

```java
CreateDeleteInvalidInput collect = new CreateDeleteInvalidInput();

String email = "email";
collect.setEmail(email);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
email.createDeleteInvalidAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


#### <a name="create_list_blocks_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.EmailController.createListBlocksAsync") createListBlocksAsync

> Outputs email addresses on your blocklist


```java
void createListBlocksAsync(
        final CreateListBlocksInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| offset |  ``` Optional ```  | Where to start in the output list |
| limit |  ``` Optional ```  | Maximum number of records to return |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
CreateListBlocksInput collect = new CreateListBlocksInput();

String offset = "offset";
collect.setOffset(offset);

String limit = "limit";
collect.setLimit(limit);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
email.createListBlocksAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


#### <a name="create_list_spam_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.EmailController.createListSpamAsync") createListSpamAsync

> List out all email addresses marked as spam


```java
void createListSpamAsync(
        final CreateListSpamInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response type format xml or json |
| offset |  ``` Optional ```  | The record number to start the list at |
| limit |  ``` Optional ```  | Maximum number of records to return |


#### Example Usage

```java
CreateListSpamInput collect = new CreateListSpamInput();

String responseType = "json";
collect.setResponseType(responseType);

String offset = "offset";
collect.setOffset(offset);

String limit = "limit";
collect.setLimit(limit);

// Invoking the API call with sample inputs
email.createListSpamAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


#### <a name="create_list_bounces_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.EmailController.createListBouncesAsync") createListBouncesAsync

> List out all email addresses that have bounced


```java
void createListBouncesAsync(
        final CreateListBouncesInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response type format xml or json |
| offset |  ``` Optional ```  | The record to start the list at |
| limit |  ``` Optional ```  | The maximum number of records to return |


#### Example Usage

```java
CreateListBouncesInput collect = new CreateListBouncesInput();

String responseType = "json";
collect.setResponseType(responseType);

String offset = "offset";
collect.setOffset(offset);

String limit = "limit";
collect.setLimit(limit);

// Invoking the API call with sample inputs
email.createListBouncesAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


#### <a name="create_delete_bounces_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.EmailController.createDeleteBouncesAsync") createDeleteBouncesAsync

> Delete an email address from the bounced address list


```java
void createDeleteBouncesAsync(
        final CreateDeleteBouncesInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| email |  ``` Required ```  | The email address to remove from the bounce list |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
CreateDeleteBouncesInput collect = new CreateDeleteBouncesInput();

String email = "email";
collect.setEmail(email);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
email.createDeleteBouncesAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


#### <a name="create_list_invalid_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.EmailController.createListInvalidAsync") createListInvalidAsync

> List out all invalid email addresses


```java
void createListInvalidAsync(
        final CreateListInvalidInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response type format xml or json |
| offet |  ``` Optional ```  | Starting record for listing out emails |
| limit |  ``` Optional ```  | Maximum number of records to return |


#### Example Usage

```java
CreateListInvalidInput collect = new CreateListInvalidInput();

String responseType = "json";
collect.setResponseType(responseType);

String offet = "offet";
collect.setOffet(offet);

String limit = "limit";
collect.setLimit(limit);

// Invoking the API call with sample inputs
email.createListInvalidAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


#### <a name="create_list_unsubscribes_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.EmailController.createListUnsubscribesAsync") createListUnsubscribesAsync

> List all unsubscribed email addresses


```java
void createListUnsubscribesAsync(
        final CreateListUnsubscribesInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response type format xml or json |
| offset |  ``` Optional ```  | Starting record of the list |
| limit |  ``` Optional ```  | Maximum number of records to be returned |


#### Example Usage

```java
CreateListUnsubscribesInput collect = new CreateListUnsubscribesInput();

String responseType = "json";
collect.setResponseType(responseType);

String offset = "offset";
collect.setOffset(offset);

String limit = "limit";
collect.setLimit(limit);

// Invoking the API call with sample inputs
email.createListUnsubscribesAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


#### <a name="create_delete_unsubscribes_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.EmailController.createDeleteUnsubscribesAsync") createDeleteUnsubscribesAsync

> Delete emails from the unsubscribe list


```java
void createDeleteUnsubscribesAsync(
        final CreateDeleteUnsubscribesInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| email |  ``` Required ```  | The email to remove from the unsubscribe list |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
CreateDeleteUnsubscribesInput collect = new CreateDeleteUnsubscribesInput();

String email = "email";
collect.setEmail(email);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
email.createDeleteUnsubscribesAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


#### <a name="add_unsubscribes_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.EmailController.addUnsubscribesAsync") addUnsubscribesAsync

> Add an email to the unsubscribe list


```java
void addUnsubscribesAsync(
        final AddUnsubscribesInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| email |  ``` Required ```  | The email to add to the unsubscribe list |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
AddUnsubscribesInput collect = new AddUnsubscribesInput();

String email = "email";
collect.setEmail(email);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
email.addUnsubscribesAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


#### <a name="create_delete_block_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.EmailController.createDeleteBlockAsync") createDeleteBlockAsync

> Deletes a blocked email


```java
void createDeleteBlockAsync(
        final CreateDeleteBlockInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| email |  ``` Required ```  | Email address to remove from block list |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
CreateDeleteBlockInput collect = new CreateDeleteBlockInput();

String email = "email";
collect.setEmail(email);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
email.createDeleteBlockAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


#### <a name="create_delete_spam_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.EmailController.createDeleteSpamAsync") createDeleteSpamAsync

> Deletes a email address marked as spam from the spam list


```java
void createDeleteSpamAsync(
        final CreateDeleteSpamInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| email |  ``` Required ```  | Email address |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
CreateDeleteSpamInput collect = new CreateDeleteSpamInput();

String email = "email";
collect.setEmail(email);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
email.createDeleteSpamAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


#### <a name="create_send_email_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.EmailController.createSendEmailAsync") createSendEmailAsync

> Send out an email


```java
void createSendEmailAsync(
        final CreateSendEmailInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| to |  ``` Required ```  | The to email address |
| from |  ``` Required ```  | The from email address |
| type |  ``` Required ```  ``` DefaultValue ```  | email format type, html or text |
| subject |  ``` Required ```  | Email subject |
| message |  ``` Required ```  | The body of the email message |
| cc |  ``` Optional ```  | CC Email address |
| bcc |  ``` Optional ```  | BCC Email address |
| attachment |  ``` Optional ```  | File to be attached.File must be less than 7MB. |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
CreateSendEmailInput collect = new CreateSendEmailInput();

String to = "to";
collect.setTo(to);

String from = "from";
collect.setFrom(from);

SendEmailAsEnum type = SendEmailAsEnum.fromString("HTML");
collect.setType(type);

String subject = "subject";
collect.setSubject(subject);

String message = "message";
collect.setMessage(message);

String cc = "cc";
collect.setCc(cc);

String bcc = "bcc";
collect.setBcc(bcc);

String attachment = "attachment";
collect.setAttachment(attachment);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
email.createSendEmailAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


[Back to List of Controllers](#list_of_controllers)

### <a name="number_verification_controller"></a>![Class: ](https://apidocs.io/img/class.png "message360.controllers.NumberVerificationController") NumberVerificationController

#### Get singleton instance

The singleton instance of the ``` NumberVerificationController ``` class can be accessed from the API Client.

```java
NumberVerificationController numberVerification = client.getNumberVerification();
```

#### <a name="create_verify_number_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.NumberVerificationController.createVerifyNumberAsync") createVerifyNumberAsync

> Number Verification


```java
void createVerifyNumberAsync(
        final CreateVerifyNumberInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| phonenumber |  ``` Required ```  | TODO: Add a parameter description |
| type |  ``` Required ```  | TODO: Add a parameter description |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response Type either json or xml |


#### Example Usage

```java
CreateVerifyNumberInput collect = new CreateVerifyNumberInput();

String phonenumber = "phonenumber";
collect.setPhonenumber(phonenumber);

String type = "type";
collect.setType(type);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
numberVerification.createVerifyNumberAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


[Back to List of Controllers](#list_of_controllers)

### <a name="carrier_controller"></a>![Class: ](https://apidocs.io/img/class.png "message360.controllers.CarrierController") CarrierController

#### Get singleton instance

The singleton instance of the ``` CarrierController ``` class can be accessed from the API Client.

```java
CarrierController carrier = client.getCarrier();
```

#### <a name="create_carrier_lookup_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.CarrierController.createCarrierLookupAsync") createCarrierLookupAsync

> Get the Carrier Lookup


```java
void createCarrierLookupAsync(
        final CreateCarrierLookupInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| phonenumber |  ``` Required ```  | The number to lookup |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
CreateCarrierLookupInput collect = new CreateCarrierLookupInput();

String phonenumber = "phonenumber";
collect.setPhonenumber(phonenumber);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
carrier.createCarrierLookupAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


#### <a name="create_carrier_lookup_list_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.CarrierController.createCarrierLookupListAsync") createCarrierLookupListAsync

> Get the All Purchase Number's Carrier lookup


```java
void createCarrierLookupListAsync(
        final CreateCarrierLookupListInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Optional ```  | Page Number |
| pagesize |  ``` Optional ```  | Page Size |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
CreateCarrierLookupListInput collect = new CreateCarrierLookupListInput();

Integer page = 27;
collect.setPage(page);

Integer pagesize = 27;
collect.setPagesize(pagesize);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
carrier.createCarrierLookupListAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


[Back to List of Controllers](#list_of_controllers)

### <a name="call_controller"></a>![Class: ](https://apidocs.io/img/class.png "message360.controllers.CallController") CallController

#### Get singleton instance

The singleton instance of the ``` CallController ``` class can be accessed from the API Client.

```java
CallController call = client.getCall();
```

#### <a name="create_view_call_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.CallController.createViewCallAsync") createViewCallAsync

> View Call Response


```java
void createViewCallAsync(
        final CreateViewCallInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| callsid |  ``` Required ```  | Call Sid id for particular Call |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
CreateViewCallInput collect = new CreateViewCallInput();

String callsid = "callsid";
collect.setCallsid(callsid);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
call.createViewCallAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


#### <a name="create_group_call_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.CallController.createGroupCallAsync") createGroupCallAsync

> Group Call


```java
void createGroupCallAsync(
        final CreateGroupCallInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| fromCountryCode |  ``` Required ```  ``` DefaultValue ```  | TODO: Add a parameter description |
| from |  ``` Required ```  | TODO: Add a parameter description |
| toCountryCode |  ``` Required ```  ``` DefaultValue ```  | TODO: Add a parameter description |
| to |  ``` Required ```  | TODO: Add a parameter description |
| url |  ``` Required ```  | TODO: Add a parameter description |
| method |  ``` Optional ```  | TODO: Add a parameter description |
| statusCallBackUrl |  ``` Optional ```  | TODO: Add a parameter description |
| statusCallBackMethod |  ``` Optional ```  | TODO: Add a parameter description |
| fallBackUrl |  ``` Optional ```  | TODO: Add a parameter description |
| fallBackMethod |  ``` Optional ```  | TODO: Add a parameter description |
| heartBeatUrl |  ``` Optional ```  | TODO: Add a parameter description |
| heartBeatMethod |  ``` Optional ```  | TODO: Add a parameter description |
| timeout |  ``` Optional ```  | TODO: Add a parameter description |
| playDtmf |  ``` Optional ```  | TODO: Add a parameter description |
| hideCallerId |  ``` Optional ```  | TODO: Add a parameter description |
| record |  ``` Optional ```  | TODO: Add a parameter description |
| recordCallBackUrl |  ``` Optional ```  | TODO: Add a parameter description |
| recordCallBackMethod |  ``` Optional ```  | TODO: Add a parameter description |
| transcribe |  ``` Optional ```  | TODO: Add a parameter description |
| transcribeCallBackUrl |  ``` Optional ```  | TODO: Add a parameter description |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | TODO: Add a parameter description |


#### Example Usage

```java
CreateGroupCallInput collect = new CreateGroupCallInput();

String fromCountryCode = "1";
collect.setFromCountryCode(fromCountryCode);

String from = "From";
collect.setFrom(from);

String toCountryCode = "1";
collect.setToCountryCode(toCountryCode);

String to = "To";
collect.setTo(to);

String url = "Url";
collect.setUrl(url);

HttpActionEnum method = HttpActionEnum.fromString("GET");
collect.setMethod(method);

String statusCallBackUrl = "StatusCallBackUrl";
collect.setStatusCallBackUrl(statusCallBackUrl);

HttpActionEnum statusCallBackMethod = HttpActionEnum.fromString("GET");
collect.setStatusCallBackMethod(statusCallBackMethod);

String fallBackUrl = "FallBackUrl";
collect.setFallBackUrl(fallBackUrl);

HttpActionEnum fallBackMethod = HttpActionEnum.fromString("GET");
collect.setFallBackMethod(fallBackMethod);

String heartBeatUrl = "HeartBeatUrl";
collect.setHeartBeatUrl(heartBeatUrl);

HttpActionEnum heartBeatMethod = HttpActionEnum.fromString("GET");
collect.setHeartBeatMethod(heartBeatMethod);

Integer timeout = 27;
collect.setTimeout(timeout);

String playDtmf = "PlayDtmf";
collect.setPlayDtmf(playDtmf);

String hideCallerId = "HideCallerId";
collect.setHideCallerId(hideCallerId);

Boolean record = false;
collect.setRecord(record);

String recordCallBackUrl = "RecordCallBackUrl";
collect.setRecordCallBackUrl(recordCallBackUrl);

HttpActionEnum recordCallBackMethod = HttpActionEnum.fromString("GET");
collect.setRecordCallBackMethod(recordCallBackMethod);

Boolean transcribe = false;
collect.setTranscribe(transcribe);

String transcribeCallBackUrl = "TranscribeCallBackUrl";
collect.setTranscribeCallBackUrl(transcribeCallBackUrl);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
call.createGroupCallAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


#### <a name="create_voice_effect_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.CallController.createVoiceEffectAsync") createVoiceEffectAsync

> Voice Effect


```java
void createVoiceEffectAsync(
        final CreateVoiceEffectInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| callSid |  ``` Required ```  | TODO: Add a parameter description |
| audioDirection |  ``` Optional ```  | TODO: Add a parameter description |
| pitchSemiTones |  ``` Optional ```  | value between -14 and 14 |
| pitchOctaves |  ``` Optional ```  | value between -1 and 1 |
| pitch |  ``` Optional ```  | value greater than 0 |
| rate |  ``` Optional ```  | value greater than 0 |
| tempo |  ``` Optional ```  | value greater than 0 |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
CreateVoiceEffectInput collect = new CreateVoiceEffectInput();

String callSid = "CallSid";
collect.setCallSid(callSid);

AudioDirectionEnum audioDirection = AudioDirectionEnum.fromString("IN");
collect.setAudioDirection(audioDirection);

Double pitchSemiTones = 119.357231149616;
collect.setPitchSemiTones(pitchSemiTones);

Double pitchOctaves = 119.357231149616;
collect.setPitchOctaves(pitchOctaves);

Double pitch = 119.357231149616;
collect.setPitch(pitch);

Double rate = 119.357231149616;
collect.setRate(rate);

Double tempo = 119.357231149616;
collect.setTempo(tempo);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
call.createVoiceEffectAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


#### <a name="create_record_call_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.CallController.createRecordCallAsync") createRecordCallAsync

> Record a Call


```java
void createRecordCallAsync(
        final CreateRecordCallInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| callSid |  ``` Required ```  | The unique identifier of each call resource |
| record |  ``` Required ```  | Set true to initiate recording or false to terminate recording |
| direction |  ``` Optional ```  | The leg of the call to record |
| timeLimit |  ``` Optional ```  | Time in seconds the recording duration should not exceed |
| callBackUrl |  ``` Optional ```  | URL consulted after the recording completes |
| fileformat |  ``` Optional ```  | Format of the recording file. Can be .mp3 or .wav |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response format, xml or json |


#### Example Usage

```java
CreateRecordCallInput collect = new CreateRecordCallInput();

String callSid = "CallSid";
collect.setCallSid(callSid);

boolean record = false;
collect.setRecord(record);

DirectionEnum direction = DirectionEnum.fromString("IN");
collect.setDirection(direction);

Integer timeLimit = 119;
collect.setTimeLimit(timeLimit);

String callBackUrl = "CallBackUrl";
collect.setCallBackUrl(callBackUrl);

AudioFormatEnum fileformat = AudioFormatEnum.fromString("mp3");
collect.setFileformat(fileformat);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
call.createRecordCallAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


#### <a name="create_play_audio_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.CallController.createPlayAudioAsync") createPlayAudioAsync

> Play Dtmf and send the Digit


```java
void createPlayAudioAsync(
        final CreatePlayAudioInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| callSid |  ``` Required ```  | The unique identifier of each call resource |
| audioUrl |  ``` Required ```  | URL to sound that should be played. You also can add more than one audio file using semicolons e.g. http://example.com/audio1.mp3;http://example.com/audio2.wav |
| length |  ``` Optional ```  | Time limit in seconds for audio play back |
| direction |  ``` Optional ```  | The leg of the call audio will be played to |
| loop |  ``` Optional ```  | Repeat audio playback indefinitely |
| mix |  ``` Optional ```  | If false, all other audio will be muted |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
CreatePlayAudioInput collect = new CreatePlayAudioInput();

String callSid = "CallSid";
collect.setCallSid(callSid);

String audioUrl = "AudioUrl";
collect.setAudioUrl(audioUrl);

Integer length = 119;
collect.setLength(length);

DirectionEnum direction = DirectionEnum.fromString("IN");
collect.setDirection(direction);

Boolean loop = false;
collect.setLoop(loop);

Boolean mix = false;
collect.setMix(mix);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
call.createPlayAudioAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


#### <a name="create_interrupted_call_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.CallController.createInterruptedCallAsync") createInterruptedCallAsync

> Interrupt the Call by Call Sid


```java
void createInterruptedCallAsync(
        final CreateInterruptedCallInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| callSid |  ``` Required ```  | Call SId |
| url |  ``` Optional ```  | URL the in-progress call will be redirected to |
| method |  ``` Optional ```  | The method used to request the above Url parameter |
| status |  ``` Optional ```  | Status to set the in-progress call to |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
CreateInterruptedCallInput collect = new CreateInterruptedCallInput();

String callSid = "CallSid";
collect.setCallSid(callSid);

String url = "Url";
collect.setUrl(url);

HttpActionEnum method = HttpActionEnum.fromString("GET");
collect.setMethod(method);

InterruptedCallStatusEnum status = InterruptedCallStatusEnum.fromString("CANCELED");
collect.setStatus(status);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
call.createInterruptedCallAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


#### <a name="create_send_digit_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.CallController.createSendDigitAsync") createSendDigitAsync

> Play Dtmf and send the Digit


```java
void createSendDigitAsync(
        final CreateSendDigitInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| callSid |  ``` Required ```  | The unique identifier of each call resource |
| playDtmf |  ``` Required ```  | DTMF digits to play to the call. 0-9, #, *, W, or w |
| playDtmfDirection |  ``` Optional ```  | The leg of the call DTMF digits should be sent to |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
CreateSendDigitInput collect = new CreateSendDigitInput();

String callSid = "CallSid";
collect.setCallSid(callSid);

String playDtmf = "PlayDtmf";
collect.setPlayDtmf(playDtmf);

DirectionEnum playDtmfDirection = DirectionEnum.fromString("IN");
collect.setPlayDtmfDirection(playDtmfDirection);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
call.createSendDigitAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


#### <a name="create_make_call_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.CallController.createMakeCallAsync") createMakeCallAsync

> You can experiment with initiating a call through Message360 and view the request response generated when doing so and get the response in json


```java
void createMakeCallAsync(
        final CreateMakeCallInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| fromCountryCode |  ``` Required ```  | from country code |
| from |  ``` Required ```  | This number to display on Caller ID as calling |
| toCountryCode |  ``` Required ```  | To cuntry code number |
| to |  ``` Required ```  | To number |
| url |  ``` Required ```  | URL requested once the call connects |
| method |  ``` Optional ```  | Specifies the HTTP method used to request the required URL once call connects. |
| statusCallBackUrl |  ``` Optional ```  | specifies the HTTP methodlinkclass used to request StatusCallbackUrl. |
| statusCallBackMethod |  ``` Optional ```  | Specifies the HTTP methodlinkclass used to request StatusCallbackUrl. |
| fallBackUrl |  ``` Optional ```  | URL requested if the initial Url parameter fails or encounters an error |
| fallBackMethod |  ``` Optional ```  | Specifies the HTTP method used to request the required FallbackUrl once call connects. |
| heartBeatUrl |  ``` Optional ```  | URL that can be requested every 60 seconds during the call to notify of elapsed tim |
| heartBeatMethod |  ``` Optional ```  | Specifies the HTTP method used to request HeartbeatUrl. |
| timeout |  ``` Optional ```  | Time (in seconds) Message360 should wait while the call is ringing before canceling the call |
| playDtmf |  ``` Optional ```  | DTMF Digits to play to the call once it connects. 0-9, #, or * |
| hideCallerId |  ``` Optional ```  | Specifies if the caller id will be hidden |
| record |  ``` Optional ```  | Specifies if the call should be recorded |
| recordCallBackUrl |  ``` Optional ```  | Recording parameters will be sent here upon completion |
| recordCallBackMethod |  ``` Optional ```  | Method used to request the RecordCallback URL. |
| transcribe |  ``` Optional ```  | Specifies if the call recording should be transcribed |
| transcribeCallBackUrl |  ``` Optional ```  | Transcription parameters will be sent here upon completion |
| ifMachine |  ``` Optional ```  | How Message360 should handle the receiving numbers voicemail machine |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
CreateMakeCallInput collect = new CreateMakeCallInput();

String fromCountryCode = "FromCountryCode";
collect.setFromCountryCode(fromCountryCode);

String from = "From";
collect.setFrom(from);

String toCountryCode = "ToCountryCode";
collect.setToCountryCode(toCountryCode);

String to = "To";
collect.setTo(to);

String url = "Url";
collect.setUrl(url);

HttpActionEnum method = HttpActionEnum.fromString("GET");
collect.setMethod(method);

String statusCallBackUrl = "StatusCallBackUrl";
collect.setStatusCallBackUrl(statusCallBackUrl);

HttpActionEnum statusCallBackMethod = HttpActionEnum.fromString("GET");
collect.setStatusCallBackMethod(statusCallBackMethod);

String fallBackUrl = "FallBackUrl";
collect.setFallBackUrl(fallBackUrl);

HttpActionEnum fallBackMethod = HttpActionEnum.fromString("GET");
collect.setFallBackMethod(fallBackMethod);

String heartBeatUrl = "HeartBeatUrl";
collect.setHeartBeatUrl(heartBeatUrl);

Boolean heartBeatMethod = false;
collect.setHeartBeatMethod(heartBeatMethod);

Integer timeout = 119;
collect.setTimeout(timeout);

String playDtmf = "PlayDtmf";
collect.setPlayDtmf(playDtmf);

Boolean hideCallerId = false;
collect.setHideCallerId(hideCallerId);

Boolean record = false;
collect.setRecord(record);

String recordCallBackUrl = "RecordCallBackUrl";
collect.setRecordCallBackUrl(recordCallBackUrl);

HttpActionEnum recordCallBackMethod = HttpActionEnum.fromString("GET");
collect.setRecordCallBackMethod(recordCallBackMethod);

Boolean transcribe = false;
collect.setTranscribe(transcribe);

String transcribeCallBackUrl = "TranscribeCallBackUrl";
collect.setTranscribeCallBackUrl(transcribeCallBackUrl);

IfMachineEnum ifMachine = IfMachineEnum.fromString("CONTINUE");
collect.setIfMachine(ifMachine);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
call.createMakeCallAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


#### <a name="create_list_calls_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.CallController.createListCallsAsync") createListCallsAsync

> A list of calls associated with your Message360 account


```java
void createListCallsAsync(
        final CreateListCallsInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Optional ```  | Which page of the overall response will be returned. Zero indexed |
| pageSize |  ``` Optional ```  ``` DefaultValue ```  | Number of individual resources listed in the response per page |
| to |  ``` Optional ```  | Only list calls to this number |
| from |  ``` Optional ```  | Only list calls from this number |
| dateCreated |  ``` Optional ```  | Only list calls starting within the specified date range |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
CreateListCallsInput collect = new CreateListCallsInput();

Integer page = 119;
collect.setPage(page);

Integer pageSize = 10;
collect.setPageSize(pageSize);

String to = "To";
collect.setTo(to);

String from = "From";
collect.setFrom(from);

String dateCreated = "DateCreated";
collect.setDateCreated(dateCreated);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
call.createListCallsAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


#### <a name="create_send_ringless_vm_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.CallController.createSendRinglessVMAsync") createSendRinglessVMAsync

> API endpoint used to send a Ringless Voicemail


```java
void createSendRinglessVMAsync(
        final CreateSendRinglessVMInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| fromCountryCode |  ``` Required ```  | From country code |
| from |  ``` Required ```  | This number to display on Caller ID as calling |
| toCountryCode |  ``` Required ```  | To country code |
| to |  ``` Required ```  | To number |
| voiceMailURL |  ``` Required ```  | URL to an audio file |
| method |  ``` Required ```  ``` DefaultValue ```  | Not currently used in this version |
| statusCallBackUrl |  ``` Optional ```  | URL to post the status of the Ringless request |
| statsCallBackMethod |  ``` Optional ```  | POST or GET |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
CreateSendRinglessVMInput collect = new CreateSendRinglessVMInput();

String fromCountryCode = "FromCountryCode";
collect.setFromCountryCode(fromCountryCode);

String from = "From";
collect.setFrom(from);

String toCountryCode = "ToCountryCode";
collect.setToCountryCode(toCountryCode);

String to = "To";
collect.setTo(to);

String voiceMailURL = "VoiceMailURL";
collect.setVoiceMailURL(voiceMailURL);

String method = "GET";
collect.setMethod(method);

String statusCallBackUrl = "StatusCallBackUrl";
collect.setStatusCallBackUrl(statusCallBackUrl);

String statsCallBackMethod = "StatsCallBackMethod";
collect.setStatsCallBackMethod(statsCallBackMethod);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
call.createSendRinglessVMAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


[Back to List of Controllers](#list_of_controllers)

### <a name="web_rtc_controller"></a>![Class: ](https://apidocs.io/img/class.png "message360.controllers.WebRTCController") WebRTCController

#### Get singleton instance

The singleton instance of the ``` WebRTCController ``` class can be accessed from the API Client.

```java
WebRTCController webRTC = client.getWebRTC();
```

#### <a name="create_check_funds_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.WebRTCController.createCheckFundsAsync") createCheckFundsAsync

> TODO: Add a method description


```java
void createCheckFundsAsync(
        final CreateCheckFundsInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accountSid |  ``` Required ```  | Your message360 Account SID |
| authToken |  ``` Required ```  | Your message360 Token |


#### Example Usage

```java
CreateCheckFundsInput collect = new CreateCheckFundsInput();

String accountSid = "account_sid";
collect.setAccountSid(accountSid);

String authToken = "auth_token";
collect.setAuthToken(authToken);

// Invoking the API call with sample inputs
webRTC.createCheckFundsAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


#### <a name="create_token_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.WebRTCController.createTokenAsync") createTokenAsync

> message360 webrtc


```java
void createTokenAsync(
        final CreateTokenInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| accountSid |  ``` Required ```  | Your message360 Account SID |
| authToken |  ``` Required ```  | Your message360 Token |
| username |  ``` Required ```  | WebRTC username authentication |
| password |  ``` Required ```  | WebRTC password authentication |


#### Example Usage

```java
CreateTokenInput collect = new CreateTokenInput();

String accountSid = "account_sid";
collect.setAccountSid(accountSid);

String authToken = "auth_token";
collect.setAuthToken(authToken);

String username = "username";
collect.setUsername(username);

String password = "password";
collect.setPassword(password);

// Invoking the API call with sample inputs
webRTC.createTokenAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


[Back to List of Controllers](#list_of_controllers)

### <a name="sub_account_controller"></a>![Class: ](https://apidocs.io/img/class.png "message360.controllers.SubAccountController") SubAccountController

#### Get singleton instance

The singleton instance of the ``` SubAccountController ``` class can be accessed from the API Client.

```java
SubAccountController subAccount = client.getSubAccount();
```

#### <a name="create_sub_account_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.SubAccountController.createSubAccountAsync") createSubAccountAsync

> Create a sub user account under the parent account


```java
void createSubAccountAsync(
        final CreateSubAccountInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| firstName |  ``` Required ```  | Sub account user first name |
| lastName |  ``` Required ```  | sub account user last name |
| email |  ``` Required ```  | Sub account email address |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
CreateSubAccountInput collect = new CreateSubAccountInput();

String firstName = "FirstName";
collect.setFirstName(firstName);

String lastName = "LastName";
collect.setLastName(lastName);

String email = "Email";
collect.setEmail(email);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
subAccount.createSubAccountAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


#### <a name="create_suspend_sub_account_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.SubAccountController.createSuspendSubAccountAsync") createSuspendSubAccountAsync

> Suspend or unsuspend


```java
void createSuspendSubAccountAsync(
        final CreateSuspendSubAccountInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subAccountSID |  ``` Required ```  | The SubaccountSid to be activated or suspended |
| activate |  ``` Required ```  ``` DefaultValue ```  | 0 to suspend or 1 to activate |
| responseType |  ``` Optional ```  | TODO: Add a parameter description |


#### Example Usage

```java
CreateSuspendSubAccountInput collect = new CreateSuspendSubAccountInput();

String subAccountSID = "SubAccountSID";
collect.setSubAccountSID(subAccountSID);

ActivateStatusEnum activate = ActivateStatusEnum.fromInteger(0);
collect.setActivate(activate);

String responseType = "ResponseType";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
subAccount.createSuspendSubAccountAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


#### <a name="create_delete_sub_account_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.SubAccountController.createDeleteSubAccountAsync") createDeleteSubAccountAsync

> Delete sub account or merge numbers into parent


```java
void createDeleteSubAccountAsync(
        final CreateDeleteSubAccountInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| subAccountSID |  ``` Required ```  | The SubaccountSid to be deleted |
| mergeNumber |  ``` Required ```  ``` DefaultValue ```  | 0 to delete or 1 to merge numbers to parent account. |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
CreateDeleteSubAccountInput collect = new CreateDeleteSubAccountInput();

String subAccountSID = "SubAccountSID";
collect.setSubAccountSID(subAccountSID);

MergeNumberStatusEnum mergeNumber = MergeNumberStatusEnum.fromInteger(0);
collect.setMergeNumber(mergeNumber);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
subAccount.createDeleteSubAccountAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


[Back to List of Controllers](#list_of_controllers)

### <a name="address_controller"></a>![Class: ](https://apidocs.io/img/class.png "message360.controllers.AddressController") AddressController

#### Get singleton instance

The singleton instance of the ``` AddressController ``` class can be accessed from the API Client.

```java
AddressController address = client.getAddress();
```

#### <a name="create_address_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.AddressController.createAddressAsync") createAddressAsync

> To add an address to your address book, you create a new address object. You can retrieve and delete individual addresses as well as get a list of addresses. Addresses are identified by a unique random ID.


```java
void createAddressAsync(
        final CreateAddressInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| name |  ``` Required ```  | Name of user |
| address |  ``` Required ```  | Address of user. |
| country |  ``` Required ```  | Must be a 2 letter country short-name code (ISO 3166) |
| state |  ``` Required ```  | Must be a 2 letter State eg. CA for US. For Some Countries it can be greater than 2 letters. |
| city |  ``` Required ```  | City Name. |
| zip |  ``` Required ```  | Zip code of city. |
| description |  ``` Optional ```  | Description of addresses. |
| email |  ``` Optional ```  | Email Id of user. |
| phone |  ``` Optional ```  | Phone number of user. |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response type either json or xml |


#### Example Usage

```java
CreateAddressInput collect = new CreateAddressInput();

String name = "Name";
collect.setName(name);

String address = "Address";
collect.setAddress(address);

String country = "Country";
collect.setCountry(country);

String state = "State";
collect.setState(state);

String city = "City";
collect.setCity(city);

String zip = "Zip";
collect.setZip(zip);

String description = "Description";
collect.setDescription(description);

String email = "email";
collect.setEmail(email);

String phone = "Phone";
collect.setPhone(phone);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
address.createAddressAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


#### <a name="create_delete_address_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.AddressController.createDeleteAddressAsync") createDeleteAddressAsync

> To delete Address to your address book


```java
void createDeleteAddressAsync(
        final CreateDeleteAddressInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| addressSID |  ``` Required ```  | The identifier of the address to be deleted. |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response type either json or xml |


#### Example Usage

```java
CreateDeleteAddressInput collect = new CreateDeleteAddressInput();

String addressSID = "AddressSID";
collect.setAddressSID(addressSID);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
address.createDeleteAddressAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


#### <a name="create_verify_address_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.AddressController.createVerifyAddressAsync") createVerifyAddressAsync

> Validates an address given.


```java
void createVerifyAddressAsync(
        final CreateVerifyAddressInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| addressSID |  ``` Required ```  | The identifier of the address to be verified. |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response type either json or xml |


#### Example Usage

```java
CreateVerifyAddressInput collect = new CreateVerifyAddressInput();

String addressSID = "AddressSID";
collect.setAddressSID(addressSID);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
address.createVerifyAddressAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


#### <a name="create_list_address_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.AddressController.createListAddressAsync") createListAddressAsync

> List All Address 


```java
void createListAddressAsync(
        final CreateListAddressInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Optional ```  ``` DefaultValue ```  | Return requested # of items starting the value, default=0, must be an integer |
| pageSize |  ``` Optional ```  ``` DefaultValue ```  | How many results to return, default is 10, max is 100, must be an integer |
| addressSID |  ``` Optional ```  | addresses Sid |
| dateCreated |  ``` Optional ```  | date created address. |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response Type either json or xml |


#### Example Usage

```java
CreateListAddressInput collect = new CreateListAddressInput();

Integer page = 1;
collect.setPage(page);

Integer pageSize = 10;
collect.setPageSize(pageSize);

String addressSID = "AddressSID";
collect.setAddressSID(addressSID);

String dateCreated = "DateCreated";
collect.setDateCreated(dateCreated);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
address.createListAddressAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


#### <a name="create_view_address_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.AddressController.createViewAddressAsync") createViewAddressAsync

> View Address Specific address Book by providing the address id


```java
void createViewAddressAsync(
        final CreateViewAddressInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| addressSID |  ``` Required ```  | The identifier of the address to be retrieved. |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response Type either json or xml |


#### Example Usage

```java
CreateViewAddressInput collect = new CreateViewAddressInput();

String addressSID = "AddressSID";
collect.setAddressSID(addressSID);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
address.createViewAddressAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


[Back to List of Controllers](#list_of_controllers)

### <a name="phone_number_controller"></a>![Class: ](https://apidocs.io/img/class.png "message360.controllers.PhoneNumberController") PhoneNumberController

#### Get singleton instance

The singleton instance of the ``` PhoneNumberController ``` class can be accessed from the API Client.

```java
PhoneNumberController phoneNumber = client.getPhoneNumber();
```

#### <a name="update_phone_number_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.PhoneNumberController.updatePhoneNumberAsync") updatePhoneNumberAsync

> Update Phone Number Details


```java
void updatePhoneNumberAsync(
        final UpdatePhoneNumberInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| phoneNumber |  ``` Required ```  | TODO: Add a parameter description |
| friendlyName |  ``` Optional ```  | TODO: Add a parameter description |
| voiceUrl |  ``` Optional ```  | URL requested once the call connects |
| voiceMethod |  ``` Optional ```  | TODO: Add a parameter description |
| voiceFallbackUrl |  ``` Optional ```  | URL requested if the voice URL is not available |
| voiceFallbackMethod |  ``` Optional ```  | TODO: Add a parameter description |
| hangupCallback |  ``` Optional ```  | TODO: Add a parameter description |
| hangupCallbackMethod |  ``` Optional ```  | TODO: Add a parameter description |
| heartbeatUrl |  ``` Optional ```  | URL requested once the call connects |
| heartbeatMethod |  ``` Optional ```  | URL that can be requested every 60 seconds during the call to notify of elapsed time |
| smsUrl |  ``` Optional ```  | URL requested when an SMS is received |
| smsMethod |  ``` Optional ```  | TODO: Add a parameter description |
| smsFallbackUrl |  ``` Optional ```  | URL requested once the call connects |
| smsFallbackMethod |  ``` Optional ```  | URL requested if the sms URL is not available |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
UpdatePhoneNumberInput collect = new UpdatePhoneNumberInput();

String phoneNumber = "PhoneNumber";
collect.setPhoneNumber(phoneNumber);

String friendlyName = "FriendlyName";
collect.setFriendlyName(friendlyName);

String voiceUrl = "VoiceUrl";
collect.setVoiceUrl(voiceUrl);

HttpActionEnum voiceMethod = HttpActionEnum.fromString("GET");
collect.setVoiceMethod(voiceMethod);

String voiceFallbackUrl = "VoiceFallbackUrl";
collect.setVoiceFallbackUrl(voiceFallbackUrl);

HttpActionEnum voiceFallbackMethod = HttpActionEnum.fromString("GET");
collect.setVoiceFallbackMethod(voiceFallbackMethod);

String hangupCallback = "HangupCallback";
collect.setHangupCallback(hangupCallback);

HttpActionEnum hangupCallbackMethod = HttpActionEnum.fromString("GET");
collect.setHangupCallbackMethod(hangupCallbackMethod);

String heartbeatUrl = "HeartbeatUrl";
collect.setHeartbeatUrl(heartbeatUrl);

HttpActionEnum heartbeatMethod = HttpActionEnum.fromString("GET");
collect.setHeartbeatMethod(heartbeatMethod);

String smsUrl = "SmsUrl";
collect.setSmsUrl(smsUrl);

HttpActionEnum smsMethod = HttpActionEnum.fromString("GET");
collect.setSmsMethod(smsMethod);

String smsFallbackUrl = "SmsFallbackUrl";
collect.setSmsFallbackUrl(smsFallbackUrl);

HttpActionEnum smsFallbackMethod = HttpActionEnum.fromString("GET");
collect.setSmsFallbackMethod(smsFallbackMethod);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
phoneNumber.updatePhoneNumberAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


#### <a name="create_buy_number_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.PhoneNumberController.createBuyNumberAsync") createBuyNumberAsync

> Buy Phone Number 


```java
void createBuyNumberAsync(
        final CreateBuyNumberInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| phoneNumber |  ``` Required ```  | Phone number to be purchase |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
CreateBuyNumberInput collect = new CreateBuyNumberInput();

String phoneNumber = "PhoneNumber";
collect.setPhoneNumber(phoneNumber);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
phoneNumber.createBuyNumberAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


#### <a name="create_release_number_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.PhoneNumberController.createReleaseNumberAsync") createReleaseNumberAsync

> Release number from account


```java
void createReleaseNumberAsync(
        final CreateReleaseNumberInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| phoneNumber |  ``` Required ```  | Phone number to be relase |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
CreateReleaseNumberInput collect = new CreateReleaseNumberInput();

String phoneNumber = "PhoneNumber";
collect.setPhoneNumber(phoneNumber);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
phoneNumber.createReleaseNumberAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


#### <a name="create_view_number_details_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.PhoneNumberController.createViewNumberDetailsAsync") createViewNumberDetailsAsync

> Get Phone Number Details


```java
void createViewNumberDetailsAsync(
        final CreateViewNumberDetailsInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| phoneNumber |  ``` Required ```  | Get Phone number Detail |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
CreateViewNumberDetailsInput collect = new CreateViewNumberDetailsInput();

String phoneNumber = "PhoneNumber";
collect.setPhoneNumber(phoneNumber);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
phoneNumber.createViewNumberDetailsAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


#### <a name="create_list_number_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.PhoneNumberController.createListNumberAsync") createListNumberAsync

> List Account's Phone number details


```java
void createListNumberAsync(
        final CreateListNumberInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Optional ```  | Which page of the overall response will be returned. Zero indexed |
| pageSize |  ``` Optional ```  ``` DefaultValue ```  | Number of individual resources listed in the response per page |
| numberType |  ``` Optional ```  | TODO: Add a parameter description |
| friendlyName |  ``` Optional ```  | TODO: Add a parameter description |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
CreateListNumberInput collect = new CreateListNumberInput();

Integer page = 119;
collect.setPage(page);

Integer pageSize = 10;
collect.setPageSize(pageSize);

NumberTypeEnum numberType = NumberTypeEnum.fromString("ALL");
collect.setNumberType(numberType);

String friendlyName = "FriendlyName";
collect.setFriendlyName(friendlyName);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
phoneNumber.createListNumberAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


#### <a name="create_available_phone_number_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.PhoneNumberController.createAvailablePhoneNumberAsync") createAvailablePhoneNumberAsync

> Available Phone Number


```java
void createAvailablePhoneNumberAsync(
        final CreateAvailablePhoneNumberInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| numberType |  ``` Required ```  | Number type either SMS,Voice or all |
| areaCode |  ``` Required ```  | Phone Number Area Code |
| pageSize |  ``` Optional ```  ``` DefaultValue ```  | Page Size |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
CreateAvailablePhoneNumberInput collect = new CreateAvailablePhoneNumberInput();

NumberTypeEnum numberType = NumberTypeEnum.fromString("ALL");
collect.setNumberType(numberType);

String areaCode = "AreaCode";
collect.setAreaCode(areaCode);

Integer pageSize = 10;
collect.setPageSize(pageSize);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
phoneNumber.createAvailablePhoneNumberAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


[Back to List of Controllers](#list_of_controllers)

### <a name="recording_controller"></a>![Class: ](https://apidocs.io/img/class.png "message360.controllers.RecordingController") RecordingController

#### Get singleton instance

The singleton instance of the ``` RecordingController ``` class can be accessed from the API Client.

```java
RecordingController recording = client.getRecording();
```

#### <a name="create_list_recording_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.RecordingController.createListRecordingAsync") createListRecordingAsync

> List out Recordings


```java
void createListRecordingAsync(
        final CreateListRecordingInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Optional ```  | Which page of the overall response will be returned. Zero indexed |
| pageSize |  ``` Optional ```  | Number of individual resources listed in the response per page |
| dateCreated |  ``` Optional ```  | TODO: Add a parameter description |
| callSid |  ``` Optional ```  | TODO: Add a parameter description |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
CreateListRecordingInput collect = new CreateListRecordingInput();

Integer page = 119;
collect.setPage(page);

Integer pageSize = 119;
collect.setPageSize(pageSize);

String dateCreated = "DateCreated";
collect.setDateCreated(dateCreated);

String callSid = "CallSid";
collect.setCallSid(callSid);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
recording.createListRecordingAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


#### <a name="create_delete_recording_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.RecordingController.createDeleteRecordingAsync") createDeleteRecordingAsync

> Delete Recording Record


```java
void createDeleteRecordingAsync(
        final CreateDeleteRecordingInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| recordingSid |  ``` Required ```  | Unique Recording Sid to be delete |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
CreateDeleteRecordingInput collect = new CreateDeleteRecordingInput();

String recordingSid = "RecordingSid";
collect.setRecordingSid(recordingSid);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
recording.createDeleteRecordingAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


#### <a name="create_view_recording_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.RecordingController.createViewRecordingAsync") createViewRecordingAsync

> View a specific Recording


```java
void createViewRecordingAsync(
        final CreateViewRecordingInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| recordingSid |  ``` Required ```  | Search Recording sid |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
CreateViewRecordingInput collect = new CreateViewRecordingInput();

String recordingSid = "RecordingSid";
collect.setRecordingSid(recordingSid);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
recording.createViewRecordingAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


[Back to List of Controllers](#list_of_controllers)

### <a name="sms_controller"></a>![Class: ](https://apidocs.io/img/class.png "message360.controllers.SMSController") SMSController

#### Get singleton instance

The singleton instance of the ``` SMSController ``` class can be accessed from the API Client.

```java
SMSController sMS = client.getSMS();
```

#### <a name="create_list_inbound_sms_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.SMSController.createListInboundSMSAsync") createListInboundSMSAsync

> List All Inbound SMS


```java
void createListInboundSMSAsync(
        final CreateListInboundSMSInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Optional ```  | Which page of the overall response will be returned. Zero indexed |
| pagesize |  ``` Optional ```  | Number of individual resources listed in the response per page |
| from |  ``` Optional ```  | From Number to Inbound SMS |
| to |  ``` Optional ```  | To Number to get Inbound SMS |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
CreateListInboundSMSInput collect = new CreateListInboundSMSInput();

Integer page = 119;
collect.setPage(page);

String pagesize = "pagesize";
collect.setPagesize(pagesize);

String from = "from";
collect.setFrom(from);

String to = "to";
collect.setTo(to);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
sMS.createListInboundSMSAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


#### <a name="create_list_sms_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.SMSController.createListSMSAsync") createListSMSAsync

> List All SMS


```java
void createListSMSAsync(
        final CreateListSMSInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Optional ```  | Which page of the overall response will be returned. Zero indexed |
| pagesize |  ``` Optional ```  | Number of individual resources listed in the response per page |
| from |  ``` Optional ```  | Messages sent from this number |
| to |  ``` Optional ```  | Messages sent to this number |
| datesent |  ``` Optional ```  | Only list SMS messages sent in the specified date range |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
CreateListSMSInput collect = new CreateListSMSInput();

Integer page = 119;
collect.setPage(page);

Integer pagesize = 119;
collect.setPagesize(pagesize);

String from = "from";
collect.setFrom(from);

String to = "to";
collect.setTo(to);

String datesent = "datesent";
collect.setDatesent(datesent);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
sMS.createListSMSAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


#### <a name="create_send_sms_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.SMSController.createSendSMSAsync") createSendSMSAsync

> Send an SMS from a message360 number


```java
void createSendSMSAsync(
        final CreateSendSMSInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| fromcountrycode |  ``` Required ```  ``` DefaultValue ```  | From Country Code |
| from |  ``` Required ```  | SMS enabled Message360 number to send this message from |
| tocountrycode |  ``` Required ```  ``` DefaultValue ```  | To country code |
| to |  ``` Required ```  | Number to send the SMS to |
| body |  ``` Required ```  | Text Message To Send |
| method |  ``` Optional ```  | Specifies the HTTP method used to request the required URL once SMS sent. |
| messagestatuscallback |  ``` Optional ```  | URL that can be requested to receive notification when SMS has Sent. A set of default parameters will be sent here once the SMS is finished. |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
CreateSendSMSInput collect = new CreateSendSMSInput();

int fromcountrycode = 1;
collect.setFromcountrycode(fromcountrycode);

String from = "from";
collect.setFrom(from);

int tocountrycode = 1;
collect.setTocountrycode(tocountrycode);

String to = "to";
collect.setTo(to);

String body = "body";
collect.setBody(body);

HttpActionEnum method = HttpActionEnum.fromString("GET");
collect.setMethod(method);

String messagestatuscallback = "messagestatuscallback";
collect.setMessagestatuscallback(messagestatuscallback);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
sMS.createSendSMSAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


#### <a name="create_view_sms_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.SMSController.createViewSMSAsync") createViewSMSAsync

> View a Particular SMS


```java
void createViewSMSAsync(
        final CreateViewSMSInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| messagesid |  ``` Required ```  | Message sid |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
CreateViewSMSInput collect = new CreateViewSMSInput();

String messagesid = "messagesid";
collect.setMessagesid(messagesid);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
sMS.createViewSMSAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


[Back to List of Controllers](#list_of_controllers)

### <a name="transcription_controller"></a>![Class: ](https://apidocs.io/img/class.png "message360.controllers.TranscriptionController") TranscriptionController

#### Get singleton instance

The singleton instance of the ``` TranscriptionController ``` class can be accessed from the API Client.

```java
TranscriptionController transcription = client.getTranscription();
```

#### <a name="create_audio_url_transcription_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.TranscriptionController.createAudioURLTranscriptionAsync") createAudioURLTranscriptionAsync

> Audio URL Transcriptions


```java
void createAudioURLTranscriptionAsync(
        final CreateAudioURLTranscriptionInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| audioUrl |  ``` Required ```  | Audio url |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
CreateAudioURLTranscriptionInput collect = new CreateAudioURLTranscriptionInput();

String audioUrl = "AudioUrl";
collect.setAudioUrl(audioUrl);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
transcription.createAudioURLTranscriptionAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


#### <a name="create_recording_transcription_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.TranscriptionController.createRecordingTranscriptionAsync") createRecordingTranscriptionAsync

> Recording Transcriptions


```java
void createRecordingTranscriptionAsync(
        final CreateRecordingTranscriptionInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| recordingSid |  ``` Required ```  | Unique Recording sid |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
CreateRecordingTranscriptionInput collect = new CreateRecordingTranscriptionInput();

String recordingSid = "RecordingSid";
collect.setRecordingSid(recordingSid);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
transcription.createRecordingTranscriptionAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


#### <a name="create_view_transcription_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.TranscriptionController.createViewTranscriptionAsync") createViewTranscriptionAsync

> View Specific Transcriptions


```java
void createViewTranscriptionAsync(
        final CreateViewTranscriptionInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| transcriptionSid |  ``` Required ```  | Unique Transcription ID |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
CreateViewTranscriptionInput collect = new CreateViewTranscriptionInput();

String transcriptionSid = "TranscriptionSid";
collect.setTranscriptionSid(transcriptionSid);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
transcription.createViewTranscriptionAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


#### <a name="create_list_transcription_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.TranscriptionController.createListTranscriptionAsync") createListTranscriptionAsync

> Get All transcriptions


```java
void createListTranscriptionAsync(
        final CreateListTranscriptionInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| page |  ``` Optional ```  | TODO: Add a parameter description |
| pageSize |  ``` Optional ```  | TODO: Add a parameter description |
| status |  ``` Optional ```  | TODO: Add a parameter description |
| dateTranscribed |  ``` Optional ```  | TODO: Add a parameter description |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
CreateListTranscriptionInput collect = new CreateListTranscriptionInput();

Integer page = 119;
collect.setPage(page);

Integer pageSize = 119;
collect.setPageSize(pageSize);

StatusEnum status = StatusEnum.fromString("INPROGRESS");
collect.setStatus(status);

String dateTranscribed = "DateTranscribed";
collect.setDateTranscribed(dateTranscribed);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
transcription.createListTranscriptionAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


[Back to List of Controllers](#list_of_controllers)

### <a name="usage_controller"></a>![Class: ](https://apidocs.io/img/class.png "message360.controllers.UsageController") UsageController

#### Get singleton instance

The singleton instance of the ``` UsageController ``` class can be accessed from the API Client.

```java
UsageController usage = client.getUsage();
```

#### <a name="create_list_usage_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.UsageController.createListUsageAsync") createListUsageAsync

> Get all usage 


```java
void createListUsageAsync(
        final CreateListUsageInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| productCode |  ``` Required ```  ``` DefaultValue ```  | Product Code |
| startDate |  ``` Required ```  ``` DefaultValue ```  | Start Usage Date |
| endDate |  ``` Required ```  ``` DefaultValue ```  | End Usage Date |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
CreateListUsageInput collect = new CreateListUsageInput();

ProductCodeEnum productCode = ProductCodeEnum.fromInteger(0);
collect.setProductCode(productCode);

String startDate = "2016-09-06";
collect.setStartDate(startDate);

String endDate = "2016-09-06";
collect.setEndDate(endDate);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
usage.createListUsageAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


[Back to List of Controllers](#list_of_controllers)

### <a name="account_controller"></a>![Class: ](https://apidocs.io/img/class.png "message360.controllers.AccountController") AccountController

#### Get singleton instance

The singleton instance of the ``` AccountController ``` class can be accessed from the API Client.

```java
AccountController account = client.getAccount();
```

#### <a name="create_view_account_async"></a>![Method: ](https://apidocs.io/img/method.png "message360.controllers.AccountController.createViewAccountAsync") createViewAccountAsync

> Display Account Description


```java
void createViewAccountAsync(
        final CreateViewAccountInput input,
        final APICallBack<String> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| date |  ``` Required ```  | TODO: Add a parameter description |
| responseType |  ``` Optional ```  ``` DefaultValue ```  | Response type format xml or json |


#### Example Usage

```java
CreateViewAccountInput collect = new CreateViewAccountInput();

String date = "Date";
collect.setDate(date);

String responseType = "json";
collect.setResponseType(responseType);

// Invoking the API call with sample inputs
account.createViewAccountAsync(collect, new APICallBack<String>() {
    public void onSuccess(HttpContext context, String response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
}
);

```


[Back to List of Controllers](#list_of_controllers)



