# Payment Processing System

A Spring Boot and microservices -based payment processing system that handles transactions, integrates with Stripe, and manages various payment statuses.

## Table of Contents
- [Introduction](#introduction)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Installation](#installation)
![End to End Payment flow](https://github.com/user-attachments/assets/fabd740d-8463-4017-88b3-512fe8ddc17e)


## Introduction
The Payment Processing System is designed to handle online payment transactions efficiently and securely. Built using the robust Spring Boot framework, the system integrates with the Stripe payment gateway, enabling seamless processing of payments for e-commerce platforms. This project manages various aspects of the payment lifecycle, from initiation to completion, ensuring that each transaction is accurately recorded and its status is dynamically managed.

This system is built with scalability in mind, allowing it to handle a large volume of transactions while maintaining performance. The core functionality revolves around the dynamic selection of payment status handlers, which process transactions based on their current state, such as CREATED, SUCCESS, or FAILED. The use of enums for transaction statuses ensures consistency and simplifies the management of different transaction states.

In addition to its core payment processing capabilities, the system is designed to be easily extensible, allowing for future integration with additional payment gateways or the addition of new features, such as automated refund processing or enhanced security measures.

Key components of the system include RESTful APIs for interacting with the payment service, a modular service layer for business logic, and a database layer that securely stores transaction details. The project also incorporates error handling mechanisms to ensure that all edge cases are covered, providing a reliable and user-friendly payment experience.

## Features
Features
The Payment Processing System offers the following key features:

**Payment Transaction Management:

Initiates, processes, and completes payment transactions.
Supports multiple transaction statuses like CREATED, SUCCESS, FAILED, etc., managed through a well-defined enum structure.

**Dynamic Status Handling:
Utilizes a factory pattern to dynamically select and execute the appropriate status handler based on the current transaction status.
Allows for easy extension to add new status handlers as needed.

**Stripe Payment Integration:
Integrates with the Stripe payment gateway for secure and reliable payment processing.
Handles end-to-end payment flows, including authorization, capture, and refunds (if applicable).

**ModelMapper for Data Transformation:
Uses ModelMapper to seamlessly convert between Transaction entities and TransactionDTO objects.
Simplifies the data mapping process, ensuring that the service layer operates with the correct data structures.

**RESTful API Endpoints:
Provides a set of RESTful APIs for interacting with the payment service.
Supports operations such as initiating payments, checking transaction status, and retrieving transaction details.

**Error Handling and Logging:
Implements robust error handling to manage unexpected scenarios gracefully.
Includes logging at various stages of the payment process to facilitate debugging and monitoring.

**Scalability and Extensibility:
Designed to handle high volumes of transactions with minimal performance degradation.
Modular architecture allows for easy integration with additional payment gateways or the introduction of new features.

**Secure Data Management:
Ensures that sensitive payment information is securely handled and stored.
Implements security best practices to protect against common vulnerabilities.

##  Technologies used

**Spring Boot**: Backend framework.
- **Java**: Programming language.
- **Stripe API**: Payment processing.
- **ModelMapper**: Object mapping.
- **MySQL**: Database management.
- **Maven**: Dependency management.

##  Installation 


Prerequisites
Java Development Kit (JDK) (version 8 or higher)

Ensure that Java is installed on your machine.
Maven

Used for managing the project’s dependencies and build processes.
Download and install Maven from here.

Install MySQL and set up a database for the application.
Download MySQL from here.
Stripe Account

Create a Stripe account and obtain your API keys for integration.
Sign up at Stripe.
Docker (optional)

If using Docker for containerization, ensure Docker is installed on your system.

