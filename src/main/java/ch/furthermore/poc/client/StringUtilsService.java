
package ch.furthermore.poc.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "StringUtilsService", targetNamespace = "http://poc.furthermore.ch/", wsdlLocation = "http://localhost:8080/StringUtils?wsdl")
public class StringUtilsService
    extends Service
{

    private final static URL STRINGUTILSSERVICE_WSDL_LOCATION;
    private final static WebServiceException STRINGUTILSSERVICE_EXCEPTION;
    private final static QName STRINGUTILSSERVICE_QNAME = new QName("http://poc.furthermore.ch/", "StringUtilsService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/StringUtils?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        STRINGUTILSSERVICE_WSDL_LOCATION = url;
        STRINGUTILSSERVICE_EXCEPTION = e;
    }

    public StringUtilsService() {
        super(__getWsdlLocation(), STRINGUTILSSERVICE_QNAME);
    }

    public StringUtilsService(WebServiceFeature... features) {
        super(__getWsdlLocation(), STRINGUTILSSERVICE_QNAME, features);
    }

    public StringUtilsService(URL wsdlLocation) {
        super(wsdlLocation, STRINGUTILSSERVICE_QNAME);
    }

    public StringUtilsService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, STRINGUTILSSERVICE_QNAME, features);
    }

    public StringUtilsService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public StringUtilsService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns StringUtils
     */
    @WebEndpoint(name = "StringUtilsPort")
    public StringUtils getStringUtilsPort() {
        return super.getPort(new QName("http://poc.furthermore.ch/", "StringUtilsPort"), StringUtils.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns StringUtils
     */
    @WebEndpoint(name = "StringUtilsPort")
    public StringUtils getStringUtilsPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://poc.furthermore.ch/", "StringUtilsPort"), StringUtils.class, features);
    }

    private static URL __getWsdlLocation() {
        if (STRINGUTILSSERVICE_EXCEPTION!= null) {
            throw STRINGUTILSSERVICE_EXCEPTION;
        }
        return STRINGUTILSSERVICE_WSDL_LOCATION;
    }

}