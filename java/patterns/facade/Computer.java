public class Computer {
	private CPU cpu;
	private Mem mem;
	
	public Computer()  {
		cpu  = new CPU();
		mem = new Mem();
	}

	public void startup() {
		cpu.startup();
		mem.startup();
	}
	public void shutdown() {
		cpu.shutdown();
		mem.shutdown();
	}
}
