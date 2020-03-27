1、eureka server 高可用
    client只会向一个server注册，若注册失败，才会向另一个注册
    若当前注册成功的server挂掉了，则client则会向另一个server注册