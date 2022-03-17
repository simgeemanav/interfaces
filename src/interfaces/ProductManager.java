package interfaces;

public class ProductManager {
	
	/* Hibernate e bagımlı bir sistem 
	 * 
	 * public void add(Product product) {
		HibernateProductDao productDao = new HibernateProductDao();
		productDao.add(product);
		
	} */
	
	private ProductDao productDao;
	private Logger logger;
	public ProductManager(ProductDao productDao,Logger logger) {
		this.productDao = productDao;
		this.logger = logger;
	}
	
	public void add(Product product) {
		productDao.add(product);
		logger.log("Ekleme operasyonu 3.15.2022");

}
}
