## "# Micro-services-avec-RestTemplate" 

### Objectif :  
Il permis de mettre en place une architecture microservices complète avec:
* Un service de découverte (Eureka)
* Une passerelle API (Gateway)
* Deux microservices métier (Client et Voiture)
* Une communication inter-services via RestTemplate
* 
### Extensions possibles:
**Sécurité:** Ajouter Spring Security et OAuth2 pour sécuriser les API
**Résilience:** Implémenter Circuit Breaker avec Resilience4j
**Monitoring:** Ajouter Spring Boot Actuator et Prometheus/Grafana
**Traçabilité:** Intégrer Spring Cloud Sleuth et Zipkin
**Configuration centralisée:** Mettre en place Spring Cloud Config
**Documentation API**: Ajouter Swagger/OpenAPI

###  eureka-server
Le service discovery Eureka est un composant essentiel dans une architecture microservices. Il permet aux services de se découvrir mutuellement sans avoir à coder en dur les adresses IP et les ports. Cela facilite le déploiement, la mise à l'échelle et la résilience de l'application.

<img width="1919" height="1005" alt="Capture d&#39;écran 2025-12-03 092608" src="https://github.com/user-attachments/assets/9fb234b3-9ba2-4917-aedd-efe63f34608a" />
<img width="1919" height="956" alt="Capture d&#39;écran 2025-12-03 092649" src="https://github.com/user-attachments/assets/40a7797a-1fa0-4e69-a18b-38e7808174c6" />

### Microservice Client
Le microservice "Client" est une application Spring Boot qui gère les opérations associées à la gestion des clients. Ce service repose sur une base de données MySQL pour le stockage des informations essentielles des clients, telles que le nom et l'âge. Des points de terminaison RESTful sont exposés afin de permettre la récupération de la liste des clients, la recherche d'un client par identifiant, ainsi que l'ajout de nouveaux clients. L'intégration au service de découverte Eureka garantit la découverte automatique des services dans un environnement de type microservices.

<img width="1919" height="963" alt="Capture d&#39;écran 2025-12-03 101234" src="https://github.com/user-attachments/assets/e8a8d49b-8646-4a0a-ad69-e684ecf48c4e" />
<img width="1919" height="955" alt="Capture d&#39;écran 2025-12-03 101328" src="https://github.com/user-attachments/assets/12efef36-be05-4b87-b9d4-f65014aab8ab" />

### Service Gateway
Le service "Gateway" assure la gestion centralisée des requêtes en utilisant Spring Cloud Gateway. Ce service permet la redirection des requêtes vers les microservices enregistrés dans le registre Eureka.

<img width="1919" height="955" alt="Capture d&#39;écran 2025-12-03 101809" src="https://github.com/user-attachments/assets/0b9a5fb1-65f5-49bb-80e3-a76b8fa2d77e" />
<img width="1919" height="957" alt="Capture d&#39;écran 2025-12-03 103135" src="https://github.com/user-attachments/assets/d08fb793-c934-4e81-97ef-5a214f6572e4" />
<img width="1917" height="1010" alt="Capture d&#39;écran 2025-12-03 112017" src="https://github.com/user-attachments/assets/e7e076f2-d87e-4053-909b-0f190a9aec01" />
<img width="1919" height="956" alt="Capture d&#39;écran 2025-12-03 112042" src="https://github.com/user-attachments/assets/498ab736-6d28-409d-8356-3a168b8cf67a" />
<img width="1919" height="956" alt="Capture d&#39;écran 2025-12-03 112333" src="https://github.com/user-attachments/assets/d74d1527-cf31-4cf7-af63-fa9733d72f2e" />
<img width="1919" height="961" alt="Capture d&#39;écran 2025-12-03 112400" src="https://github.com/user-attachments/assets/3af4b005-8959-4153-ac58-8ea0ca0bebca" />

### Service Voiture
Le service "Voiture" assure la gestion des informations sur les voitures. Les principales opérations incluent la récupération de toutes les voitures, la recherche d'une voiture par identifiant et l'affichage des détails de la voiture ainsi que ceux du client associé.

<img width="1918" height="955" alt="Capture d&#39;écran 2025-12-03 114350" src="https://github.com/user-attachments/assets/14c385cf-b464-4c54-ad5b-5489aa69a264" />
<img width="959" height="480" alt="Capture d&#39;écran 2025-12-03 130826" src="https://github.com/user-attachments/assets/42b8fadf-2929-47f1-a4e5-96dd1bd085fe" />
<img width="1919" height="963" alt="image" src="https://github.com/user-attachments/assets/8c908a59-b489-4c7e-9e1f-a7e440fc3838" />
<img width="1919" height="959" alt="Capture d&#39;écran 2025-12-03 131703" src="https://github.com/user-attachments/assets/519daaf7-0046-4d7d-9c37-440b562d4b8b" />
<img width="1919" height="961" alt="Capture d&#39;écran 2025-12-03 131740" src="https://github.com/user-attachments/assets/608db007-7ccb-4032-8db3-a38df6e5ff05" />


## Auteur
* **Nom** : BEN-LAGHFIRI Majeda
* **Cours**: Architecture Microservices : Conception, Déploiement et Orchestration
* **Date** : Decembre 2025 
* **Encadré par** : Pr.Mohamed LACHGAR

