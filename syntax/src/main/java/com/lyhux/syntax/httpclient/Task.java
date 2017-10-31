package com.lyhux.syntax.httpclient;

import okhttp3.*;

public class Task {
    private String cookieFile;
    private Request request;
    private String outputFile;

    Task(Builder builder) {
        this.cookieFile = builder.cookieFile;
        this.request = builder.request;
        this.outputFile = builder.outputFile;
    }

    public String getCookieFile() {
        return cookieFile;
    }

    public Request getRequest() {
        return request;
    }

    public String getOutputFile() {
        return outputFile;
    }

    public static class Builder {
        private String cookieFile;
        private Request request;
        private String outputFile;

        public Builder addCookieFile(String file) {
            this.cookieFile = file;
            return this;
        }

        public Builder addRequest(Request body) {
            this.request = body;
            return this;
        }

        public Builder addOutputFile(String file) {
            this.outputFile = file;
            return this;
        }

        public Task build() {
            return new Task(this);
        }
    }

}
