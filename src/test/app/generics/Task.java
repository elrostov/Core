package test.app.generics;

public class Task<T> {

    private int id;

    private Class<T> clazz;

    public Task(Class<T> clazz) {
        System.out.println(clazz);
    }
    //2
    public void printType() {
        System.out.println(clazz);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void main(String[] args) {
        Task<String> task = new Task<>(String.class);
//        task.printType();
    }
}
