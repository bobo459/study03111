package Java0325;

    abstract public class StudentsA {
/*        String a;*/

        String a;
        String b;
        int c;

        public StudentsA(){
            this.a = "Steve";
            this.b = "Physics";
            this.c = 1001;

        }

        public StudentsA(String a, String b, int c) {
        }

        public String  toString(){
            return a;
        }

        abstract public String getName();

        public void setName(String  a){
            this.a = a;
        }
        public void setDepartment(String b){
            this.b = b;
        }
        public void setStudentId(int c){
            this.c = c;
        }

    }

