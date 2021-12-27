package br.com.dio;

public class PrimeiroPrograma {
    public static void main(String[] args) {

        Livro livro1 = new Livro("O Corvo", 100);
        System.out.println(livro1);
    }
}
    class Livro{
        private String nome;
        private Integer npag;

        public Livro() {
        }

        public Livro(String nome, Integer npag) {
            this.nome = nome;
            this.npag = npag;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public Integer getNpag() {
            return npag;
        }

        public void setNpag(Integer npag) {
            this.npag = npag;
        }

        @Override
        public String toString() {
            return "Livro{" +
                    "nome='" + nome + '\'' +
                    ", npag=" + npag +
                    '}';
            }
    }