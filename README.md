# chaos-mybatis-generator
mybatis自定义生成demo
官方文档参照：http://mybatis.org/generator/index.html

# 支持2种方式运行：
1、使用maven命令，mvn mybatis-generator:generate 执行
- 配合pom文件中properties设置的值，例如<mybatis.generator.configurationFile>设置了配置文件读取的是generatorConfig-link.xml
其它的配置见文档中 http://mybatis.org/generator/running/runningWithMaven.html
- 配置文件中，不能使用自定义的注释器、类型转换器，对应commentGenerator的type属性、javaTypeResolver的type属性
- targetProject可以使用特殊内置值：MAVEN，大小写敏感，如此配置后，生成的文件路径在target/generated-sources下面

2、使用java类执行，在com.chaos.mybatis包下创建了Startup类，执行它的main方法就行
- 增加自定义注释生成器 ChaosCommentGenerator
- 增加自定义Java类型处理器 ChaosJavaTypeResolver

