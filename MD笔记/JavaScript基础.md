# JavaScript基础语法

- JS属于解释型语言

![image-20210317165713792](JavaScript.assets/image-20210317165713792.png)

![image-20210317165807417](JavaScript.assets/image-20210317165807417.png)

## JS的组成

![](JavaScript.assets/image-20210317154113917.png)

## 1、ECMAScript

### 1、导读

#### 1、介绍

![image-20210317154156233](JavaScript.assets/image-20210317154156233.png)

#### 2、JS的三种引入

![image-20210317154750810](JavaScript.assets/image-20210317154750810.png)

##### 1、行内式JS

![image-20210317154831555](JavaScript.assets/image-20210317154831555.png)

##### 2、内嵌JS

![image-20210317154847307](JavaScript.assets/image-20210317154847307.png)

##### 3、外部JS

![image-20210317154929105](JavaScript.assets/image-20210317154929105.png)

#### 3、JS注释

![image-20210317155115988](JavaScript.assets/image-20210317155115988.png)

#### 4、输入输出

![image-20210317155304459](JavaScript.assets/image-20210317155304459.png)

### 2、变量

#### 1、变量存储在内存中

![image-20210317155725842](JavaScript.assets/image-20210317155725842.png)

#### 2、变量的使用

![image-20210317160012887](JavaScript.assets/image-20210317160012887.png)

==输出输入的名字实例==

![image-20210317160140320](JavaScript.assets/image-20210317160140320.png)

#### 3、语法扩展

![image-20210317160300041](JavaScript.assets/image-20210317160300041.png)

![](JavaScript.assets/image-20210317160406248.png)

> 不声明直接用的方式不推荐，会成为全局变量。
>
> 程序报错则不再向下执行

#### 4、命名规范

![image-20210317160611056](JavaScript.assets/image-20210317160611056.png)

### 3、数据类型

![image-20210317161136040](JavaScript.assets/image-20210317161136040.png)

![image-20210317161105685](JavaScript.assets/image-20210317161105685.png)

> 根据占用内存空间不同，划分数据类型

#### 1、基本数据类型

![image-20210317161552087](JavaScript.assets/image-20210317161552087.png)

##### 1、数字型

###### 1、数字型进制

![image-20210317161951503](JavaScript.assets/image-20210317161951503.png)

###### 2、数字型最大最小值

![image-20210317162016062](JavaScript.assets/image-20210317162016062.png)

###### 3、数字型的三个特殊值

![image-20210317162150690](JavaScript.assets/image-20210317162150690.png)

==实例==

![image-20210317162257224](JavaScript.assets/image-20210317162257224.png)

###### 4、isNaN()

![image-20210317162354503](JavaScript.assets/image-20210317162354503.png)

##### 2、字符串型

![image-20210317162506979](JavaScript.assets/image-20210317162506979.png)

###### 1、字符串引号嵌套

![image-20210317162654436](JavaScript.assets/image-20210317162654436.png)

![image-20210317162746371](JavaScript.assets/image-20210317162746371.png)

###### 2、字符串转义字符

![image-20210317162803579](JavaScript.assets/image-20210317162803579.png)

###### 3、字符串长度

![image-20210317163043587](JavaScript.assets/image-20210317163043587.png)

###### 4、字符串拼接

![image-20210317163301445](JavaScript.assets/image-20210317163301445.png)

==实例==

![image-20210317163251147](JavaScript.assets/image-20210317163251147.png)

==加强==

![image-20210317163526371](JavaScript.assets/image-20210317163526371.png)

##### 3、Boolean布尔类型

###### 1、参与数字运算

![image-20210317163731324](JavaScript.assets/image-20210317163731324.png)

##### 4、Undefined和null

![image-20210317163958325](JavaScript.assets/image-20210317163958325.png)

![image-20210317163948151](JavaScript.assets/image-20210317163948151.png)

> null是object类型

#### 2、获取变量数据类型

![image-20210317164249783](JavaScript.assets/image-20210317164249783.png)

> 测试出一个结果：prompt输入的是一个字符型

==看控制台输出的颜色辨别数据类型==

![image-20210317164445304](JavaScript.assets/image-20210317164445304.png)

==字面量==

![image-20210317164553704](JavaScript.assets/image-20210317164553704.png)

#### 3、数据类型转换

##### 1、转换为字符串

![image-20210317164729343](JavaScript.assets/image-20210317164729343.png)

##### 2、转换为数字型

![image-20210317164826608](JavaScript.assets/image-20210317164826608.png)

![image-20210317165211618](JavaScript.assets/image-20210317165211618.png)

![image-20210317165341107](JavaScript.assets/image-20210317165341107.png)

##### 3、转换为布尔类型

![image-20210317165533475](JavaScript.assets/image-20210317165533475.png)

### 4、标识符、关键字、保留字

#### 1、标识符

![image-20210317170022008](JavaScript.assets/image-20210317170022008.png)

#### 2、关键字

![image-20210317170040399](JavaScript.assets/image-20210317170040399.png)

#### 3、保留字

![image-20210317170058422](JavaScript.assets/image-20210317170058422.png)

### 5、运算符

#### 1、导读

![image-20210317170203974](JavaScript.assets/image-20210317170203974.png)

#### 2、算术运算符

![image-20210317170248404](JavaScript.assets/image-20210317170248404.png)

==特殊的浮点数==

![image-20210317170418184](JavaScript.assets/image-20210317170418184.png)

==表达式必有返回值==

![image-20210317170724279](JavaScript.assets/image-20210317170724279.png)

#### 3、递增递减运算符

![image-20210317170842518](JavaScript.assets/image-20210317170842518.png)

#### 4、比较运算符

![image-20210317171055802](JavaScript.assets/image-20210317171055802.png)

#### 5、逻辑运算符

![image-20210317171322128](JavaScript.assets/image-20210317171322128.png)

==&&和||的逻辑中断==

![image-20210317171851996](JavaScript.assets/image-20210317171851996.png)

#### 6、赋值运算符

#### ![image-20210317171936108](JavaScript.assets/image-20210317171936108.png)7、运算符优先级

![image-20210317172124036](JavaScript.assets/image-20210317172124036.png)

### 6、流程控制

![image-20210317172439665](JavaScript.assets/image-20210317172439665.png)

#### 1、顺序流程控制

#### ![image-20210317201723796](JavaScript.assets/image-20210317201723796.png)2、分支流程控制if

![image-20210317201752583](JavaScript.assets/image-20210317201752583.png)

#### 3、三元表达式

![image-20210317201857113](JavaScript.assets/image-20210317201857113.png)

#### 4、switch

![image-20210317202035201](JavaScript.assets/image-20210317202035201.png)

> 是全等匹配

### 7、循环

#### 1、for循环

![image-20210317202313977](JavaScript.assets/image-20210317202313977.png)

> 可以在sources中打断点

#### 2、while循环

![image-20210317202528805](JavaScript.assets/image-20210317202528805.png)

#### 3、do-while循环

![image-20210317202653518](JavaScript.assets/image-20210317202653518.png)

#### 4、continue

![image-20210317202720357](JavaScript.assets/image-20210317202720357.png)

#### 5、break

![image-20210317202747682](JavaScript.assets/image-20210317202747682.png)

### 8、数组

#### 1、数组的概念

![image-20210317202941695](JavaScript.assets/image-20210317202941695.png)

#### 2、创建数组

##### 1、利用new创建数组

![image-20210317203049859](JavaScript.assets/image-20210317203049859.png)

##### 2、利用数组字面量创建数组（常用）

![image-20210317203114715](JavaScript.assets/image-20210317203114715.png)

- 可以存任何数据类型

![image-20210317203202515](JavaScript.assets/image-20210317203202515.png)

#### 3、获取数组元素

##### 1、数组的索引

![image-20210317203241252](JavaScript.assets/image-20210317203241252.png)

![image-20210317203333161](JavaScript.assets/image-20210317203333161.png)

==数组的长度==

![image-20210317203454008](JavaScript.assets/image-20210317203454008.png)

#### 4、数组中新增元素

![image-20210317203617618](JavaScript.assets/image-20210317203617618.png)

![image-20210317203656649](JavaScript.assets/image-20210317203656649.png)

### 9、函数

#### 1、函数的概念

![image-20210317203929673](JavaScript.assets/image-20210317203929673.png)

#### 2、函数的使用

##### 1、声明函数

![](JavaScript.assets/image-20210317204042946.png)

##### 2、函数调用

![image-20210317204100183](JavaScript.assets/image-20210317204100183.png)

#### 3、函数的封装

![image-20210317204126030](JavaScript.assets/image-20210317204126030.png)

#### 4、函数的参数

![image-20210317204242357](JavaScript.assets/image-20210317204242357.png)

##### 1、当形参和实参个数不匹配时（不会报错）

![image-20210317204457058](JavaScript.assets/image-20210317204457058.png)

#### 5、函数的返回

==不需要声明类型，直接用return返回==

==如果没有return，则默认返回undefined==

#### 6、arguments的使用

![image-20210317204919653](JavaScript.assets/image-20210317204919653.png)

#### 7、函数的两种声明方式

![image-20210317205253347](JavaScript.assets/image-20210317205253347.png)

### 10、JS的作用域

![image-20210317205617672](JavaScript.assets/image-20210317205617672.png)

==ES6加入了块级作用域==

##### 作用域链

![image-20210317210244955](JavaScript.assets/image-20210317210244955.png)

### 11、JS的预解析

![image-20210317210814848](JavaScript.assets/image-20210317210814848.png)

==变量只是声明没有赋值，赋值是一种操作==

==函数声明时，如果用赋值声明函数则会报错，因为本质还是变量==

### 12、对象

#### 1、字面量创建对象

![image-20210317211422904](JavaScript.assets/image-20210317211422904.png)

#### 2、new创建对象

![image-20210317211642375](JavaScript.assets/image-20210317211642375.png)

#### 3、遍历对象

### 13、构造函数

#### 1、为什么要构造函数

![image-20210317211829566](JavaScript.assets/image-20210317211829566.png)

#### 2、构造函数的使用

![image-20210317212054516](JavaScript.assets/image-20210317212054516.png)

![image-20210317212104831](JavaScript.assets/image-20210317212104831.png)

#### 3、构造函数被调用时的执行过程

![image-20210317212312244](JavaScript.assets/image-20210317212312244.png)

### 14、内置对象

![image-20210317212818538](JavaScript.assets/image-20210317212818538.png)

==MDN中查文档==

#### 1、常用Math对象

![image-20210317213220807](JavaScript.assets/image-20210317213220807.png)

#### 2、常用Date日期对象

![image-20210317213442533](JavaScript.assets/image-20210317213442533.png)

##### 1、获得总秒数

![image-20210317213721095](JavaScript.assets/image-20210317213721095.png)

#### 3、数组对象

##### 1、创建数组的两种方式

![image-20210317214130486](JavaScript.assets/image-20210317214130486.png)

##### 2、检测是否为数组的两种方式

![image-20210317214254441](JavaScript.assets/image-20210317214254441.png)

##### 3、添加删除数组的函数

![image-20210317214452371](JavaScript.assets/image-20210317214452371.png)

![image-20210317214408938](JavaScript.assets/image-20210317214408938.png)

##### 4、获取数组中某元素的索引

![image-20210317214528248](JavaScript.assets/image-20210317214528248.png)

##### 5、转换为字符串方法

![image-20210317214555594](JavaScript.assets/image-20210317214555594.png)

> join默认是逗号(,)分隔

#### 4、字符串对象

##### 1、基本包装类型

![image-20210317214815847](JavaScript.assets/image-20210317214815847.png)

##### 2、字符串的不可变

![image-20210317215051446](JavaScript.assets/image-20210317215051446.png)

##### 3、根据字符返回index

![image-20210317215306002](JavaScript.assets/image-20210317215306002.png)

##### 4、根据位置返回字符（重点）

![image-20210317215433267](JavaScript.assets/image-20210317215433267.png)

##### 5、字符串操作方法

![image-20210317215549616](JavaScript.assets/image-20210317215549616.png)

##### 6、替换字符replace

![image-20210317215656627](JavaScript.assets/image-20210317215656627.png)

##### 7、字符转换为数组split('分隔符')

![image-20210317215736299](JavaScript.assets/image-20210317215736299.png)

