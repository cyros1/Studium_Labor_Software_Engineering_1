# **Software Engineering Laboraufgabe 6**
## Aufgabe 1

### a)
Die Klasse MultiManger hat folgende Verantwortlichkeiten:
- holdMeeting() → Meetings abhalten

- calculateInvoice() → Rechnungen berechnen
- refreshUserInterface() → Benutzeroberfläche          aktualisieren
- setEmployeeGoals() → Mitarbeiterziele setzen
- provideFeedback() → Feedback geben
- deliverGoods() → Waren liefern
- report() → Berichte erstellen
- calculatePayroll() → Gehaltsabrechnung berechnen


### b)
Ein Code mit vielen Verantwortlichkeiten ist:
- Fehleranfällig, besonders bei Änderungen

- Schwer zu warten
- Schwer zu lesen

Demnach, und weil Code mit vielen Verantwortlichkeiten gegen **Seperation of Concerns** vertößt, ist ein Code mit wenig Verantwortlichkeiten erstrebenswert.


### c) 

```
public class MeetingManager {
    public void holdMeeting() {}
}

public class InvoiceCalculator {
    public void calculateInvoice() {}
}

public class EmployeeGoalSetter {
    public void setEmployeeGoals() {}
}

public class UIRefresher {
    public void refreshUserInterface() {}
}

public class FeedbackProvider {
    public void provideFeedback() {}
}

public class GoodsDeliverer {
    public void deliverGoods() {}
}

public class Reporter {
    public void report() {}
}

public class PayrollCalculator {
    public void calculatePayroll() {}
}
```

### d)

1. ***God Object (Gottklasse)***: Eine Klasse übernimmt zu viele Aufgaben und kennt alle Details. → schwer wartbar.

2. ***Feature Envy***: Eine Klasse greift ständig auf Daten anderer Klassen zu, statt ihre eigene Logik zu kapseln.


## Aufgabe 2

Beispiel für eine Gottklasse:

```
public class SmartHomeController {
    public void turnOnLights() {}
    public void turnOffLights() {}
    public void setThermostat() {}
    public void lockDoors() {}
    public void playMusic() {}
    public void monitorSecurity() {}
    public void cleanHouse() {}
    public void waterPlants() {}
}
```
Diese Klaase ist ein Gottklasse, denn sie:

- Zentralisiert viele unterschiedliche Verantwortungen.

- Verstößt gegen SRP, OCP und DIP.

- Sollte aufgeteilt werden z. B. in ***LightingController***, ***SecurityManager***, ***ClimateController***, etc.



## Aufgabe 3

In der Klasse unterstützen alle Methoden die Stack-funktionaltitöt, es gibt keine fremden Verantwortungsbereiche und die Kapselung ist auch gut. Somit weißt die Klassse hohe Kohäsion auf.


## Aufgabe 4

Die Klasse hat nur eine Schleifen-Verseuchte Methode zum generieren der Primzahlen, das macht sie unübersichtlich und schlecht lesbar. <br> 
Hier die bessere Variante:

```
public class PrimeGenerator {

    public static int[] generatePrimes(int maxValue) {
        if (maxValue < 2) {
            return new int[0];
        }

        boolean[] isPrime = initializeBooleanArray(maxValue);
        findPrimesWithLimit(isPrime);
        return extractPrimes(isPrime);
    }

    private static boolean[] initializeBooleanArray(int maxValue) {
        boolean[] isPrime = new boolean[maxValue + 1];
        for (int i = 2; i < isPrime.length; i++) {
            isPrime[i] = true;
        }
        return isPrime;
    }

    private static void findPrimesWithLimit(boolean[] isPrime) {
        int limit = (int) Math.sqrt(isPrime.length);
        for (int i = 2; i <= limit; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < isPrime.length; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }

    private static int[] extractPrimes(boolean[] isPrime) {
        int count = 0;
        for (boolean prime : isPrime) {
            if (prime) count++;
        }

        int[] primes = new int[count];
        for (int i = 0, j = 0; i < isPrime.length; i++) {
            if (isPrime[i]) primes[j++] = i;
        }
        return primes;
    }

    public static void main(String[] args) {
        int[] primes = generatePrimes(20);
        for (int prime : primes) {
            System.out.print(prime + " ");
        }
    }
}

```
