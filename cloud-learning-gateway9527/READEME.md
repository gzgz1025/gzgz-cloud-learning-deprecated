# GateWay 笔记
[官方文档](https://spring.io/projects/spring-cloud-gateway)
## 1、是什么
Spring Cloud Gateway 使用的Webflux中的reactor-netty响应式编程组件，底层使用了Netty通讯框架

## 2、能干啥
反向代理、鉴权、流量控制、熔断、日志监控等

## 3、三大核心概念

- Route(路由):路由是构建网关的基本模块，它由ID，目标URI，一系列的断言和过滤器组成，如果断言为true则匹配该路由
- Predicate（断言）:参考的是java8的java.util.function.Predicate开发人员可以匹配HTTP请求中的所有内容（例如请求头或请求参数），如果请求与断言相匹配则进行路由
- Filter(过滤):指的是Spring框架中GatewayFilter的实例，使用过滤器，可以在请求被路由前或者之后对请求进行修改。

## 4、工作流程

![工作原理](./doc/gateway12.png)