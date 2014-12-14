package product.entity;

import java.io.Serializable;
import java.net.URI;
import java.net.URISyntaxException;

import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.NONE)
public class AtomLink implements Serializable {
	private static final long serialVersionUID = 8188187423512538776L;

	@Transient
	public static final String NAMESPACE_ATOM = "http://www.w3.org/2005/Atom";

	@Transient
	public static final String DEFAULT_PATH = "http://128.199.212.108:8080/api/v1/";
	@Transient
	public static final String PRODUCT_PATH = "http://128.199.212.108:8080/api/v1/products/";

	@Transient
	public static final String ALTERNATE = "alternate";
	@Transient
	public static final String ENCLOSURE = "enclosure";
	@Transient
	public static final String RELATED = "related";
	@Transient
	public static final String SELF = "self";
	@Transient
	public static final String VIA = "via";

	@Transient
	public static final String XML = "application/xml";

	@XmlAttribute(name = "rel")
	private String rel;

	@XmlAttribute(name = "href")
	private URI href;
	
	@XmlAttribute(name = "type")
	private String type;

	@XmlAttribute(name = "hreflang")
	private String hreflang;
	
	@XmlAttribute(name = "title")
	private String title;
	
	@XmlAttribute(name = "length")
	private String length;
	
	public AtomLink() {
		this.rel = SELF;
		try {
			this.href = new URI(DEFAULT_PATH);
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		this.type = XML;
	}

	public AtomLink(URI href) {
		this.rel = SELF;
		this.href = href;
		this.type = XML;
	}

	public AtomLink(String rel, URI href, String type) {
		this.rel = rel;
		this.href = href;
		this.type = type;
	}

	public String getRel() {
		return rel;
	}

	public void setRel(String rel) {
		this.rel = rel;
	}

	public URI getHref() {
		return href;
	}

	public void setHref(URI href) {
		this.href = href;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}