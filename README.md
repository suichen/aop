# aop
注解方式和 XML 配置方式的底层实现都是一样的，都是通过继承 ProxyCreatorSupport 来实现的，不同的通过扩展不同的 Spring 提供的接口。
XML 扩展的是FactoryBean 接口， 而注解方式扩展的是 BenaPostProcessor 接口，通过Spring 的扩展接口，能够对特定的Bean进行增强。

XML配置方式和注解方式的底层方式都是相同的，都是通过ProxyCreatorSupport创建代理，但是
XML是通过ProxyFatoryBean来实现的，而注解是通过BeanPostProcessor来实现创建代理的逻辑。


