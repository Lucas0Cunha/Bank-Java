package bank.repository;

public interface GenericsInterface <T, I> {

        public boolean update(T t);
        
        public void delete(T t);

        public T get(I i);

        /**
         * Este metodo serve para adicionar um cliente
         * @throws RuntimeException
         * @param </T>
         */
        public void add(T t);

        public boolean contem(I i);


    }


