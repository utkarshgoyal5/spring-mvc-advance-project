**Spring MVC Advance Notes**

**Java Based Spring MVC Configuration**

* Every Java web application have web.xml file  
* Any web server like tomcat, JBoss reads the web.xml to get the configuration done by the developer  
* In web.xml we can do configuration like defining:  
  * Servlet/URL mapping  
  * Filters  
  * Security   
  * Error Handlers   
  * Welcome files list  
* Can we create a web application without a web.xml file?  
  * Yes, we can, if our web server has a servlet container which supports servlet spec 3.0+ version.  
  * For the implementation, we need to implement an interface provided by Spring MVC named WebApplicationInitializer to our class where we want to do our configuration.  
    * This interface contains only 1 method named onStartup.  
      * void onStartup(ServletContext servletContext);  
      * Here ServletContext is an interface which is implemented by servletContainer (in our case tomcat), so it's tomcat's responsibility to know how it is going to implement this interface.  
    * This method will be called by the web server (tomcat) automatically, it is a kind of callback method.   
  * We can use another approach by extending the AbstractAnnotationConfigDispatcherServletInitializer class to our config class.  
    * Using this class we can implement the same functionality with less code, internally this class is also implementing the same WebApplicationInitializer interface.  
* In spring MVC we can use Spring form tags in JSP to make it more developer friendly, tags are as follows   
  * \<form:form\>\<\</form:form\>, \<form:input\>\</form:input\> etc  
  * We can also use @ModelAttribute annotation in java method, to pass DTO data.

**Spring MVC Form Validation**

* We have 2 types of validation client-side and server-side.  
  * For example if we want some field to not be empty, we can validate this by adding javascript code in html to prevent the user from submitting the form without filling that field.  
  * But client side code can be accessed by the user and can be modified also, and it can break that validation. So for that we need server-side validation.  
  * So in java we use the bean Validation API 2.0 also known as JSR 380 (java specification request).  
    * Java Specification Requests (JSRs) are created by Java developers and submitted to the Java Community Process (JCP) to introduce new features or enhancements to Java. Once reviewed and approved by the JCP's governing body, the PMO, the new feature is released with a unique JSR number in a subsequent Java version.  
    * In the context of bean validation in Java, three JSRs are particularly relevant: JSR 303, JSR 349, and JSR 380\. Among these, JSR 380 is the most recent and provides the latest set of specifications and guidelines for bean validation.  
  * In our case we will use hibernate validator which uses JSR 380 specification to implement it.  
  * So we will add both the dependencies of JRE 380 and hibernate validator and after that we can use annotations like @Size, @Min, @NotEmpty, and can also pass the message.  
    * In the controller we must use @Valid annotation before @ModleAttribute so that request can be validated when received.  
    * For receiving the validation result we can pass the BidingResult object in the controller method param just after the DTO object param to get the error.  
    * In JSP we can pass the form:error tag with field name as path to show the message to the user.

    

**Spring Formatter**

* In cases where a user inputs a phone number along with its country code, such as "91-9988776655" and we have a Phone class with two fields: countryCode and phoneNumber, Spring offers a Formatter interface to automatically format such data. By utilizing this interface method named parse(String text, Locale locale), we can format the phone number and store both the country code and the phone number in their respective fields.  
  * Note: If we do not pass any value in the required field then the formator will not be called at null value.  
* To accomplish this, we must implement the WebMvcConfigurer interface in our config Java file. Within this interface, we need to override the addFormatter method to register all of our formatters.  
* The Formatter interface includes a print method that allows us to display formatted data on a webpage. For example, if we want to display the phone number provided above on a webpage, we can use this method to format it as "91-9988776655."

**Advanced Spring MVC Form Validation**

* It is possible to create custom validators for a Spring MVC form. For instance, you might want to ensure that a phone number field contains exactly 10 digits and is not left empty.  
* To create a custom annotation:  
  * Define an interface using this syntax: \`public @interface CustomAnnotation { int length() default 10; String message() default “any message you want to provide”; }\`.  
  * Apply annotations like \`@Retention(RUNTIME)\`, \`@Target(FIELD)\`, and \`@Constraint(validatedBy=CustomAnnotationClass.class)\`. The purpose of each annotation is as follows:  
    * \`@Retention(RUNTIME)\`: This indicates that the annotation can be used at runtime.  
    * \`@Target(FIELD)\`: This indicates that the annotation can only be applied to fields.  
    * \`@Constraint(validatedBy=CustomAnnotationClass.class)\`: This identifies the class that contains the logic for the validation.  
  * We can also create a custom property file to set messages at one place. For that we need to create messageSource() and validator() beans in our config file and also override the method getValidator() imported from WebMvcConfigurer interface.

