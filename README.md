# Descripción
Pequeña suite de pruebas automatizadas (Serenity + Gradle) E2E del Sistema de Restaurante.

## Clonar el repositorio (SSH)
```bash
git clone git@github.com:Sanavi01/AUTO_FRONT_POM_FACTORY.git
cd AUTO_FRONT_POM_FACTORY
```

## Comando recomendado para ejecutar los tests

### En Windows (PowerShell/CMD)
```powershell
.\gradlew.bat clean test aggregate
```

### En macOS / Linux
```bash
./gradlew clean test aggregate
```

Usa el wrapper gradlew para garantizar la versión de Gradle y generar los reportes.

## Nota
La configuración de Java usada está en `build.gradle` y requiere Java 16.

## Resultados / Reportes
Al finalizar, abre el reporte de Serenity en:

target/site/serenity/index.html
