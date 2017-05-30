/*
 * Copyright(c) 2014-2017 NTT Corporation.
 */
package jp.co.ntt.fw.spring.functionaltest.ws.webfault;

import javax.xml.ws.WebFault;

@WebFault(name = "BusinessFault", targetNamespace = "http://functionaltest.spring.fw.ntt.co.jp/todo")
public class BusinessFaultException extends WebFaultException {

    private static final long serialVersionUID = 1L;

    public BusinessFaultException(String message, WebFaultBean faultInfo) {
        super(message, faultInfo);
    }

    public BusinessFaultException(String message, WebFaultBean faultInfo,
            Throwable e) {
        super(message, faultInfo, e);
    }

}
