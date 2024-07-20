
 

<h2 align="center">
  An Front End made in SpringBoot and Thymeleaf for Vancancy Manager Project.
</h2>

<p align="center">The best way to manager your vacancy!</p>



<p align="center">

  <img alt="GitHub top language" src="https://img.shields.io/github/languages/top/dvargas42/fed_vancancy_management?color=green">

  <a href="https://www.linkedin.com/in/daniel-santos-040983ab/" target="_blank" rel="noopener noreferrer">
    <img alt="Made by" src="https://img.shields.io/badge/made%20by-Daniel%20Vargas-green">
  </a>

  <img alt="Repository size" src="https://img.shields.io/github/repo-size/dvargas42/fed_vancancy_management?color=green">

  <a href="https://github.com/dvargas42/fed_vancancy_management/commits/main">
    <img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/dvargas42/fed_vancancy_management?color=green">
  </a>

  <a href="https://github.com/dvargas42/fed_vancancy_management/issues">
    <img alt="Repository issues" src="https://img.shields.io/github/issues/dvargas42/fed_vancancy_management?color=green">
  </a>

  <img alt="GitHub" src="https://img.shields.io/github/license/dvargas42/fed_vancancy_management?color=green">
</p>



<p align="center">
  <a href="#%EF%B8%8F-about-the-project">About the project</a>&nbsp;|&nbsp;
  <a href="#-technologies">Technologies</a>&nbsp;|&nbsp;
  <a href="#-getting-started">Getting started</a>&nbsp;|&nbsp;
  <a href="#-route-structure">Route structure (NEW!)</a>&nbsp;|&nbsp;
  <a href="#-how-to-contribute">How to contribute</a>&nbsp;|&nbsp;
  <a href="#-license">License</a>
</p>

## 💇🏼 About the project

TThis app is part of a challenge to test the ability to implement resources at an API built in Java Springboot Thymeleaf. Among the knowledge, we can cite the creation of Web Pages, TDD with Junit and Mockito, global exception treatment, input data validation, CI/CD with Github actions and AWS, among others.


## 🚀 Technologies

Technologies that I used to develop this web application


- [Java 21](https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html)
- [Maven](https://maven.apache.org/)
- [Spring Boot 3](https://spring.io/projects/spring-boot)
- [Thymeleaf](https://www.thymeleaf.org/doc/tutorials/3.1/usingthymeleaf.html)
- [JUnit](https://junit.org/junit5/)
- [Mockito](https://site.mockito.org/)
- [Docker Compose](https://docs.docker.com/compose/)
- [Docker Hub](https://hub.docker.com/)
- [AWS](https://aws.amazon.com/documentation/)


## 💻 Getting Started

To run this application, you will need to have Docker installed on your PC. Below is a step-by-step guide to prepare your environment.

### Requirements

- [Java 21](https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html)
- [Maven](https://maven.apache.org/)
- [Docker](https://www.docker.com/)


### Running Application Locally

**1. Clone the project in a folder of your preference**

```bash
$ git clone https://github.com/dvargas42/fed_vancancy_management.git
```

**2. Access the folder where the project was downloaded**

```bash
$ docker compose up -d
```
Run the command above to download PostgreSQL. In addition to other utilities will run as Prometheus, Grafana and Sonarqube

**3. Run project**

```bash
$ mvn spring-boot:run
```


**In case of problems with containers**

I had problems with the execution of containers in my home and all these were permissions that need to be given to the folder. Enter the command below and will resolve.

```bash
sudo chmod -R 777 docker 
```
## 🖇️ How to access containers

**SonarQube**

Here, you can see the quality of your code

```
http://localhost:9000/
```
The command should be executed below so that Sonarqube can evaluate its application

```
mvn clean verify sonar:sonar \
  -Dsonar.projectKey=planner-backend \
  -Dsonar.projectName='planner-backend' \
  -Dsonar.host.url=http://localhost:9000 \
  -Dsonar.token=sqp_2b0dcebefc059273cc39027c5ce11adee1aa0680
```
Remembering that the sonar token you only get after and to set it. This and the format: **sqp_2b0dcebefc059273cc39027c5ce11Adee1aa0680**
 

**Swagger Openapi**

All ready and configured.

```
http://localhost:8080/swagger-ui/index.html
```

**Grafana**

You will have to create your panels or import from the Grafana Portal. There you will have models ready to import. 

```
http://localhost:3000/login
```

## 🤔 How to contribute

**Make a fork of this repository**

```bash
# Fork using GitHub official command line
# If you don't have the GitHub CLI, use the web site to do that.

$ gh repo fork dvargas42/fed_vancancy_management

```

**Follow the steps below**

```bash
# Clone your fork
$ git clone your-fork-url && cd fed_vancancy_management

# Create a branch with your feature
$ git checkout -b my-feature

# Make the commit with your changes
$ git commit -m "My new feature"

# Send the code to your remote branch
$ git push origin my-feature
```

After your pull request is merged, you can delete your branch

## 📝 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

Made with 💜 &nbsp;by Daniel Vargas 👋 &nbsp;[See my linkedin](https://www.linkedin.com/in/daniel-santos-040983ab/)