## Groovy程序控制
### 循环控制
在groovy中实现循环，有以下三种实现：
- while语句
- for语句
- for-in语句

如：
```
int count = 3
while (count>0){
	println(count)
	count--
}

for (i=0;i<3;i++) {
	println("Outputing -"+i)
	i+1
}

String[] array = ['Cat','Dog','Tiger']
for (a in array) {
	println(a)
}
```
则输出结果为
```
3
2
1
Outputing -0
Outputing -1
Outputing -2
Cat
Dog
Tiger
```
跳出循环有以下两种方式
- break
- continue

让我们实践其用法：
```
String[] statuses = ['Right', 'Wrong', 'Continue', 'Break', 'NeverHappen']
for ( status in statuses ) {
	if ( status == 'Continue' ) {
		println("Continue will be not outputted...")
		continue
	}
	else if ( status == 'Break') {
		println("Break and NeverHappen will be not outputted..")
		break
	}
	else {
		println("Status: "+status)
	}
}
```
则输出为：
```
Status: Right
Status: Wrong
Continue will be not outputted...
Break and NeverHappen will be not outputted..
```
### 条件控制
在groovy种实现条件控制，有以下三种实现：
- if
- if...else
- switch
if和if..else在循环控制中已经举例，让我们仅对switch进行举例，如下：
```
int i = 0;
int j = 1;
switch(i) {
	case 0:
		switch(j) {
			case 0:
			  println("i is 0, j is 0!")
			  break
			case 1:
			  println("i is 0, j is 1!")
			  break
			default:
			  println("Nested default for the embeded switch")
		}	
	break
	default:
	  println("Default for the top switch")
}
```
则输出如下：
```
i is 0, j is 1!
```
本文说用代码段可在loop_condition.groogy中获得。
