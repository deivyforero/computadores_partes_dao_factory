# computadores_partes_dao_factory


la ubicación de los archivos se encuentra en la ruta https://github.com/deivyforero/computadores_partes_dao_factory/tree/master

-El programa se implementó utilizando el patró de diseño Abstract Factory de la siguiente forma:
-Se diseña la Clase AbstractFactory que implementa la interfaz IntAbstractFactory la cual contiene el llamado a funciones getJson y getXML que invocan las fabricas DaoJson y DaoXML
-Las clases DaoJson y DaoXML contienen las fabricas que leen los archivos Json y XMl los cuales contienen los tipos de computadores y sus partes que serán leidas por onjeto de la clase Computador
- La clase computador contiene los metodos y la estructura de los archivos 


