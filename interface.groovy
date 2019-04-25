interface Components {
	void front()
	void backend()
}

class WebService implements Components {
	String webName
	WebService(webName) {
		this.webName = webName
	}
	void front() {
		println("Front method ...of ${webName}")
	}
	void backend() {
		println("Backed method ...of ${webName}")
	}
}

web_a = new WebService("webA")
web_a.front()
web_a.backend()