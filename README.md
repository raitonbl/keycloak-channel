# keycloak captcha api
Intended to extend [Keycloak](https://www.keycloak.org/) features through a standard api which abstract the message channel vendor.
This project enables:
* Message Channel api abstraction - Making it possible to design message channel dependent features without vendor locking. This api needs to be deployed on [Keycloak](https://www.keycloak.org/) whenever a Channel vendor is to be deployed.  

## Building

Ensure you have JDK 8 (or newer), Maven 3.5.4 (or newer) and Git installed

    java -version
    mvn -version
    git --version

How to build:

    mvn clean package

## How to use?
In order to develop a vendor implementation , the implementation must define the bellow on the pom:

```XML
  <dependency>
     <groupId>com.raitonbl</groupId>
       <artifactId>keycloak.channel</artifactId>
       <version>1.0.0-RELEASE</version>
   </dependency>
```

## Deployment    

In order to deploy the api , Keycloak must be stopped and the generated jar should be deployed on **KEYCLOAK_HOME/providers/** (for containers) or on **KEYCLOAK_HOME/standalone/deployments/**.

Start **Keycloak** , [More details](https://www.keycloak.org/documentation.html)

