public class Singleton {
	
	private Singleton() {}

	private static Singleton mSingle = null;
	
	public static Singleton getInstance() {
		if (mSingle == null) {
			mSingle = new Singleton();
		}	
		return mSingle;
	}

}

