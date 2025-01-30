#Order, Stock, and Email Microservices with Kafka
Overview :
This project is a Spring Boot-based microservices architecture implementing order management. The system consists of three microservices:

Order Service (Producer)

Stock Service (Consumer)

Email Service (Consumer)

Kafka is used for event-driven communication between these microservices.

#Architecture :

The microservices interact as follows:
The Order Service places an order and publishes an event to a Kafka topic.

The Stock Service consumes the event, checks the stock availability, and processes the order.

The Email Service consumes the event and sends an email confirmation to the customer.

#Technologies Used:

Java 17
1. Spring Boot 3.x
2. Spring Kafka
3. Kafka Broker


#Microservices:

1. Order Service
   
a. Exposes REST APIs to place an order.

b. Publishes order events to a Kafka topic.

3. Stock Service
   
a. Consumes order events.

b. Checks stock availability and processes the order.

c. Updates stock levels.

5. Email Service
   
a. Consumes order events.

b. Sends an email notification to the customer.

#Kafka Configuration:

Topics--
order-topics: Used to communicate order details between services.


#How to Run the Application:
Prerequisites

a. Install Java 17 and Maven

b. Install and start Kafka


#Steps to Run:

a. Start Kafka and database.

b. Start each microservice: mvn spring-boot:run
