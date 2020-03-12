# Delivery

Projeto desenvolvido utilizando micro serviços com a linguagem de desenvolvimento Java.

### Serviços

  - Configuração (Config Server)
  - Registro de Serviço (Service Registry)
  - Autenticação
  - Pedidos

### Tech

Para desenvolvimento foi utilizado as seguintes tecnologias e arquitetura:

* [REST] - Representational State Transfers
* [Java] - Linguagem de Programação
* [MySQL] - Banco de Dados
* [Spring Cloud Netflix] - Provedor de integração para aplicações Spring Boot
* [Config Server] - Provedor de configuração
* [Spring Security] - Estrutura de autenticação e controle
* [Spring Oauth2] - Estrutura de autenticação
* 

### Informação
> Para inicializar a aplicação deve-se primeiramente rodar o serviço na seguinte ordem:
* **delivery-config-server**; 
* **delivery-eureka-server**;
* **delivery-oauth-server**;
* **delivery-order-service**.

   [REST]: <https://pt.wikipedia.org/wiki/REST>
   [Java]: <https://www.oracle.com/technetwork/pt/java/javase/downloads/index.html>
   [MySQL]: <https://www.mysql.com/>
   [Spring Cloud Netflix]: <https://spring.io/projects/spring-cloud-netflix/>
   [Spring Security]: <https://spring.io/projects/spring-security/>
   [Spring Oauth2]: <https://spring.io/guides/tutorials/spring-boot-oauth2//>
   [Config Server]: <https://cloud.spring.io/spring-cloud-config/multi/multi__spring_cloud_config_server.html/>

Após rodar os micro serviços poderá visualizar eles registrados no Eureka em:
```sh
http://localhost:9091/
```

### Autenticação

Para realizar a autenticação, poderá ser utilizado o [Postman](https://www.postman.com/).
  - Método: POST
  - URI: http://localhost:9092/oauth/token?grant_type=password&username=admin&password=123456
  - Authorization: Username: coderef Password: $2a$10$p9Pk0fQNAQSesI4vuvKA0OZanDD2

