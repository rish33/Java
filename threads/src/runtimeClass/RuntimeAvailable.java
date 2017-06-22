package runtimeClass;

public class RuntimeAvailable {

	public static void main(String args[]) throws Exception {
		System.out.println("Available Processors : "
				+ Runtime.getRuntime().availableProcessors());
	}

}
