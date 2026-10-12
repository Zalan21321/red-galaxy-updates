# Red Galaxy Next

Új, natív Android-projekt. Minimum Android 10 (API 29).

## Jelenlegi állapot

Kezdeti forrásprojekt. A GitHub Actions fordítás, Android lint és APK-aláírás
ellenőrzés sikeresen lefutott. Telefonon még nem tesztelt.
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
A GitHub-tárolóban a projekt a `red-galaxy-next/` mappában található,
a munkafolyamat pedig a `.github/workflows/red-galaxy-next.yml` fájlban.
A mellékelt munkafolyamat ezt az elrendezést feltételezi. Sikeres fordítás,
lint és aláírás-ellenőrzés után fejlesztői előzetes kiadást publikál,
közvetlen APK-letöltéssel.

[APK letöltése](https://github.com/Zalan21321/red-galaxy-updates/releases/download/next-dev-38222101946/RedGalaxyNext-0.1.0-dev.apk)

[Sikeres fordítás](https://github.com/Zalan21321/red-galaxy-updates/actions/runs/38222101946)

SHA-256: `069caf5eb20ab50a33bd2d5050d7024359a9a53a889da9c239058cc4d961bc77`.

## A további fejlesztéshez tisztázandó

- Az első verzió pontos feladatai és a régi app hibás viselkedése.
- A céltelefon Android-verziója és a játék vezérlőinek elrendezése.
- A kívánt NPC-nevek; a korábbi 39 elemű lista nem áll rendelkezésre.

A helyi környezet Android SDK és hálózati kapcsolat hiányában nem tud
fordítani; a működő fordítás a GitHub Actions környezetben történik.
