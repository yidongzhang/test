public class Array_1{
	static void point(int... price){
		for(int i :price) {
			System.out.println(i);
		}
	}

	public static void main(String[] args){
		Array_1.point();
		Array_1.point(1);
		int[] p = {1, 2,3};
		Array_1.point(p);
	}
}
