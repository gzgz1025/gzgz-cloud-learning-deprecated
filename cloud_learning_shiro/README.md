# Shiro 学习笔记
## 什么是 Shiro  
[官网](http://shiro.apache.org/)  
是一款主流的 Java 安全框架，不依赖任何容器，可以运行在 Java SE和 Java EE 项目中，它的主要作用是对访问系统的用户进行身份认证、授权、会话管理、加密等操作。  
Shiro 就是用来解决安全管理的系统化框架。

## Shiro 核心组件
用户、角色、权限：会给角色赋予权限，给用户赋予角色  
- UsernamePasswordToken，Shiro 用来封装用户登录信息，使用用户的登录信息来创建令牌 Token。
- SecurityManager，Shiro 的核心部分，负责安全认证和授权。
- Suject，Shiro 的一个抽象概念，包含了用户信息。
- Realm，开发者自定义的模块，根据项目的需求，验证和授权的逻辑全部写在 Realm 中。
- AuthenticationInfo，用户的角色信息集合，认证时使用。
- AuthorzationInfo，角色的权限信息集合，授权时使用。
- DefaultWebSecurityManager，安全管理器，开发者自定义的Realm 需要注入到 DefaultWebSecurityManager 进行管理才能生
  效。
- ShiroFilterFactoryBean，过滤器工厂，Shiro 的基本运行机制是开发者定制规则，Shiro 去执行，具体的执行操作就是由ShiroFilterFactoryBean 创建的一个个 Filter 对象来完成。
## 运行机制
[Image text](https://raw.githubusercontent.com/gzgz1025/gzgz-cloud-learning/master/doc/shiro.png)