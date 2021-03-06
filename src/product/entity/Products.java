package product.entity;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "products")
@XmlAccessorType(XmlAccessType.FIELD)
public class Products {

	@XmlElement(name = "product")
	private List<Product> products;

	public List<Product> getContacts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
}
