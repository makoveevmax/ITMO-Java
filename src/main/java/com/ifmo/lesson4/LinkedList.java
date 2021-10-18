package com.ifmo.lesson4;

/**
 * Односвязный список, где каждый предыдущий
 * элемент харнит ссылку на следующий. Список
 * оканчивается ссылкой со значением {@code null}.
 */
public class LinkedList {
    /** Ссылка на первый элемент списка. */
    private Item head;

    /**
     * Добавляет значение в конец списка.
     *
     * @param val Значение, которое будет добавлено.
     */
    public void add(Object val) {
        Item item = new Item(val);

        if (head == null) {
            head = item;
        } else {
            Item current = head;
            while(true) {
                if (current.next == null) {
                    current.next = item;
                    break;
                }
                current = current.next;
            }
        }
    }

    /**
     * Извлекает значение из списка по индексу.
     *
     * @param i Индекс значения в списке.
     * @return Значение, которое находится по индексу
     * или {@code null}, если не найдено.
     */
    public Object get(int i) {

//        int cnt = 0;
//        Item current = head;
//
//        while (true) {
//            if (current == null) {
//                return null;
//            }
//            if (cnt == i) {
//                return current.value;
//            }
//            current = current.next;
//            cnt++;
//        }

        Item current = head;
        for (int cnt = 0; current != null; cnt++) {
            if (cnt == i) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }


    /**
     * Удаляет значение по индексу и возвращает
     * удаленный элемент.
     *
     * @param i Индекс, по которому будет удален элемент.
     * @return Удаленное значение или {@code null}, если не найдено.
     */
    public Object remove(int i) {

        if (head == null) {
            return null;
        }

        if (i == 0) {
            Object value = head.value;
            head = head.next;
            return value;
        }

        Item previous = head;
        for (int cnt = 0; previous != null; cnt++) {
            if (cnt + 1 == i) {
                if (previous.next == null)
                    return null;
                Object value = previous.next.value;
                previous.next = previous.next.next;
                return value;
            }
            previous = previous.next;
        }
        return null;
    }
}


