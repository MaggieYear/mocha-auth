# mocha-auth
一个基于maven-spring-shiro的权限认证项目
===
项目架构：
-- 

一、基础配置：
--
Maven : 4.0.0 <br>
Spring : 4.2.9.RELEASE <br>
Servlet : 3.1.0 <br>
MyBatis : 3.4.1 <br>
MySql : 5.1.38 <br>
 <br>
shiro : 1.3.2 <br>
quartz : 2.2.3 <br>
 <br>
Tomcat : 7.0 <br>
Java-SE : 1.8 <br>

二、模块说明：
--
* mocha-pom : maven主pom项目（父模块）
  * 子模块
  * <module>mocha-model</module>
  * <module>mocha-basic</module>
  * <module>mocha-utils</module>
  * <module>mocha-dao</module>
  * <module>mocha-service</module>
  * <module>mocha-controller-jsp</module>
  * <module>mocha-quartz</module>
  
* 模块间依赖关系
![模块间依赖关系](http://on-img.com/chart_image/5ac25527e4b04a5e96113e2a.png) 
