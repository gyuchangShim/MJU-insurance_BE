package server.app.insurance.intra.control;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import server.app.insurance.intra.dto.ContractManagementPolicyDto;
import server.app.insurance.intra.service.ContractManagementPolicyList;

import java.util.List;

@Tag(name = "ContractManagementPolicy 컨트롤러", description = "ContractManagementPolicy API입니다.")
@RestController
@RequiredArgsConstructor
public class ContractManagementPolicyController {
    private final ContractManagementPolicyList contractManagementPolicyList;

    @PostMapping( "/contractmanagementpolicy")
    public void add(@RequestBody ContractManagementPolicyDto request ){
        contractManagementPolicyList.add( request );
    }

    @GetMapping( "/contractmanagementpolicy")
    public ContractManagementPolicyDto retrieve( @RequestParam int id ){
        return contractManagementPolicyList.retrieve( id );
    }

    @GetMapping( "/contractmanagementpolicy/getAll" )
    public List<ContractManagementPolicyDto> retrieveAll(){
        return contractManagementPolicyList.retrieveAll();
    }

    @PutMapping( "/contractmanagementpolicy" )
    public void update( @RequestBody ContractManagementPolicyDto request ){
        contractManagementPolicyList.update( request );
    }

    @DeleteMapping( "/contractmanagementpolicy" )
    public void delete( @RequestParam int id ){
        contractManagementPolicyList.delete( id );
    }
}