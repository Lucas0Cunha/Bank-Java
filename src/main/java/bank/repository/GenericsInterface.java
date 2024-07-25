package bank.repository;

//TODO  documentacao
public interface GenericsInterface <T, I> {

        public boolean update(T t);
        
        public void delete(T t);

        public T get(I i);

        /**
         * Este metodo serve para adicionar um T
         * @throws RuntimeException
         * @param T
         */
        public void add(T t);

        public boolean contem(I i);


    }


