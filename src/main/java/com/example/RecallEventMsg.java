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
public class RecallEventMsg {
    private String chaincodeId;
    private String txId;
    private String eventName;
    private RecallEventPayload payload;

    /**
     * @return the chaincodeId
     */
    public String getChaincodeId() {
        return chaincodeId;
    }

    /**
     * @param chaincodeId the chaincodeId to set
     */
    public void setChaincodeId(String chaincodeId) {
        this.chaincodeId = chaincodeId;
    }

    /**
     * @return the txId
     */
    public String getTxId() {
        return txId;
    }

    /**
     * @param txId the txId to set
     */
    public void setTxId(String txId) {
        this.txId = txId;
    }

    /**
     * @return the eventName
     */
    public String getEventName() {
        return eventName;
    }

    /**
     * @param eventName the eventName to set
     */
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    /**
     * @return the payload
     */
    public RecallEventPayload getPayload() {
        return payload;
    }

    /**
     * @param payload the payload to set
     */
    public void setPayload(RecallEventPayload payload) {
        this.payload = payload;
    }
}
