# BasicUI (Java)
Crea una venata basica sin ningun componente agregado, es decir una ventana vacia.  
Documentacion muy rapido sabre el codigo de estas clases. :D  
  
  
## Clase View.
Hereda de JFrame lo que nos permite crear ventanas tradicionales.   
### Constructor.  
__View()__  
 Inicializa la ventana con la llama al constructor de la super clase y ejecutando el metodo __initProperties()__
### Metodos.  
__initProperties()__  
    Ejecuta los metodos de la super clase que son.  
   * setDefaultCloseOperation(EXIT_ON_CLOSE) - establece que cierra todo al momento de dar click en el boton rojo de la venatan.  
   * setTitle("BasicUI.") - establece el titulo de la ventana.  
   * getContentPane().setBackground(Color.WHITE) - pinta el fondo de color blanco.  
  
  
## Clase Main.
En el metodo principal crea un objeto de la clase __View__ 
### Metodos.
__main(String args[])__  
    Ejecuta los metodos necesarios (que hereda) del objeto __view__ para poder crear, centar y mostrar una ventana.  
    + __View view = new View();__ //Crea un objeto de la clase __View__ llamado "view".  
    + __view.setSize(800, 600);__ //Establece las dimenciones del elemento.  
    + __view.setLocationRelativeTo(null);__ //Centra el elemento en la panatalla.  
    + __view.setVisible(true);__ //Hace visible el elemento en la pantall.  
