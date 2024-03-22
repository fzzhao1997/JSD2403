package OOday03.Practice;

public class Test {
    public static void main(String[] args) {
        CRO xyy = new CRO("喜羊羊",23,40000);
        Lecturer myy = new Lecturer("美羊羊",24,20000);
        ProjectManager lyy = new ProjectManager("懒羊羊",25,10000);
        ClassTeacher fyy = new ClassTeacher("沸羊羊",26,50000);
        xyy.training();
        xyy.editBook();
        xyy.solving();
        xyy.FinishWork();
        xyy.clockIn();
        xyy.clockOut();
    }
}
