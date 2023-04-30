package org.java.dev;
import org.java.dev.db.dto.*;
import org.java.dev.db.service.DatabaseQueryService;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        List<LongestProject> longestProject = new DatabaseQueryService().findLongestProject();
        System.out.println("\n=> Результат запиту find_longest_project.sql:");
        longestProject.stream().forEach(e -> {System.out.println("   " + e.toString());});

        List<MaxProjectsClient> maxProjectsClients = new DatabaseQueryService().findMaxProjectsClient();
        System.out.println("\n=> Результат запиту find_max_projects_client.sql:");
        maxProjectsClients.stream().forEach(e -> {System.out.println("   " +  e.toString());});

        List<MaxSalaryWorker> maxSalaryWorker = new DatabaseQueryService().findMaxSalaryWorker();
        System.out.println("\n=> Результат запиту find_max_salary_worker.sql:");
        maxSalaryWorker.stream().forEach(e -> {System.out.println("   " + e.toString());});

        List<YoungestEldestWorkers> youngestEldestWorkers = new DatabaseQueryService().findYoungestEldestWorkers();
        System.out.println("\n=> Результат запиту find_youngest_eldest_workers.sql:");
        youngestEldestWorkers.stream().forEach(e -> {System.out.println("   " + e.toString());});

        List<ProjectPrices> projectPrices = new DatabaseQueryService().findProjectPrices();
        System.out.println("\n=> Результат запиту print_project_prices.sql:");
        projectPrices.stream().forEach(e -> {System.out.println("   " + e.toString());});
    }
}