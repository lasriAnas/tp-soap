
package proxy;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy package. 
 * <p>An ObjectFactory allows you to programmatically 
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

    private static final QName _AccountList_QNAME = new QName("http://ws/", "AccountList");
    private static final QName _AccountListResponse_QNAME = new QName("http://ws/", "AccountListResponse");
    private static final QName _Account_QNAME = new QName("http://ws/", "account");
    private static final QName _Conversion_QNAME = new QName("http://ws/", "conversion");
    private static final QName _ConversionResponse_QNAME = new QName("http://ws/", "conversionResponse");
    private static final QName _GetAccount_QNAME = new QName("http://ws/", "getAccount");
    private static final QName _GetAccountResponse_QNAME = new QName("http://ws/", "getAccountResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AccountList }
     * 
     * @return
     *     the new instance of {@link AccountList }
     */
    public AccountList createAccountList() {
        return new AccountList();
    }

    /**
     * Create an instance of {@link AccountListResponse }
     * 
     * @return
     *     the new instance of {@link AccountListResponse }
     */
    public AccountListResponse createAccountListResponse() {
        return new AccountListResponse();
    }

    /**
     * Create an instance of {@link Account }
     * 
     * @return
     *     the new instance of {@link Account }
     */
    public Account createAccount() {
        return new Account();
    }

    /**
     * Create an instance of {@link Conversion }
     * 
     * @return
     *     the new instance of {@link Conversion }
     */
    public Conversion createConversion() {
        return new Conversion();
    }

    /**
     * Create an instance of {@link ConversionResponse }
     * 
     * @return
     *     the new instance of {@link ConversionResponse }
     */
    public ConversionResponse createConversionResponse() {
        return new ConversionResponse();
    }

    /**
     * Create an instance of {@link GetAccount }
     * 
     * @return
     *     the new instance of {@link GetAccount }
     */
    public GetAccount createGetAccount() {
        return new GetAccount();
    }

    /**
     * Create an instance of {@link GetAccountResponse }
     * 
     * @return
     *     the new instance of {@link GetAccountResponse }
     */
    public GetAccountResponse createGetAccountResponse() {
        return new GetAccountResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AccountList }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "AccountList")
    public JAXBElement<AccountList> createAccountList(AccountList value) {
        return new JAXBElement<>(_AccountList_QNAME, AccountList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountListResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AccountListResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "AccountListResponse")
    public JAXBElement<AccountListResponse> createAccountListResponse(AccountListResponse value) {
        return new JAXBElement<>(_AccountListResponse_QNAME, AccountListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Account }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Account }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "account")
    public JAXBElement<Account> createAccount(Account value) {
        return new JAXBElement<>(_Account_QNAME, Account.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Conversion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Conversion }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "conversion")
    public JAXBElement<Conversion> createConversion(Conversion value) {
        return new JAXBElement<>(_Conversion_QNAME, Conversion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConversionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "conversionResponse")
    public JAXBElement<ConversionResponse> createConversionResponse(ConversionResponse value) {
        return new JAXBElement<>(_ConversionResponse_QNAME, ConversionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccount }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAccount }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getAccount")
    public JAXBElement<GetAccount> createGetAccount(GetAccount value) {
        return new JAXBElement<>(_GetAccount_QNAME, GetAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAccountResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getAccountResponse")
    public JAXBElement<GetAccountResponse> createGetAccountResponse(GetAccountResponse value) {
        return new JAXBElement<>(_GetAccountResponse_QNAME, GetAccountResponse.class, null, value);
    }

}
