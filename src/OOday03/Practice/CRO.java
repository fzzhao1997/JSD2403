package OOday03.Practice;

public class CRO extends Teacher implements Solveing,Training,EditBook{
    CRO(){}
    CRO(String name,int age,double salary){
        super(name,age,salary);
    }

    @Override
    void FinishWork() {
        System.out.println(name+"完成了教研总监工作");
    }
    @Override
    public void solving() {
        System.out.println(name+"正在解决企业问题");
    }
    @Override
    public void editBook() {
        System.out.println(name+"正在编辑书籍");
    }
    @Override
    public void training() {
        System.out.println(name+"正在培训企业员工");
    }
}
