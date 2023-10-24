import java.util.ArrayList;


public class StudentManager implements IManager<Student>{
    ArrayList<Student> list;

    public StudentManager() {
        this.list = new ArrayList<>();
    }

    @Override
    public void add(Student student) {
        list.add(student);

    }

    @Override
    public void delete(int id) {
        int index = findByid(id);
        list.remove(index);

    }

    @Override
    public int findByid(int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id){
                return i;
            }
        }
        return -1;
    }

    @Override
    public void upDate(int id, Student student) {
        int index = findByid(id);
        list.set(index, student);

    }

    @Override
    public ArrayList<Student> finfAll() {
        return list;
    }

}
