# Read Me First
The following was discovered as part of building this project:

* The following dependencies are not known to work with Spring Native: 'Spring Boot DevTools, Picocli, Quartz Scheduler, Spring cache abstraction, Spring Batch, JOOQ Access Layer, MariaDB Driver, Oracle Driver, IBM DB2 Driver, Flyway Migration, Liquibase Migration, Apache Derby Database, MS SQL Server Driver, MyBatis Framework, Cloud Bootstrap, Apache Zookeeper Configuration, Consul Configuration, Vault Configuration, Spring HATEOAS, Spring Web Services, Rest Repositories, Rest Repositories HAL Explorer'. As a result, your application may not work as expected.

# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.5.6/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.5.6/maven-plugin/reference/html/#build-image)
* [Spring Native Reference Guide](https://docs.spring.io/spring-native/docs/current/reference/htmlsingle/)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.5.6/reference/htmlsingle/#using-boot-devtools)
* [Picocli](https://picocli.info/#_spring_boot_example)
* [Spring cache abstraction](https://docs.spring.io/spring-boot/docs/2.5.6/reference/htmlsingle/#boot-features-caching)
* [Validation](https://docs.spring.io/spring-boot/docs/2.5.6/reference/htmlsingle/#boot-features-validation)
* [Spring Batch](https://docs.spring.io/spring-boot/docs/2.5.6/reference/htmlsingle/#howto-batch-applications)
* [Java Mail Sender](https://docs.spring.io/spring-boot/docs/2.5.6/reference/htmlsingle/#boot-features-email)
* [JOOQ Access Layer](https://docs.spring.io/spring-boot/docs/2.5.6/reference/htmlsingle/#boot-features-jooq)
* [JDBC API](https://docs.spring.io/spring-boot/docs/2.5.6/reference/htmlsingle/#boot-features-sql)
* [Flyway Migration](https://docs.spring.io/spring-boot/docs/2.5.6/reference/htmlsingle/#howto-execute-flyway-database-migrations-on-startup)
* [Liquibase Migration](https://docs.spring.io/spring-boot/docs/2.5.6/reference/htmlsingle/#howto-execute-liquibase-database-migrations-on-startup)
* [Spring Data JDBC](https://docs.spring.io/spring-data/jdbc/docs/current/reference/html/)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.5.6/reference/htmlsingle/#boot-features-jpa-and-spring-data)
* [MyBatis Framework](https://mybatis.org/spring-boot-starter/mybatis-spring-boot-autoconfigure/)
* [Spring Data R2DBC](https://docs.spring.io/spring-boot/docs/2.5.6/reference/html/spring-boot-features.html#boot-features-r2dbc)
* [Spring Security](https://docs.spring.io/spring-boot/docs/2.5.6/reference/htmlsingle/#boot-features-security)
* [Cloud Bootstrap](https://spring.io/projects/spring-cloud-commons)
* [Apache Zookeeper Quick Start](https://docs.spring.io/spring-cloud-zookeeper/docs/current/reference/html/#distributed-configuration-usage)
* [Spring Cloud Consul Quick Start](https://docs.spring.io/spring-cloud-consul/docs/current/reference/html/#distributed-configuration-usage)
* [Config Client Quick Start](https://docs.spring.io/spring-cloud-config/docs/current/reference/html/#_client_side_usage)
* [Vault Client Quick Start](https://docs.spring.io/spring-cloud-vault/docs/current/reference/html/#client-side-usage)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.5.6/reference/htmlsingle/#boot-features-developing-web-applications)
* [Spring HATEOAS](https://docs.spring.io/spring-boot/docs/2.5.6/reference/htmlsingle/#boot-features-spring-hateoas)
* [Spring Web Services](https://docs.spring.io/spring-boot/docs/2.5.6/reference/htmlsingle/#boot-features-webservices)
* [Rest Repositories](https://docs.spring.io/spring-boot/docs/2.5.6/reference/htmlsingle/#howto-use-exposing-spring-data-repositories-rest-endpoint)

### Guides
The following guides illustrate how to use some features concretely:

* [Caching Data with Spring](https://spring.io/guides/gs/caching/)
* [Creating a Batch Service](https://spring.io/guides/gs/batch-processing/)
* [Accessing Relational Data using JDBC with Spring](https://spring.io/guides/gs/relational-data-access/)
* [Managing Transactions](https://spring.io/guides/gs/managing-transactions/)
* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)
* [Using Spring Data JDBC](https://github.com/spring-projects/spring-data-examples/tree/master/jdbc/basics)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [MyBatis Quick Start](https://github.com/mybatis/spring-boot-starter/wiki/Quick-Start)
* [Acessing data with R2DBC](https://spring.io/guides/gs/accessing-data-r2dbc/)
* [Securing a Web Application](https://spring.io/guides/gs/securing-web/)
* [Spring Boot and OAuth2](https://spring.io/guides/tutorials/spring-boot-oauth2/)
* [Authenticating a User with LDAP](https://spring.io/guides/gs/authenticating-ldap/)
* [Centralized Configuration](https://spring.io/guides/gs/centralized-configuration/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Building a Hypermedia-Driven RESTful Web Service](https://spring.io/guides/gs/rest-hateoas/)
* [Producing a SOAP web service](https://spring.io/guides/gs/producing-web-service/)
* [Accessing JPA Data with REST](https://spring.io/guides/gs/accessing-data-rest/)
* [Accessing Neo4j Data with REST](https://spring.io/guides/gs/accessing-neo4j-data-rest/)
* [Accessing MongoDB Data with REST](https://spring.io/guides/gs/accessing-mongodb-data-rest/)

### Additional Links
These additional references should also help you:

* [Configure the Spring AOT Plugin](https://docs.spring.io/spring-native/docs/0.10.5/reference/htmlsingle/#spring-aot-maven)
* [R2DBC Homepage](https://r2dbc.io)

## Spring Native

This project has been configured to let you generate either a lightweight container or a native executable.

### Lightweight Container with Cloud Native Buildpacks
If you're already familiar with Spring Boot container images support, this is the easiest way to get started with Spring Native.
Docker should be installed and configured on your machine prior to creating the image, see [the Getting Started section of the reference guide](https://docs.spring.io/spring-native/docs/0.10.5/reference/htmlsingle/#getting-started-buildpacks).

To create the image, run the following goal:

```
$ ./mvnw spring-boot:build-image
```

Then, you can run the app like any other container:

```
$ docker run --rm -p 8080:8080 Senai:0.0.1-SNAPSHOT
```

### Executable with Native Build Tools
Use this option if you want to explore more options such as running your tests in a native image.
The GraalVM native-image compiler should be installed and configured on your machine, see [the Getting Started section of the reference guide](https://docs.spring.io/spring-native/docs/0.10.5/reference/htmlsingle/#getting-started-native-build-tools).

To create the executable, run the following goal:

```
$ ./mvnw package -Pnative
```

Then, you can run the app as follows:
```
$ target/Senai
```
