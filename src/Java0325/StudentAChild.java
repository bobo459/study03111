package Java0325;

public class StudentAChild extends StudentsA {
    public StudentAChild(){
        super();
    }

    @Override
    public String getName() {
        return super.a;
    }

    public void setName(String  a) {
        super.setName(a);
    }
    public void setDepartment(String b){
        super.setDepartment(b);
    }
    public void setStudentId(int c){
        super.setStudentId(c);
    }
}
