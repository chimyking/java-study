package ArrayList;

import java.util.ArrayList;

/**
 * 构造方法:
 *          public ArrayList(int initialCapacity)
 *          public ArrayList()
 *          public ArrayList(Collection<? extends E> c)
 *          - Set
 *          - List
 *          - Map
 *          - SortedSet
 *          - SortedMap
 *          - HashSet
 *          - TreeSet
 *          - ArrayList
 *          - LinkedList
 *          - Vector
 *          - Collections
 *          - Arrays
 *          - AbstractCollection
 *
 * 静态方法:
 *
 * 实例方法:
 *          public int size()
 *          public boolean isEmpty()
 *          public boolean contains(Object o)
 *          public int indexOf(Object o)
 *          public int lastIndexOf(Object o)
 *          public Object clone()
 *          public Object[] toArray()
 *          public <T> T[] toArray(T[] a)
 *          public E get(int index)
 *          public E set(int index, E element)
 *          public boolean add(E e)
 *          public void add(int index, E element)
 *          public E remove(int index)
 *          public boolean remove(Object o)
 *          public void clear()
 *          public boolean addAll(Collection<? extends E> c)
 *          public boolean addAll(int index, Collection<? extends E> c)
 *          public boolean removeAll(Collection<?> c)
 *          public boolean retainAll(Collection<?> c)
 *          public ListIterator<E> listIterator(int index)
 *          public ListIterator<E> listIterator()
 *          public Iterator<E> iterator()
 *          public List<E> subList(int fromIndex, int toIndex)
 *          public void forEach(Consumer<? super E> action)
 *          public Spliterator<E> spliterator()
 *          public boolean removeIf(Predicate<? super E> filter)
 *          public void replaceAll(UnaryOperator<E> operator)
 *          public void sort(Comparator<? super E> c)
 *
 */
public class TestArrayList {
    public static void main(String[] args) {
        testNew();
    }
    public static void testNew(){
//        public ArrayList(int initialCapacity)
        ArrayList<String> arrayList1 = new ArrayList<String>(5);
        System.out.println(arrayList1);
//        public ArrayList()
//        public ArrayList(Collection<? extends E> c)

    }
}
