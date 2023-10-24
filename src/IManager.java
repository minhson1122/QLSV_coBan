import java.util.ArrayList;

public interface IManager<E> {
    void add(E e);
    void delete(int id);
    int findByid(int id);
    void upDate(int id, E e);
    ArrayList<E> finfAll();
}
