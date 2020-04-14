# Ladon Rest Client Demo project

This is an example how to use the Ladon Enterprise Repository Client API

```
 <dependency>
        <groupId>de.mc.ladon</groupId>
        <artifactId>rest-client</artifactId>
        <version>1.0.0</version>
 </dependency>
```

You need to add the Mind Repository as well:
```
  <repositories>
        <repository>
            <id>mind</id>
            <url>https://repo.mind-consulting.de/repository/mind/</url>
        </repository>
  </repositories>

```

Then start coding:
```java
LadonClient ladon = LadonClient.connect("ladon-url", "api-key", "api-secret");
ladon.createBucket(bucket);
...
  ```      
### License
Copyright (C) 2020 Mind Consulting

Free for private use, easy commercial licensing available [here](https://elopage.com/s/mind/ladon-s3-server/payment?locale=en)

<a href="https://ladon.org/"><img src="https://ladon.org/img/logo_no_bg.png" height="100" width="250" ></a>
