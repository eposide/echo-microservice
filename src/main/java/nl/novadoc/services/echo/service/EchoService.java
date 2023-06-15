package nl.novadoc.services.echo.service;

import org.springframework.stereotype.Service;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Service
public class EchoService {


    public String getMessage(String message) {
        return "Echo from " + getHostName() + " : " + message;
    }

    private String getHostName() {

        String hostname = "Unknown";
        try {
            hostname = InetAddress.getLocalHost().getHostName();
        }
        catch (UnknownHostException ex)
        {
            System.out.println("Hostname can not be resolved");
        }

        return hostname;
    }

}
