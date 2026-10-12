# Red Galaxy Next

Új, natív Android-projekt. Minimum Android 10 (API 29).

## Jelenlegi állapot

Kezdeti forrásprojekt, még nem fordított és telefonon nem tesztelt.
Magyar profilképernyőt, helyben mentett NPC-neveket és 1–120 másodperces
menetidő-beállítást tartalmaz. A képfelismerés, kalibráció, célzás,
gesztusvezérlés, játék feletti STOP és frissítéskezelés még nincs megvalósítva.
A mentett beállítások jelenleg nem indítanak játékvezérlést.

A `hu.redgalaxy.next` csomagnév miatt külön alkalmazásként települ majd;
nem frissíti vagy írja felül a régi `hu.redgalaxy.visionassistant` appot.
Nem tartalmazza a régi alkalmazás kódját vagy aláírókulcsát.

## Fordítás

Szükséges: JDK 17, Gradle 8.9 és Android SDK 35.
Az SDK helyét az `ANDROID_HOME` változóval vagy a helyi `local.properties`
fájl `sdk.dir` értékével kell megadni.

```sh
gradle --no-daemon assembleDebug lintDebug
```

Eredmény: `app/build/outputs/apk/debug/app-debug.apk`.
A mellékelt GitHub Actions munkafolyamat ugyanezt végzi, és letölthető
fejlesztői APK-artifactot készít, ha a projekt egy GitHub-repóba kerül.
A munkafolyamat még nem futott. Nyilvános kiadást nem publikál.

## A további fejlesztéshez tisztázandó

- Az első verzió pontos feladatai és a régi app hibás viselkedése.
- A céltelefon Android-verziója és a játék vezérlőinek elrendezése.
- A kívánt NPC-nevek; a korábbi 39 elemű lista nem áll rendelkezésre.

Az APK fordítását jelenleg a fejlesztői környezetből hiányzó Android SDK
és a nem működő hálózati proxy akadályozza.
