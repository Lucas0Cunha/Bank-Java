package bank.repository;

import bank.models.Conta;

public interface GenericsInterface <T, I> {

        public boolean update(T t);

        public void delete(T t);

        public T get(I i);

        public void add(T t);

        public boolean contem(I i);


    }


