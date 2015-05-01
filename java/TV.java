public class TV{
	public int price = 10;
	public int getprice(){
		return price;
	}
	public static String getString(){
		return "tv";
	}

}

class LeTV extends TV{
	public int price = 20;
	public int getprice(){
		return price;
	}

	public int getsuperprice(){
		return super.price;
	}

	public static String getString(){
		return "letv";
	}

	public static void main(String[] args) {
		TV tv = new LeTV();
		System.out.println(tv.price+"get"+tv.getprice()+tv.getString());
		LeTV letv = new LeTV();
		System.out.println(letv.price+"get"+letv.getprice()+"getsuper"+letv.getsuperprice()+letv.getString());
	}
}
