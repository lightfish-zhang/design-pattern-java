## 简单工厂模式

### 代码笔记

- 简单的工厂模式，似乎没什么好提的

### 关于编译脚本

- 运行环境是Linux　Arch，编辑器使用vscode(还是要依赖一定的ide功能)，按照我一贯的编程风格，编译要么使用makefile要么写shell脚本，编译过程清晰可见。
- 一开始使用下面命令

```shell
mkdir build &&
javac -sourcepath src -d build src/Main.java &&
java -classpath build Main
```

- 简单来讲，源码目录与编译文件目录分来，最后执行`*.class`时指定class目录，并指定main函数的类名
- 在指定编译的文件`src/Main.java`时，`javac`遇到不认识的类型，会从`sourcepath`目录下查找，同时也编译相对应的`*.class`文件，但是如果是方法工厂模式下，往往是运行时才会通过一个类名来实例化一个对象，这就必须要提前手动编译好所需的`*.class`文件，可以使用下面命令

```shell
javac -sourcepath src -d build src/*.java
```

- 或者指定一个fileList文件，内容是java文件的路径，以空格或者换行符隔开

```
javac -sourcepath src -d build @fileList.txt
```

- 之后改进一下，添加`MANIFEST.MF`文件，打包成jar包，单文件容易管理

```shell
#!/bin/bash
fileName=$(basename `pwd`).jar
if [ -d "build" ]; then
    rm build -rf
fi
mkdir build
javac -sourcepath src -d build src/*.java &&
jar cvfm ${fileName} MANIFEST.MF -C build . &&
echo -e "\n--------------------------------\n build success \n release ${fileName}\n--------------------------------\n"
rm build -rf &&
java -jar ${fileName} ${*}
```

- 需要额外注意的是，`MANIFEST.MF`文件最后要换行，否则最后一个属性不被java识别