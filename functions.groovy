def testSum(a, b) {
	return a+b
}
println(testSum(1,2))

def testSub(a, b=3) {
	return a-b
}
println(testSub(4))

def testList(String[] test, a="test!") {
	return test+a
}
println(testList("helloworld"))

def testString(String test, a="cara!") {
	return test+a
}
println(testString("hello,"))


class TryMethod {
	int x;
	def getx() {
		return x
	}

	def setx(int px){
		x = px 
	}
}

try_method = new TryMethod()
try_method.setx(10)
println(try_method.getx())





