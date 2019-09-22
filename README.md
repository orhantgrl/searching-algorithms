# Arama Algoritmaları (Searching Algorithms)

- Doğrusal Arama (Linear Search)
- İkili Arama (Binary search)
- Interpolasyon Araması (Ara değer araması, Interpolation Search) Coming Soon :) 

## Doğrusal Arama (Linear Search)
Teker teker bütün sayılara bakılır. Örneğin baştan başlanarak 4 aranan sayı mı? değil 6 aranan sayı mı değil 12 aranan sayı mı değil şeklinde bütün sayılar alınır ve aranan sayı bulunana kadar devam eder.

## İkili Arama (Binary Search)
Algoritmanın her durumda çalışması aşağıdaki şekildedir.

Problemde aranacak uzayın tam orta noktasına bak
Şayet aranan değer bulunduysa bit
Şayet bakılan değer aranan değerden büyükse arama işlemini problem uzayının küçük elamanlarında devam ettir.
Şayet bakılan değer arana değerden küçükse arama işlemini problem uzayının büyük elemanlarında devam ettir.
Şayet bakılan aralık 1 veya daha küçükse aranan değer bulunamadı olarak bitir.

`Döküm Kaynağı` : <http://bilgisayarkavramlari.sadievrenseker.com/2009/11/23/arama-algoritmalari-search-algorithms/>
