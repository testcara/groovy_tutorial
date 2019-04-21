### Groovy变量
Groovy中的变量定义有两种方式：
- 用数据类型的原生语法，如
  ```
  Int a = 5
  ```
- 用def定义
  ```
  def Int a = 5
  或者
  def a = 5
  ```
而a=5这种没有指名类型又没有使用def关键字的用法是无法定义一个变量的。
除了我们在上一章节中提到的基本变量类型，Groovy还允许额外的变量内性，如列表，结构体和类等，这类变量我们会再后面章节中讲解。

### 变量声明和输出变量
一个变量的声明告诉编译器在哪里创建变量和给其分配多少内存。
如我们在两种变量定义方法提到的一样，定义时，就是变量声明的过程。
定义变量后，则我们可以在后面的程序块中调用，例如输出变量。如下：
```
class Example {
  static void main(String[] args){
    int x = 5 ;
    def int y = 6 ;
    def z = 7 ;
    println("The value of x is " + x);
    println(y);
    println(z);
  }
}
```
