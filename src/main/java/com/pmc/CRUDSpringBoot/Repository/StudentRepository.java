package com.pmc.CRUDSpringBoot.Repository;

import com.pmc.CRUDSpringBoot.Model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,Integer> {
}

//https://console.aiven.io/account/a47082b5cff7/project/anjali-55aa/services/mysql-3cee6e55/query-statistics