package io.swagger.handler;

import com.networknt.config.Config;
import io.undertow.server.HttpHandler;
import io.undertow.server.HttpServerExchange;
import io.undertow.util.HttpString;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.StringEscapeUtils;

public class DataGetHandler implements HttpHandler {

    public void handleRequest(HttpServerExchange exchange) throws Exception {
        List<String> messages = new ArrayList<String>();
        messages.add("API C: Message 1");
        messages.add("API C: Message 2");
        exchange.getResponseSender().send(Config.getInstance().getMapper().writeValueAsString(messages));
    }
}
