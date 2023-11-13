    public class HilosRun implements Runnable {

        private int tipo;

        public HilosRun(int tipo) {
            this.tipo = tipo; // Constructor que recibe el tipo de hilo
        }

        @Override
        public void run() {
            // Este método se ejecutará cuando se inicie el hilo
            // Dependiendo del tipo, el hilo realizará diferentes tareas.
        }
    }


