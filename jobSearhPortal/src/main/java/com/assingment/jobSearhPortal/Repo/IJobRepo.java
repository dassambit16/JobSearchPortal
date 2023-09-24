package com.assingment.jobSearhPortal.Repo;

import com.assingment.jobSearhPortal.Model.Job;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IJobRepo extends CrudRepository<Job, Long> {
    List<Job> findByLocation(String location);

}
