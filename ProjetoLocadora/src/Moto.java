
    //um novo atributo cilindrada
    //se cilindrada > 300 : acrescimo de 15%

    public class Moto extends Veiculo {
        private int cilindrada;

        //Construtor
        public Moto(String marca, String modelo, int ano, String placa, double precoBase, int quantidadePortas, int cilindrada) {
            super(marca, modelo, ano, placa, precoBase);
            this.cilindrada = cilindrada;

        }

        public int getCilindrada() {
            return cilindrada;

        }

        @Override
        public double calcularDiaria() {

            if (cilindrada >= 300) {
                return getPrecoBase() * 1.15;

            }

            return getPrecoBase();

        }


    }

