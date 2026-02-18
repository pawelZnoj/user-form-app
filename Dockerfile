# Używamy lekkiego obrazu z Java 21
FROM eclipse-temurin:21-jdk-alpine

# Tworzymy katalog w kontenerze
WORKDIR /app

# Kopiujemy plik JAR do kontenera
COPY target/user-form-app-0.0.1-SNAPSHOT.jar app.jar

# Otwieramy port 8080
EXPOSE 8080

# Uruchamiamy aplikację
ENTRYPOINT ["java", "-jar", "app.jar"]