package HW5_RE;


public class HW5 {
    public static void main(String[] args) {
        EmployeeView view = new EmployeeView();
        EmployeeModel model = new EmployeeModel();
        EmployeePresenter presenter = new EmployeePresenter(view, model);
    }
}
