package com.assingment.jobSearhPortal.Controller;

import com.assingment.jobSearhPortal.Model.Job;
import com.assingment.jobSearhPortal.Service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobController {
    @Autowired
    JobService jobService;

    @PostMapping("job")
    public String addJob(@RequestBody Job newJob) {
        return jobService.addJob(newJob);
    }

    @PostMapping("jobs")
    public String addJobs(@RequestBody List<Job> newJobs) {
        return jobService.addJobs(newJobs);
    }

    @GetMapping("jobs")
    public List<Job> getJobs() {
        return jobService.getJobs();
    }

    @GetMapping("job/id/{id}")
    public Job getJob(@PathVariable Long id) {
        return jobService.getJobById(id);
    }

    @GetMapping("job/location/{location}")
    public List<Job> getJobByLocation(@PathVariable String location) {
        return jobService.getJobByLocation(location);
    }

}
