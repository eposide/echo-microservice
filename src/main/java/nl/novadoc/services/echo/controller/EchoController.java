package nl.novadoc.services.echo.controller;

import nl.novadoc.services.echo.service.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {

    @Autowired
    private EchoService service;

    @GetMapping("/echo")
    public String getEcho(@PathVariable String message) {

        return service.getMessage(message);
    }


}
