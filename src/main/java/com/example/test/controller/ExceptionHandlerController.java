package com.example.test.controller;

import com.example.test.utils.RestException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ExceptionHandlerController {
    private static final Logger LOG = LoggerFactory.getLogger(ExceptionHandlerController.class);

    public @ResponseBody
    String handlerException(RestException e) {
        String errorMsg = "Error: " + e.getMessage();
        LOG.error(errorMsg, e);
        return errorMsg;
    }
}
