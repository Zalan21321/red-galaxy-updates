# Red Galaxy Vision Assistant – Android-kiadások

A Red Galaxy: Online Space MMO (`com.doganaylab.redgalaxy`) mobilváltozatához készülő magyar Android-asszisztens kiadási tárhelye. Minimum Android 10; az asszisztens csomagneve `hu.redgalaxy.visionassistant`.

Az aktuális kiadás **0.3.0**, verziókód **3**.

[A 0.3.0 APK letöltése](https://github.com/Zalan21321/red-galaxy-updates/releases/download/v0.3.0/RedGalaxyVisionAssistant-0.3.0.apk)

Ha már 0.2.0-t használsz, az alkalmazás **Frissítés** lapján ellenőrizd, töltsd le és telepítsd az új kiadást. A telefonos használathoz nem kell PC. Az Android telepítési ablakát jóvá kell hagynod; az appot ne távolítsd el.

## Állandó frissítési cím

```text
https://raw.githubusercontent.com/Zalan21321/red-galaxy-updates/main/update.json
```

Ezt add meg a **HTTPS frissítési cím** mezőben, majd **Forrás mentése → Frissítés ellenőrzése**. Már telepített 0.3.0 esetén a „nincs újabb verzió” eredmény helyes. A kiadott APK-k változatlanok maradnak, a feed választja ki az aktuális verziót. A 0.1.0-ról egyszer kézzel kell telepíteni az új APK-t.

## Mit tartalmaz a 0.3.0?

- Engedélyköteles, helyi OCR, valódi szövegek és koordináták, helyi Room-napló.
- Ellenőrzött HTTPS APK-letöltés, méret-, SHA-256-, csomag- és aláírásvizsgálat.
- Új, alapból kikapcsolt **kísérleti NPC-harc**, kézi telefonos kalibrálással, külön kisegítő szolgáltatási engedéllyel, indítással és játék feletti STOP gombbal.

Az NPC-harc két stabil névfelismerés után kijelöl, és csak a kijelölés utáni két új képen igazolt pontos célpontnév és külön NPC-jelölés után érinti meg a támadógombot. Legalább 85%-os ismert OCR-pontszám kell. A menet legfeljebb 120 másodperc; elavult kép vagy megváltozott játékablak esetén leáll.

**Nincs betanított Red Galaxy objektumfelismerő modell és nincs kész játékprofil.** A külön NPC-jelölésnek valóban olvasható, kizárólag NPC-t jelentő játékfeliratnak kell lennie; a név önmagában nem elég. A kijelölés a korábbi támadás után sem indíthat tüzelést, a támadógombnak egy érintésre kell működnie. Ha ezek nem teljesülnek, ez a verzió nem használható automatikus harcra. Nem állítunk igazolt ölést, bevételt, HP/pajzsvédelmet vagy készüléken már tesztelt automatikus farmolást.

A STOP az asszisztens új érintéseit állítja le. A játék saját, már elindított tüzelését kézzel kell leállítani. Képernyőképet és OCR-naplót nem töltünk fel; a kalibrációs kép csak memóriában marad. A nevek és koordináták helyben menthetők.

A fordítási és JVM-tesztek nem helyettesítik a valódi telefonos próbát. Az új mód tényleges játékbeli működése és az NPC/játékos megkülönböztetés készülékes ellenőrzést igényel. A részletes feltételek az alkalmazás NPC-harc lapján és a [kiadási megjegyzésekben](https://github.com/Zalan21321/red-galaxy-updates/releases/tag/v0.3.0) olvashatók.

Ez csak kiadási repó. A forrásprojekt, az aláírókulcs és a privát buildbeállítások nem kerülnek ide. A GitHub automatikus „Source code” archívuma ennek a repónak a fájljait tartalmazza, nem az Android-alkalmazás forráskódját.

