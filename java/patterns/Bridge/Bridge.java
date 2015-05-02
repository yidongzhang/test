public abstract class Bridge {
	private Sourceable source;
	
	public void method() {
		source.method();
	}

	public Sourceable getsource() {
		return source;
	}
	
	public void setSource(Sourceable source) {
		this.source = source;
	}
}
