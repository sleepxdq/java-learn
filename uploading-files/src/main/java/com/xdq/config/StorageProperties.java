package com.xdq.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by xu_do on 2017/8/16.
 */
@ConfigurationProperties("storage")
public class StorageProperties {

    /**
     * Folder location for storing files
     */
    private String location = "upload-dir";

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
