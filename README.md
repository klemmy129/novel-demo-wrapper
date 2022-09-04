# novel-ghostwriter

![GitHub release (latest SemVer)](https://img.shields.io/github/v/release/klemmy129/novel-ghostwriter?display_name=tag&sort=semver)
![GitHub top language](https://img.shields.io/github/languages/top/klemmy129/novel-ghostwriter)
![GitHub](https://img.shields.io/github/license/klemmy129/novel-ghostwriter)
![GitHub code size in bytes](https://img.shields.io/github/languages/code-size/klemmy129/novel-ghostwriter)
![GitHub Workflow Status](https://img.shields.io/github/workflow/status/klemmy129/novel-ghostwriter/CodeQL)
![Snyk Vulnerabilities for GitHub Repo (Specific Manifest)](https://img.shields.io/snyk/vulnerabilities/github/klemmy129/novel-ghostwriter/pom.xml)
![GitHub issues](https://img.shields.io/github/issues/klemmy129/novel-ghostwriter)

## Description
This is a companion demo app to [novel-ideas](https://github.com/klemmy129/novel-ideas)
and is meant to be run together.

This is also a Java Spring Boot demonstrator for a Rest application, but uses a client library form 
[novel-ideas](https://github.com/klemmy129/novel-ideas) to communicate with it.

## Table of Contents
<!-- START doctoc generated TOC please keep comment here to allow auto update -->
<!-- DON'T EDIT THIS SECTION, INSTEAD RE-RUN doctoc TO UPDATE -->

- [Technology Used](#technology-used)
- [Building](#building)
- [Startup](#startup)
  - [Environment Variables](#environment-variables)
    - [application-default.yml](#application-defaultyml)
- [Coding Demo Explained](#coding-demo-explained)
  - [The client](#the-client)
- [Next](#next)

<!-- END doctoc generated TOC please keep comment here to allow auto update -->

## Technology Used
- Java 17
- Maven
- Spring Boot 2.7.3
- Spring Docs
- Lombok
- [Certificates](https://github.com/klemmy129/novel-ideas/blob/main/CERTS.md)

## Building

```
mvn clean package
```
## Startup

### Environment Variables
#### application-default.yml
- PORT _default 11443_
- TRUSTSTORE _default /home/${user}/certs/truststore.p12_
- TRUSTSTORE-PASSWORD
- KEYSTORE _default /home/${user}/certs/keystore.p12_
- KEYSTORE-PASSWORD
- NOVEL-IDEAS-URL _default https://servername.devstuff.org:10443_ (Novel-Ideas base URL)

## Coding Demo Explained
### The client
The GhostWriteService uses the NovelIdeasClient bean to call Novel Ideas Rest interface. 
To do this there were some things that needed to be setup.
* In [application.yml](novel-ghostwriter-rest/src/main/resources/application.yml) add the URL to the running version of Novel Ideas eg 
 ```
novel-ideas:
   url: https://servername.devstuff.org:10443
  ``` 
* Add the `novel-ideas-client-starter` to the POM file. This brings in the API DTOs, the client, the property classes/records, Configurations and the AutoConfiguration.
  * There are two properties records: 
    * One for SSL (for RestTemplate) 
    * One for the URL to Novel Ideas.
  * There are two Configuration classes: 
    * One for creating a RestTemplate. I created two that achieve the same thing using two different libraries 
    * One uses the RestTemple Bean and URL for Novel Ideas to instantiate Novel Ideas Client.

## Next

Message bus
