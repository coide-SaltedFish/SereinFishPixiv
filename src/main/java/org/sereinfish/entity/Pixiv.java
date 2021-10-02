package org.sereinfish.entity;

import lombok.Getter;

public class Pixiv {
    private Error error;
    private Illust illust;

    @Getter
    public class Error{
        private String user_message;
        private String message;
        private String reason;
    }

    public boolean isError(){
        return error != null;
    }
}
