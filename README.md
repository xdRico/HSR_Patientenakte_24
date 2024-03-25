## Intro: Verteilte Systeme und Cloud Computing - 11.03.24

### Was sind verteilte Systeme?

![image](https://github.com/StraysWonderland/HSR_distributedsystems_24/assets/22505258/c54a42c2-deff-4c13-bf5d-f1aa77fcdbf0)

- Anwendung läuft "verteilt" auf verschiedenen Systemen
- Uniformer Zugriff 

![image](https://github.com/StraysWonderland/HSR_distributedsystems_24/assets/22505258/12425bc5-dfe5-4e43-b4cf-71819c0b1da9)

- Vorteil: Last verteilt sich auf allen Replicas

### Problem bei "traiditionellen" Verteilten System im eigenen Datacenter

- Aufstocken der Resourcen bei steigender Last kostspielig
- Resourcen müssen dauerhaft gewartet werden, auch bei fallender Last
- Resourcen werden nicht optimal utilisiert.

![image](https://github.com/StraysWonderland/HSR_distributedsystems_24/assets/22505258/3cb2f6c4-e789-4b10-9893-02ecb89c664c)

### Review Questions:
- Was ist eine der großen Herausforderung für polyglote verteilte Systeme und welche Technologie macht dies erst sehr simpel umsetzbar?

## Intro; Springboot - 18.03.24
### Aufgabe 1
- Einen Fork des Repositories erstellen
- Codespace öffnen
- Mittels `sdk install java 17.0.0-tem` Java 17 installieren
- Mit `java -version` validieren, dass Java 17 installiert ist
- Projekt über VS Code ausführen
- @RestController implementieren mit @GetMapping("hello") der "Hello World"! zurück gibt



## Containers and Dockers
Problem bei (polygloten) verteilten Systemen:
- Jede Umgebung muss aufwendig konfiguriert werden. Sowohl Server als auch Lokale Dev Environments
- Konfiguration muss identisch repliziert werden um Fehlerquellen durch unterschiedliche Umgebungen zu vermeiden
- Macht polyglote Systeme sehr aufwendig da für jede Sprache die eigene Entwicklungsumgebung geschaffen werden muss.
- Wechseln der versionen in der Entwicklung auch lästig

![image](https://github.com/StraysWonderland/HSR_distributedsystems_24/assets/22505258/6b291787-1a4b-4394-96e5-fe2e00805b7e)

Probleme werden durch Containerisierung vermieden.
- Zielumgebung braucht lediglich die Container Engine.
- Container bringen mit was sie benötigen

![image](https://github.com/StraysWonderland/HSR_distributedsystems_24/assets/22505258/d0462b73-b581-4676-8d00-ec776b450b29)

### Images vs Container
- Aus dem Sourcerepo wird mittels Dockerfile ein Image (blaupause) erstellt.
- Aus diesem Image lassen sich beliebig viele Instanzen generieren => Container
- Images lassen sich auf Docker Hub, einem öffentlichen Image Repository ablegen. 
- Images lassen sich so von überall beziehen
  
![image](https://github.com/StraysWonderland/HSR_distributedsystems_24/assets/22505258/59eb76da-b201-47de-8e2e-f9ad71e4e114)

### Students Questions:
- Muss für jeden einzelnen container die umgebung einzeln installiert werden ?
- Läuft der container mit rechenpower des Lokalen pc oder auf einem server?
