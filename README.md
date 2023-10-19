# JobSearchPortal

JobSearchPortal is a web application built using the Spring Boot framework and Java. It provides a platform for managing job listings and allows users to search for job opportunities. The project includes the following features:

## Framework and Language

- Framework: Spring Boot
- Language: Java

## Dependencies

- Spring Boot Starter Web
- Lombok
- Validation
- H2 Database
- JPA

## Data Flow

- **Job**
  1. `id` (Primary Key)
  2. `title`
  3. `description`
  4. `location`
  5. `jobSalary` (Minimum value: 20000)
  6. `companyEmail` (Must be a valid email address)
  7. `companyName`
  8. `employerName`
  9. `jobType` (Enumerated job type)

## Controllers

- **GET /jobs**: Retrieve a list of all jobs.
- **GET /job/{id}**: Retrieve a job by its ID.
- **GET /jobs/type/{type}**: Retrieve jobs by type.
- **GET /jobs/salary/range/{salary}**: Retrieve jobs within a salary range.
- **GET /jobs/company/**: Retrieve all jobs from a specific company.
- **POST /job**: Add a new job.
- **POST /jobs**: Add multiple jobs.
- **PUT /job/id/{id}/Salary/{salary}**: Update a job's salary by ID.
- **PUT /job/id/{id}/{loc}**: Update a job's location by ID.
- **PUT /job/id/{id}/email**: Update a job's email by ID.
- **PUT /jobs/salaryHike/jobType/{type}**: Increase the salary of jobs with a specific type.
- **DELETE /job/delete/id/{id}**: Delete a job by ID.
- **DELETE /jobs/company/{cName}**: Delete all jobs from a specific company.

## Service

- `getAllJobs()`: Get all jobs.
- `getJobById(Long id)`: Get a job by ID.
- `postAJob(Job j)`: Post a new job.
- `postJobs(List<Job> j)`: Post multiple jobs.
- `updateSalaryById(Long id, Double salary)`: Update a job's salary by ID.
- `updateLocationById(Long id, String location)`: Update a job's location by ID.
- `updateEmailById(Long id, String email)`: Update a job's email by ID.
- `removeJobById(Long id)`: Remove a job by ID.
- `getAllSameTypeJobs(JobType type)`: Get all jobs of the same type.
- `getAllJobsInASalaryRange(Double salary)`: Get all jobs within a salary range.
- `getAllJobsWithTheSameCompany(String cName)`: Get all jobs from the same company.
- `removeAllJobsOfTheSameCompany(String cName)`: Remove all jobs from the same company.
- `updateSalaryOfSimilarJobType(JobType type)`: Update the salary of jobs with a specific type.

## Project Summary

In this application, you can Create, Read, Update, and Delete job listings using the different APIs provided by the application. This platform makes it easy to manage and search for job opportunities in an organized manner.
