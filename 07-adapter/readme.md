## 适配器模式

### 简而言之

- 适配器模式可以解决两个已有接口间不兼容问题
- 在这种情况下被适配的类往往是一个黑盒子，有时候我们不想也不能改变这个被适配的类，也不能控制其扩展。适配器模式通常用于现有系统与第三方产品功能的集成，采用增加适配器的方式将第三方类集成到系统中。

### 具体

- 在抽象工厂的基础上，一样是通过xml文件获取类名，并且加载指定的类
- 考虑实践开发中，存在代码之间不兼容的情况，即需要复用代码，又要在原本的抽象接口上实现功能，于是需做一层封装，也就是`adapter`类
- 常用的代码写法一:
    + `adapter`类继承不兼容的类，实现约束的接口，在方法中调用父类方法，如下

```java
public class DogAdapter extends Dog implements Robot {
	public void cry() {
		super.wang();
	}

	public void move() {
		super.run();
	}
}
```

- 常用的代码写法二:
    + `adapter`类继承约束的抽象类，添加不兼容的类作为私有属性，在具体方法中调用引用类型的私有属性

```java
public class CipherAdapter extends DataOperation {
	private Caesar cipher;

	public CipherAdapter() {
		cipher = new Caesar();
	}

	public String doEncrypt(int key, String ps) {
		return cipher.doEncrypt(key, ps);
	}
}
```