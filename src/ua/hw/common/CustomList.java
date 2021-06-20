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
        return new CustomIterator<>();
    }

    public ListIterator<T> listIterator() {
        return new CustomIterator<>();
    }

    private class CustomIterator<E> implements ListIterator<E> {
        int cursor;       // index of next element to return
        int lastRet = -1; // index of last element returned; -1 if no such

        public boolean hasNext() {
            return cursor != size();
        }

        @SuppressWarnings("unchecked")
        public E next() {
            if (cursor < 0) cursor = lastRet;
            int i = cursor;
            if (i >= size())
                throw new NoSuchElementException();
            if (i >= innerList.size())
                throw new ConcurrentModificationException();
            cursor = i + 1;
            return (E) innerList.get(lastRet = i);
        }

        public boolean hasPrevious() {
            return cursor >= 0;
        }

        @SuppressWarnings("unchecked")
        public E previous() {
            if (cursor >= size()) cursor = lastRet;
            int i = cursor;
            if (i < 0)
                throw new NoSuchElementException();
            cursor = i - 1;
            return (E) innerList.get(lastRet = i);
        }

        public int nextIndex() {
            int i = cursor + 1;
            if (i >= size()) i = size();
            if (i >= innerList.size())
                throw new ConcurrentModificationException();
            return i;
        }

        public int previousIndex() {
            int i = cursor - 1;
            if (i < 0) i = -1;
            return i;
        }

        public void remove() {
            if (lastRet == cursor)
                throw new IllegalStateException();
            innerList.remove(lastRet);
        }

        @Override
        public void set(E e) {
        }

        @Override
        public void add(E e) {
        }
    }
}
