package OOday03.Practice;

public class ProjectManager extends  Teacher implements EditBook{
    ProjectManager(){}
    ProjectManager(String name,int age,double salary){
        super(name,age,salary);
    }
    @Override
    void FinishWork() {
        System.out.println(name+"完成了项目经理工作");
    }
    @Override
    public void editBook() {
        System.out.println(name+"正在编辑书籍");
    }
}
