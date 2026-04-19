# **Software Engineering Laboraufgabe 2**

## Aufgabe 1

### a & b)
```java
public class AccountView {

    public static final int threshold = 1000;

    public void showAccount(User user) {

        printHeader();

        int result = getResult(user);

        extracted(user);

        printStats(user, result);

        showIfHigh(result);
    }
    //zeigt ob ein nutzer die activity oft nutzt
    private void showIfHigh(int result) {
        if (result > threshold) {
            System.out.println("High activity user");
        }
    }
    //zeigt Nutzerstatisken
    private void printStats(User user, int result) {
        System.out.println("Name \t\t" + user.getName());
        System.out.println("Points \t\t" + result);
        System.out.println("Last viewed \t" +
                user.getLastViewed());
    }
    //zeigt Header
    private void printHeader() {
        System.out.println("====================");
        System.out.println("=== User Account ===");
        System.out.println("====================");
    }

    // zeigt leztes aufrufdatum
    private void extracted(User user) {
        LocalDateTime now = LocalDateTime.now();
        user.setLastViewed(now);
    }

    // Counter für Activity nutzung
    private int getResult(User user) {
        int result = 0;
        for (Activity a : user.getActivities()) {
            result += a.getPoints();
        }
        return result;
    }
} 
```

### c) 
Die *Extract Method* ist hier empfehlenswert um sensible Logik auszulagern und um sich an das SRP zu halten.

### d)
***Replace Magic Literal*** bietet sich hier an um die *1000* in der if abfrage zu ersetzen. Somit wird die Zahl aussagekräftiger und der Code ist Lesbarer.
```java
if (result > 1000)
```
wird zu
```java
public static final int threshold = 1000;
if (result > threshold)
```

### e) 
Die eigentliche Logik wird nicht verändert, es wird lediglich eine Zahl, die vorher schon hardcoded war, in eine Konstante ausgelagert. 


## Aufgabe 2
### a)


1. Ich als Nutzer möchte die Möglichkeit haben meinen Account so zu kennzeichnen, dass man direkt sieht ob ich eher Reparaturen benötige oder Anbiete.

2. Als Auftraggeber möchte ich den in anspruch genommenen Dienst, nach ermessen bewerten können.

3. Als Auftraggeber hätte ich gerne die Möglichkeit haben Bilder hochladen zu können.

4. Als Auftragnehmer möchte ich nur Anfragen bekommen, die in meinen Bereich der expertise fallen.

5. Als Auftragnehmer möchte ich den Auftraggeber und meine Erfahrung mit diesem bewerten können. 

### b)

- 1 ist eine wichtige User-Story, da sie eine Funktionelle Grundanforderung beschreibt und ein Maß an komplexität setzt <br>

- 2 und 5 sind besonders wichtig, da diese ein wichtiges Feature klar und deutlich beschreiben

### c) 
In User Stories 2 und 5 wird nur beschrieben das Bewertungen existieren sollen, aber nicht wie diese Bewertungen aussehen sollen. Häufig lassen User Stories wie diese zu viel Raum für Design, was zu einem überschuss an Client-Meetings führt.

### d)
![alt text](res\image.png)