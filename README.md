# Plan wprowadzenia Spring Boot do projektu bankowego

## 1. Wprowadzenie Spring Boot i konfiguracji projektu
**Cel:** Poznanie podstaw Spring Boot oraz struktury projektu.

**Kroki:**
1. Dodaj do projektu Spring Boot, korzystając z narzędzia **Spring Initializr** lub poprzez dodanie zależności Spring Boot do istniejącego projektu Maven/Gradle.
2. Wprowadź plik konfiguracyjny `application.properties` lub `application.yml`.
3. Uruchom prostą aplikację Spring Boot, aby zapoznać się z metodą `main()` oraz adnotacją `@SpringBootApplication`.

## 2. Wprowadzenie Spring Boot REST API
**Cel:** Nauka tworzenia kontrolerów RESTowych oraz pracy z endpointami.

**Kroki:**
1. Utwórz kontroler REST, używając adnotacji `@RestController`.
2. Zaimplementuj podstawowe operacje HTTP:
    - GET (np. pobranie danych o użytkownikach)
    - POST (np. dodanie nowego konta bankowego).
3. Przykład endpointu: `GET /accounts` - zwraca listę wszystkich kont bankowych.

**Nowe pojęcia:** `@GetMapping`, `@PostMapping`, `@RequestBody`.

## 3. Integracja Spring Boot z warstwą danych (Spring Data JPA)
**Cel:** Nauka zarządzania danymi przy użyciu ORM (Object-Relational Mapping).

**Kroki:**
1. Dodaj zależność **Spring Data JPA** oraz **H2 Database** (dla prostoty użyj najpierw bazy in-memory).
2. Utwórz encje, np. `Account`, `User`.
3. Stwórz repozytoria, używając interfejsu `JpaRepository`.
4. Dodaj proste operacje CRUD w serwisie, np. dodanie nowego użytkownika, utworzenie konta.

**Nowe pojęcia:** `@Entity`, `@Id`, `@GeneratedValue`, `@Repository`.

## 4. Wprowadzenie Spring Boot Service Layer (Serwisowa warstwa aplikacji)
**Cel:** Oddzielenie logiki biznesowej od kontrolerów, poznanie koncepcji warstwowości aplikacji.

**Kroki:**
1. Utwórz serwis, używając adnotacji `@Service`, np. `AccountService`.
2. Przenieś logikę biznesową z kontrolera do serwisu (np. otwieranie nowego konta bankowego).
3. Zaimplementuj metody serwisowe, takie jak `createAccount`, `deposit`, `withdraw`.

**Nowe pojęcia:** `@Service`, `@Transactional`.

## 5. Walidacja danych przy użyciu Spring Boot Validation
**Cel:** Wprowadzenie walidacji danych wejściowych w aplikacji.

**Kroki:**
1. Dodaj zależność `spring-boot-starter-validation`.
2. Dodaj adnotacje walidacyjne do modeli, np. `@NotNull`, `@Size`, `@Email`.
3. Wprowadź walidację w kontrolerze, używając `@Valid`.
4. Zaimplementuj obsługę błędów walidacyjnych (np. zwracanie odpowiednich komunikatów błędów).

**Nowe pojęcia:** `@Valid`, `@NotNull`, `@Size`.

## 6. Konfiguracja i użycie Spring Boot Profiles
**Cel:** Poznanie koncepcji profili konfiguracyjnych w Spring Boot.

**Kroki:**
1. Stwórz różne profile (`dev`, `prod`).
2. Skonfiguruj różne ustawienia bazy danych w `application-dev.properties` i `application-prod.properties`.
3. Uruchom aplikację w różnych profilach, korzystając z ustawienia `--spring.profiles.active=dev`.

**Nowe pojęcia:** Profile Spring Boot, `@Profile`.

## 7. Autoryzacja i uwierzytelnianie (Spring Security)
**Cel:** Nauka zabezpieczania aplikacji.

**Kroki:**
1. Dodaj zależność `spring-boot-starter-security`.
2. Skonfiguruj podstawową autoryzację HTTP Basic Auth.
3. Dodaj mechanizm logowania użytkownika oraz zabezpiecz endpointy (np. tylko zalogowani użytkownicy mogą tworzyć konto).

**Nowe pojęcia:** `@EnableWebSecurity`, `WebSecurityConfigurerAdapter`.

## 8. Testowanie jednostkowe i integracyjne (Spring Boot Testing)
**Cel:** Nauka testowania w Spring Boot.

**Kroki:**
1. Dodaj zależność `spring-boot-starter-test`.
2. Utwórz testy jednostkowe dla serwisów, używając JUnit i Mockito.
3. Utwórz testy integracyjne dla kontrolerów REST, używając `MockMvc`.

**Nowe pojęcia:** `@MockBean`, `@WebMvcTest`, `@SpringBootTest`.

## 9. Obsługa błędów i globalny error handling
**Cel:** Nauka obsługi wyjątków w aplikacji.

**Kroki:**
1. Wprowadź globalną obsługę błędów, używając `@ControllerAdvice`.
2. Utwórz własne wyjątki biznesowe i obsłuż je (np. `AccountNotFoundException`).
3. Dodaj standardowe odpowiedzi błędów w formacie JSON.

**Nowe pojęcia:** `@ExceptionHandler`, `@ControllerAdvice`.

## 10. Logowanie i monitoring aplikacji (Spring Boot Actuator)
**Cel:** Poznanie narzędzi do monitorowania i logowania.

**Kroki:**
1. Dodaj zależność `spring-boot-starter-actuator`.
2. Skonfiguruj podstawowe endpointy Actuator (`/actuator/health`, `/actuator/info`).
3. Dodaj logowanie w serwisach, używając SLF4J.

**Nowe pojęcia:** Actuator, `@Slf4j`.

## 11. Dokumentacja API (Spring Boot + OpenAPI/Swagger)
**Cel:** Wprowadzenie dokumentacji API.

**Kroki:**
1. Dodaj zależność `springdoc-openapi-ui`.
2. Skonfiguruj dokumentację Swaggera.
3. Dodaj opisy endpointów przy użyciu adnotacji OpenAPI (`@Operation`, `@ApiResponse`).

**Nowe pojęcia:** Swagger UI, OpenAPI.

## 12. Wprowadzenie Spring Boot DevTools i konfiguracja hot reload
**Cel:** Ułatwienie pracy deweloperskiej.

**Kroki:**
1. Dodaj zależność `spring-boot-devtools`.
2. Skonfiguruj hot reload, aby zmiany w kodzie były natychmiast widoczne bez restartu aplikacji.

## Podsumowanie
Po przejściu przez te etapy, aplikacja bankowa będzie pełnoprawnym projektem Spring Boot z kompletnym zakresem funkcjonalności Javy oraz narzędzi Spring Boot.

W razie potrzeby, można także wprowadzić dodatkowe elementy, takie jak:
- Integracja z bazą danych SQL (MySQL, PostgreSQL) lub NoSQL (MongoDB).
- Wysyłanie powiadomień e-mail (Spring Boot Mail).
- Cache'owanie danych (Spring Cache).
- Asynchroniczne operacje (Spring Boot Async).
