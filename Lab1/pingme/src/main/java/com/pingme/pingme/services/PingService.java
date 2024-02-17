package com.pingme.pingme.services;

import java.io.IOException;
import java.net.InetAddress;

import com.pingme.pingme.dtos.ExtServerRespond;
import com.pingme.pingme.dtos.UrlDTO;

public class PingService {
    private PingService() {}

    public static ExtServerRespond pingExternalServer(UrlDTO url) throws IOException
    {
        return new ExtServerRespond(InetAddress.getByName(url.url()).isReachable(1000));
    }
}
