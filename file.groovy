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