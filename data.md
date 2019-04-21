## Groovy数据类型
在所有语言中，我们都需要用不同的变量去存储不同类型的信息。变量实际上就是为存储变量预留存储空间来存储值。我们可能会存储不同的信息，如字符串，单个字符，通配符，整型，浮点型等。基于不同变量的数据类型，操作系统会分配内存并在内存中存储对应的值。
### 内建数据类型
Groovy的内建数据类型很多，如下
| 数据类型 | 说明+例子 | 数值范围|
|---|---|---|
| byte     | 一个字节，如2 | -128～127 |
| short    | 一个短型数，如10 | -32,768 ~ 32,767 |
| int      | 整型数，如1234   |-2,147,483,648 ~ 2,147,483,647|
| long     | 一个长型数， 如1000090 |-9,223,372,036,854,775,808 ~ +9,223,372,036,854,775,807|
| float    | 32位浮点数，如12.34 |1.40129846432481707e-45 ~ 3.40282346638528860e+38|
| double   | 64位浮点数，如12.34565 |4.94065645841246544e-324d ~ 1.79769313486231570e+308d|
| char     | 一个字符常量，如a|-|
| boolean  | 真或假， 如true或者false |-|
| string   | 一串字符组成的字符常量，如helloworld|-|
### 数据类
除了原生类型，以下类型在groovy中也是合法的：
- java.lang.Byte
- java.lang.Short
- java.lang.Integer
- java.lang.Long
- java.lang.Float
- java.lang.Double
- java.math.BigInteger（任意精度整数）
- java.math.BigDecimal（任意精度小数）

让我们拿此数据类和原生类进行比较：
```
class Example { 
   static void main(String[] args) { 
      //Example of a int datatype 
      int x = 5; 
		
      //Example of a long datatype 
      long y = 100L; 
		
      //Example of a floating point datatype 
      float a = 10.56f; 
		
          //Example of a double datatype 
          double b = 10.5e40; 
    		
          //Example of a BigInteger datatype 
          BigInteger bi = 30g; 
    		
          //Example of a BigDecimal datatype 
          BigDecimal bd = 3.5g; 
    		
          println(x); 
          println(y); 
          println(a); 
          println(b); 
          println(bi); 
          println(bd); 
       } 
    }
```
