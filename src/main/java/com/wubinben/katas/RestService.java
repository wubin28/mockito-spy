package com.wubinben.katas;

public class RestService {
    private static RestService instance = new RestService();

    RestService() {
    }

    public static void setInstance(RestService instance) {
        RestService.instance = instance;
    }

    public static String bar() {
        return instance.getRealBar();
    }

    String getRealBar() {
        String result = invokeWebService();
        //do something else

        return result;
    }

    public static String invokeWebService() {
        return instance.callWebService();
    }

    String callWebService() {
        //call web service;

        return "ABCD";
    }
}
