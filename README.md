# aop
注解方式和 XML 配置方式的底层实现都是一样的，都是通过继承 ProxyCreatorSupport 来实现的，不同的通过扩展不同的 Spring 提供的接口。
XML 扩展的是FactoryBean 接口， 而注解方式扩展的是 BenaPostProcessor 接口，通过Spring 的扩展接口，能够对特定的Bean进行增强
