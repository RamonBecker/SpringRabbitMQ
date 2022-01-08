# SpringRabbitMQ
 
## :information_source: Information 

Project developed with Spring, Docker and RabbitMQ. Two projects were created: the consumer (consumer) and a producer (producer). The consumer project will consume the messages from the queues and the producer project is responsible for creating the queues and their messages.
Developed features:

- Standardization and creation and consumption of automatic queues;
- Creation of exception flow for the queues;
- Creation of automatic reprocessing of queues;
- Creation of established time for the execution of the reprocessing of the queues;
- Creation of endpoints in the API for sending messages and for executing the reprocessing of queues;
- RabbitMQ container creation in Docker



## ⚠️ Prerequisite
[![Java Badge](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)](https://www.oracle.com/br/java/technologies/javase-downloads.html) >= 11 

![Spring Badge](https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white)

![Spring boot](https://img.shields.io/badge/Spring_Boot-F2F4F9?style=for-the-badge&logo=spring-boot)

![JSON Badge](https://img.shields.io/badge/json-5E5C5C?style=for-the-badge&logo=json&logoColor=white)

![Docker](https://img.shields.io/badge/Docker-2CA5E0?style=for-the-badge&logo=docker&logoColor=white)

![POSTMAN](https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=Postman&logoColor=white )

<img src="https://www.rabbitmq.com/img/logo-rabbitmq.svg" heigth="150" width="150"/>


##  🔧 Install 


![](https://img.shields.io/badge/Linux-FCC624?style=for-the-badge&logo=linux&logoColor=black)


```
git clone https://github.com/RamonBecker/SpringRabbitMQ.git
```

![](https://img.shields.io/badge/Windows-0078D6?style=for-the-badge&logo=windows&logoColor=white)
```
git clone https://github.com/RamonBecker/SpringRabbitMQ.git
or install github https://desktop.github.com/ 
```



## 🔨 POSTMAN

To test the end points you will need to install POSTMAN or Insomnia.

To send messages in RabbitMQ, open POSTMAN or Insomnia, choose the POST method and type the following:

```

localhost:8081/send

{
    "text": "test"
}

```
To perform queue reprocessing in RabbitMQ, open POSTMAN or Insomnia, choose the GET method and type the following:

```
localhost:8082/repost
```

## 🔨 Docker

To install RabbitMQ in Docker container, open the windows cmd or linux terminal and type:
```
docker run -d -p 15672:15672 -p 5672:5672 --name rabbitmq rabbitmq-3-management
```

Once RabbitMQ is installed, you will need to enable the feature to move messages from one queue to another. For this you will need to enter the RabbitMQ bash, type in the terminal:
```
docker exec -it rabbitmq bash
```
Run the following command in bash:
```
rabbitmq-plugins enable rabbitmq_shovel rabbitmq_shovel_management
```


RabbitMQ has as default user:
```
username: guest
password: guest
```
If you want to change the default user, open your browser and enter the following address to enter the RabbitMQ user settings and make the changes you want:
```
http://localhost:15672/#/users/guest
```
If you change the default user, don't forget to change the application.yml project files:
```
spring:
   rabbitmq:
     username: your username changed
     password: your password changed
```

## RabbitMQ

To see the created queues and their messages:

![filas](https://user-images.githubusercontent.com/44611131/148652379-92467a6b-a5b2-4915-825b-0525e38e418e.PNG)

Click on the queue name and go to the get Message(s) option

![mensagem](https://user-images.githubusercontent.com/44611131/148652418-2cc632ea-da28-4b92-927a-da4f4471d28f.PNG)

## :zap: Technologies	

- Java
- Spring Boot
- Docker
- RabbitMQ

## :memo: Developed features

- [x] Sending messages through queues
- [x] Endpoint creation

## :technologist:	 Author

By Ramon Becker 👋🏽 Get in touch!

[<img src='https://cdn.jsdelivr.net/npm/simple-icons@3.0.1/icons/github.svg' alt='github' height='40'>](https://github.com/RamonBecker)  [<img src='https://cdn.jsdelivr.net/npm/simple-icons@3.0.1/icons/linkedin.svg' alt='linkedin' height='40'>](https://www.linkedin.com/in/https://www.linkedin.com/in/ramon-becker-da-silva-96b81b141//)
![Gmail Badge](https://img.shields.io/badge/-ramonbecker68@gmail.com-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:ramonbecker68@gmail.com)
