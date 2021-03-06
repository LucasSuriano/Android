package com.example.trabajopractico2.dto;

import com.google.gson.annotations.SerializedName;

public class EventoRequest {

    @SerializedName("env")
    private String env;
    @SerializedName("type_events")
    private String type_events;
    @SerializedName("description")
    private String description;

    public EventoRequest() {
    }

    public EventoRequest(String env, String type_events, String description) {
        this.env = env;
        this.type_events = type_events;
        this.description = description;
    }

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }

    public String getType_events() {
        return type_events;
    }

    public void setType_events(String type_events) {
        this.type_events = type_events;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
