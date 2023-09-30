package technoCredits.oops.polymorphism;

class PredefinedActions {

	void start() {
		// Launch Chrome
		// dev-facebook.com
		// demo, demo
	}

	void start(String browser, int x) {
		// Launch browser
		// dev-facebook.com
		// demo, demo
	}

	public void start(int ip, String name) {
		// Launch browser
		// dev-facebook.com
		// demo, demo
	}

	static void start(String browser, String url) {
		// Launch browser
		// url
		// demo, demo
	}

	private void start(String browser, String url, String username, String password) {
		// Launch browser
		// url
		// username, password
	}

	int m1(String str) {
		System.out.println("Hi");
		return 2;
	}

	static private boolean m1(char ch) { // CE
		System.out.println("Hi");
		return true;
	}

	public static void main(String[] args) {
		PredefinedActions actions = new PredefinedActions();
		System.out.println(100);
		
		String str = "technocredits";
		str.replace('e', '*');
		str.replace("ech", "*");

	}

}
