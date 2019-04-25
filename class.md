## Groovy 类
### 类的介绍
Groovy中，类依旧是一类数据和行为的集合。一个具体的对象就是一个示例。例如，学生是一组类，学生A就是学生类的一个实例。
我们知道Groovy支持JAVA的语法，但是Groovy的类与Java类的仍有一些区别：
1、没有可见修饰符的类或者方法是自动公开的
2、类不需要与源文件定义相同名称，但是默认规定定义一样
3、一个源文件包含一个或者多个类，但是如果文件包含不再类中的任何代码将视为脚本
4、脚本只是具有一些特殊约定的类
5、不要在脚本中定义与脚本源文件相同名称的类定义
6、必须用abstract关键字修饰抽象方法和类
7、可以使用as运算符使对象的实例在运行时实现接口
除了这些区别外，groovy中的类同样支持继承，抽象，接口等。
### 不用构造函数创建类和对象
让我们实现最简单的一个类，如下
```
class Student {
   private int StudentID;
   private String StudentName;
  
   void setStudentID(int pID) {
      StudentID = pID;
   }
  
   void setStudentName(String pName) {
      StudentName = pName;
   }
  
   int getStudentID() {
      return this.StudentID;
   }
  
   String getStudentName() {
      return this.StudentName;
   }
}
student_1 = new Student()
student_1.setStudentID(1)
student_1.setStudentName("Cara Wang")
println(student_1.getStudentID())
println(student_1.getStudentName())
```

### 类的构造方法
```
class PersonConstructor {
    String name
    Integer age

    PersonConstructor(name, age) {
        this.name = name
        this.age = age
    }
    def show_person() {
      println("Name: ${this.name}, age: ${this.age}")
    }
}

def person1 = new PersonConstructor('Marie', 1)
def person2 = ['Marie', 2] as PersonConstructor
PersonConstructor person3 = ['Marie', 3]
person1.show_person()
person2.show_person()
person3.show_person()
```
如图，我们有三种方法去创建实例。
### 类的继承
在Groovy中，我们也支持类的继承。例如学生是个类，大学生类继承学生类，则学生类为父类或者超类，大学生类为子类或者派生类。
子类通过extends父类来实现继承。
举例如下：
```
class People {
  private String name
  private Long id
  
  People(name, id) {
    this.name = name
    this.id = id
  }
  
  def show_people() {
    println("Name: ${this.name}; Id: ${this.id}")
  }
}


class Student extends People {
  private String school
  private String name
  private Long id

  Student(name, id, school) {
    super(name, id)
    this.school = school
  }
  def show_student() {
    super.show_people()
    println("School: ${this.school}")
  }
}


student_1 = new Student("CaraWang",1,"BeiJing University")
student_1.show_student()
```
### 抽象类
类本是就是将一类物体进行抽象成为一个类，然而类可以进一步抽象，成为抽象类。抽象类只能被类继承而不能被实例化，且抽象类中的抽象方法必须通过子类实现。抽象类和抽象方法都必须使用抽象关键字来进行声明。且抽象类的子类必须定义抽象方法否则就会出现错误。
如下：
```
abstract class Person { 
   String name; 
   Person() {
   } 
   abstract void DisplayInfo();
}

class Student extends Person { 
   private int studentID
   private String name
  
   Student(name, studentID) { 
      this.name = name
      this.studentID = studentID
   } 
  
   void DisplayInfo() { 
      println("Name: ${this.name}, ID: ${this.studentID}") 
   }

}

student = new Student("Cara", 1)
student.DisplayInfo()
```
### 接口
接口仅定义需要实现的方法的列表，但是不定义方法实现。需要使用interface关键字声明接口。接口仅定义方法签名。接口的方法总是公开的。在接口不能定义受限或者私有方法。我们在类中定义继承接口并实现其方法。
如下：
```
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
    println("Backend method ...of ${webName}")
  }
}

web_a = new WebService("webA")
web_a.front()
web_a.backend()
```
### 抽象类与接口的区别
- 语法层面的区别
    - 抽象类可以有不抽象的方法，可以实现方法。接口中永远不存在方法定义
    - 抽象类中中方法和变量类型不唯一，可以public也可以是private，可以是static和abstract等，但是，接口只能为public abstract方法, 成员变量只能是public static final类型
    - 一个类只能继承一个类，一个类可以实现多个接口
　　3）接口中不能含有静态代码块以及静态方法，而抽象类可以有静态代码块和静态方法。
    以）类可以使用new来新建对象，但是接口只能通过引用
- 设计层面的区别
   -  抽象类是抽象的类，是对抽象后的事物的再次抽象，包括属性和行为。
   -  接口是对行为的抽象。
假设天上飞的东西可以是一个抽象类A，飞机和鸟是类，飞行是接口D，则飞机继承A实现接口D，鸟也是继承A实现接口的D，飞机和鸟对飞行接口的实现不同，飞机是用机翼飞翔，鸟是用翅膀飞翔。
假设还有抽象类是茶具，则茶具不能飞，所有茶具的所有类都不会实现接口D。
有人说，继承是一个“是不是“的这种物体的关系，接口实现的是”有没有“这种行为的关系。
  - 抽象类通常作为很多子类的父类，是一种模版设计模式, 而接口是一种行为规范，是一种辐射型设计。
    - 模版设计模式举例：我们用PPT模版A设计了PPT-B和PPT-C，则他俩的共同部分就是模版A，如果需要改动，则改动模版A就可以了，而不一需要改动PPT-B和PPT-C。
    - 辐射型设计，某个大楼安装了报警器，一旦要更新报警器，则必须全部更新。
    - 也就是说，对于抽象类，如果需要添加新的方法或者重新定义方法，则可以在抽象中添加或者更新方法，子类可以不进行变更；而对于接口，如果接口进行了变更，则所有实现必须这个接口的类必须变更。

### 门和警报的例子
我们通过门和警报的例子，来用类，抽象类，和接口完成设计。
门都有开关两种动作，我们可以通过抽象类和接口的定义来实现这个抽象概念。
如：
```
abstract class Door {
  public void abstract open()
  public void abstract close()
}
```
或者
```
interface Door {
  public void open()
  public void close()
}
```
现在我们考虑报警动能，如果放在类里面，则所有的门都需要具备报警功能则不符合现实。如果全刚在接口，则要求现在所有的门都能报警，实际上也不现实。而具有警报的门只需要是一种门，就是报警门就可以了。所以，我们的设计应该如下：
```
abstract class Door {
  public abstract void open()
  public abstract void close()
}

interface Alarm {
  public void alarm()
}

class AlarmDoor extends Door implements Alarm {
  
  public void open() {
    println("Open the door!")
  }

    public void close() {
      println("Close the door!")
    }

    public void alarm() {
      println("Alarm! Alarm! Alarm!")
    }
}

alarmdoor_1 = new AlarmDoor()
alarmdoor_1.open()
alarmdoor_1.close()
alarmdoor_1.alarm()
```
其实，只有分清了哪些是类的属性，哪些是类的行为，还是很简单的，对不！
本文中所遇到的例子，可在以下文件中获取到代码：
```
abstract_class.groovy
abstract_class_interfaces.groovy
basic_class.groovy
constructor.groovy
extend_class.groovy
interface.groovy
```
谢谢观看！
