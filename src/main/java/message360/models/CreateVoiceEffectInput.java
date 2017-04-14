/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class CreateVoiceEffectInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5134076340517505187L;
    private String callSid;
    private AudioDirectionEnum audioDirection;
    private Double pitchSemiTones;
    private Double pitchOctaves;
    private Double pitch;
    private Double rate;
    private Double tempo;
    private String responseType = "json";
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("CallSid")
    public String getCallSid ( ) { 
        return this.callSid;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("CallSid")
    public void setCallSid (String value) { 
        this.callSid = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("AudioDirection")
    public AudioDirectionEnum getAudioDirection ( ) { 
        return this.audioDirection;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("AudioDirection")
    public void setAudioDirection (AudioDirectionEnum value) { 
        this.audioDirection = value;
    }
 
    /** GETTER
     * value between -14 and 14
     */
    @JsonGetter("PitchSemiTones")
    public Double getPitchSemiTones ( ) { 
        return this.pitchSemiTones;
    }
    
    /** SETTER
     * value between -14 and 14
     */
    @JsonSetter("PitchSemiTones")
    public void setPitchSemiTones (Double value) { 
        this.pitchSemiTones = value;
    }
 
    /** GETTER
     * value between -1 and 1
     */
    @JsonGetter("PitchOctaves")
    public Double getPitchOctaves ( ) { 
        return this.pitchOctaves;
    }
    
    /** SETTER
     * value between -1 and 1
     */
    @JsonSetter("PitchOctaves")
    public void setPitchOctaves (Double value) { 
        this.pitchOctaves = value;
    }
 
    /** GETTER
     * value greater than 0
     */
    @JsonGetter("Pitch")
    public Double getPitch ( ) { 
        return this.pitch;
    }
    
    /** SETTER
     * value greater than 0
     */
    @JsonSetter("Pitch")
    public void setPitch (Double value) { 
        this.pitch = value;
    }
 
    /** GETTER
     * value greater than 0
     */
    @JsonGetter("Rate")
    public Double getRate ( ) { 
        return this.rate;
    }
    
    /** SETTER
     * value greater than 0
     */
    @JsonSetter("Rate")
    public void setRate (Double value) { 
        this.rate = value;
    }
 
    /** GETTER
     * value greater than 0
     */
    @JsonGetter("Tempo")
    public Double getTempo ( ) { 
        return this.tempo;
    }
    
    /** SETTER
     * value greater than 0
     */
    @JsonSetter("Tempo")
    public void setTempo (Double value) { 
        this.tempo = value;
    }
 
    /** GETTER
     * Response type format xml or json
     */
    @JsonGetter("ResponseType")
    public String getResponseType ( ) { 
        return this.responseType;
    }
    
    /** SETTER
     * Response type format xml or json
     */
    @JsonSetter("ResponseType")
    public void setResponseType (String value) { 
        this.responseType = value;
    }
 
}
 