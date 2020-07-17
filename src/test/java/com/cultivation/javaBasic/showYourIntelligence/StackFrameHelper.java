package com.cultivation.javaBasic.showYourIntelligence;

public class StackFrameHelper {
    public static String getCurrentMethodName() {
        // TODO: please modify the following code to pass the test
        // <--start
//        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[2];
//        return stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
        // --end-->
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
    }
}
