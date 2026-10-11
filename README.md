# Red Galaxy Vision Assistant – Android-kiadások

A **Red Galaxy Vision Assistant** Android-alkalmazás nyilvános APK- és
frissítési tárhelye. Az asszisztens a Red Galaxy: Online Space MMO
(`com.doganaylab.redgalaxy`) mobilváltozatához készül. Minimum Android 10.
Az asszisztens csomagneve: `hu.redgalaxy.visionassistant`.

Ez a repó a kiadott APK-kat és a frissítési leírót szolgálja ki. Az alkalmazás
forráskódja, aláírókulcsa és privát buildbeállításai nem kerülnek ide. A GitHub
automatikus „Source code” archívumai ennek a kiadási repónak a fájljait
tartalmazzák, nem az Android-alkalmazás forrásprojektjét.

## Közzétételi állapot

**A 0.2.0-s APK közzétéve.** A nyilvános HTTPS-letöltést bejelentkezés nélkül
visszaellenőriztük: mérete és SHA-256 lenyomata egyezik a kiadott fájléval.

[RedGalaxyVisionAssistant-0.2.0.apk letöltése](https://github.com/Zalan21321/red-galaxy-updates/releases/download/v0.2.0/RedGalaxyVisionAssistant-0.2.0.apk)

Az aktuális kiadás: **0.2.0**, verziókód: **2**. A készüléken futó
frissítő már ebben a verzióban található; a korábbi 0.1.0-ról egyszeri kézi
APK-telepítés szükséges. A meglévő alkalmazást ne távolítsd el, ha meg akarod
tartani a helyi naplót. Azonos csomagnév és aláírás szükséges a frissítéshez.

## Frissítési cím

Az állandó frissítési cím:

[update.json a main ágon](https://raw.githubusercontent.com/Zalan21321/red-galaxy-updates/main/update.json)

Ezt a címet add meg az asszisztens **Frissítés → HTTPS frissítési cím** mezőjében,
majd válaszd a **Forrás mentése → Frissítés ellenőrzése** gombokat. Az `update.json`
mindig a legújabb ellenőrzött APK verzióhoz kötött letöltési címére mutat.

Ha már a 0.2.0 van telepítve, jelenleg a **nincs újabb verzió** eredmény a helyes.
A következő, nagyobb verziókódú kiadást innen ajánlja majd fel az alkalmazás.

A kiadások az [APK-kiadások oldalán](https://github.com/Zalan21321/red-galaxy-updates/releases)
érhetők el. A régi verziózott APK-k változatlanok maradnak; az újabb
verzió kiválasztását a `main` ág frissítési leírójának módosítása végzi.

## Mit tud az alkalmazás?

- Magyar, sötét Android-felület, engedélyköteles képernyőelemzés és helyi OCR.
- A felismert szöveg, koordináták és helyi felismerési napló megjelenítése.
- Beállítható HTTPS-frissítési cím, ellenőrzött APK-letöltés és felhasználó által
  jóváhagyott Android-telepítés. A telefonos használathoz nem kell PC.

**Nincs betanított Red Galaxy objektumfelismerő modell.** Hajó-, NPC-, érc-,
küldetés-, HP- és pajzsfelismerést nem állít működőnek; nincs kitalált felismerés
vagy automatikus játékvezérlés. Képernyőképet és felismerési naplót nem tölt fel.
Az OCR helyben működik; az internet a frissítési leíró és az APK letöltéséhez kell.

A fordítási ellenőrzés nem helyettesíti a valódi telefonos próbát. A rendszer
engedélyablakait, a tényleges frissítést és a játékbeli OCR-pontosságot készüléken
kell ellenőrizni. A telepítést mindig az Android rendszerablakában hagyod jóvá.
