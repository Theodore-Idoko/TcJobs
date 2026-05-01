package com.Tc.TcJobs.repository;

import com.Tc.TcJobs.entity.JobPostActivity;
import com.Tc.TcJobs.entity.JobSeekerProfile;
import com.Tc.TcJobs.entity.JobSeekerSave;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobSeekerSaveRepository extends JpaRepository<JobSeekerSave, Integer> {
    public List<JobSeekerSave> findByUserId(JobSeekerProfile userAccountId);
    public List<JobSeekerSave> findByJob(JobPostActivity job);
}
