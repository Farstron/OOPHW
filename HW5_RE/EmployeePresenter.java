package HW5_RE;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmployeePresenter {
    private EmployeeView view;
    private EmployeeModel model;

    public EmployeePresenter(EmployeeView view, EmployeeModel model) {
        this.view = view;
        this.model = model;

        view.setEmployeeList(model.getAllEmployees());
        view.setAddActionListener(new AddEmployeeActionListener());
        view.setDeleteActionListener(new DeleteEmployeeActionListener());
        view.setUpdateActionListener(new UpdateEmployeeActionListener());
    }

    private class AddEmployeeActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Employee employee = view.getEmployeeInputData();
            model.addEmployee(employee);
            view.setEmployeeList(model.getAllEmployees());
        }
    }

    private class DeleteEmployeeActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int selectedEmployeeId = view.getSelectedEmployeeId();
            model.deleteEmployee(selectedEmployeeId);
            view.setEmployeeList(model.getAllEmployees());
        }
    }

    private class UpdateEmployeeActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Employee employee = view.getEmployeeInputData();
            model.updateEmployee(employee);
            view.setEmployeeList(model.getAllEmployees());
        }
    }
}
