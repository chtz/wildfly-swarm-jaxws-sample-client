
package ch.furthermore.poc.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ch.furthermore.poc.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _UpperCase_QNAME = new QName("http://poc.furthermore.ch/", "upperCase");
    private final static QName _UpperCaseResponse_QNAME = new QName("http://poc.furthermore.ch/", "upperCaseResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ch.furthermore.poc.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UpperCaseResponse }
     * 
     */
    public UpperCaseResponse createUpperCaseResponse() {
        return new UpperCaseResponse();
    }

    /**
     * Create an instance of {@link UpperCase }
     * 
     */
    public UpperCase createUpperCase() {
        return new UpperCase();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpperCase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://poc.furthermore.ch/", name = "upperCase")
    public JAXBElement<UpperCase> createUpperCase(UpperCase value) {
        return new JAXBElement<UpperCase>(_UpperCase_QNAME, UpperCase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpperCaseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://poc.furthermore.ch/", name = "upperCaseResponse")
    public JAXBElement<UpperCaseResponse> createUpperCaseResponse(UpperCaseResponse value) {
        return new JAXBElement<UpperCaseResponse>(_UpperCaseResponse_QNAME, UpperCaseResponse.class, null, value);
    }

}
