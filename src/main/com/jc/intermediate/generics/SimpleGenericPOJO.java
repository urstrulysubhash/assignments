package main.com.jc.intermediate.generics;

public class SimpleGenericPOJO<T> {

    private T data;

    public SimpleGenericPOJO(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
