最新访问方式为：
http://ip:port/actuator/


actuator默认的访问端口跟项目端口一致，但也可自己指定
management:
  server:
    port: 8100
    
    
actuator访问必须通过JMX和HTTP，但是使用HTTP默认只暴露health和info，因此想访问其他端点需自己配置
management:
  endpoints:
    web:
      exposure:
        exclude: shutdown,info  # 排除端点，不可访问；多端点之间用逗号分隔
        include: httptrace,env  # 包含端点，可以访问；多端点之间用逗号分隔
        
如想访问全部端点信息：
management:
 endpoints:
  web:
   exposure:
	   include: "*"
	   
在Spring Boot 2.0.0.RELEAS版本中，访问health端口，只能查询系统的状态，不能查看详细的信息。若想查看所需信息，需进行如下配置：
management:
  endpoint:
    health:
      show-details: always
其中show-details的值有三个：never，when-authorized，always。具体含义如下：
　　　　never：从不展示详情（默认）
　　　　when-authorized：详情只展示给授权用户，授权角色可使用 management.endpoint.health.roles 进行配置
　　　　always：展示详情给所有用户

