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

<!-- INITIAL_PUBLICATION: replace this status only after the public APK and feed are verified. -->
**Az első kiadás közzététele előkészítés alatt áll.** A repó létrejötte még nem
jelenti azt, hogy az APK vagy a frissítési leíró már letölthető. A működő
letöltési hivatkozás csak az APK feltöltése és visszaellenőrzése után kerül ide.

Az előkészített kiadás: **0.2.0**, verziókód: **2**. A készüléken futó
frissítő már ebben a verzióban található; a korábbi 0.1.0-ról egyszeri kézi
APK-telepítés szükséges. A meglévő alkalmazást ne távolítsd el, ha meg akarod
tartani a helyi naplót. Azonos csomagnév és aláírás szükséges a frissítéshez.

## Frissítési cím

A tervezett állandó frissítési cím:

[update.json a main ágon](https://raw.githubusercontent.com/Zalan21321/red-galaxy-updates/main/update.json)

Az előkészítés alatt ez a fájl még hiányozhat. Sikeres közzététel után ezt a
címet kell az asszisztens frissítési beállításában megadni. Az `update.json`
mindig a legújabb ellenőrzött APK verzióhoz kötött letöltési címére mutat.

A kiadások az [APK-kiadások oldalán](https://github.com/Zalan21321/red-galaxy-updates/releases)
lesznek elérhetők. A régi verziózott APK-k változatlanok maradnak; az újabb
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
