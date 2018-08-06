设计模式，主要用于练习和复习。

## 一，简介  
Christopher Alexander 说过：“每一个模式描述了一个在我们周围不断重复发生的问题，以及该问题的解决方案的核心。这样，你就能一次又一次地使用该方案而不必做重复劳动”  
**模式描述为：在一定环境中解决某一问题的方案，包括三个基本元素--问题，解决方案和环境。**

## 二，分类  
设计模式主要分三个类型：**创建型**、**行为型**和**结构型**。  
1. 创建模式：对类的实例化过程的抽象。一些系统在创建对象时，需要动态地决定怎样创建对象，创建哪些对象，以及如何组合和表示这些对象。创建模式描述了怎样构造和封装这些动态的决定。包含类的创建模式和对象的创建模式。  
2. 行为模式：对在不同的对象之间划分责任和算法的抽象。不仅仅关于类和对象，并且还关于他们之间的相互作用。类的行为模式使用继承关系在几个类之间分配行为，对象的行为模式则使用对象的聚合来分配行为。  
3. 结构模式：描述如何将类或对象结合在一起形成更大的结构。分为类的结构模式和对象的结构模式。类的结构模式使用继承把类，接口等组合在一起，以形成更大的结构。类的结构模式是静态的。对象的结构模式描述怎样把各种不同类型的对象组合在一起，以实现新的功能的方法。对象的结构模式是动态的。  

## 三，创建型     
1. **Singleton**（单例模式，使用频率5星）：保证一个类只有一个实例，并提供一个访问它的全局访问点。    
2. Abstract Factory（抽象工厂，使用频率4星）：提供一个创建一系列相关或相互依赖对象的接口，而无须指定它们的具体类。    
3. Factory Method（工厂方法，使用频率4星）：定义一个用于创建对象的接口，让子类决定实例化哪一个类，Factory Method使一个类的实例化延迟到了子类。    
4. **Builder**（建造模式，使用频率3星）：将一个复杂对象的构建与他的表示相分离，使得同样的构建过程可以创建不同的表示。    
5. Prototype（原型模式，使用频率2星）：用原型实例指定创建对象的种类，并且通过拷贝这些原型来创建新的对象。  

## 四，行为型      
1. Iterator（迭代器模式，使用频率5星）：提供一个方法顺序访问一个聚合对象的各个元素，而又不需要暴露该对象的内部表示。  
2. **Observer**（观察者模式，使用频率5星）：定义对象间一对多的依赖关系，当一个对象的状态发生改变时，所有依赖于它的对象都得到通知自动更新。       
3. **Template Method**（模板方法，使用频率5星）：定义一个操作中的算法的骨架，而将一些步骤延迟到子类中，TemplateMethod使得子类可以不改变一个算法的结构即可以重定义该算法得某些特定步骤。  
4. Command（命令模式，使用频率4星）：将一个请求封装为一个对象，从而使你可以用不同的请求对客户进行参数化，对请求排队和记录请求日志，以及支持可撤销的操作。  
5. State（状态模式，使用频率4星）：允许对象在其内部状态改变时改变他的行为。对象看起来似乎改变了他的类。  
6. **Strategy**（策略模式，使用频率5星）：定义一系列的算法，把他们一个个封装起来，并使他们可以互相替换，本模式使得算法可以独立于使用它们的客户。   
7. China of Responsibility（职责链模式，使用频率3星）：使多个对象都有机会处理请求，从而避免请求的送发者和接收者之间的耦合关系。  
8. Mediator（中介者模式，使用频率2星）：用一个中介对象封装一系列的对象交互。  
9. Visitor（访问者模式，使用频率2星）：表示一个作用于某对象结构中的各元素的操作，它使你可以在不改变各元素类的前提下定义作用于这个元素的新操作。       
10. Interpreter（解释器模式，使用频率1星）：给定一个语言，定义他的文法的一个表示，并定义一个解释器，这个解释器使用该表示来解释语言中的句子。  
11. Memento（备忘录模式，使用频率1星）：在不破坏对象的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态。  

## 五，结构型  
1. Composite（组合模式，使用频率5星）：将对象组合成树形结构以表示部分整体的关系，Composite使得用户对单个对象和组合对象的使用具有一致性。       
2. **Facade**（外观模式，使用频率5星）：为子系统中的一组接口提供一致的界面(门面类)，门面类提供了一高层接口，这个接口使得子系统更容易使用。       
3. **Proxy**（代理模式，使用频率5星）：为其他对象提供一种代理以控制对这个对象的访问 。  
4. Adapter（适配器模式，使用频率4星）：将一类的接口转换成客户希望的另外一个接口，Adapter模式使得原本由于接口不兼容而不能一起工作那些类可以一起工作。       
5. Decrator（装饰模式，使用频率4星）：动态地给一个对象增加一些额外的职责，就增加的功能来说，Decorator模式相比生成子类更加灵活。  
6. Bridge（桥模式，使用频率3星）：将抽象部分与它的实现部分相分离，使他们可以独立的变化。  
7. Flyweight（享元模式，使用频率2星）：运用共享技术有效地支持大量细粒度的对象。  

参考：  
http://blog.csdn.net/longronglin/article/details/1454315 (里面有很多例子)

