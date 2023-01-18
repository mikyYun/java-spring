package com.myspring.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class RequestInfo {
    @RequestMapping("/requestInfo")
    public void main(HttpServletRequest request) {
        System.out.println("request.getCharacterEncoding()="+request.getCharacterEncoding()); // encoding in request
        System.out.println("request.getContentLength()="+request.getContentLength());  // length of request. if unknown : -1
        System.out.println("request.getContentType()="+request.getContentType()); // type of request. if unknown: null

        System.out.println("request.getMethod()="+request.getMethod());      // request method
        System.out.println("request.getProtocol()="+request.getProtocol());  // types of protocol and version
        System.out.println("request.getScheme()="+request.getScheme());      // protocol

        System.out.println("request.getServerName()="+request.getServerName()); // server name OR IP address
        System.out.println("request.getServerPort()="+request.getServerPort()); // server port
        System.out.println("request.getRequestURL()="+request.getRequestURL()); // request URL
        System.out.println("request.getRequestURI()="+request.getRequestURI()); // request URI

        System.out.println("request.getContextPath()="+request.getContextPath()); // context path
        System.out.println("request.getServletPath()="+request.getServletPath()); // servlet path
        System.out.println("request.getQueryString()="+request.getQueryString()); // query string

        System.out.println("request.getLocalName()="+request.getLocalName()); // local name
        System.out.println("request.getLocalPort()="+request.getLocalPort()); // local port

        System.out.println("request.getRemoteAddr()="+request.getRemoteAddr()); // remote ip address
        System.out.println("request.getRemoteHost()="+request.getRemoteHost()); // remote host OR ip address
        System.out.println("request.getRemotePort()="+request.getRemotePort()); // remote port
    }
}
