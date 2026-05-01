package com.Tc.TcJobs.repository;

import com.Tc.TcJobs.entity.JobPostActivity;
import com.Tc.TcJobs.entity.JobSeekerApply;
import com.Tc.TcJobs.entity.JobSeekerProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobSeekerApplyRepository extends JpaRepository<JobSeekerApply, Integer> {
    List<JobSeekerApply> findByUserId(JobSeekerProfile userId);
    List<JobSeekerApply> findByJob(JobPostActivity job);
}
