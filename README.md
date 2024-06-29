# OpenBCI Integration

## Descrizione

Questo progetto integra la GUI open-source di OpenBCI con un sistema di pagamento basato sul web. Include le seguenti funzionalità:
- Personalizzazione della GUI di OpenBCI
- Sostituzione del logo esistente con il logo della nostra azienda
- Modifica della funzionalità del pulsante di avvio
- Sviluppo di un'applicazione web per gestire il pagamento e l'autenticazione degli utenti
- Integrazione dell'applicazione desktop con il servizio web
- Sviluppo di un'API per la comunicazione tra la GUI e l'app web
- Implementazione di un sistema di licenze/attivazione
- Creazione di un sistema di database per archiviare le informazioni degli utenti e i dati di sessione

## Requisiti

- Java 11 o superiore
- Maven 3.6.0 o superiore

## Come Avviare

### Backend

1. Naviga nella directory del backend:
   ```bash
   cd backend
Avvia l'applicazione Spring Boot:
mvn spring-boot:run

Frontend

Naviga nella directory del frontend:
cd frontend

Compila ed esegui l'applicazione:

mvn clean compile exec:java

OpenBCIIntegration/
├── backend/
│   ├── pom.xml
│   └── src/
├── frontend/
│   ├── pom.xml
│   └── src/
└── README.md
