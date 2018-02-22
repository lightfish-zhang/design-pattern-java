## 单例模式——打开窗口为例子

### 内部类

- 内部类很少使用，这里提一提
- 本例子中使用了内部类
    + `class Main`内定义了`class BtListener`
    + `class SubFrame`内定义了`class MyIFListener`

- 编译时生成class文件名格式`out$inner.class`，如本例子的`Main$BtListener.class`与`SubFrame$MyIFListener.class`
- 内部类，有闭包的特性，可以访问外部类的所有属性
- 通过内部类implement各种接口，方便管理，完善多重继承的机制

