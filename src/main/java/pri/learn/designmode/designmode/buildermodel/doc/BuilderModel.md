# 建造者模式
　　建造模式可以将一个产品的内部表象（internal representation）与产品的生产过程分割开来，从而可以使一个建造过程生成具有不同的内部表象的产品对象。

## 产品的内部表象
  一个产品常有不同的组成成分作为产品的零件，这些零件有可能是对象，也有可能不是对象，它们通常又叫做产品的内部表象（internal representation）。
  不同的产品可以有不同的内部表象，也就是不同的零件。使用建造模式可以使客户端不需要知道所生成的产品有哪些零件，每个产品的对应零件彼此有何不同，是怎么建造出来的，以及怎么组成产品。

## 对象性质的建造
   有些情况下，一个对象会有一些重要的性质，在它们没有恰当的值之前，对象不能作为一个完整的产品使用。比如，一个电子邮件有发件人地址、收件人地址、主题、内容、附录等部分，而在最起码的收件人地址得到赋值之前，这个电子邮件不能发送。
    
   有些情况下，一个对象的一些性质必须按照某个顺序赋值才有意义。在某个性质没有赋值之前，另一个性质则无法赋值。这些情况使得性质本身的建造涉及到复杂的商业逻辑。这时候，此对象相当于一个有待建造的产品，而对象的这些性质相当于产品的零件，建造产品的过程是建造零件的过程。由于建造零件的过程很复杂，因此，这些零件的建造过程往往被“外部化”到另一个称做建造者的对象里，建造者对象返还给客户端的是一个全部零件都建造完毕的产品对象。
    
   建造模式利用一个导演者对象和具体建造者对象一个个地建造出所有的零件，从而建造出完整的产品对象。建造者模式将产品的结构和产品的零件的建造过程对客户端隐藏起来，把对建造过程进行指挥的责任和具体建造者零件的责任分割开来，达到责任划分和封装的目的。　

## 角色

### 1.抽象建造者（Builder）角色：
   给出一个抽象接口，以规范产品对象的各个组成成分的建造。一般而言，此接口独立于应用程序的商业逻辑。模式中直接创建产品对象的是具体建造者 (ConcreteBuilder)角色。具体建造者类必须实现这个接口所要求的两种方法：一种是建造方法(buildPart1和 buildPart2)，另一种是返还结构方法(retrieveResult)。一般来说，产品所包含的零件数目与建造方法的数目相符。换言之，有多少 零件，就有多少相应的建造方法。

### 2.具体建造者（ConcreteBuilder）角色：
   担任这个角色的是与应用程序紧密相关的一些类，它们在应用程序调用下创建产品的实例。
   这个角色要完成的任务包括：
        1.实现抽象建造者Builder所声明的接口，给出一步一步地完成创建产品实例的操作。
        2.在建造过程完成后，提供产品的实例。

### 3.导演者（Director）角色：    
   担任这个角色的类调用具体建造者角色以创建产品对象。应当指出的是，导演者角色并没有产品类的具体知识，真正拥有产品类的具体知识的是具体建造者角色。

### 4.产品（Product）角色:   
   产品便是建造中的复杂对象。一般来说，一个系统中会有多于一个的产品类，而且这些产品类并不一定有共同的接口，而完全可以是不相关联的。
   
   导演者角色是与客户端打交道的角色。导演者将客户端创建产品的请求划分为对各个零件的建造请求，再将这些请求委派给具体建造者角色。
   具体建造者角色是做具体建造工作的，但是却不为客户端所知。
  
##建造模式分成两个很重要的部分：
 
### 1. 一个部分是Builder接口，这里是定义了如何构建各个部件，也就是知道每个部件功能如何实现，以及如何装配这些部件到产品中去；
 
### 2. 另外一个部分是Director，Director是知道如何组合来构建产品，也就是说Director负责整体的构建算法，而且通常是分步骤地来执行。
 
 　　不管如何变化，建造模式都存在这么两个部分，一个部分是部件构造和产品装配，另一个部分是整体构建的算法。认识这点是很重要的，因为在建造模式中，强调的是固定整体构建的算法，而灵活扩展和切换部件的具体构造和产品装配的方式。
 
 　　再直白点说，建造模式的重心在于分离构建算法和具体的构造实现，从而使得构建算法可以重用。具体的构造实现可以很方便地扩展和切换，从而可以灵活地组合来构造出不同的产品对象。
    