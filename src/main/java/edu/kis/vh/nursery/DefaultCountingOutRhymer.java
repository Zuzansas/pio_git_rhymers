package edu.kis.vh.nursery;

/**
 * Klasa DefaultCountingOutRhymer odpowiedzialna za zarządzanie tablicą liczb całkowitych
 * oraz operacje takie jak dodawanie, usuwanie i sprawdzanie stanu tablicy.
 */
public class DefaultCountingOutRhymer {


    private static final int INT = 12;
    private int[] numbers = new int[INT];
    private int totalCount = -1;

    /**
     * Zwraca całkowitą liczbę elementów w tablicy.
     *
     * @return całkowita liczba elementów w tablicy
     */
    public int getTotal() {
        return totalCount;
    }

    public static final int EMPTY = -1;
    public static final int CAPACITY = 12;
    public static final int FULL = CAPACITY-1;
    private final int[] numbers = new int[CAPACITY];

    private int total = -1;


    /**
     * Dodaje nowy element do tablicy, jeśli nie jest pełna.
     *
     * @param in element do dodania
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++totalCount] = in;
    }

    /**
     * Sprawdza, czy tablica jest pusta.
     *
     * @return true, jeśli tablica jest pusta; false w przeciwnym razie
     */
    public boolean callCheck() {

        return total == EMPTY;

    }

    /**
     * Sprawdza, czy tablica jest pełna.
     *
     * @return true, jeśli tablica jest pełna; false w przeciwnym razie
     */
    public boolean isFull() {

        return total == FULL;

    }

    /**
     * Zwraca ostatni element z tablicy bez jego usuwania.
     *
     * @return ostatni element z tablicy lub -1, jeśli tablica jest pusta
     */
    protected int peekaboo() {
        if (callCheck())
            return EMPTY;
        return numbers[total];
    }

    /**
     * Usuwa i zwraca ostatni element z tablicy.
     *
     * @return ostatni element z tablicy lub -1, jeśli tablica jest pusta
     */
    public int countOut() {
        if (callCheck())
            return EMPTY;
        return numbers[total--];
    }
}

