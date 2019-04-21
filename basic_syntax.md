## Groovy基本语法
### Hello World!
我们学习一门语言，通常从helloworld开始，现在我们来看以下groovy的helloworld程序。如下：
```
groovy_tutorial$ cat helloworld.groovy 
class Example {
  static void main(String[] args) {
    // Using a simple println statement to print output to the console
    println("Hello World!")
  }
}
groovy_tutorial$ groovy helloworld.groovy 
Hello World!
```
### Import关键字
在groovy中，我们可以使用import关键字来导入其他库的一些函数来供自己使用。
如我们导入一个MarkupBuilder类去创建HTML或者XML标记
```
import groovy.xml.MarkupBuilder 
def xml = new MarkupBuilder() 
```
绝多数库我们都需要手动导入，但如下库，则默认已导入，无需手动显示导入。
```
import java.lang.* 
import java.util.* 
import java.io.* 
import java.net.* 

import groovy.lang.* 
import groovy.util.* 

import java.math.BigInteger 
import java.math.BigDecimal
```
### Groovy中的标记
Groovy标记或成为token, 可以是一个关键字，一个标识，一个常量，一个字符串或者一个符号。如下：
```
println(“Hello World”);
```
则有2个token，一个println关键字，一个为字符串常值。
## Groovy中的注释
注释用来给你的code添加说明。注释有多行注释和单行注释。
单行注释使用‘//’，多行注释使用/**/。如下：
```
class Example {
   static void main(String[] args) {
      // Using a simple println statement to print output to the console
      println('Hello World');
   }
}
class Example {
   static void main(String[] args) {
      /* This program is the first program
      This program shows how to display hello world */
      println('Hello World');
   }
}
```
### 分号
就像Java编程语言，多行代码之间需要使用分号来分开。如下：
```
class Example {
   static void main(String[] args) {
      // One can see the use of a semi-colon after each statement
      def x = 5;
      println('Hello World');  
   }
}
```
### 标识符
标识符用来定义变量，函数或者其他用户定义的变量。标识符以字母，$或者下划线开头，不能以数字开头。下面是一些有意义的标识符。
```
def employeename 
def student1 
def student_name
```
### 关键字
Groovy关键字指Groovy编程语言的保留字。和其他语言一样，关键字都有特定用途，不要随意使用。
|as 	| assert| break | case    |
|---    | ---   | ---   | ---     |
| catch | class | const | continue|
| def 	| default| 	do 	| else    |
| enum 	| extends |	false | Finally |
| for   | goto 	  | if    |	implements |
| import| in 	  | instanceof | interface |
| new 	| pull    |	package    | return    |
| super | switch  |	this       | throw     |
| throws |	trait |	true 	   | try       |
| while |
### 空格
空格是编程语言如Java和Groovy用来描述blanks, tabs, newline character等的术语。如下：
```
def x = 5;
```
如上，在关键字def和变量x中有个空格，这个空格使得编译器知道def是关键字，x是我们要定义的变量，而不会将‘defx’放在一起。
### 常量
常量用来标示groovy中的固定值。如整型常量，浮点型常量或者字符常量。如下：
```
12
1.45
‘a’
"aa"
```
