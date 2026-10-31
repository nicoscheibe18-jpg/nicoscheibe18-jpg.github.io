# Herzfänger – Android-App

Das Spiel läuft als echte Android-App im Vollbild, auf Handy und Tablet, auch ohne Internet.
Punkte, Sterne, Shop-Käufe und Tagesbonus werden in der App gespeichert.

## Weg A: Mit Android Studio (am Mac oder PC)

1. Android Studio installieren: https://developer.android.com/studio
2. Den Ordner `Herzfaenger` entpacken und in Android Studio mit **File > Open** öffnen.
3. Warten, bis unten „Gradle sync“ fertig ist (beim ersten Mal ein paar Minuten).
4. APK bauen: **Build > Build App Bundle(s) / APK(s) > Build APK(s)**.
   Die Datei liegt danach unter `app/build/outputs/apk/debug/app-debug.apk`.
5. Direkt aufs Handy: Handy per USB anschließen, auf dem Handy **USB-Debugging** einschalten
   (Einstellungen > Über das Telefon > 7× auf „Build-Nummer“ tippen, dann in den Entwickleroptionen),
   und in Android Studio auf den grünen **Play**-Knopf drücken.

## Weg B: Ohne Android Studio, über GitHub

1. Neues Repository auf GitHub anlegen und den Inhalt des Ordners `Herzfaenger` hochladen
   (inklusive des versteckten Ordners `.github`).
2. Auf GitHub den Reiter **Actions** öffnen. Der Ablauf „APK bauen“ startet automatisch
   (sonst links „APK bauen“ wählen und **Run workflow** drücken).
3. Nach ca. 3–5 Minuten den fertigen Lauf öffnen und unten bei **Artifacts** die Datei
   `Herzfaenger-APK` herunterladen. Darin steckt `app-release.apk`.

## APK aufs Handy oder Tablet bringen

1. Die APK-Datei aufs Gerät schicken (z. B. per Google Drive, Telegram, WhatsApp-an-dich-selbst oder USB).
2. Auf dem Gerät antippen. Android fragt nach der Erlaubnis, **Apps aus dieser Quelle zu installieren** – erlauben.
3. Installieren, fertig. Das Herz-Icon erscheint bei den Apps.

## Das Spiel ändern

Das Spiel steckt in `app/src/main/assets/game.html`. Wenn du eine neue Version des Spiels bekommst,
ersetze nur diese Datei und baue die APK neu. Bei einer neuen Version am besten in
`app/build.gradle.kts` `versionCode` um 1 erhöhen, dann kann sie über die alte App installiert werden
und der Spielstand bleibt erhalten.

## Gut zu wissen

- Die App ist nicht im Play Store. Für den Play Store bräuchtest du ein Google-Entwicklerkonto
  (einmalig 25 US-Dollar) und eine eigene Signatur.
- Zurück-Taste: pausiert das Spiel und legt die App in den Hintergrund.
- App-Name und Paketname: `Herzfänger`, `de.nico.herzfaenger`.
