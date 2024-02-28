public class Pair<T> {
    private T first;
    private T last;
    public Pair(T first, T last) {
        this.first = first;
        this.last = last;
    }
    public T getFirst() {
        return first;
    }
    public T getLast() {
        return last;
    }
    // Utilisation de <T> dans une méthode statique :
    public static Pair<T> create(T first, T last) {
        return new Pair<T>(first, last);
    }
}