
package soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the soap package. 
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

    private final static QName _GetCreditRateResponse_QNAME = new QName("http://vbank.hfu.de/", "getCreditRateResponse");
    private final static QName _GetCreditRate_QNAME = new QName("http://vbank.hfu.de/", "getCreditRate");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCreditRate }
     * 
     */
    public GetCreditRate createGetCreditRate() {
        return new GetCreditRate();
    }

    /**
     * Create an instance of {@link GetCreditRateResponse }
     * 
     */
    public GetCreditRateResponse createGetCreditRateResponse() {
        return new GetCreditRateResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCreditRateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vbank.hfu.de/", name = "getCreditRateResponse")
    public JAXBElement<GetCreditRateResponse> createGetCreditRateResponse(GetCreditRateResponse value) {
        return new JAXBElement<GetCreditRateResponse>(_GetCreditRateResponse_QNAME, GetCreditRateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCreditRate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://vbank.hfu.de/", name = "getCreditRate")
    public JAXBElement<GetCreditRate> createGetCreditRate(GetCreditRate value) {
        return new JAXBElement<GetCreditRate>(_GetCreditRate_QNAME, GetCreditRate.class, null, value);
    }

}
