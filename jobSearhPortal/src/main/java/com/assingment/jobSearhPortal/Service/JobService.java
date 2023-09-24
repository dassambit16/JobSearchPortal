package com.assingment.jobSearhPortal.Service;

import com.assingment.jobSearhPortal.Model.Job;
import com.assingment.jobSearhPortal.Repo.IJobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    IJobRepo iJobRepo;


    public String addJob(Job newJob) {
        iJobRepo.save(newJob);
        return "job added";
    }

    public String addJobs(List<Job> newJobs) {
        iJobRepo.saveAll(newJobs);
        return newJobs.size() + " jobs are added";
    }


    public List<Job> getJobs() {
        return (List<Job>) iJobRepo.findAll();
    }

    public Job getJobById(Long id) {
        return iJobRepo.findById(id).get();
    }


    public List<Job> getJobByLocation(String location) {
        return iJobRepo.findByLocation(location);
    }

}
