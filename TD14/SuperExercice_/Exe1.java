class Box<T> {
    private T value;

    public void set(T value) { 
        this.value = value; 
    }

    public T get() { 
        return value; 
    }
}


public class Exe1 {

    public static void setInteger(Box<? super Integer> box) {
        box.set(123);
    }
    
    public static void main(String[] args) {
        Box<Number> numberBox = new Box<>();
        setInteger(numberBox);
        System.out.println(numberBox.get());
        
        Box<Object> objectBox = new Box<>();
        setInteger(objectBox);
        System.out.println(objectBox.get());
    }
}