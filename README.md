# Spring Love Calculator

A Spring MVC-based web application that calculates love percentage between two individuals based on their names. This project serves as a demonstration of advanced Spring MVC concepts such as Java-based configuration, form validation, and custom formatters.

## Features

- **User Input Form:** Enter your name and your crush's name to calculate love percentage.
- **Java-based Spring MVC Configuration:** No `web.xml` required. Utilizes `WebApplicationInitializer` and `AbstractAnnotationConfigDispatcherServletInitializer`.
- **Form Validation:** 
  - Uses Hibernate Validator with JSR 380 for server-side validation.
  - Validates user input (e.g., names should not be empty).
- **Custom Formatter:** Formats input data where necessary.
- **Spring Form Tags:** Simplified form handling with Spring form tags like `<form:form>` and `<form:input>`.
- **Custom Annotations and Validators:** Example of creating custom validation annotations.

## Technologies Used

- **Spring MVC**
- **Hibernate Validator** (JSR 380)
- **JSP and Spring Form Tags**
- **Tomcat (or any servlet container supporting Servlet 3.0+)**

## Project Structure

The project is configured using Java-based Spring MVC configuration:

- **Config Class:** Implements `WebApplicationInitializer` for configuration without `web.xml`.
- **Custom Form Validators:** Implement server-side validation logic using annotations like `@NotEmpty`, `@Size`, etc.
- **Controller:** Manages requests and form submissions with `@Controller`, `@ModelAttribute`, and `@Valid`.
- **JSP Views:** Form submission pages using Spring's form tags for ease of development.

## Getting Started

### Prerequisites

- **Java 8 or higher**
- **Maven**
- **Tomcat 9 or higher**

### Installing and Running

1. Clone the repository.
2. Import the project into your preferred IDE (like Eclipse or IntelliJ).
3. Ensure Maven dependencies are installed by running `mvn clean install`.
4. Deploy the application to a servlet container like Tomcat.
5. Access the application in a browser at `http://localhost:8080/spring-love-calculator`.

## Usage

1. Enter your name and your crush's name on the home page.
2. Submit the form to calculate the love percentage.

## Advanced Concepts Demonstrated

- **Spring MVC Form Validation:** Validates input fields using annotations and handles validation errors in the controller with `BindingResult`.
- **Custom Annotations:** Demonstrates how to create custom validation annotations.
- **Custom Formatters:** Implements custom formatting logic for special fields like phone numbers or other user inputs.

## Learning Outcomes

This project is ideal for developers looking to:

- Understand how to configure Spring MVC applications using Java-based configuration.
- Implement server-side form validation with Hibernate Validator.
- Gain practical experience with Spring form tags and data binding in JSP pages.
- Explore advanced features like custom formatters and validators.
