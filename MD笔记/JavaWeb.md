# JavaWeb

### 1、JSP简介

#### 1、JSP：动态网页、是服务端脚本语言

1. 不用和是否有“动感”混为一谈
2. 是否随着 时间、地点、用户操作 的改变而改变

#### 2、架构

##### 1、C/S架构  Client Server -------->QQ

1. 升级需要所有软件都升级
2. 需要维护每一个客户端
3. 每个客户端都需要下载软件
4. 速度快

##### 2、B/S架构 Browser Server -------->网页

1. 客户端可以通过浏览器直接访问服务器
2. 访问速度慢些

> C/S和B/S各有优劣

### 2、Tomcat

#### 1、Tomcat解压后目录解析

1. bin：可执行文件（startup.bar   shutdown.bar）
2. conf：配置文件（server.xml）
3. lib：Tomcat依赖的jar文件
4. log：日志文件（记录出错等信息）
5. temp：临时文件
6. webapps：可执行的项目（将我们开发的项目 放入该目录）
7. work：存放由JSP翻译成的java，以及编辑成的class文件 （jsp->java->class）

#### 2、配置Tomcat

1. 配置jdk
2. 配置catalina_home

#### 3、启动Tomcat

1. 双击bin/startup.bat

> 端口号默认8080 太常见容易冲突，改成8888 （config/server.xml）

#### 4、访问Tomcat

1. http://localhost:8080

#### 5、常见访问码

1. 200:一切正常
2. 300/301：页面重定向（跳转）
3. 404：资源不存在
4. 403：权限不足（访问a目录，但a目录设置不可见）
5. 500：服务器内部错误（代码有误）

### 3、JSP操作

#### 1、目录信息

1. webapps/项目名称/WEB-INF/classes、lib和web.xml

- web.xml中welcome的规范（规定访问目录的默认网页）

```java
<welcome-file-list>
        <welcome-file>index.html</welcome-file>
        <welcome-file>index.xhtml</welcome-file>
        <welcome-file>index.htm</welcome-file>
        <welcome-file>index.jsp</welcome-file>
</welcome-file-list>
```

#### 2、虚拟路径

- ##### 将web项目配置到webapps以外的目录

  方式1：

  1. conf/server.xml中配置

  2. host标签中：

     <Context docBase="D:\study\JspProject" path="/JspProject" />

     docBase:实际路径

     path:虚拟路径（绝对路径、相对路径（相对于webapps））

     重启

  方式2：

  1. D:\study\apache-tomcat-8.5.30\conf\Catalina\localhost中

  2. 新建"项目名.xml"中新增一行：

     <Context docBase="D:\study\JspProject" path="/JspProject" />

#### 3、虚拟主机

1. 通过www.test.com访问本机
2. conf/server.xml中
3. 修改<Engine defaultHost="www.test.com"
4. 加<Host appBase="项目的实际位置" name="www.test.com">
5. <Context docBase="实际位置" path="/" />
6. </Host>

1. C:\Windows\System32\drivers\etc\host
2. 增加
3. 127.0.0.1 www.test.com

> 流程：www.test.com->host找映射关系->server.xml找Engine的defaultHost->通过"/"映射到实际位置

#### 4、servlet (server applet)

##### 1、什么是servlet

1. servlet就是一个接口，定义了Jva类被浏览器访问到（tomcat识别）的规则
2. 我们自定义一个类，实现servlet接口，复写方法

##### 2、servlet执行原理

1. 当服务器接收到客户端浏览器的请求后，会解析请求URL路径，获取访问的Servlet的资源路径
2. 查找web.xml文件，是否有对应的<url-pattern>标签体内容
3. 如果有，则在找到对应的<servlet-class>全类名
4. tomcat会将字节码文件加载进内存，并创建其对象
5. 调用其方法

##### 3、Servlet中的生命周期

1. 被创建：执行init方法，只执行一次

   何时被创建：1.默认情况下，第一次被访问时，Servlet被创建

   ​							 2.可以配置执行Servlet的创建时机

   ​								    1.第一次被访问时，创建

   ​												<load-on-startup>的值为负数

   ​									 2.在服务器启动时，创建

   ​												<load-on-startup>的值为0或正整数

   **Servlet的init方法，只执行一次，说明Servlet在内存中只存在一个对象，Servlet是单例的

   ​      *多个用户同时访问时，可能存在线程安全问题

   ​	  *解决：尽量不要在Servlet中定义成员变量。即使定义了成员变量，也不要有修改操作

2. 提供服务：执行service()方法，执行多次

   1. 每次访问Servlet时，Service方法都会被调用一次

3. 被销毁：执行destory方法，只执行一次

   1. Servlet被销毁时执行。服务器关闭时，Servlet被销毁
   2. 只有服务器正常关闭时，才会执行destroy方法
   3. destroy方法在Servlet被销毁之前执行，一般用于释放资源

##### 4、Servlet3.0以上

1. 不需要web.xml
2. 在类上使用@WebServlet注解，进行配置
   1. @WebServlet("资源路径")

##### 5、Servlet体系结构

1. Servlet ------接口
2. GenericServlet  ------抽象类
   1. 将Servlet接口中其他的方法做了默认空实现，只将service()方法作为抽象
      1. 将来定义Servlet类时，可以继承GenericServlet，实现service()方法即可
3. HttpServlet  -------抽象类
   1. 对http协议的一种封装，简化操作
   2. 定义类继承HttpServlet
   3. 复写doGet/doPost方法

- HttpServlet  

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <form action="/day001_war_exploded/demo3" method="post">
        <input name="username">
        <input type="submit" value="提交">

    </form>
</body>
</html>
```

##### 6、Servlet相关配置

1. urlpartten：Servlet访问路径
   1. 一个Servlet可以定义多个访问路径：@WebServlet({"/d1","/dd1"})
   2. *通配符使用
      1. /xxx/*
      2. *.do          注意没有   / 

##### 7、请求消息数据格式

- 请求行

1. GET：
   1. 请求数据在请求行中，在url后
   2. 请求的url长度有限制
   3. 不太安全
2. POST
   1. 请求参数在请求体重
   2. 请求的url长度没有限制
   3. 相对安全

- 请求头：客户端浏览器告诉服务器一些信息

1. 常见的请求头：
   1. User-Agent：浏览器告诉服务器，我访问你使用的浏览器版本信息
      1. 可以在服务器端获取该头的信息，解决浏览器的兼容性问题
   2. Referer：http://localhost/login.html
      1. 告诉服务器，当前请求从哪里来
         1. 作用：
            1. 防盗链
            2. 统计工作

- 请求空行

1. 空行

- 请求体（正文）

1. 封装POST请求消息的请求参数 （GET则没有）

##### 8、Request  &&  Response

1. request对象和respnse对象的原理：
   1. request和response对象是由服务器创建的。我们来使用他们
   2. request对象是来获取请求消息，response对象是来设置响应消息
2. request对象继承体系结构
   1. ServletRequest       --------接口
   2. HttpServletRequest  -------接口  继承
   3. org.apache.catalina.connector.RequestFacade  类（tomcat）
3. request功能
   1. 获取请求信息数据
      1. 获取请求行数据
         1. GET  /day01/demo01？name=zhangsan  HTTP/1.1
         2. 方法：
            1. 获取请求方式：GET
               1. String getMethod()
            2. (*)获取虚拟目录：/day01
               1. String getContextPath()
            3. 获取Servlet路径：/demo01
               1. String getServletPath()
            4. 获取get方式请求参数：name=zhangsan
               1. String getQueryString()
            5. (*)获取请求URI：/day01/demo01
               1. String getRequestURI():                 /day01/demo01
               2. StringBuffer getRequestURL():       http://localhost/day01/demo01
            6. 获取协议及版本：HTTP/1.1
               1. String getProtocol()
            7. 获取客户机的IP地址：
               1. String getRemoteAddr()

#### 5、request常用api

- getRequestURI()
  1. 获取请求的资源路径
- getRequestURL()

1. 获取请求的统一资源定位符（绝对路径）

- getRemoteHost()

1. 获取客户端的ip地址

- getHeader()
  1. 获取请求头
- getParameter()

1. 获取请求的参数

- getParameterValues()

1. 获取请求的参数（多个值）

- getMethod()

1. 获取求情的方式GET  or  POST

- setAttribute(key,value)

1. 设置域数据

- getAttribute(key)

1. 获取域数据

- getRequestDispatcher()

1. 获取请求转发对象























