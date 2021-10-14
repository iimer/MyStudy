# JavaScript APIs

## 1、导读

![](JavaScript APIs.assets/image-20210318134552419.png)

![image-20210318134906918](JavaScript APIs.assets/image-20210318134906918.png)

## 2、DOM

### 1、DOM简介

#### 1、什么是DOM

![image-20210318135139654](JavaScript APIs.assets/image-20210318135139654.png)

#### 2、DOM树

![image-20210318135346685](JavaScript APIs.assets/image-20210318135346685.png)

### 2、获取元素

#### 1、如何获取页面元素

![image-20210318135510106](JavaScript APIs.assets/image-20210318135510106.png)

#### 2、根据ID获取（独一无二）

![image-20210318135843763](JavaScript APIs.assets/image-20210318135843763.png)

> console.dir();替代log 查看属性方法

#### 3、根据标签名获取

![image-20210318140649440](JavaScript APIs.assets/image-20210318140649440.png)

![image-20210318140709437](JavaScript APIs.assets/image-20210318140709437.png)

#### 4、H5新增获取元素方式

![image-20210318145157448](JavaScript APIs.assets/image-20210318145157448.png)

![image-20210318145152224](JavaScript APIs.assets/image-20210318145152224.png)

#### 5、获取特殊元素（body，html）

![image-20210318145405558](JavaScript APIs.assets/image-20210318145405558.png)

### 3、事件基础

#### 1、事件概述

![image-20210318145505302](JavaScript APIs.assets/image-20210318145505302.png)

==小例子==

![image-20210318145748268](JavaScript APIs.assets/image-20210318145748268.png)

#### 2、执行事件的步骤

![image-20210318145835959](JavaScript APIs.assets/image-20210318145835959.png)

==小例子==

![image-20210318145924630](JavaScript APIs.assets/image-20210318145924630.png)

#### 3、常见的鼠标事件

![image-20210318150021367](JavaScript APIs.assets/image-20210318150021367.png)

### 4、操作元素

#### 1、改变元素内容

![image-20210318150215208](JavaScript APIs.assets/image-20210318150215208.png)

##### 1、element.innerText（不识别html标签）

![image-20210318150554448](JavaScript APIs.assets/image-20210318150554448.png)

==也可以让网页一打开就有变化，不用注册事件==

![image-20210318150725629](JavaScript APIs.assets/image-20210318150725629.png)

##### 2、element.innerHTML（识别html标签并且不会去除空格和换行）

![image-20210318151059897](JavaScript APIs.assets/image-20210318151059897.png)

#### 2、修改元素属性

![image-20210318151329506](JavaScript APIs.assets/image-20210318151329506.png)

##### 1、常用元素的属性操作

![image-20210318151410881](JavaScript APIs.assets/image-20210318151410881.png)

#### 3、表单元素的属性操作

![image-20210318151607410](JavaScript APIs.assets/image-20210318151607410.png)

==用法与上面修改元素属性类似，知道了属性及含义就可==

![image-20210318151818788](JavaScript APIs.assets/image-20210318151818788.png)

#### 4、this就是事件函数的调用者

![image-20210318152028191](JavaScript APIs.assets/image-20210318152028191.png)

#### 5、样式属性操作

![image-20210318180309124](JavaScript APIs.assets/image-20210318180309124.png)

==第二点巧妙运用了className属性，实质将需要的class加上去，避免了繁琐的第一点写法==

![image-20210318180829967](JavaScript APIs.assets/image-20210318180829967.png)

![image-20210318185944782](JavaScript APIs.assets/image-20210318185944782.png)

==如果需要保持原先的类名，则需要这么写==

![image-20210318190041976](JavaScript APIs.assets/image-20210318190041976.png)

#### 6、自定义属性的操作

##### 1、获取属性值

![image-20210318190636782](JavaScript APIs.assets/image-20210318190636782.png)

##### 2、设置元素属性值

![image-20210318190910852](JavaScript APIs.assets/image-20210318190910852.png)

##### 3、移除属性

![image-20210318190932755](JavaScript APIs.assets/image-20210318190932755.png)

##### 4、Attribute对应的是代码中元素的属性名，元素.（对应的是对象的属性）

#### 7、H5自定义属性

![image-20210318191632126](JavaScript APIs.assets/image-20210318191632126.png)

##### 1、设置H5自定义属性

![image-20210318191650228](JavaScript APIs.assets/image-20210318191650228.png)

![image-20210318191917175](JavaScript APIs.assets/image-20210318191917175.png)

##### 2、获取H5自定义属性

![image-20210318191945951](JavaScript APIs.assets/image-20210318191945951.png)

### 5、节点操作

#### 1、为什么要有节点操作

![image-20210318192141481](JavaScript APIs.assets/image-20210318192141481.png)

#### 2、节点概述

![image-20210318192228152](JavaScript APIs.assets/image-20210318192228152.png)

![image-20210318192445649](JavaScript APIs.assets/image-20210318192445649.png)

#### 3、节点层级

##### 1、父级节点

![image-20210318192713087](JavaScript APIs.assets/image-20210318192713087.png)

![image-20210318192722116](JavaScript APIs.assets/image-20210318192722116.png)

##### 2、子节点 	

![image-20210318193333147](JavaScript APIs.assets/image-20210318193333147.png)

![image-20210318193516525](JavaScript APIs.assets/image-20210318193516525.png)

==两种方式的实例==

![image-20210318193504587](JavaScript APIs.assets/image-20210318193504587.png)

![image-20210318193723758](JavaScript APIs.assets/image-20210318193723758.png)

![image-20210318193743692](JavaScript APIs.assets/image-20210318193743692.png)

![image-20210318194009233](JavaScript APIs.assets/image-20210318194009233.png)

==实例==

![image-20210318193908468](JavaScript APIs.assets/image-20210318193908468.png)

##### 3、兄弟节点

![image-20210318194232966](JavaScript APIs.assets/image-20210318194232966.png)

![image-20210318194311552](JavaScript APIs.assets/image-20210318194311552.png)

![image-20210318194259888](JavaScript APIs.assets/image-20210318194259888.png)

==解决兼容性问题，封装一个函数==

![image-20210318194522428](JavaScript APIs.assets/image-20210318194522428.png)

##### 4、创建元素节点

![image-20210318194957039](JavaScript APIs.assets/image-20210318194957039.png)

![image-20210318194936111](JavaScript APIs.assets/image-20210318194936111.png)

#### 4、删除节点

![image-20210318201209555](JavaScript APIs.assets/image-20210318201209555.png)

#### 5、复制节点

##### 1、深拷贝和浅拷贝

![image-20210318201638434](JavaScript APIs.assets/image-20210318201638434.png)

![](JavaScript APIs.assets/image-20210318201557574.png)

#### 6、document.write()创建元素节点

##### 1、三种动态创建元素区别

![](JavaScript APIs.assets/image-20210318202539555.png)

##### 2、write()

![image-20210318202118120](JavaScript APIs.assets/image-20210318202118120.png)

##### 3、innerHTML和createElement

![image-20210318202613975](JavaScript APIs.assets/image-20210318202613975.png)

### 6、DOM重点核心

![image-20210318202745783](JavaScript APIs.assets/image-20210318202745783.png)

#### 1、创建

![image-20210318202922547](JavaScript APIs.assets/image-20210318202922547.png)

#### 2、增加

![image-20210318202935158](JavaScript APIs.assets/image-20210318202935158.png)

#### 3、删除

![image-20210318202950053](JavaScript APIs.assets/image-20210318202950053.png)

#### 4、改

![image-20210318203001243](JavaScript APIs.assets/image-20210318203001243.png)

#### 5、查

![image-20210318203102434](JavaScript APIs.assets/image-20210318203102434.png)

#### 6、属性操作

![image-20210318203203493](JavaScript APIs.assets/image-20210318203203493.png)

#### 7、事件操作

![image-20210318203227022](JavaScript APIs.assets/image-20210318203227022.png)

### 7、事件高级

#### 1、注册事件（绑定事件）

##### 1、注册事件概述

![](JavaScript APIs.assets/image-20210318203500837.png)

##### 2、方法监听方式addEventListener

![image-20210318203722868](JavaScript APIs.assets/image-20210318203722868.png)

![image-20210318203819530](JavaScript APIs.assets/image-20210318203819530.png)

==两种事件对比实例==

![](JavaScript APIs.assets/image-20210318204017426.png)

> 同一个元素同一个方式，不会被覆盖，会依次执行

##### 3、attachEvent 事件监听方式（基本不用，垃圾）

![image-20210318204451730](JavaScript APIs.assets/image-20210318204451730.png)

#### 2、删除事件

![image-20210318204936590](JavaScript APIs.assets/image-20210318204936590.png)

![image-20210318204957627](JavaScript APIs.assets/image-20210318204957627.png)

##### 1、兼容性解决方案

![image-20210318205017514](JavaScript APIs.assets/image-20210318205017514.png)

#### 3、DOM事件流

![image-20210318205309485](JavaScript APIs.assets/image-20210318205309485.png)

![image-20210318205332419](JavaScript APIs.assets/image-20210318205332419.png)

![image-20210318205921973](JavaScript APIs.assets/image-20210318205921973.png)

==实例==

![image-20210318205956175](JavaScript APIs.assets/image-20210318205956175.png)

> 先执行father再执行son

![](JavaScript APIs.assets/image-20210318210143298.png)

> 先son再father

#### 4、事件对象

##### 1、什么是事件对象

![image-20210318214609143](JavaScript APIs.assets/image-20210318214609143.png)

##### 2、事件对象的实用语法

![image-20210318214640983](JavaScript APIs.assets/image-20210318214640983.png)

##### 3、事件对象的兼容性方案

![image-20210318214709184](JavaScript APIs.assets/image-20210318214709184.png)

==实例==

![image-20210318214525787](JavaScript APIs.assets/image-20210318214525787.png)

##### 4、e.target和this（概念完全不同，只是有时结果相同）

![image-20210318215103410](JavaScript APIs.assets/image-20210318215103410.png)

##### 5、事件对象的常见属性和方法

![image-20210318215126759](JavaScript APIs.assets/image-20210318215126759.png)

##### 6、阻止默认行为

![image-20210318215720786](JavaScript APIs.assets/image-20210318215720786.png)

##### 7、阻止事件冒泡

![image-20210318220134931](JavaScript APIs.assets/image-20210318220134931.png)

==兼容性方案==

![image-20210318220121788](JavaScript APIs.assets/image-20210318220121788.png)

![image-20210318215935403](JavaScript APIs.assets/image-20210318215935403.png)

> 理解为鼠标点击一个地方算一个真实事件，多个监听的事件完成是通过冒泡实现的

##### 8、事件委托

![image-20210318220805213](JavaScript APIs.assets/image-20210318220805213.png)

![image-20210318220753668](JavaScript APIs.assets/image-20210318220753668.png)

##### 9、常用鼠标事件延伸

###### 1、禁止鼠标右键菜单和禁止鼠标选中

![image-20210319114424395](JavaScript APIs.assets/image-20210319114424395.png)

==例子==

![image-20210319114418691](JavaScript APIs.assets/image-20210319114418691.png)

###### 2、MouseEvent事件

![image-20210319114835458](JavaScript APIs.assets/image-20210319114835458.png)

![image-20210319114750553](JavaScript APIs.assets/image-20210319114750553.png)

##### 10、常用的键盘事件

###### 1、常用的键盘事件

![image-20210319125153787](JavaScript APIs.assets/image-20210319125153787.png)

###### 2、keyCode属性

![image-20210319125406415](JavaScript APIs.assets/image-20210319125406415.png)

![image-20210319125447031](JavaScript APIs.assets/image-20210319125447031.png)

###### 3、ASCII表

![image-20210319125511078](JavaScript APIs.assets/image-20210319125511078.png)

## 3、BOM

### 1、BOM概述

#### 1、什么是BOM

![image-20210319130309454](JavaScript APIs.assets/image-20210319130309454.png)

#### 2、BOM的构成

![image-20210319130820997](JavaScript APIs.assets/image-20210319130820997.png)

![image-20210319130841010](JavaScript APIs.assets/image-20210319130841010.png)

### 2、window对象的常见事件

#### 1、窗口加载事件

![](JavaScript APIs.assets/image-20210319131251701.png)

![image-20210319131518796](JavaScript APIs.assets/image-20210319131518796.png)

==实例==

![image-20210319131504094](JavaScript APIs.assets/image-20210319131504094.png)

#### 2、调整窗口大小事件

![image-20210319205423990](JavaScript APIs.assets/image-20210319205423990.png)

==实例==

![image-20210319205346697](JavaScript APIs.assets/image-20210319205346697.png)

#### 3、定时器

##### 1、setTimeout()

![image-20210319205456264](JavaScript APIs.assets/image-20210319205456264.png)

![image-20210319205706510](JavaScript APIs.assets/image-20210319205706510.png)

##### 2、停止setTimeout()定时器

![image-20210319205819940](JavaScript APIs.assets/image-20210319205819940.png)

##### 3、setInterval()定时器

![image-20210319205855654](JavaScript APIs.assets/image-20210319205855654.png)

##### 4、停止setInterval()定时器

### 3、this指定问题

![image-20210319210445692](JavaScript APIs.assets/image-20210319210445692.png)

![](JavaScript APIs.assets/image-20210319210703781.png)

![image-20210319210729397](JavaScript APIs.assets/image-20210319210729397.png)

### 4、JS执行机制

#### 1、JS是单线程

![image-20210319210950108](JavaScript APIs.assets/image-20210319210950108.png)

#### 2、一个问题

![image-20210319211037483](JavaScript APIs.assets/image-20210319211037483.png)

#### 3、同步与异步

![image-20210319211124536](JavaScript APIs.assets/image-20210319211124536.png)

#### 4、又一个问题

![image-20210319211237985](JavaScript APIs.assets/image-20210319211237985.png)

> 123

#### 5、执行机制

![image-20210319211454854](JavaScript APIs.assets/image-20210319211454854.png)

==小例子==

![image-20210319211556569](JavaScript APIs.assets/image-20210319211556569.png)

![image-20210319211708653](JavaScript APIs.assets/image-20210319211708653.png)

![image-20210319211834370](JavaScript APIs.assets/image-20210319211834370.png)

#### 6、location对象

##### 1、什么事location对象

![image-20210319211927239](JavaScript APIs.assets/image-20210319211927239.png)

##### 2、URL组成

![image-20210319212018435](JavaScript APIs.assets/image-20210319212018435.png)

##### 3、location对象的属性

![image-20210319212137523](JavaScript APIs.assets/image-20210319212137523.png)

##### 4、location常见的方法

![image-20210319212445745](JavaScript APIs.assets/image-20210319212445745.png)

#### 7、navigator对象

##### 1、userAgent属性

![image-20210319212628791](JavaScript APIs.assets/image-20210319212628791.png)

![image-20210319212648617](JavaScript APIs.assets/image-20210319212648617.png)

#### 8、history对象

![image-20210319212853731](JavaScript APIs.assets/image-20210319212853731.png)

## 4、PC端网页特效

### 1、元素偏移量offset系列

#### 1、offset概述

![image-20210319213432523](JavaScript APIs.assets/image-20210319213432523.png)

#### 2、offset与style区别

![image-20210319213650575](JavaScript APIs.assets/image-20210319213650575.png)

### 2、元素的可视区client系列

![image-20210324163701263](JavaScript APIs.assets/image-20210324163701263.png)

### 3、元素滚动scroll系列

![image-20210324163801660](JavaScript APIs.assets/image-20210324163801660.png)

#### 1、滚动条触发事件

![image-20210324164220833](JavaScript APIs.assets/image-20210324164220833.png)

### 4、mouseenter和mouseover的区别

![image-20210324164435048](JavaScript APIs.assets/image-20210324164435048.png)

### 5、动画函数封装

#### 1、动画原理及应用

![image-20210324164941406](JavaScript APIs.assets/image-20210324164941406.png)

==实例==

![image-20210324164933544](JavaScript APIs.assets/image-20210324164933544.png)

#### 2、简单动画的封装

![image-20210324165304298](JavaScript APIs.assets/image-20210324165304298.png)

#### 3、避免相同名称的定时器

![image-20210324165539621](JavaScript APIs.assets/image-20210324165539621.png)

> 如果将函数定义到一个button，被赋值的timer的对应定时器在变，但是之前的定时器不会消失，只有等到条件满足才会执行销毁函数