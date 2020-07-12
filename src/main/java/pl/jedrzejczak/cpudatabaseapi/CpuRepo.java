package pl.jedrzejczak.cpudatabaseapi;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CpuRepo extends CrudRepository<CpuEntity, Integer> {
    Optional<CpuEntity> findById(Integer id);
}
