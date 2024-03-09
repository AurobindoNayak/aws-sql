1- To configure kafkaTemplate these are required as mandatory params
bootstrap-servers
key-serializer
value-serializer

2- Spring Kafka has a class called KafkaAdmin. Which is used to
create the topics via programmatically

It is the part of SpringKafka that we've added in our pom.xml file

3-To tell the application to create a new topic using this configuration , 
we need to provide the Admin api configuration in the application.properties file

spring.kafka.admin.properties.bootstrap.servers=localhost:9092,localhost:9094