package com.enterprise.taskplatform.repository;

import com.enterprise.taskplatform.domain.Task;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TaskRepository extends MongoRepository<Task, String> {
}
