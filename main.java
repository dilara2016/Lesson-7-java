class Student {
    private String name;
    public String GetName(){
        return name;
    }
    public  void setName(String name) {
        this.name = name;
    }
}

class main{
    public static void main(String[] args){
        Student  s = new Student();
        s.setName("Aashish  @Codingak");
        System.out.println(s.GetName());
    }
}