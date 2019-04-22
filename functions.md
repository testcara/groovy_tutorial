## Groovy函数
我们在第一章Groovy概述里就讲过到，Groovy可以省略参数类型和返回值定义。
则最简单的方法定义为：
```
def methodName() { 
   //Method code 
}
```
且默认该方法是public的，除非我们指定方法为protectd, private
则调用方法可通过以下方式：
```
methodName()
或者
methodName
```
### 方法参数
Groovy方法参数个数没有限制，且支持默认参数。如下：
```
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
```
则输出结果为：
```
3
1
[helloworld, test!]
hello,cara!
```
除此之外，我们还需要在类里面定义方法。如：
```
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
```
则输出为：
```
10
```
