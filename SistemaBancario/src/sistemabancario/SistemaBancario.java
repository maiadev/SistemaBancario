
package SistemaBancario;

    import banco.BancoDadosSistemaBancario;
    import views.MenuInicialView;

    public class SistemaBancario{
    
        public static void main(String[] args) {
            BancoDadosSistemaBancario.inicializarBancoConta();
            
            MenuInicialView menu = new MenuInicialView();
            menu.exibirMenu();
            
        }
    
        
    }    