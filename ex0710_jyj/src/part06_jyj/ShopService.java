package part06_jyj;

public class ShopService {
	private static ShopService ss = new ShopService();
	
	private ShopService() {
		
	}
	public static ShopService getInstance() {
		return ss;
	}
}
