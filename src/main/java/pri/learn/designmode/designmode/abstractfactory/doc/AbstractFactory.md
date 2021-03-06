# 抽象工厂模式

## 1 快速介绍
　　抽象工厂模式需要面对多个产品等级结构，它是工厂方法模式的进一步推广。
　　抽象工厂的功能是为一系列相关对象或相互依赖的对象创建一个接口。一定要注意，这个接口内的方法不是任意堆砌的，而是一系列相关或相互依赖的方法。比如上面例子中的主板和CPU，都是为了组装一台电脑的相关对象。不同的装机方案，代表一种具体的电脑系列。

### 1.1产品族和产品等级。

　　所谓产品族，是指位于不同产品等级结构中，功能相关联的产品组成的家族。比如AMD的主板、芯片组、CPU组成一个家族，Intel的主板、芯片组、CPU组成一个家族。
    而这两个家族都来有三个产品等级：主板、芯片组、CPU。一个等级结构是由相同的结构的产品组成。

## 2 在什么情况下应当使用抽象工厂模式
　　1.一个系统不应当依赖于产品类实例如何被创建、组合和表达的细节，这对于所有形态的工厂模式都是重要的。

　　2.这个系统的产品有多于一个的产品族，而系统只消费其中某一族的产品。

　　3.同属于同一个产品族的产品是在一起使用的，这一约束必须在系统的设计中体现出来。（比如：Intel主板必须使用Intel CPU、Intel芯片组）

　　4.系统提供一个产品类的库，所有的产品以同样的接口出现，从而使客户端不依赖于实现。

## 3 抽象工厂模式的起源
　　抽象工厂模式的起源或者最早的应用，是用于创建分属于不同操作系统的视窗构建。比如：命令按键（Button）与文字框（Text)都是视窗构建，在UNIX操作系统的视窗环境和Windows操作系统的视窗环境中，这两个构建有不同的本地实现，它们的细节有所不同。

　　在每一个操作系统中，都有一个视窗构建组成的构建家族。在这里就是Button和Text组成的产品族。而每一个视窗构件都构成自己的等级结构，由一个抽象角色给出抽象的功能描述，而由具体子类给出不同操作系统下的具体实现。

## 4 抽象工厂模式的优点
   分离接口和实现
　　  客户端使用抽象工厂来创建需要的对象，而客户端根本就不知道具体的实现是谁，客户端只是面向产品的接口编程而已。也就是说，客户端从具体的产品实现中解耦。
   使切换产品族变得容易
　　  因为一个具体的工厂实现代表的是一个产品族，比如上面例子的从Intel系列到AMD系列只需要切换一下具体工厂。

## 6 抽象工厂模式的缺点
    不太容易扩展新的产品
　　  如果需要给整个产品族添加一个新的产品，那么就需要修改抽象工厂，这样就会导致修改所有的工厂实现类。
