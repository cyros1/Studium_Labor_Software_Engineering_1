# **Software Engineering Laboraufgabe 1**



## Aufgabe 1

- #### Artefakt 1:
    **Bezeichnung:** *CREDITS*<br>
    **Pfad:** *~/CREDITS.txt*<br>
    **Funktion:** Ansammlung aller Mitwirkenden

- #### Artefakt 2:
    **Bezeichnung:** *pyproject.toml* <br>
    **Pfad:** *linux/tools/net/ynl/pyproject.toml*<br>
    **Funktion:** Konfigurationsdatei für den YAML Netlink

- #### Artefakt 3: 
    **Bezeichnung:** *Kconfig*<br>
    **Pfad:** *~/Kconfig.txt*<br>
    **Funktion:** Liste mit den Locations für die Kernelkonfigurationen

- #### Artefakt 4: 
    **Bezeichnung:** *docutils.conf*<br>
    **Pfad:** *~/Documentation/docutils.conf*<br>
    **Funktion:** Konfigurationsdatei für das docutils Tool

- #### Artefakt 5: 
    **Bezeichnung:** *Makefile*<br>
    **Pfad:** *~/Makefile*<br>
    **Funktion:** Installer

Wichtig sind hier die Makefile, da sie den Installer des Programms darstellt, die Kconfig, da sonst die auf dem Kernel laufenden Treiber nicht installieren/laufen könnten und die pyproject.toml, da diese für den Allgemeinen Netzverkehr benötigt wird

---
<br>

<br>

## Aufgabe 2

Hier ein Beispiel für schlecht lesbaren code:

```
public class Test {
    public static void main(String[] args) {
        int a = 5, b = 10, c = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                a = a + i;
            } else {
                b = b - i;
            }
            if (i % 3 == 0) {
                c = c + i;
            }
        }
        System.out.println(a + b + c);
    }
}

```

- Der Code geht von 0 bis 99 durch und:
    - Wenn i gerade ist (d.h. i % 2 == 0), wird i zu a addiert.
    - Wenn i ungerade ist, wird i von b subtrahiert.
    - Wenn i durch 3 teilbar ist (d.h. i % 3 == 0), wird i zu c addiert.
- Am Ende wird die Summe der Variablen a, b und c ausgegeben.


Dieser Code ist schlecht lesbar da:<br>
1. Die Variablennamen a, b und c, sind nicht aussagenkräftig,
2. Der Code ist unkommentiert,
3. Der Einsatz von mehreren Bedingungen hinter einander.

Ein schlecht lesbarer Code kann bei der Software-Entwicklung die Implementierung von Bug-Fixes in einem -, sowie die Weiterentwicklung von einem Pojekt mächtig erschweren.

Hier ein Beispiel für eine mehr lesbare Variante des Codes:

```
public class SumCalculator {
    public static void main(String[] args) {
        // Initialisierung der Variablen
        int sumEven = 0;   // Summe der geraden Zahlen
        int sumOdd = 0;    // Summe der ungeraden Zahlen
        int sumDivBy3 = 0; // Summe der durch 3 teilbaren Zahlen

        // Schleife von 0 bis 99
        for (int i = 0; i < 100; i++) {
            // Überprüfen, ob die Zahl gerade oder ungerade ist
            if (i % 2 == 0) {
                sumEven += i; // Füge der Summe der geraden Zahlen hinzu
            } else {
                sumOdd -= i;  // Subtrahiere von der Summe der ungeraden Zahlen
            }

            // Überprüfen, ob die Zahl durch 3 teilbar ist
            if (i % 3 == 0) {
                sumDivBy3 += i; // Füge der Summe der durch 3 teilbaren Zahlen hinzu
            }
        }

        // Ausgabe der Gesamtsumme
        int totalSum = sumEven + sumOdd + sumDivBy3;
        System.out.println("Gesamtsumme: " + totalSum);
    }
}

```

<br>

<br>

## Aufgabe 3

Verifaktion beschäftigt sich damit ob alle funktionellen Anforderungen erfüllt sind während sich Validierung damit beschäftigt ob das Produkt einen gewissen Qualitätsstandard (z.B Benutzbarkeit) erfüllt.

- #### Fall 1:
    Verifikation, da die einzelenen Funktionen, also die funktionellen Anforderungen, des Produkts geprüft werden.
- #### Fall 2:
    Validierung, da hier lediglich die Bedienbarkeit getestet wird, demnach wird die Qualität des Produkts getestet, nicht die Funktionalität.
- #### Fall 3:
    Verifikation, denn es wird geprüft ob alle Anforderungen implementiert/erfüllt sind.
- #### Fall 4:
    Validierung, denn hier wird getestet ob die Nutzer mit dem Produkt arbeiten können, nicht ob das Produkt so funktioniert wie es soll.



---


<br>


<br>

## Aufgabe 4

Für ein Schiffssystem, welches die Wassertiefe in Echtzeit misst, 
lässt sich Wasserfall-Modell empfehlen, da es sich erstens nicht schnell oder praktisch Updaten lässt. 
Außerdem, sollte in dem ausgelieferten Produkt ein Fehler sein, könnte das Schiff hunderte von Fehlerhaften Datensätzen produziert haben, da es in Echtzeit misst.


Bei einem VR-Stadtführungssystem kann Inkrementell entwickelt werden, da es Fehler haben "darf".
Meint hierbei, dass ein Fehler nicht unbedingt Fatal ist. Darüber hinaus, kann man einen Bug-Fix leicht auf solchen Geräten implementieren, 
da alle Geräte die selbe Software nutzen, somit der Fix auf allen Geräten gleichzeitigt implementiert wird.

