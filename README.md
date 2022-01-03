

## 基于SpringBoot2 + Thymeleaf + Layui +  Mybatis + MySql 的后台管理系统

### **1.技术**

```java
核心框架: SpringBoot2
项目构建: maven
JDK: 1.8
持久成框架:Mybatis
模板框架: Thymeleaf
数据库: MySQL

```

## 2.系统的功能

菜单管理：增删改系统的菜单

用户管理：管理员增删改查询系统用户，分页。

角色管理：超级管理员、管理员

权限管理：超级管理员分配系统的功能使用权

日志管理：系统的日志



## 3.数据库设计

管理员表admin: 通过rid字段与roleb表关联。

role_treemenu：role表和treemenu两个表的关联。

通过Mybatis插件，逆向生成表的实体类和Mapper接口和和对应的XXmapper.xml文件。

<img src="../images/%E6%B3%9B%E5%9E%8B%20-%20%E5%89%AF%E6%9C%AC/%E6%95%B0%E6%8D%AE%E5%BA%932.png" style="zoom: 67%;" />

<img src="../images/%E6%B3%9B%E5%9E%8B%20-%20%E5%89%AF%E6%9C%AC/%E6%95%B0%E6%8D%AE%E5%BA%934.png" style="zoom:67%;" />

<img src="../images/%E6%B3%9B%E5%9E%8B%20-%20%E5%89%AF%E6%9C%AC/%E6%95%B0%E6%8D%AE%E5%BA%935.png" style="zoom:67%;" />

<img src="../images/%E6%B3%9B%E5%9E%8B%20-%20%E5%89%AF%E6%9C%AC/%E6%95%B0%E6%8D%AE%E5%BA%936.png" style="zoom:67%;" />

<img src="../images/%E6%B3%9B%E5%9E%8B%20-%20%E5%89%AF%E6%9C%AC/%E6%95%B0%E6%8D%AE%E5%BA%931.png" style="zoom:67%;" />

###        ### 4.系统的截图

1.系统页面

![](../images/%E6%B3%9B%E5%9E%8B%20-%20%E5%89%AF%E6%9C%AC/%E5%90%8E%E5%8F%B0%E9%A1%B5%E9%9D%A2.PNG)

2.用户列表

![](../images/%E6%B3%9B%E5%9E%8B%20-%20%E5%89%AF%E6%9C%AC/%E7%94%A8%E6%88%B7%E5%88%97%E8%A1%A8.PNG)

3.角色管理

![](../images/%E6%B3%9B%E5%9E%8B%20-%20%E5%89%AF%E6%9C%AC/%E8%A7%92%E8%89%B2%E7%AE%A1%E7%90%86.PNG)

4.权限控制

![](../images/%E6%B3%9B%E5%9E%8B%20-%20%E5%89%AF%E6%9C%AC/%E6%9D%83%E9%99%90.PNG)

### 5.登录账号

### 账号：superAdmin
密码：123456