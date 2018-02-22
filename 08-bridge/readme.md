## 桥接模式

### 简而言之

- 桥接模式与适配器模式的代码写法相似
- 桥接模式用于系统的初步设计，对于存在两个独立变化维度的类可以将其分为抽象化和实现化两个角色，使它们可以分别进行变化
- 举个例子，开发一个跨平台的图片浏览软件
    + 它有两个维度，图片格式与操作系统的渲染接口
    + 桥接模式反例

![桥接模式反例](http://img.my.csdn.net/uploads/201204/15/1334505400_2839.gif)

+ 桥接模式范例

![桥接模式范例](http://img.my.csdn.net/uploads/201204/16/1334506504_5936.gif)

### demo code

```java
public interface Implementor
{
	public void operationImpl();
}

public class ConcreteImplementor implements Implementor
{
	public void operationImpl()
	{
		//具体实现
	}
}

public abstract class Abstraction
{
	protected Implementor impl;
	
	public void setImpl(Implementor impl)
	{
		this.impl=impl;
	}
	
	public abstract void operation();
}

public class RefinedAbstraction extends Abstraction
{
	public void operation()
	{
		//代码
		impl.operationImpl();
		//代码
	}
}
```