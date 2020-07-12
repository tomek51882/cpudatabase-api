package pl.jedrzejczak.cpudatabaseapi;

import org.springframework.data.repository.CrudRepository;

public interface BrandRepo extends CrudRepository<BrandEntity, Integer> {
    BrandEntity findByBrandname (String brandname);
}
