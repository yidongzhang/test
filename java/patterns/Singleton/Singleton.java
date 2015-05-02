public class Singleton {
	
	private Singleton() {}

	private volatile static Singleton mSingle = null;
	
	public static Singleton getInstance() {
		if (mSingle == null) {
			synchronized (Singleton.class) {
				if (mSingle == null)
					mSingle = new Singleton();
				
			}
		}	
		return mSingle;
	}

}

