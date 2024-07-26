package bank.repository;


public interface GenericsInterface <T, I> {

        /**
         * Este metodo serve para atualizar algum dado já existente
         * @param t
         * @return
         */
        public boolean update(T t);

        /**
         * Este metodo serve para deletar algum dado ja inserido
         * @param t
         */
        public void delete(T t);


        /**
         * Este metodo serve para puxar as informações do objeto
         * @param i
         * @return
         */
        public T get(I i);

        /**
         * Este metodo serve para adicionar um objeto
         * @throws RuntimeException
         * @param t
         */
        public void add(T t);

        /**
         * Este metodo verifica se o valor desejado por parametro existe
         * @param i
         * @return
         */
        public boolean contem(I i);


    }


