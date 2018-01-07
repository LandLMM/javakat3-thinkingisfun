# Thinking is fun!

Tym razem Waszym głównym zadaniem będzie próba rozwiązania zadań nie skupiających się na funkcjonalnościach Javy. Będziecie musieli sami wymyśleć oraz zaimplementować rozwiązania przedstawionych problemów. Do każdego zadania są napisane testy jednostkowe, które sprawdzą Wasze rozwiązania.

1. PrintingIsFun.
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
