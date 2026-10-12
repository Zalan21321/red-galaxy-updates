# Red Galaxy Vision Assistant – Android-kiadások

Magyar Android-asszisztens a Red Galaxy: Online Space MMO (`com.doganaylab.redgalaxy`) mobilváltozatához. Minimum Android 10; az asszisztens csomagneve `hu.redgalaxy.visionassistant`.

Aktuális kiadás: **0.4.2**, verziókód **6**.

[0.4.2 APK letöltése](https://github.com/Zalan21321/red-galaxy-updates/releases/download/v0.4.2/RedGalaxyVisionAssistant-0.4.2.apk)

A 0.2.0 vagy újabb alkalmazásban: **Frissítés → Frissítés ellenőrzése → Frissítés letöltése → Telepítés**. A telepítést az Android ablakában jóvá kell hagyni. Újranyitás után **0.4.2 (6)** szerepeljen a főképernyőn. Ha a korábbi frissítő nem telepíti az új kiadást, használd a fenti közvetlen APK-linket. A meglévő alkalmazás frissítéseként telepítsd, eltávolítás nélkül.

## A frissítő javításai

- A teljes letöltés megmarad app-újraindítás után; újbóli hash-, csomag-, verzió- és aláírás-ellenőrzés után telepíthető.
- A telepítőből visszatéréskor és következő appindításkor a valós telepített verzió alapján jelez eredményt. A letöltés befejezése vagy a telepítő bezárása nem számít sikeres frissítésnek.
- A változatlan régi verziót külön jelzi; a kész APK-val újrapróbálható a telepítés.
- A hivatalos forrás alapértelmezett. Egyedi forrás továbbra is megadható, és a korábban mentett saját cím megmarad.
- A forrás és a telefon verziója, az ellenőrzés időpontja, az elavult feed és az inkompatibilis kiadás külön látható.

Az állandó frissítési cím:

```text
https://raw.githubusercontent.com/Zalan21321/red-galaxy-updates/main/update.json
```

A korábbi 0.2–0.4.1 verzióban szükség esetén ezt add meg a HTTPS frissítési cím mezőben. A 0.1.0-ról egyszer kézzel kell telepíteni az új APK-t. A kiadott APK-k változatlanok maradnak.

## Képfelismerés és harc

A helyi OCR, Room-napló, a 39 megadott NPC-név és a korábbi kísérleti harci kód része a csomagnak. **A kézi beállítás nélküli automatikus harc még nem készült el.** A jelenlegi harci mód külön célpontnév-panelt igényel; a csak hajó fölött megjelenő név nem helyettesíti ezt. A felismerőhöz tényleges mobilos, kijelölt és kijelöletlen NPC-képekre van szükség.

Nincs betanított hajófelismerő, térképértés, HP/pajzsvédelem vagy igazolt megsemmisítés. A játékbeli multitouch és a javított telepítési folyamat valódi telefonos tesztje még nem történt meg. Képernyőkép és OCR-napló nem kerül hálózatra.

Részletek: [0.4.2 kiadási megjegyzések](https://github.com/Zalan21321/red-galaxy-updates/releases/tag/v0.4.2).

Ez csak kiadási repó. A forrásprojekt, az aláírókulcs és a privát buildbeállítások nem kerülnek ide. A GitHub automatikus „Source code” archívuma ennek a repónak a fájljait tartalmazza, nem az Android-alkalmazás forrását.

