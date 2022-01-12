# 集成
## java-suit-log
### 引用
```xml
<dependency>
    <groupId>org.pettyfox.base</groupId>
    <artifactId>java-suit-log</artifactId>
    <version>1.0.0</version>
</dependency>
```
### 功能
- 提供日志基础套件
- 提供logback示例模板

### 使用示例
```java
@Slf4j
public class Main {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Main.class);
        log.error("this is log test");
        log.warn("this is log test");
        log.info("this is log test");
        log.debug("this is log test");
    }
}
```
### logback.xml
[logback.xml下载地址](http)