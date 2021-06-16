package ua.hw.common;

import java.util.*;

public class CustomList<T> implements Collection<T> {
    private final List<T> innerList = new ArrayList<>();

    @Override
    public int size() {
        return innerList.size();
    }

    @Override
    public boolean isEmpty() {
        return innerList.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return innerList.contains(o);
    }

    @Override
    public Object[] toArray() {
        return innerList.toArray();
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return innerList.toArray(a);
    }

    @Override
    public boolean add(T t) {
        return innerList.add(t);
    }

    @Override
    public boolean remove(Object o) {
        return innerList.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return innerList.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return innerList.addAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return innerList.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return innerList.retainAll(c);
    }

    @Override
    public void clear() {
        innerList.clear();
    }

    @Override
    public Iterator<T> iterator() {
        return new CustomIterator<T>();
    }

    private class CustomIterator<E> implements Iterator<E>{
        int cursor;       // index of next element to return
        int lastRet = -1; // index of last element returned; -1 if no such

        public boolean hasNext() {
            return cursor != size();
        }

        @SuppressWarnings("unchecked")
        public E next() {
            int i = cursor;
            if (i >= size())
                throw new NoSuchElementException();
            if (i >= innerList.size())
                throw new ConcurrentModificationException();
            cursor = i + 1;
            return (E) innerList.get(lastRet = i);
        }
    }
}
