package io.github.ngocitbk.websocket.util;

import javax.json.Json;

public class JsonUtil {

    public static String formatMessage(String message, String user) {
        return Json.createObjectBuilder()
                .add("message", message)
                .add("sender", user)
                .add("received", "")
                .build().toString();
    }

}
