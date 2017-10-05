package com.app.app;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
@Repository
public interface Rep extends CrudRepository<Tser, String> {

}

