package java13;

import java13.models.Employee;
import java13.models.Job;
import java13.service.EmployeeService;
import java13.service.JobService;
import java13.service.serviceImpl.EmployeeServiceImpl;
import java13.service.serviceImpl.JobServiceImpl;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        //TODO 1
        JobService jobService = new JobServiceImpl();

        // jobService.createJobTable();
//         Job job = new Job();
//         job.setPosition("Instructor");
//         job.setProfession("JS");
//         job.setDescription("gfdhgfdfs");
//         job.setExperience(2);
//         jobService.addJob(job);

        // System.out.println("Get by id: " + jobService.getJobById(11L));
        //  System.out.println("jobService.sortByExperience(\"asc\") = " + jobService.sortByExperience("asc"));
        //  System.out.println("jobService.sortByExperience(\"desc\") = " + jobService.sortByExperience("desc"));

        // System.out.println("jobService.getJobByEmployeeId(1L) = " + jobService.getJobByEmployeeId(1L));

        //   jobService.deleteDescriptionColumn();

        //TODO 2
        EmployeeService employeeService = new EmployeeServiceImpl();
        // employeeService.createEmployee();
        //  employeeService.addEmployee(new Employee("Nuri", "Zakirovna", 17, "zakirovna@gmail.com", 2L));
        // employeeService.dropTable();
        // employeeService.cleanTable();
        // System.out.println(employeeService.getAllEmployees());

        // employeeService.updateEmployee(1L, new Employee("Nurim", "Samatova", 22, "nurim@gmail.com", 2L));

        //  System.out.println(employeeService.findByEmail("zakirova@gmail.com"));
        //  System.out.println("employeeService.getEmployeeByPosition(\"Java\") = " + employeeService.getEmployeeByPosition("Mentor"));
        // System.out.println("employeeService.getEmployeeById(1L) = " + employeeService.getEmployeeById(1L));
    }
}
