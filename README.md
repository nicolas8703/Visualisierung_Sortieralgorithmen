# Visualisierung_Sortieralgorithmen

Das ist eine angefangene Visualisierung der Sortieralgorithmen Quicksort, Bubblesort, Heapsort und Shakersort. Die Sortieralgorithmen stammen aus einer Abschlussarbeit von Modul 411.

Der Sortieralgorithmus wird mit der Sortierung mehrerer Balken visualisiert. Man kann beliebig viele Zahlen eingeben, ein Sortieralgorithmus auswählen
und die Geschwindigkeit bestimmen. Nach der Visualisierung werden die Schleifendurchläufe und die Anzahl der Vergleiche ausgegeben.

Bei der Eingabe der Werte ist darauf zu achten, dass keine Leerzeichen zwischen den Kommas sind. Z.B: 50,13,22,14,8,3,33,42,19

Schwierigkeiten:<br>
Die erste Schwierigkeit war, dass die Visualisierung von einem ActionListener aufgerufen wurde. Dieser wurde dann im Event Dispatch Thread (EDT) ausgeführt.
Deswegen konnte sich das GUI erst dann neu darstellen, wenn die Ausführung des gesamten Codes abgeschlossen war. 
Damit die Visualisierung trotzdem funktionieren kann, habe ich den Code in einem separaten Thread ausgeführt. Hierfür habe ich einen SwingWorker verwendet.
Da ich noch nie zuvor mit so etwas gearbeitet habe, musste ich viel recherchieren und nachschlagen.

Die zweite Schwierigkeit waren die zweidimensionalen Arrays, die ich benötigt habe. Wir haben diese in der Schule nur kurz angeschaut und die for Schleifen mit den zweidimensionalen Arrays haben viele Notizen und Überlegungen gebraucht.

Weiterentwicklung:<br>
In der nächsten Version sollen die zeitlichen Abstände der Visualisierung von Quicksort noch optimiert werden.
Momentan ist die Verzögerung zwischen den einzelnen Schritten nicht immer gleich.

In der nächsten Version soll es ausserdem möglich sein, beliebige Zahlen einzugeben und beliebig viele.DONE
Die Panels, auf denen die Algorithmen visualisiert werden, sollen dynamisch erweitert oder verkleinert werden. DONE
Dafür werden die Einstellungen in ein separates Gui verschoben und die Farben der einzelnen Werte werden vereinheitlicht. DONE

Es werden noch weitere Sortieralgorithmen wie zum Beispiel der binaryTreeSort oder der insertionSort hinzugefügt.

Zusätzlich möchte ich, dass am Schluss einer Visualisierung die benötigte Zeit und der benötigte Speicher angezeigt wird. 
Damit man die richtigen Werte erhält, müssen die Algorithmen ein zweites Mal durch laufen, ohne die Visualisierung.

Schlussendlich soll das Projekt bei einem gratis Webhoster, für immer eingebunden sein und mit Source-Code für alle Lernenden verfügbar sein.

Bis 27.09 sollen mindestens zwei von diesen Zielen erreicht sein.
