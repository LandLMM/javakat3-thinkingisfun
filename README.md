# Thinking is fun!

Tym razem Waszym głównym zadaniem będzie próba rozwiązania zadań nie skupiających się na funkcjonalnościach Javy. Będziecie musieli sami wymyśleć oraz zaimplementować rozwiązania przedstawionych problemów. Do każdego zadania są napisane testy jednostkowe, które sprawdzą Wasze rozwiązania.

1. PrintingIsFun!
Musicie wypisać określony ciąg znaków do strumienia wyjściowego. Strumień zapisany jest w zmiennej "output", została także przygotowana metoda pomocnicza, która zapisuje do niego kolejne linie tekstu.
    * printRectangle(int width, int height) - Wypisz do strumienia prostokąt składający się ze znaków "*". Przykład:
      ```printRectangle(2, 4)``` powinno wypisać:  
      ```**```  
      ```**```  
      ```**```  
      ```**```  
    * printBox(int width, int height) - Wypisz do strumienia ramkę, składającą się ze znaków "*" oraz znaków spacji w środku ramki. Przykład:  
      ```printBox(3, 3)``` powinno wypisać:  
      ```***```  
      ```* *```  
      ```***``` 
    * printTriangle(int height) - Wypisz trójkąt, którego ilość znaków w podstawie jest równa wysokści. Trókąt ma się składać ze znaków "*". UWAGA! trókąt ma być "odwrócony". Przykład:  
      ```printTriangle(4)``` powinno wypisać:  
      ```****```  
      ```***```  
      ```**```  
      ```*``` 
    * printTree(int height) - Wypisz choinkę o określonej wielkości. Choinka rozrasta się o 1 znak "*" z każdej jej strony wraz z każdym poziomem. Przykład:  
      ```printTree(4)``` powinno wypisać:  
      ```   *   ```  
      ```  ***  ```  
      ``` ***** ```  
      ```*******```  
2. ArraysAreFun!
W podanych metodach musi zostać wytworzona nowa tablica, która będzie zawierała określone elementy.
    * public Integer[] merge(Integer[] first, Integer[] second) - metoda jako parametry przyjmuje posortowane tablice (nie trzeba tego sprawdzać, można założyć, że tak jest), a jako wynik powinna zwrócić posortowaną tablicę składającą się ze wszystkich elementów tablic wejściowych. Algorytm powinien się wykonywać w czasie liniowym (zakaz używania metody sort). Przykład:  
      ```first := [1,4,5]```  
      ```second := [3,5,8]```  
      ```result := [1,3,4,5,5,8]```
    * public Integer[] reverse(Integer[] array) - metoda powinna zwracać odwróconą tablicę. Przykład:  
      ```array := [3,7,2,4]```  
      ```result := [4,2,7,3]```
    * public Integer[] roll(Integer[] array, int amount) - metoda powinna "przekręcać" tablicę o zadaną liczbę elementów. Oznacza to, że pewna ilość (amount) elementów z początku listy powinna zostać przenesiona na jej koniec. amount zawsze będzie mniejsze bądź równe długości tablicy wejściowej. Przykład:  
      ```array := [9,8,7,6,5,4,3,2,1]```  
      ```amount := 4```  
      ```result := [5,4,3,2,1,9,8,7,6]```
    * public Integer[] longestGrowingTrent(Integer[] array) - metoda powinna zwracać najdłuższy rosnący ciąg wartości. Ciąg jest rosnący, jeżeli wszystkie poprzednie wartości są mniejsze od aktualnej. Przykład:  
      ```array := [5,6,2,4,7,9,3,5,6]```  
      ```result := [2,4,7,9]```
3. StringsAreFun!
    * isPalindrome - metoda sprawdza, czy podany tekst jest palindromem. Palindrom to tekst, który czytany od każdego z końców brzmi tak samo (np. Kobyła ma mały bok). Metoda będzie przyjmowała tekst bez spacji, pisany małymi litarami. Przykład:  
      ```abcdeffedcba```  
      ```true```
    * public Integer countOccurences(String toBeTested, String toBeFound) - metoda zlicza, ile razy w podanym tekście wystąpiła szukana fraza. Przykład:  
      ```toBeTested := "Lorem ipsum dolor sit amet"```  
      ```toBeFound := "or"```  
      ```result := 2```
    * rot13 - metoda koduje/dekoduje tekst za pomocą algorytmu ROT13 - jest to algorytm, który zamienia każdą literę alfabetu na literę o 13 znaków dalej (a->n; b->o; c->p; q->d; r->e; s->f). Przydatna tutaj będzie znajomość budowy Tablicy kodów ASCII (zawiera informacje o kodach znaków, czyli jaki numer ma która litera). Działanie ROT13 można sprawdzić na stronie rot13.com. Przykład:  
      ```Kiedys wystarczal Szyfr Cezara```  
      ```Xvrqlf jlfgnepmny Fmlse Prmnen```


#Thinking is fun V2!
Nowe zadania!
 
1. ArraysAreFun!
Napisz metody tak, aby testy przechodziły
    * Integer[] removeElementAtPosition(Integer[] array, Integer positionNumber) - usuwa element o podanym indeksie z tablicy
    * List convertToList(int[] ints) - przekształca tablicę intów w ich Listę
2. CollectionsAreFun!
Tym razem metody są napisane! Uzupełnij metody testujące tak, aby sprawdzały wielkość zwróconej kolekcji oraz sprawdzały, czy wszystkie elementy są w niej zawarte w odpowiedniej kolejności. Ćwiczenie pozwoli Wam na utrwalenie różnic między różnymi implementacjami kolekcji.


#Thinking with tests are fun!
Zadania z podstawa testów jednostkowch.
1. CalculatorTest
    Napisz po 3 metody testujące poprawność kalkulatora. Klasa nie wymaga mockowania, a jedynie pisania prostych asercji.
2. ProxyForNumberTest  
    Zaimplementuj metodę testującą dla każdej z metod w klasie. Klasa odpytuje serwis NumberProvider o kolejny numer. Waszym zadaniem jest zmockowanie zwracanej wartości i sprawdzenie, czy ta zmockowana wartość została zwrócona z service.
3. CalculatorForProxy  
    Klasa wykorzystuje znane już metody kalkulatora oraz znany intergace dla pobierania wartości. Należy zmockować zwracane przez NumberProvider i sprawdzić, czy została na nich wykonana operacja.
4. DatabaseInformationServiceTest  
    Klasa używa sztucznego obiektu połączenie do bazy w celu symulowania połączenia. Waszym zadaniem jest zaimplementowanie brakujących metod testujących. Wymagane jest mockowanie zwracanych przez bazę danych, oraz używanie konstrukcji verify.
    