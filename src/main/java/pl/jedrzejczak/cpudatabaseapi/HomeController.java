package pl.jedrzejczak.cpudatabaseapi;

import org.apache.tomcat.jni.Time;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
@RestController
public class HomeController {
    @Autowired
    private CpuRepo cpuRepo;
    @Autowired
    private BrandRepo brandRepo;
    @Autowired
    private SocketRepo socketRepo;


    //GET /getAllCpus
    @GetMapping(path = "/getAllCpus")
    public @ResponseBody Iterable<CpuEntity> getAllCpus()
    {
        return cpuRepo.findAll();
    }

    //GET /getAllBrands
    @GetMapping(path = "/getAllBrands")
    public @ResponseBody Iterable<BrandEntity> getAllBrands()
    {
        return brandRepo.findAll();
    }

    //GET /getAllSockets
    @GetMapping(path = "/getAllSockets")
    public @ResponseBody Iterable<SocketEntity> getAllSockets()
    {
        return socketRepo.findAll();
    }

    //GET /getCpu/{id}
    @GetMapping(path = "/getCpu/{id}")
    public @ResponseBody
    Optional<CpuEntity> getCpu(@PathVariable Integer id)
    {
        return cpuRepo.findById(id);
    }

    //POST /addBrand
    @PostMapping(path = "/addBrand")
    public @ResponseBody HttpStatus addNewBrand (@RequestBody BrandEntity brand)
    {
        brandRepo.save(brand);
        return HttpStatus.OK;
    }

    //POST /addSocket
    @PostMapping(path = "/addSocket")
    public @ResponseBody HttpStatus addNewSocket (@RequestBody SocketEntity socket)
    {
        System.out.println(socket);
        socketRepo.save(socket);
        return HttpStatus.OK;
    }

    //POST /addCpu
    @PostMapping(path = "/addCpu")
    public @ResponseBody HttpStatus addNewCpu (@RequestBody CpuEntity cpu)
    {
        System.out.println(cpu);
        cpuRepo.save(cpu);
        return HttpStatus.OK;
    }

    @PutMapping(path = "/updateCpu/{id}")
    public @ResponseBody HttpStatus updateCpu (@PathVariable Integer id, @RequestBody CpuEntity cpu)
    {
        System.out.println(cpu);
        cpuRepo.save(cpu);
        return HttpStatus.OK;
    }
    @DeleteMapping(path = "/deleteCpu/{id}")
    public @ResponseBody HttpStatus deleteCpu (@PathVariable Integer id)
    {
        cpuRepo.deleteById(id);
        return HttpStatus.OK;
    }
}
