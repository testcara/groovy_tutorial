## Groovy I/O操作
比起Java，Groovy提供了更简单的类来为文件提供以下功能：
- 读取文件
- 写入文件
- 遍历文件树
- 读取和写入数据对象到文件
- 对文件属性进行判断等
```
def writeHelloWorld(String file) {
	new File(file).withWriter('utf-8') { 
         writer -> writer.writeLine 'Hello World!' 
      }
}

def readHelloWorld(String file) {
	new File(file).eachLine { 
		line -> println(line)
	}
}

def getFileSize(String file_name){
	File file = new File(file_name)
    println "The file ${file.absolutePath} has ${file.length()} bytes"
}

def getFileType(String file_name){
      def file = new File(file_name) 
      if (file.isFile()) {
      	println(file.name+" is one file!")

      }
      else if (isDirectory) {
      	println(file+" is one directory!")
      	
      } 
}
writeHelloWorld('testing_file.txt')
readHelloWorld('testing_file.txt')
getFileSize('testing_file.txt')
getFileType('testing_file.txt')
```
则输出为：
```
Hello World!
The file /home/wlin/groovy_tutorial/testing_file.txt has 13 bytes
testing_file.txt is one file!
```
自然，Java类中的所有的关于I/O的类，也是可以使用的。这里还是让我们聚焦在Groovy语法。
