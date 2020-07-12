package pl.jedrzejczak.cpudatabaseapi;

import org.springframework.data.repository.CrudRepository;

public interface SocketRepo extends CrudRepository<SocketEntity, Integer> {
    SocketEntity findBySocketname(String socketname);
}
