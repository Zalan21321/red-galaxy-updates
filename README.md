# Red Galaxy Vision Assistant – Android-kiadások

Magyar Android-asszisztens a Red Galaxy: Online Space MMO (`com.doganaylab.redgalaxy`) mobilváltozatához. Minimum Android 10. Az asszisztens csomagneve `hu.redgalaxy.visionassistant`.

Aktuális kiadás: **0.5.0**, verziókód **7**.

[0.5.0 APK letöltése](https://github.com/Zalan21321/red-galaxy-updates/releases/download/v0.5.0/RedGalaxyVisionAssistant-0.5.0.apk)

Az alkalmazásban: **Frissítés → Frissítés ellenőrzése → Frissítés letöltése → Telepítés**. Az Android telepítési ablakát jóvá kell hagyni. Újranyitás után **0.5.0 (7)** szerepeljen az appban. Ha a régi frissítő nem telepíti, használd a fenti közvetlen APK-linket, a meglévő app eltávolítása nélkül.

## Automatikus NPC-harc

A megadott játékfotó tényleges vezérlőikonjaival keresi a joystickot, a rakétát és a lézert. Nem kell kézi koordináta vagy külön célpontpanel. A 39 megadott NPC-nevet szűrt OCR-rel követi, egyszer a hajóra koppint, két új névészlelés után tartja a lézert, legkorábban 5 másodpercenként rakétázik és véletlen irányokba húzza a joystickot.

Indítás: OCR + képernyőmegosztási engedély → NPC-harc → Kisegítő szolgáltatás beállítása → elsőre 15 másodperc → Automatikus NPC-harc indítása. A játék felett **NPC STOP** gomb látható. Bizonytalanság, eltűnő név vagy megváltozott felület felengedést/leállást eredményez. A teljes menet legfeljebb 120 másodperc.

**Kísérleti, a kapott elrendezéshez kötött funkció, telefonon még nincs igazolt harci teszt.** Nincs betanított hajómodell, vizuálisan igazolt célpontkijelölés, HP-/pajzsvédelem, ölésigazolás vagy akadálykerülés. Új érintéshez legfeljebb 350 ms-os kép kell. A keresésből a chat és a HUD kimarad. Képernyőkép és OCR-napló nem kerül hálózatra.

## Frissítő

A 0.4.2-ben javított frissítő megmaradt: kész letöltés visszaállítása újraellenőrzéssel, tényleges telepített verzió kijelzése, változatlan régi verzió külön jelzése. Az alapértelmezett forrás:

```text
https://raw.githubusercontent.com/Zalan21321/red-galaxy-updates/main/update.json
```

0.1.0-ról egyszer kézzel kell telepíteni a frissítőt tartalmazó APK-t. Korábbi saját forrás megmarad; a Forrásbeállítások alatt visszaállítható a hivatalos cím. A korábbi kiadott APK-k változatlanok.

[0.5.0 kiadási megjegyzések](https://github.com/Zalan21321/red-galaxy-updates/releases/tag/v0.5.0).

Ez csak kiadási repó. A forrásprojekt, teljes játékfotó, aláírókulcs és privát buildbeállítások nem kerülnek ide. A GitHub automatikus Source code archívuma ennek a repónak a fájljait tartalmazza, nem az Android-alkalmazás forrását.
