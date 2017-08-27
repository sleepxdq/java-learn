package com.xdq.learn.beans;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by xu_do on 2017/8/15.
 */
@Data
public class Greeting {
    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }
}
