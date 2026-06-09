package Atividade9_Exemplo_Fixação_Polimorfismo.Applications;

import Atividade9_Exemplo_Fixação_Polimorfismo.Entities.Account;

import java.util.*;

public class Program {
    public static void main(String[] args) {

        List<Account> list = new List<Account>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Account> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Account account) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Account> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Account> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public boolean equals(Object o) {
                return false;
            }

            @Override
            public int hashCode() {
                return 0;
            }

            @Override
            public Account get(int index) {
                return null;
            }

            @Override
            public Account set(int index, Account element) {
                return null;
            }

            @Override
            public void add(int index, Account element) {

            }

            @Override
            public Account remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Account> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Account> listIterator(int index) {
                return null;
            }

            @Override
            public List<Account> subList(int fromIndex, int toIndex) {
                return List.of();
            }
        };
    }
}