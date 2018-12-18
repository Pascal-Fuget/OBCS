/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

/**
 *
 * @author PFUGET
 */
public class RecallEvent {

    private String eventType;
    private String subid;
    private String channel;
    private RecallEventMsg eventMsg;

    public RecallEvent() {
        this.channel = "";
        this.eventMsg = new RecallEventMsg();
        this.subid = "";
        this.eventType = "chaincodeEvent";
    }
    
    public String getEventType() {
        return this.eventType;
    }
    
    public void setEvenType(String string) {
        this.eventType = string;
    }
    public String getSubid() {
        return this.subid;
    }
    
    public void setSubid(String string) {
        this.subid = string;
    }
    public String getChannel() {
        return this.channel;
    }
    
    public void setChannel(String string) {
        this.channel = string;
    }
    
    public RecallEventMsg getEventMsg() {
        return this.eventMsg;
    }
    
    public void setEventMsg(RecallEventMsg recalleventmsg) {
        this.eventMsg = recalleventmsg;
    }
}
