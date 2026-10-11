# Red Galaxy Vision Assistant – Android-kiadások

Magyar Android-asszisztens a Red Galaxy: Online Space MMO (`com.doganaylab.redgalaxy`) mobilváltozatához. Minimum Android 10; az asszisztens csomagneve `hu.redgalaxy.visionassistant`.

Aktuális kiadás: **0.4.1**, verziókód **5**.

[0.4.1 APK letöltése](https://github.com/Zalan21321/red-galaxy-updates/releases/download/v0.4.1/RedGalaxyVisionAssistant-0.4.1.apk)

A 0.2.0 vagy újabb alkalmazásban: **Frissítés → Frissítés ellenőrzése → Letöltés → Telepítés**. Az Android telepítési ablakát külön jóvá kell hagyni. Telepítés után nyisd meg újra az appot: a főképernyőn **0.4.1 (5)** szerepel. A meglévő alkalmazás frissítéseként telepítsd.

## Állandó frissítési cím

```text
https://raw.githubusercontent.com/Zalan21321/red-galaxy-updates/main/update.json
```

Ezt add meg a **HTTPS frissítési cím** mezőben, majd **Forrás mentése → Frissítés ellenőrzése**. A kiadott APK-k változatlanok maradnak, a feed választja ki az aktuális verziót. A 0.1.0-ról egyszer kézzel kell telepíteni az új APK-t.

## Újdonságok

- 39 pontos, a felhasználó által megadott NPC-név beépített listája.
- Nyomva tartott lézer, legkorábban 5 másodpercenkénti rakéta és véletlen joystickirányok; a vezérlők külön kalibrálhatók és kikapcsolhatók.
- Kijelölés után két friss képen pontos célpontnév-visszaellenőrzés. Külön NPC-jelölés opcionálisan megkövetelhető.
- Összehangolt többujjas gesztusok, játék feletti NPC STOP és 1–120 másodperces menet. Nincs automatikus újraindulás.
- A telepített verzió a főképernyőn is olvasható. A frissítés telepítési gombja a változáslista előtt szerepel.

**A többujjas működés valódi Red Galaxy-telefonos tesztje még nem történt meg.** A lézer-, rakéta-, joystick- és célpontkoordinátákat a tényleges játékfelületen kell beállítani. Nincs kitalált képernyőprofil vagy betanított hajófelismerő. A névlista és az OCR nem garantálja a hajó típusát. A véletlen mozgás nem értelmezi a térképet vagy az akadályokat; nincs HP/pajzsvédelem, igazolt megsemmisítés vagy jutalomszámítás.

STOP után nincs új harci gesztus. A már folyamatban lévő legfeljebb 250 ms-os szakasz még befejeződhet, utána a tartott vezérlők felengedése következik. A régi egyszeri érintéses módban bekapcsolt játékbeli automatikus tüzelést szükség esetén a játékban kapcsold ki.

A helyi OCR, Room-napló és az ellenőrzött HTTPS-frissítő is a csomag része. Képernyőkép és OCR-napló nem kerül hálózatra. A kalibrációs kép csak memóriában él; a nevek és koordináták helyben menthetők.

Részletek: [0.4.1 kiadási megjegyzések](https://github.com/Zalan21321/red-galaxy-updates/releases/tag/v0.4.1).

Ez csak kiadási repó. A forrásprojekt, az aláírókulcs és a privát buildbeállítások nem kerülnek ide. A GitHub automatikus „Source code” archívuma ennek a repónak a fájljait tartalmazza, nem az Android-alkalmazás forrását.

