/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360;

import message360.controllers.*;
import message360.http.client.HttpClient;

public class Message360Client {
    /**
     * Singleton access to ShortCode controller
     * @return	Returns the ShortCodeController instance 
     */
    public ShortCodeController getShortCode() {
        return ShortCodeController.getInstance();
    }

    /**
     * Singleton access to Conference controller
     * @return	Returns the ConferenceController instance 
     */
    public ConferenceController getConference() {
        return ConferenceController.getInstance();
    }

    /**
     * Singleton access to Email controller
     * @return	Returns the EmailController instance 
     */
    public EmailController getEmail() {
        return EmailController.getInstance();
    }

    /**
     * Singleton access to NumberVerification controller
     * @return	Returns the NumberVerificationController instance 
     */
    public NumberVerificationController getNumberVerification() {
        return NumberVerificationController.getInstance();
    }

    /**
     * Singleton access to Carrier controller
     * @return	Returns the CarrierController instance 
     */
    public CarrierController getCarrier() {
        return CarrierController.getInstance();
    }

    /**
     * Singleton access to Call controller
     * @return	Returns the CallController instance 
     */
    public CallController getCall() {
        return CallController.getInstance();
    }

    /**
     * Singleton access to WebRTC controller
     * @return	Returns the WebRTCController instance 
     */
    public WebRTCController getWebRTC() {
        return WebRTCController.getInstance();
    }

    /**
     * Singleton access to SubAccount controller
     * @return	Returns the SubAccountController instance 
     */
    public SubAccountController getSubAccount() {
        return SubAccountController.getInstance();
    }

    /**
     * Singleton access to Address controller
     * @return	Returns the AddressController instance 
     */
    public AddressController getAddress() {
        return AddressController.getInstance();
    }

    /**
     * Singleton access to PhoneNumber controller
     * @return	Returns the PhoneNumberController instance 
     */
    public PhoneNumberController getPhoneNumber() {
        return PhoneNumberController.getInstance();
    }

    /**
     * Singleton access to Recording controller
     * @return	Returns the RecordingController instance 
     */
    public RecordingController getRecording() {
        return RecordingController.getInstance();
    }

    /**
     * Singleton access to SMS controller
     * @return	Returns the SMSController instance 
     */
    public SMSController getSMS() {
        return SMSController.getInstance();
    }

    /**
     * Singleton access to Transcription controller
     * @return	Returns the TranscriptionController instance 
     */
    public TranscriptionController getTranscription() {
        return TranscriptionController.getInstance();
    }

    /**
     * Singleton access to Usage controller
     * @return	Returns the UsageController instance 
     */
    public UsageController getUsage() {
        return UsageController.getInstance();
    }

    /**
     * Singleton access to Account controller
     * @return	Returns the AccountController instance 
     */
    public AccountController getAccount() {
        return AccountController.getInstance();
    }

    /**
     * Get the shared http client currently being used for API calls
     * @return The http client instance currently being used
     */
    public HttpClient getSharedHttpClient() {
        return BaseController.getClientInstance();
    }
    
    /**
     * Set a shared http client to be used for API calls
     * @param httpClient The http client to use
     */
    public void setSharedHttpClient(HttpClient httpClient) {
        BaseController.setClientInstance(httpClient);
    }

    /**
     * Default constructor 
     */     
    public Message360Client() {	
	}

    /**
     * Client initialization constructor 
     */     
    public Message360Client(String basicAuthUserName, String basicAuthPassword) {
        this();
        Configuration.basicAuthUserName = basicAuthUserName;
        Configuration.basicAuthPassword = basicAuthPassword;
    }
}